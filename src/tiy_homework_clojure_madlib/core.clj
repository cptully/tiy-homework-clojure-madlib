(ns tiy-homework-clojure-madlib.core)

;; Word wrap function copied from
;; https://www.rosettacode.org/wiki/Word_wrap#Clojure
(defn wrap-line [size text]
  (re-seq (re-pattern (str ".{0," size "}\\s"))
          (clojure.string/replace text #"\n" " ")))

;; MadLib function, arguements fill in the blanks
(defn madlib-albert-einstein [place adjective1 adjective2 female-celebrity
                           male-celebrity noun1 noun2 noun3 plural-noun1
                           plural-noun2 plural-noun3 plural-noun4 plural-profession]

    ;; bind Text to the MadLib assembled from the augments and boiler plate text
    (def text (str "Albert Einstein, the son of " male-celebrity " and " female-celebrity ", "
                   "was born in Ulm, Germany, in 1879. In 1902, he had a job "
                   "as assistant " noun1 " in the Swiss patent office and attended "
                   "the University of Zurich. There he began studying atoms, molecules, "
                   "and " plural-noun1 ". He developed the theory of "
                   adjective1 "relativity, which expanded the phenomena of sub-atomic "
                   plural-noun2 " and " adjective2 " magnetism. In 1921, "
                   "he won the Nobel prize for " plural-noun3 " and was director of "
                   "theoretical physics at the Kaiser Wilhelm " noun2 " in Berlin. "
                   "In 1933, when Hitler became Chancellor of " place ", "
                   "Einstein came to America to take a post at Princeton Institute for "
                   plural-noun4 ", where his theories helped America devise the first "
                   "atomic " noun3 ". There is no question about it: Einstein was "
                   "one of the most brilliant " plural-profession " of our time."))
                   ;; the space after ..time. is necessary so that wrap-line can match the last word of the string
                   ;; since it is matching the space after the chosen length of characters

    ;; snippet from same website to iterate cutting the sting into chunks <= 72 characters
    (doseq [line (wrap-line 60 text)]
      (println line))
  )

;; calling the MadLib function
(madlib-albert-einstein "Raleigh" "silly" "furry" "Madonna" "Tom Curz" "brick" "car"
                     "tree" "deer" "gorges" "classes" "knives" "trash men")