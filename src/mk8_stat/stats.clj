(ns mk8-stat.stats)

(def class-stats
  {:light {:baby {:speed {:ground 2.25
                          :water 2.75
                          :air 2.25
                          :antigrav 2.5}
                  :accel 3.25
                  :weight 2.25
                  :handling {:ground 4.75
                             :water 4.75
                             :air 4.5
                             :antigrav 5}
                  :traction 4.5
                  :turbo 3}
           :light {:speed {:ground 2.75
                           :water 3.25
                           :air 2.75
                           :antigrav 3}
                   :accel 3
                   :weight 2.75
                   :handling {:ground 4.25
                              :water 4.25
                              :air 4
                              :antigrav 4.5}
                   :traction 4.25
                   :turbo 2.75}}
   :medium {:small {:speed {:ground 3.25
                            :water 3.75
                            :air 3.25
                            :antigrav 3.5}
                    :accel 2.75
                    :weight 3.25
                    :handling {:ground 3.75
                               :water 3.75
                               :air 3.5
                               :antigrav 4}
                    :traction 4
                    :turbo 2.5}
            :medium {:speed {:ground 3.75
                             :water 4.25
                             :air 3.75
                             :antigrav 4}
                     :accel 2.5
                     :weight 3.75
                     :handling {:ground 3.25
                                :water 3.25
                                :air 3
                                :antigrav 3.5}
                     :traction 3.75
                     :turbo 2.25}}
   :heavy {:small {:speed {:ground 4.25
                           :water 4.75
                           :air 4.25
                           :antigrav 4.5}
                   :accel 2.25
                   :weight 4.25
                   :handling {:ground 2.75
                              :water 2.75
                              :air 2.5
                              :antigrav 3}
                   :traction 3.5
                   :turbo 2}
           :medium {:speed {:ground 4.25
                            :water 4.75
                            :air 4.25
                            :antigrav 4.5}
                    :accel 2
                    :weight 4.75
                    :handling {:ground 2.75
                               :water 2.75
                               :air 2.5
                               :antigrav 3}
                    :traction 3.25
                    :turbo 1.75}
           :large  {:speed {:ground 4.75
                            :water 5.25
                            :air 4.75
                            :antigrav 5}
                    :accel 2
                    :weight 4.75
                    :handling {:ground 2.25
                               :water 2.25
                               :air 2
                               :antigrav 2.5}
                    :traction 3.25
                    :turbo 1.75}}})

(def player-classes
  {:baby-mario [:light :baby]
   :baby-luigi [:light :baby]
   :baby-peach [:light :baby]
   :baby-daisy [:light :baby]
   :baby-rosalina [:light :baby]
   :lemmy-koopa [:light :baby]
   :toad [:light :baby]
   :toadette [:light :light]
   :koopa-troopa [:light :light]
   :shyguy [:light :light]
   :lakitu [:light :light]
   :larry-koopa [:light :light]
   :wendy-koopa [:light :light]
   :daisy [:medium :small]
   :peach [:medium :small]
   :yoshi [:medium :small]
   :mario [:medium :medium]
   :luigi [:medium :medium]
   :iggy  [:medium :medium]
   :ludwig [:medium :medium]
   :donky-kong [:heavy :small]
   :waluigi [:heavy :small]
   :rosalina [:heavy :small]
   :roy [:heavy :small]
   :metal-mario [:heavy :medium]
   :pink-gold-peach [:heavy :medium]
   :bowser [:heavy :large]
   :wario [:heavy :large]
   :morton [:heavy :large]})

