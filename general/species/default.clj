;This file defines some default settings. It does not describe any specific species.
;
{
"Name" ""
"Capital" 1000
"Strength" {"Min" 50 "Max" 150 "Typical" 120 "ModifierCost" (fn [newVal] (* (- newVal 120) 2 ))}
"Size" {"Min" 50 "Max" 150 "Typical" 120 "ModifierCost" (fn [newVal] (* (- newVal 120) 0.2 ))}
"Weight" {"Min" 50 "Max" 150 "Typical" 120 "ModifierCost" (fn [newVal] (* (Math/abs (- newVal 120)) 2 ))}
"Fear" {"Min" 50 "Max" 150 "Typical" 120 "ModifierCost" (fn [newVal] (* (- newVal 120) -2 ))}
}