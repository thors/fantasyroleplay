; load these files to evaluate later that all mandatory properties are set for the new character
;(def mandatory_species_properties (load-file "species/mandatory_properties.clj"))
;(def mandatory_archetype_properties (load-file "archetypes/mandatory_properties.clj"))
;(def mandatory_character_properties (load-file "characters/mandatory_properties.clj"))
(def species_properties {})
(def archetype_properties {})
(def character_properties {})

(merge character_properties (load-file "species/default.clj"))

(defn add_property [name, min, max, typical, costfn] (def character_properties (assoc character_properties name { "minimum" min "maximum" max "typical" typical "modifiercost" costfn})))

(add_property "Strength" 0 200 100 (fn [new old] (- new old)))
(add_property "Size" 0 200 100 1)

(get character_properties "Strength")

