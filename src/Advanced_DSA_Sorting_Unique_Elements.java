import java.util.*;
public class Advanced_DSA_Sorting_Unique_Elements {
    public static int solve(int[] A) {

        Arrays.sort(A);
        int count = 0;

        for(int i =1;i<A.length;i++)
        {

            if(i>=2) {
                if (A[i] < A[i - 1] || A[i] <= A[i - 2]) {
                    count++;
                    A[i] = A[i] + 1;
                    i--;

                }
            }
            if(A[i]==A[i-1])
            {
                count++;
                A[i] = A[i-1]+1;

            }
            System.out.print(A[i]+" ");

        }

        return count;
    }

    public static void main(String[] args) {

        int[] A = {  14755, 21950, 14936, 31288, 26685, 28971, 2458, 25110, 251, 16944, 8209, 28764, 5732, 8582, 677, 10536, 9137, 18125, 20094, 10440, 14468, 5494, 25186, 30662, 3286, 12512, 12862, 24609, 4401, 7105, 30978, 10206, 20256, 26312, 15538, 21695, 11749, 12929, 22714, 23891, 28521, 2168, 643, 27439, 31097, 20385, 31811, 4730, 16174, 24567, 27161, 8879, 24237, 31076, 32089, 29854, 18193, 8673, 27173, 22964, 31398, 11998, 23357, 4221, 16728, 32228, 22551, 25191, 24427, 8313, 20787, 20169, 9324, 32580, 18089, 26403, 26215, 14449, 15620, 16552, 15706, 15703, 29778, 7929, 4842, 29528, 5500, 15412, 23125, 23561, 18900, 21037, 1192, 2195, 28909, 18683, 1330, 23642, 26799, 11959, 31288, 2081, 4945, 3858, 493, 1012, 4499, 2473, 1185, 490, 3055, 4210, 141, 3753, 3204, 3744, 4499, 801, 819, 1441, 3405, 2392, 3538, 4416, 3235, 2620, 2179, 1683, 1369, 573, 2410, 1797, 1830, 3863, 2130, 1733, 2255, 2413, 256, 2717, 1025, 2937, 3902, 3996, 3594, 301, 1522, 3468, 1113, 4750, 2741, 2501, 2713, 2523, 4068, 3056, 186, 2354, 314, 1773, 3904, 2132, 1260, 910, 1314, 2964, 731, 3921, 4980, 2963, 3070, 1826, 4718, 1199, 3254, 2511, 1683, 1816, 4864, 4218, 395, 1265, 3934, 3579, 393, 4461, 4574, 59, 917, 2431, 3241, 3346, 1915, 593, 1486, 2593, 754, 3974, 1093, 3697, 20278, 18120, 2952, 11537, 25220, 30645, 19576, 12891, 12444, 20680, 24423, 26196, 30880, 20014, 25375, 29358, 27468, 5185, 1761, 13497, 28540, 12799, 4868, 13180, 4078, 26554, 25823, 15364, 30280, 17936, 25065, 6140, 5981, 14622, 9759, 4734, 29868, 21489, 29094, 16169, 5929, 28733, 6578, 14196, 10049, 30290, 166, 16961, 17944, 24907, 22909, 6582, 3093, 21385, 14952, 17224, 20640, 20320, 17080, 11800, 7978, 26639, 22527, 2947, 32110, 32502, 15986, 5620, 26359, 24835, 4242, 14845, 8675, 22638, 23052, 21927, 20710, 1702, 23005, 518, 26258, 6795, 12217, 6928, 24021, 14045, 30894, 31151, 23491, 7412, 7941, 5140, 7829, 28594, 24937, 30799, 24050, 8887, 21835, 21788, 110, 27091, 26756, 1280, 19025, 15553, 9788, 20373, 27033, 17170, 17163, 21794, 834, 15463, 13407, 22639, 9668, 14563, 22302, 23256, 17630, 13792, 27020, 16031, 8850, 29409, 23662, 25479, 18801, 4808, 16240, 29086, 31768, 23882, 19652, 18010, 15867, 13471, 22540, 14311, 22881, 4990, 9338, 8896, 1712, 10056, 26165, 30077, 6379, 23172, 29439, 12011, 21369, 25483, 26134, 610, 19752, 11140, 15191, 5715, 1137, 8595, 9641, 4385, 2302, 20046, 9369, 26674, 24169, 15217, 7490, 9541, 31815, 978, 31344, 5638, 3941, 8087, 6149, 6623, 24657, 16550, 32155, 530, 796, 21341, 11370, 14341, 13407, 30596, 1132, 7644, 1916, 1407, 1216, 23885, 18982, 29640, 27469, 6320, 16676, 12445, 30631, 12886, 8785, 17398, 21814, 7708, 28648, 19898, 28821, 28992, 6398, 13362, 15416, 9331, 848, 5822, 10322, 15407, 25151, 22727, 20981, 19274, 32537, 22772, 11643, 972, 22170, 10401, 12326, 18942, 12211, 22413, 15619, 32195, 3977, 10194, 22804, 28203, 11969, 15899, 27309, 11078, 21499, 8721, 2079, 10806, 14236, 8982, 6548, 28552, 21713, 30006, 21050, 13253, 19409, 6746, 17572, 13891, 14690, 27583, 5741, 12865, 10142, 22439, 5918, 10803, 31735, 10063, 15953, 32091, 1657, 24864, 21783, 31641, 5711, 6953, 20120, 27524, 14217, 20941, 5113, 14009, 32284, 5817, 18307, 12404, 554, 11290, 17153, 10845, 29060, 24588, 21865, 19364, 23150, 15445, 959, 24143, 5026, 24147, 20791, 1747, 26007, 2867, 21146, 6626, 22786, 21604, 4330, 1157, 20126, 24651, 32585, 31338, 17448, 11065, 2071, 24191, 27310, 21658, 30043, 6592, 29194, 19567, 14436, 21580, 11690, 29950, 21680, 17599, 30354, 3271, 29196, 2492, 28323, 29883, 23037, 16841, 2333, 9897, 25695, 21856, 31843, 28665, 5964, 10050, 254, 17564, 32319, 7951, 485, 15939, 31865, 16916, 8699, 7119, 7844, 20068, 15066, 21769, 12215, 3114, 14543, 5780, 5401, 18749, 30757, 14880, 13833, 13045, 1959, 3807, 29245, 574, 29792, 1597, 27593, 11754, 677, 6348, 10307, 5964, 30806, 30589, 19749, 25858, 23648, 23830, 31602, 18, 20358, 5088, 3741, 26425, 25186, 928, 17062, 19583, 3238, 23497, 1414, 12559, 10664, 11760, 30669, 29510, 7710, 3200, 24714, 778, 2853, 431, 6251, 12381, 12937, 29361, 12325, 18481, 28736, 17195, 22038, 29566, 27959, 19690, 16169, 3219, 28498, 32725, 5883, 24234, 27310, 15904, 15164, 958, 14377, 18627, 18007, 21665, 5412, 20523, 11605, 8009, 20615, 32047, 29950, 5994, 18694, 1605, 16962, 13643, 8355, 9462, 18904, 30418, 18804, 32655, 25381, 14048, 20391, 23322, 16991, 3813, 1219, 10636, 7666, 30379, 28720, 18496, 17187, 5750, 10490, 676, 24051, 32591, 31954, 11571, 30790, 15773, 2134, 27811, 29764, 31221, 9362, 32095, 1536, 7219, 19910, 3895, 28759, 9418, 26473, 2390, 2332, 12376, 367, 19061, 18546, 22910, 712, 14671, 26488, 27886, 23849, 14677, 21036, 9157, 11790, 22434, 28809, 22556, 28928, 17457, 2803, 26585, 10003, 27470, 19925, 14795, 6068, 17226, 12425, 6391, 3745, 8819, 17272, 23084, 15161, 12611, 10626, 32734, 5366, 19672, 16544, 20529, 26936, 28068, 15815, 4435, 30276, 26214, 16400, 24591, 14220, 3929, 7959, 21663, 18225, 12715, 30880, 27074, 30918, 18224, 16769, 23055, 4439, 25176, 23996, 26505, 16553, 21087, 1003, 16755, 16324, 22467, 28641, 31846, 14511, 31995, 10382, 20640, 23419, 26470, 23843, 4767, 17538, 13442, 7543, 6639, 6129, 14174, 29097, 2624, 30340, 10834, 5384, 12987, 12177, 10477, 22575, 30614, 21576, 1583, 28276, 31206, 4153, 21240, 10884, 29109, 27415, 10433, 28231, 28245, 22459, 3210, 21002, 28915, 13419, 32275, 18140, 5487, 8285, 1871, 14392, 15724, 19063, 24598, 28901, 29091, 7513, 31258, 18203, 28028, 27805, 2332, 21479, 2271, 1885, 23392, 14800, 29767, 21494, 5726, 16059, 31513, 22796, 11194, 15628, 16437, 22479, 6774, 12302, 10442, 23420, 20583, 24469, 26990, 25126, 16357, 28386, 26990, 694, 32199, 21190, 28770, 13361, 31631, 29451, 20997, 6713, 12769, 31503, 3140, 31447, 20282, 7602, 2965, 16759, 16094, 20594, 2442, 13108, 7186, 16853, 14758, 14422, 25996, 3848, 14447, 24345, 1320, 31941, 28868, 31665, 32732, 14201, 27505, 2442, 25070, 24231, 15617, 12756, 15204, 24455, 1492, 6975, 16573, 25332, 14449, 26371, 25566, 21125, 6684, 32548, 31055, 14585, 12716, 6644, 15783, 472, 6295, 5849, 20293, 23639, 25167, 6224, 28737, 17788, 3537, 32562, 9378, 32132, 13690, 11063, 210, 27778, 28957, 9400, 15439, 14920, 7764, 5049, 23714, 7562, 787, 10278, 3221, 9793, 32387, 22365, 29601, 1870, 15373, 4845, 8614, 9056, 7348, 23709, 25311, 24855, 19113, 23473, 4116, 2666, 11033, 22376, 12049, 15174, 8778, 15049, 30552, 9079, 24038, 1439, 3859, 8140, 6551, 20163, 5196, 28278, 4563, 15257, 18016, 690, 6394, 4317, 25521, 15272, 670, 16544, 3996, 658, 22817, 6541, 21675, 5152, 4486, 31601, 5899, 31003, 12673, 13563, 2880, 29258, 7120, 28352, 1303, 23442, 30414, 18305, 24039, 6456, 32467, 5561, 30333, 17383, 18875, 31447, 37111, 25568, 31442, 12891, 25101, 34984, 31402, 11890, 23118, 31795, 24554, 8186, 16026, 8044, 12238, 15112, 37031, 5808, 28324, 19301, 18301, 18003, 32847, 6413, 22522, 7961, 22727, 7343, 36175, 15038, 31896, 33840, 12672, 18543, 20831, 34600, 34280, 18767, 15952, 35683, 35763, 7411, 7347, 6497, 7266, 24038, 30818, 8406, 21066, 36389, 8268, 36139, 16661, 5028, 34549, 10747, 32320, 33992, 29428, 22423, 31131, 17643, 32627, 36738, 9677, 28891, 27827, 14582, 28877, 7003, 16518, 19805, 35946, 22944, 14034, 19673, 34500, 8149, 33301, 33469, 13008, 28056, 23516, 6673, 24792, 19066, 25930, 33298, 26361, 37507, 22423, 8879, 31139, 37548, 33934, 24845, 21533, 30052, 9998, 29701, 12542, 32524, 33674, 34977, 37557, 6778, 22665, 13986, 23554, 13689, 7975, 17661, 14458, 27975, 7058, 15960, 21767, 35606, 15758, 21906, 26725, 20620, 20722, 6713, 35751, 5188, 32296, 32018, 25264, 11850, 6833, 9365, 5306, 13474, 18846, 37230, 5331, 34754, 27672, 37629, 14938, 12051, 25049, 35798, 10631, 34164, 6576, 34369, 35808, 13751, 29186, 6331, 6341, 34594, 26948, 6772, 28133, 31216, 7809, 10192, 14278, 13262, 8666, 30438, 10817, 15454, 5377, 31748, 18692, 35255, 7101, 24104, 32783, 23778, 7274, 15240, 35895, 28254, 20598, 15883, 13221, 27294, 9444, 32718, 20056, 16006, 27341, 16289, 7839, 13298, 22490, 25991, 31136, 24110, 22219, 22329, 16340, 22143, 10228, 7331, 9608, 18585, 20922, 21605, 19294, 20262, 24858, 30804, 9930, 8262, 31266, 29175, 14997, 35337, 14454, 32522, 8030, 16119, 24525, 26110, 23572, 29320, 23666, 31351, 36477, 17836, 5059, 29133, 25522, 33605, 33973, 34700, 24736, 11432, 14414, 29172, 31368, 22048, 33321, 9849, 32640, 21354, 37110, 28227, 20209, 13370, 20216, 19120, 25111, 37045, 37509, 10701, 9348, 9716, 7817, 27361, 7325, 17032, 29443, 13026, 25627, 33520, 28038, 37118, 28811, 24101, 14777, 29459, 11214, 33295, 37336, 27191, 23706, 32780, 20273, 16177, 24312, 18800, 19112, 22270, 11460, 31744, 36148, 26445, 13871, 32374, 20575, 31492, 35392, 27904, 20170, 18105, 20303, 21953, 25766, 19769, 35721, 17742, 32828, 21508, 15727, 9011, 25190, 10190, 17495, 24171, 12052, 12544, 6377, 27115, 19912, 22582, 21923, 35096, 6682, 15039, 36694, 27724, 25653, 12064, 32167, 7510, 16728, 6544, 29583, 15351, 11350, 36989, 10203, 35430, 30230, 20742, 19884, 18892, 34323, 33663, 31991, 26312, 27357, 20465, 27399, 30188, 14999, 17047, 29431, 32830, 17271, 32865, 28216, 8120, 35914, 19317, 23825, 27593, 9453, 22441, 24345, 13778, 18132, 28427, 31679, 5546, 17799, 26201, 15043, 17946, 20256, 24969, 36027, 20833, 31950, 26690, 33679, 36274, 13141, 19041, 23293, 27057, 21388, 21621, 20757, 35065, 15070, 21572, 20158, 12441, 5065, 27972, 24624, 33683, 30306, 15650, 32119, 36699, 22735, 20542, 8950, 10334, 20427, 26156, 14818, 5752, 7974, 34357, 20675, 37245, 6723, 25557, 9206, 36273, 21656, 37691, 30254, 22608, 8753, 36299, 14574, 33799, 26669, 34463, 34065, 9592, 15679, 36610, 25410, 24506, 23087, 35572, 25732, 16599, 23126, 30121, 35500, 28237, 19494, 30217, 32994, 8589, 37279, 17201, 9251, 29823, 37083, 22769, 23490, 32251, 13443, 31820, 16866, 15954, 15448, 36860, 7165, 23491, 23980, 14571, 9057, 12038, 13285, 21179, 7598, 8133, 33024, 13374, 17753, 20766, 15884, 17407, 33324, 7715, 31659, 23735, 29123, 26201, 37525, 33241, 16401, 10812, 9237, 25607, 20441, 30650, 27274, 13722, 13109, 9907, 23015, 20254, 29715, 25984, 36915, 9171, 11442, 5481, 5642, 34349, 28714, 30509, 28442, 15445, 33505, 10109, 31399, 25767, 25367, 27521, 9223, 10802, 8539, 19794, 25382, 18746, 35091, 34943, 36100, 25529, 6392, 18057, 29746, 9690, 19352, 11110, 22873, 14972, 12242, 12801, 11187, 36790, 20829, 22712, 6543, 27469, 28994, 7645, 28881, 20287, 36445, 19511, 20336, 11836, 15840, 6014, 9207, 28711, 21456, 35041, 32260, 18073, 23431, 15235, 11980, 20831, 24624, 26874, 14741, 37623, 34125, 17871, 5179, 13591, 28468, 11778, 14251, 7462, 31630, 8579, 32875, 20673, 18903, 37049, 24336, 10807, 5089, 30974, 22726, 23821, 22097, 20769, 22476, 19067, 18720, 17891, 19446, 9709, 10267, 18043, 6953, 27011, 19300, 24851, 25058, 6802, 36847, 28488, 33711, 24097, 36869, 37549, 35764, 23916, 11204, 33097, 23848, 31332, 24989, 8724, 13269, 21549, 30421, 31102, 29852, 7070, 28677, 26089, 19950, 14277, 22938, 11306, 10324, 14945, 24661, 21515, 26344, 9318, 14796, 21708, 30682, 31356, 23783, 37277, 13548, 10624, 35429, 9766, 5110, 15106, 9556, 33535, 10083, 22981, 23452, 23096, 28338, 9794, 7797, 23507, 30454, 23334, 27372, 16965, 19286, 16847, 25186, 12025, 13710, 30419, 13069, 22221, 20076, 32377, 20597, 32402, 24148, 10558, 31736, 18320, 36284, 18513, 7495, 19456, 26032, 12823, 27366, 35728, 8272, 5800, 25264, 10211, 18765, 9296, 37457, 28942, 11888, 31759, 12234, 16924, 8211, 30233, 33265, 11659, 33189, 13911, 6382, 31180, 10794, 37092, 22207, 28103, 5305, 16017, 18357, 27989, 24829, 24930, 19188, 26053, 9141, 22799, 35575, 35416, 34612, 26499, 17930, 24772, 15329, 9568, 26318, 7604, 14519, 18041, 27832, 20806, 19398, 11862, 9362, 25484, 31408, 21684, 12537, 24844, 13102, 31235, 25310, 5952, 19337, 11238, 25093, 33047, 21281, 6583, 9609, 33650, 13033, 14592, 15445};
        System.out.println(solve(A));
    }
}
