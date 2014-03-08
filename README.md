About msc2gen
=======

Msc2gen is a simple translator from MSC textual representation format (event-oriented, standardized by ITU-Z.120) into mscgen textual representation.

Usage
=====

Type in command line:

    msc2gen <in_file.msc> <out_file.mscgen>

Example of input MSC file:

    msc MscSWSimple;
        Sender   : instance;
        Receiver : instance;
        
        Sender   : in sEnv(sbuffer := buffer) from env;
        Sender   : out sFrame(sbuffer =: frData) to Receiver;
        Receiver : in  sFrame(sbuffer =: frData) from Sender;
        
        Receiver : out rEnv to env;
        
        Receiver : out rFrame to Sender;
        Sender   : in  rFrame from Receiver;
        
        Sender   : endinstance;
        Receiver : endinstance;
    endmsc;
