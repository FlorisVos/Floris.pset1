I made the main layout a linear one with a vertical orientation. In this layout is a relativelayout and a tablelayout. The Relative layout
consists of the ImageViews and the tablelayout consists of the checkboxes. The tablelayout itself is horizontal oriented but consists of
two vertical rows with checkboxes. To implement this I had to put a vertical linearlayout with the checkboxes inside the tablerows.

To connect the checkboxes with the imageviews there is java code. There is one function called onCheckBoxClick that all checkboxes are
connected to. The different checkboxes have their own case where the visibility of one of the imageviews is toggled based on whether
the checkbox is checked or unchecked, this is a built-in boolean function.

I chose to make a folder called layout-land that provides code for the landscape mode. It is exactly the same code except for the fact
that the main layout is horizontal instead of vertical. When rotating the screen it auto-switch to the right code. A bug exists still
because the imageviews-visibility is reset once the screen is rotated. While the checkbox statusses are continued. This means that
despite the checkbox statuses you will again see the complete mr.potatohead when you rotate the screen. I was told this was not necessary
to fix for the requirements and decided to use my time for heuristics instead.
