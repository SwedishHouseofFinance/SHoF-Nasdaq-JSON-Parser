# SHoF-Nasdaq-JSON-Parser
Simple Java implementation of a parser for our Nasdaq JSON output.

It relies on Java ( and the BOON library.

Beware: it takes a lot of RAM to parse a full day of all kinds of Nasdaq messages!
Suggested VM options: -server -Xmx8G -Xms2G -XX:+UseG1GC
