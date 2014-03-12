About msc2gen
=======

Msc2gen is a simple translator from MSC textual representation format (event-oriented, standardized by ITU-Z.120) into `Msc-generator <http://sourceforge.net/projects/msc-generator/>` textual representation.

Usage
=====

Type in command line:

    msc2gen <in_file.msc> <out_file.signalling>

Example of input MSC file ``stop_and_wait.msc``:

    msc msc_stop_and_wait;
        Sender   : instance;
        Receiver : instance;
        
        Sender   : in 'sEnv(buffer)' from env;
        Sender   : out 'sFrame(buffer =: frData)' to Receiver;
        Receiver : in 'sFrame(buffer =: frData)' from Sender;
        
        Receiver : out 'rEnv(frData)' to env;
        
        Receiver : out rFrame to Sender;
        Sender   : in  rFrame from Receiver;
        
        Sender   : endinstance;
        Receiver : endinstance;
    endmsc;

and the output ``msc_stop_and_wait.signalling`` file:

    title: msc_stop_and_wait;
    hscale=auto;
    
    Sender, Receiver;
    
    ->Sender: sEnv(buffer);
    Sender->Receiver: sFrame(buffer =: frData);
    Receiver->: rEnv(frData);
    Receiver->Sender: rFrame;