(def kart-stat-modifiers
  {:standard-kart {:speed {:ground [+ 0]
                           :water [+ 0]
                           :air [+ 0]
                           :antigrav [+ 0]}
                   :accel [+ 0]
                   :weight [+ 0]
                   :handling {:ground [+ 0]
                              :water [+ 0]
                              :air [+ 0]
                              :antigrav [+ 0]}
                   :traction [+ 0]
                   :turbo [+ 0]}
   :pipe-frame {:speed {:ground [+ 0]
                        :water [+ 0.25]
                        :air [+ 0.25]
                        :antigrav [- 0.25]}
                :accel [+ 0.25]
                :weight [- 0.25]
                :handling {:ground [+ 0.5]
                           :water [+ 0.5]
                           :air [+ 0.75]
                           :antigrav [+ 0]}
                :traction [- 0.5]
                :turbo [+ 0.25]}
   :mach-eight {:speed {:ground [+ 0.5]
                        :water [+ 0.25]
                        :air [+ 0.5]
                        :antigrav [- 0.25]}
                :accel [- 0.25]
                :weight [+ 0.25]
                :handling {:ground [+ 0]
                           :water [+ 0]
                           :air [+ 0]
                           :antigrav [- 0.25]}
                :traction [- 1]
                :turbo [- 0.5]}
   :steel-driver {:speed {:ground [+ 0]
                          :water [+ 0.5]
                          :air [+ 0]
                          :antigrav [- 0.25]}
                  :accel [- 0.5]
                  :weight [+ 0.5]
                  :handling {:ground [- 0.5]
                             :water [+ 0.75]
                             :air [- 0.25]
                             :antigrav [- 0.75]}
                  :traction [+ 0.5]
                  :turbo [- 0.75]}
   :cat-cruiser {:speed {:ground [+ 0]
                         :water [+ 0]
                         :air [+ 0]
                         :antigrav [+ 0]}
                 :accel [+ 0]
                 :weight [+ 0]
                 :handling {:ground [+ 0]
                            :water [+ 0]
                            :air [+ 0]
                            :antigrav [+ 0]}
                 :traction [+ 0]
                 :turbo [+ 0]}
   :circuit-special {:speed {:ground [+ 0.5]
                             :water [+ 0.25]
                             :air [+ 0.5]
                             :antigrav [- 0.25]}
                     :accel [- 0.25]
                     :weight [+ 0.25]
                     :handling {:ground [+ 0]
                                :water [+ 0]
                                :air [+ 0]
                                :antigrav [- 0.25]}
                     :traction [- 1]
                     :turbo [- 0.5]}
   :tri-speeder {:speed {:ground [+ 0]
                         :water [+ 0.5]
                         :air [+ 0]
                         :antigrav [- 0.25]}
                 :accel [- 0.5]
                 :weight [+ 0.5]
                 :handling {:ground [- 0.5]
                            :water [+ 0.75]
                            :air [- 0.25]
                            :antigrav [- 0.75]}
                 :traction [+ 0.5]
                 :turbo [- 0.75]}
   :band-wagon {:speed {:ground [+ 0]
                        :water [+ 0.5]
                        :air [+ 0]
                        :antigrav [- 0.25]}
                :accel [- 0.5]
                :weight [+ 0.5]
                :handling {:ground [- 0.5]
                           :water [+ 0.75]
                           :air [- 0.25]
                           :antigrav [- 0.75]}
                :traction [+ 0.5]
                :turbo [- 0.75]}
   :prancer {:speed {:ground [+ 0]
                     :water [+ 0]
                     :air [+ 0]
                     :antigrav [+ 0]}
             :accel [+ 0]
             :weight [+ 0]
             :handling {:ground [+ 0]
                        :water [+ 0]
                        :air [+ 0]
                        :antigrav [+ 0]}
             :traction [+ 0]
             :turbo [+ 0]}
   :biddybuggy {:speed {:ground [- 0.75]
                        :water [+ 0.5]
                        :air [+ 0.5]
                        :antigrav [- 0.25]}
                :accel [+ 1.25]
                :weight [- 0.5]
                :handling {:ground [+ 0.5]
                           :water [+ 0.75]
                           :air [+ 0.75]
                           :antigrav [+ 0]}
                :traction [- 0.25]
                :turbo [+ 1]}
   :landship {:speed {:ground [- 0.75]
                      :water [+ 0.5]
                      :air [+ 0.5]
                      :antigrav [- 0.25]}
              :accel [+ 1.25]
              :weight [- 0.5]
              :handling {:ground [+ 0.5]
                         :water [+ 0.75]
                         :air [+ 0.75]
                         :antigrav [+ 0]}
              :traction [- 0.25]
              :turbo [+ 1]}
   :sneeker {:speed {:ground [+ 0]
                     :water [+ 0]
                     :air [+ 0]
                     :antigrav [+ 0]}
             :accel [+ 0]
             :weight [+ 0]
             :handling {:ground [+ 0]
                        :water [+ 0]
                        :air [+ 0]
                        :antigrav [+ 0]}
             :traction [+ 0]
             :turbo [+ 0]}
   :sports-coupe {:speed {:ground [+ 0.5]
                          :water [+ 0.25]
                          :air [+ 0.5]
                          :antigrav [- 0.25]}
                  :accel [- 0.25]
                  :weight [+ 0.25]
                  :handling {:ground [+ 0]
                             :water [+ 0]
                             :air [+ 0]
                             :antigrav [- 0.25]}
                  :traction [- 1]
                  :turbo [- 0.5]}
   :gold-standard {:speed {:ground [+ 0.5]
                           :water [+ 0.25]
                           :air [+ 0.5]
                           :antigrav [- 0.25]}
                   :accel [- 0.25]
                   :weight [+ 0.25]
                   :handling {:ground [+ 0]
                              :water [+ 0]
                              :air [+ 0]
                              :antigrav [- 0.25]}
                   :traction [- 1]
                   :turbo [- 0.5]}
   :standard-bike {:speed {:ground [+ 0]
                           :water [+ 0.25]
                           :air [+ 0.25]
                           :antigrav [- 0.25]}
                   :accel [+ 0.25]
                   :weight [- 0.25]
                   :handling {:ground [+ 0.5]
                              :water [+ 0.5]
                              :air [+ 0.75]
                              :antigrav [+ 0]}
                   :traction [- 0.5]
                   :turbo [+ 0.25]}
   :comet {:speed {:ground [+ 0]
                   :water [+ 0]
                   :air [+ 0]
                   :antigrav [- 0.25]}
           :accel [+ 0.75]
           :weight [- 0.25]
           :handling {:ground [+ 0.75]
                      :water [+ 0.75]
                      :air [+ 0.75]
                      :antigrav [+ 0.5]}
           :traction [- 1.25]
           :turbo [+ 0.5]}
   :sport-bike {:speed {:ground [+ 0]
                        :water [+ 0]
                        :air [+ 0]
                        :antigrav [- 0.25]}
                :accel [+ 0.75]
                :weight [- 0.25]
                :handling {:ground [+ 0.75]
                           :water [+ 0.75]
                           :air [+ 0.75]
                           :antigrav [+ 0.5]}
                :traction [- 1.25]
                :turbo [+ 0.5]}
   :the-duke {:speed {:ground [+ 0]
                      :water [+ 0]
                      :air [+ 0]
                      :antigrav [+ 0]}
              :accel [+ 0]
              :weight [+ 0]
              :handling {:ground [+ 0]
                         :water [+ 0]
                         :air [+ 0]
                         :antigrav [+ 0]}
              :traction [+ 0]
              :turbo [+ 0]}
   :flame-rider {:speed {:ground [+ 0]
                         :water [+ 0.25]
                         :air [+ 0.25]
                         :antigrav [- 0.25]}
                 :accel [+ 0.25]
                 :weight [- 0.25]
                 :handling {:ground [+ 0.5]
                            :water [+ 0.5]
                            :air [+ 0.75]
                            :antigrav [+ 0]}
                 :traction [- 0.5]
                 :turbo [+ 0.25]}
   :varmint {:speed {:ground [+ 0]
                     :water [+ 0.25]
                     :air [+ 0.25]
                     :antigrav [- 0.25]}
             :accel [+ 0.25]
             :weight [- 0.25]
             :handling {:ground [+ 0.5]
                        :water [+ 0.5]
                        :air [+ 0.75]
                        :antigrav [+ 0]}
             :traction [- 0.5]
             :turbo [+ 0.25]}
   :mr-scooty {:speed {:ground [- 0.75]
                       :water [+ 0.5]
                       :air [+ 0.5]
                       :antigrav [- 0.25]}
               :accel [+ 1.25]
               :weight [- 0.5]
               :handling {:ground [+ 0.5]
                          :water [+ 0.75]
                          :air [+ 0.75]
                          :antigrav [+ 0]}
               :traction [- 0.25]
               :turbo [+ 1]}
   :jet-bike {:speed {:ground [+ 0]
                      :water [+ 0]
                      :air [+ 0]
                      :antigrav [- 0.25]}
              :accel [+ 0.75]
              :weight [- 0.25]
              :handling {:ground [+ 0.75]
                         :water [+ 0.75]
                         :air [+ 0.75]
                         :antigrav [+ 0.5]}
              :traction [- 1.25]
              :turbo [+ 0.5]}
   :yoshi-bike {:speed {:ground [+ 0]
                        :water [+ 0]
                        :air [+ 0]
                        :antigrav [- 0.25]}
                :accel [+ 0.75]
                :weight [- 0.25]
                :handling {:ground [+ 0.75]
                           :water [+ 0.75]
                           :air [+ 0.75]
                           :antigrav [+ 0.5]}
                :traction [- 1.25]
                :turbo [+ 0.5]}
   :standard-atv {:speed {:ground [+ 0]
                          :water [+ 0.5]
                          :air [+ 0]
                          :antigrav [- 0.25]}
                  :accel [- 0.5]
                  :weight [+ 0.5]
                  :handling {:ground [- 0.5]
                             :water [+ 0.75]
                             :air [- 0.25]
                             :antigrav [- 0.75]}
                  :traction [+ 0.5]
                  :turbo [- 0.75]}
   :wild-wiggler {:speed {:ground [+ 0]
                          :water [+ 0.25]
                          :air [+ 0.25]
                          :antigrav [- 0.25]}
                  :accel [+ 0.25]
                  :weight [- 0.25]
                  :handling {:ground [+ 0.5]
                             :water [+ 0.5]
                             :air [+ 0.75]
                             :antigrav [+ 0]}
                  :traction [- 0.5]
                  :turbo [+ 0.25]}
   :teddy-buddy {:speed {:ground [+ 0]
                         :water [+ 0]
                         :air [+ 0]
                         :antigrav [+ 0]}
                 :accel [+ 0]
                 :weight [+ 0]
                 :handling {:ground [+ 0]
                            :water [+ 0]
                            :air [+ 0]
                            :antigrav [+ 0]}
                 :traction [+ 0]
                 :turbo [+ 0]}})


