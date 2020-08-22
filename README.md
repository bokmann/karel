LoudounCodes JKarel

This code was born from the Loudoun County Public School System's use of Fairfax County's FCPSKarel conputer science curriculum.

In the intervening decade+ since the code was originally written, Java has evolved.  This is first and foremost an effort to evolve the Karel code into the present.

This version of the framework is making the code more idomatic with current Java conventions, as well as revisiting some design decisions that should make this code more suitable both for a beginner programming course, as well as a post-AP course learning about software architecture.

Changes made to this version:
- idioms based on C++ (like enums based on integer values) have been replaced with modern Java semantics (like Java's Enum, introduced in Java 1.5)

- XML Parsing was moved to use the built-in Java classes rather than the external Xerces library from Apache (makes the setup easier for the begining level class)

- Fixed the build system to be inline with larger organizational software development practices
-- Classes are built in an independent location; not next to java files.
-- There is an appropriately implemented 'clean' command, which removes all non-version-controlled build artefacts.
-- The jar file is built entirely by the build process, not reliant on fragments of text files.
-- the version number of the library is semantic, and included in the jar file name.

- Documentation is now entirely built with Javadoc
-- Doxyfile is no longer used in this project.
-- (effort to redocument and include diagrams is in-progress)
-- rewrite documentation from scratch (in progress. As forked, had over 50 documentation warnings or errors)
- Names were changed to a more semantic metaphor, making it easier to learn
-- As an example, Robots no longer have 'coordinates' on a 'display', they have 'locations' in an 'arena'.

-- the concept of Display Speed has been changed to the Arena Pace.  There is a Pacing enumeration that also includes a step ability.
--- lots of integer mod checking math and edge case code evaporated with this change.

- Package hierarchy was collapsed.  A 'util' package that depends on and is depended by the parent provides no value, just a layer of confusion.

- XML Package was not collapsed, because a future mod is going to introduce an interface and a runtime dependency as an example for an architecure class.

- Unused files were removed.

- Unit Tests are in progress.

- Package hierarchy was renamed to clearly delineate this from the past non-semantically compatible library, and to remove the version number from the hierarchy name. This will make package evolution and upgrade easier in the future.

- New jar file is compatible with JRuby.

- Check the git commit comments for a more detailed changelog.

Regrding Contributions:

Contributions are welcome!  As this is intended for a class on software architecture, the impact on pull requests will be considered, so contrbutions will not be blinfly accepted.

To contribute:
- fork this project on github.
- make your change, ideally tracking it to an issue you have added to the repo.
- Commits should follow the Chris Beam's "How to Write a Commit Message"
-- https://chris.beams.io/posts/git-commit/#imperative
-- with an overriding opinion on Rule 5.  While Git commit messages that are imperative will be accepted, this project prefers commit subject lines written by humans start with a *present tense action verb*, and answer the question, "What would this commit do if I cherry-picked it into my current code?"
- make sure you add your name to the list of contributors.  While github tracks that, I hope to eventually embed attribution into the jar file manifest.
- submit a pull request.



ToDo:
- redesign curriculum to use new classes and features.
- Add a maze generation package based on the book "Mazes For Programmers", so that make generating algorithms can be studied in an algorithms course.
- Design curriculum for a software architecture course.
-- example: Strategy Pattern in the Pacing Enum
-- Inversion/Refactoring of Dependency in the XML package
-- Interface for ArenaData, with a the xml library and a maze generation library as data producers.
-- more advanced robots, ala RoboCode or RTanque?
-- Curriculum using JRuby?




Previous Contributors to FCPSKarel, on which this work is based:

Andy Street <alstreet@vt.edu> 2007
Daniel Johnson <2010djohnson@tjhsst.edu> Summer 2009

