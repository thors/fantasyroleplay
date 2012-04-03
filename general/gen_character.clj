; load these files to evaluate later that all mandatory properties are set for the new character
(def species_properties {})
(def archetype_properties {})
(def character_properties {})

(defn add_property [name, min, max, typical, costfn] (def character_properties (assoc character_properties name { "minimum" min "maximum" max "typical" typical "modifiercost" costfn})))

(merge character_properties (load-file "species/default.clj"))



(defn set_property [property newvalue] 
  (if (get character_properties property)
    (do
	(def cos

(defn set_archetype [arche] 
  (def archetype_properties (load_map archetype_properties (str "archetypes/" arche ".clj"))))


;load the character description file 
(def character_file (nth *command-line-args* 0 ))
(load-file  character_file)

(check_completeness mandatory_species_properties species_properties)
(check_completeness mandatory_archetype_properties archetype_properties)