(def tire-stat-modifiers
  {:standard {:speed {:ground [+ 0]
                      :water [+ 0]
                      :air [+ 0]
                      :antigrav [+ 0]}
              :accel [+ 0]
              :weight [+ 0]
              :handling {:ground [+ 0]
                         :water [+ 0]
                         :air [+ 0]
                         :antigrav [+ 0]}
              :traction [+ 0]
              :turbo [+ 0]}
   :monster {:speed {:ground [+ 0]
                     :water [- 0.5]
                     :air [- 0.25]
                     :antigrav [+ 0]}
             :accel [- 0.5]
             :weight [+ 0.5]
             :handling {:ground [- 0.75]
                        :water [- 0.75]
                        :air [- 0.75]
                        :antigrav [- 0.75]}
             :traction [+ 0.75]
             :turbo [+ 0]}
   :roller {:speed {:ground [- 0.5]
                    :water [+ 0]
                    :air [+ 0.5]
                    :antigrav [- 0.5]}
            :accel [+ 1]
            :weight [- 0.5]
            :handling {:ground [+ 0.25]
                       :water [+ 0.25]
                       :air [+ 0.25]
                       :antigrav [+ 0.25]}
            :traction [- 0.25]
            :turbo [+ 1.5]}
   :slim {:speed {:ground [+ 0.25]
                  :water [- 0.25]
                  :air [+ 0.25]
                  :antigrav [+ 0.25]}
          :accel [- 0.25]
          :weight [+ 0]
          :handling {:ground [+ 0.25]
                     :water [+ 0.25]
                     :air [+ 0.25]
                     :antigrav [+ 0.25]}
          :traction [- 0.5]
          :turbo [+ 0.25]}
   :slick {:speed {:ground [+ 0.5]
                   :water [- 1]
                   :air [+ 0.5]
                   :antigrav [+ 0.5]}
           :accel [- 0.25]
           :weight [+ 0.25]
           :handling {:ground [+ 0]
                      :water [+ 0]
                      :air [+ 0]
                      :antigrav [+ 0]}
           :traction [- 1]
           :turbo [+ 0.25]}
   :metal {:speed {:ground [+ 0.25]
                   :water [- 0.25]
                   :air [+ 0.25]
                   :antigrav [+ 0.25]}
           :accel [- 0.5]
           :weight [+ 0.5]
           :handling {:ground [+ 0]
                      :water [+ 0]
                      :air [+ 0]
                      :antigrav [+ 0]}
           :traction [- 0.5]
           :turbo [+ 0]}
   :button {:speed {:ground [- 0.5]
                    :water [+ 0]
                    :air [+ 0.5]
                    :antigrav [- 0.5]}
            :accel [+ 1]
            :weight [- 0.5]
            :handling {:ground [+ 0.25]
                       :water [+ 0.25]
                       :air [+ 0.25]
                       :antigrav [+ 0.25]}
            :traction [- 0.25]
            :turbo [+ 1.5]}
   :off-road {:speed {:ground [+ 0]
                      :water [+ 0]
                      :air [+ 0]
                      :antigrav [+ 0]}
              :accel [+ 0]
              :weight [+ 0]
              :handling {:ground [+ 0]
                         :water [+ 0]
                         :air [+ 0]
                         :antigrav [+ 0]}
              :traction [+ 0]
              :turbo [+ 0]}
   :sponge {:speed {:ground [- 0.25]
                    :water [- 1]
                    :air [+ 0.25]
                    :antigrav [- 0.25]}
            :accel [+ 0.25]
            :weight [- 0.25]
            :handling {:ground [- 0.25]
                       :water [- 0.5]
                       :air [+ 0]
                       :antigrav [- 0.25]}
            :traction [+ 0.5]
            :turbo [+ 0.75]}
   :wood {:speed {:ground [- 0.25]
                  :water [- 1]
                  :air [+ 0.25]
                  :antigrav [- 0.25]}
          :accel [+ 0.25]
          :weight [- 0.25]
          :handling {:ground [- 0.25]
                     :water [- 0.5]
                     :air [+ 0]
                     :antigrav [- 0.25]}
          :traction [+ 0.5]
          :turbo [+ 0.75]}
   :cushion {:speed {:ground [- 0.25]
                     :water [- 1]
                     :air [+ 0.25]
                     :antigrav [- 0.25]}
             :accel [+ 0.25]
             :weight [- 0.25]
             :handling {:ground [- 0.25]
                        :water [- 0.5]
                        :air [+ 0]
                        :antigrav [- 0.25]}
             :traction [+ 0.5]
             :turbo [+ 0.75]}
   :blue-standard {:speed {:ground [+ 0]
                           :water [+ 0]
                           :air [+ 0]
                           :antigrav [+ 0]}
                   :accel [+ 0]
                   :weight [+ 0]
                   :handling {:ground [+ 0]
                              :water [+ 0]
                              :air [+ 0]
                              :antigrav [+ 0]}
                   :traction [+ 0]
                   :turbo [+ 0]}
   :hot-monster {:speed {:ground [+ 0]
                         :water [- 0.5]
                         :air [- 0.25]
                         :antigrav [+ 0]}
                 :accel [- 0.5]
                 :weight [+ 0.5]
                 :handling {:ground [- 0.75]
                            :water [- 0.75]
                            :air [- 0.75]
                            :antigrav [- 0.75]}
                 :traction [+ 0.75]
                 :turbo [+ 0]}
   :azure-roller {:speed {:ground [- 0.5]
                          :water [+ 0]
                          :air [+ 0.5]
                          :antigrav [- 0.5]}
                  :accel [+ 1]
                  :weight [- 0.5]
                  :handling {:ground [+ 0.25]
                             :water [+ 0.25]
                             :air [+ 0.25]
                             :antigrav [+ 0.25]}
                  :traction [- 0.25]
                  :turbo [+ 1.5]}
   :crimson-slim {:speed {:ground [+ 0.25]
                          :water [- 0.25]
                          :air [+ 0.25]
                          :antigrav [+ 0.25]}
                  :accel [- 0.25]
                  :weight [+ 0]
                  :handling {:ground [+ 0.25]
                             :water [+ 0.25]
                             :air [+ 0.25]
                             :antigrav [+ 0.25]}
                  :traction [- 0.5]
                  :turbo [+ 0.25]}
   :cyber-slick {:speed {:ground [+ 0.5]
                         :water [- 1]
                         :air [+ 0.5]
                         :antigrav [+ 0.5]}
                 :accel [- 0.25]
                 :weight [+ 0.25]
                 :handling {:ground [+ 0]
                            :water [+ 0]
                            :air [+ 0]
                            :antigrav [+ 0]}
                 :traction [- 1]
                 :turbo [+ 0.25]}
   :retro-off-road {:speed {:ground [+ 0]
                            :water [+ 0]
                            :air [+ 0]
                            :antigrav [+ 0]}
                    :accel [+ 0]
                    :weight [+ 0]
                    :handling {:ground [+ 0]
                               :water [+ 0]
                               :air [+ 0]
                               :antigrav [+ 0]}
                    :traction [+ 0]
                    :turbo [+ 0]}
   :gold-tires {:speed {:ground [+ 0.25]
                        :water [- 0.25]
                        :air [+ 0.25]
                        :antigrav [+ 0.25]}
                :accel [- 0.5]
                :weight [+ 0.5]
                :handling {:ground [+ 0]
                           :water [+ 0]
                           :air [+ 0]
                           :antigrav [+ 0]}
                :traction [- 0.5]
                :turbo [+ 0]}})

