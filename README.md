# Docs Code Samples

These docs code samples follow a pre-defined structure in order to be parsed correctly. A docs folder can be one of the following:

- Structural (doesn't get used to generate a code block)
- File set (generates a file-based code block)
- Folder set (generates a folder-based code block)

Within a file or folder set, the rendering of the code block can be further customized using an `__meta.json` file. This file can contain the following:

- `zip` - A link to the zip file to download for the block.
- `highlightedLines` - An object matching keys to the file names, and the values as a comma-separated list of lines to highlight. Single digits as well as ranges can be provided, e.g. `1,2,5-7,10`.

The order of files and folders can also be set by pre-pending numbers to the start of names, which will be stripped when rendered, e.g. `1. My Folder`. This is optional, and will sort alphabetically otherwise.