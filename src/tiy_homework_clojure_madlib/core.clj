(ns tiy-homework-clojure-madlib.core)

(defn mad-albert-einstein [place adjective1 adjective2 female-celebrity
                           male-celebrity noun1 noun2 noun3 plural-noun1
                           plural-noun2 plural-noun3 plural-noun4 plural-profession]
    (print (str "Albert Einstein, the son of " male-celebrity " and " female-celebrity ", \n"
                "was born in Ulm, Germany, in 1879. In 1902, he had a job \n"
                "as assistant " noun1 " in the Swiss patent office and attended \n"
                "the University of Zurich. There he began studying atoms, molecules, \n"
                "and " plural-noun1 ". He developed the theory of "
                adjective1 "relativity, \nwhich expanded the phenomena of sub-atomic \n"
                plural-noun2 " and " adjective2 " magnetism. In 1921, \n"
                "he won the Nobel prize for " plural-noun3 " and was director of \n"
                "theoretical physics at the Kaiser Wilhelm " noun2 " in Berlin. \n"
                "In 1933, when Hitler became Chancellor of " place ", \n"
                "Einstein came to America to take a post at Princeton Institute for \n"
                plural-noun4 ", where his theories helped America devise the first \n"
                "atomic " noun3 ". There is no question about it: Einstein was \n"
                "one of the most brilliant " plural-profession " of our time.") ))

(mad-albert-einstein "Raleigh" "silly" "furry" "Madonna" "Tom Curz" "brick" "car"
                     "tree" "deer" "gorges" "classes" "knives" "trash men")