(def glider-stat-modifiers
  {:super-glider {:speed {:ground [+ 0]
                          :water [+ 0]
                          :air [+ 0]
                          :antigrav [+ 0]}
                  :accel [+ 0]
                  :weight [+ 0]
                  :handling {:ground [+ 0]
                             :water [+ 0]
                             :air [+ 0]
                             :antigrav [+ 0]}
                  :traction [+ 0]
                  :turbo [+ 0]}
   :cloud-glider {:speed {:ground [+ 0]
                          :water [+ 0]
                          :air [- 0.25]
                          :antigrav [+ 0]}
                  :accel [+ 0.25]
                  :weight [- 0.25]
                  :handling {:ground [+ 0]
                             :water [+ 0]
                             :air [+ 0.25]
                             :antigrav [+ 0]}
                  :traction [+ 0]
                  :turbo [+ 0.25]}
   :wario-wing {:speed {:ground [+ 0]
                        :water [+ 0]
                        :air [+ 0]
                        :antigrav [+ 0]}
                :accel [+ 0]
                :weight [+ 0]
                :handling {:ground [+ 0]
                           :water [+ 0]
                           :air [+ 0]
                           :antigrav [+ 0]}
                :traction [+ 0]
                :turbo [+ 0]}
   :waddle-wing {:speed {:ground [+ 0]
                         :water [+ 0]
                         :air [+ 0]
                         :antigrav [+ 0]}
                 :accel [+ 0]
                 :weight [+ 0]
                 :handling {:ground [+ 0]
                            :water [+ 0]
                            :air [+ 0]
                            :antigrav [+ 0]}
                 :traction [+ 0]
                 :turbo [+ 0]}
   :peach-parasol {:speed {:ground [+ 0]
                           :water [+ 0]
                           :air [- 0.25]
                           :antigrav [+ 0]}
                   :accel [+ 0.25]
                   :weight [- 0.25]
                   :handling {:ground [+ 0]
                              :water [+ 0]
                              :air [+ 0.25]
                              :antigrav [+ 0]}
                   :traction [+ 0]
                   :turbo [+ 0.25]}
   :parachute {:speed {:ground [+ 0]
                       :water [+ 0]
                       :air [- 0.25]
                       :antigrav [+ 0]}
               :accel [+ 0.25]
               :weight [- 0.25]
               :handling {:ground [+ 0]
                          :water [+ 0]
                          :air [+ 0.25]
                          :antigrav [+ 0]}
               :traction [+ 0]
               :turbo [+ 0.25]}
   :parafoil {:speed {:ground [+ 0]
                      :water [+ 0]
                      :air [- 0.25]
                      :antigrav [+ 0]}
              :accel [+ 0.25]
              :weight [- 0.25]
              :handling {:ground [+ 0]
                         :water [+ 0]
                         :air [+ 0.25]
                         :antigrav [+ 0]}
              :traction [+ 0]
              :turbo [+ 0.25]}
   :flower-glider {:speed {:ground [+ 0]
                           :water [+ 0]
                           :air [- 0.25]
                           :antigrav [+ 0]}
                   :accel [+ 0.25]
                   :weight [- 0.25]
                   :handling {:ground [+ 0]
                              :water [+ 0]
                              :air [+ 0.25]
                              :antigrav [+ 0]}
                   :traction [+ 0]
                   :turbo [+ 0.25]}
   :bowser-kite {:speed {:ground [+ 0]
                         :water [+ 0]
                         :air [- 0.25]
                         :antigrav [+ 0]}
                 :accel [+ 0.25]
                 :weight [- 0.25]
                 :handling {:ground [+ 0]
                            :water [+ 0]
                            :air [+ 0.25]
                            :antigrav [+ 0]}
                 :traction [+ 0]
                 :turbo [+ 0.25]}
   :mktv-parafoil {:speed {:ground [+ 0]
                           :water [+ 0]
                           :air [- 0.25]
                           :antigrav [+ 0]}
                   :accel [+ 0.25]
                   :weight [- 0.25]
                   :handling {:ground [+ 0]
                              :water [+ 0]
                              :air [+ 0.25]
                              :antigrav [+ 0]}
                   :traction [+ 0]
                   :turbo [+ 0.25]}
   :plane-glider {:speed {:ground [+ 0]
                          :water [+ 0]
                          :air [+ 0]
                          :antigrav [+ 0]}
                  :accel [+ 0]
                  :weight [+ 0]
                  :handling {:ground [+ 0]
                             :water [+ 0]
                             :air [+ 0]
                             :antigrav [+ 0]}
                  :traction [+ 0]
                  :turbo [+ 0]}
   :gold-glider {:speed {:ground [+ 0]
                         :water [+ 0]
                         :air [+ 0]
                         :antigrav [+ 0]}
                 :accel [+ 0]
                 :weight [+ 0]
                 :handling {:ground [+ 0]
                            :water [+ 0]
                            :air [+ 0]
                            :antigrav [+ 0]}
                 :traction [+ 0]
                 :turbo [+ 0]}})
