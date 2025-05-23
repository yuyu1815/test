/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ import java.nio.file.Path;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000À\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\b\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\000 R2\0020\001:\001RB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\006\020\f\032\0020\rJ\024\020\016\032\016\022\004\022\0020\020\022\004\022\0020\0210\017H\002J2\020\022\032\024\022\020\022\016\022\004\022\0020\025\022\004\022\0020\0260\0240\0232\026\020\027\032\022\022\004\022\0020\020\022\004\022\0020\0300\017j\002`\031H\002J2\020\032\032\024\022\020\022\016\022\004\022\0020\025\022\004\022\0020\0330\0240\0232\026\020\027\032\022\022\004\022\0020\020\022\004\022\0020\0300\017j\002`\031H\002J8\020\034\032\0020\0352\006\020\036\032\0020\0252\016\020\037\032\n\022\004\022\0020\020\030\0010\0232\026\020\027\032\022\022\004\022\0020\020\022\004\022\0020\0300\017j\002`\031H\002J8\020 \032\0020!2\006\020\036\032\0020\0252\016\020\037\032\n\022\004\022\0020\020\030\0010\0232\026\020\027\032\022\022\004\022\0020\020\022\004\022\0020\0300\017j\002`\031H\002J\030\020\"\032\0020\0252\006\020\036\032\0020\0252\006\020#\032\0020\020H\002J\035\020$\032\022\022\004\022\0020\020\022\004\022\0020\0300\017j\002`\031H\000¢\006\002\b%J \020&\032\0020'2\006\020\036\032\0020\0252\006\020(\032\0020\0202\006\020)\032\0020\021H\002J\020\020*\032\0020+2\006\020,\032\0020\025H\002J\030\020-\032\0020+2\006\020.\032\0020\0202\006\020,\032\0020\025H\002J\030\020/\032\0020+2\006\020(\032\0020\0202\006\020,\032\0020\025H\002J8\0200\032\0020+2\026\020\027\032\022\022\004\022\0020\020\022\004\022\0020\0300\017j\002`\0312\016\0201\032\n\022\004\022\0020\020\030\0010\0232\006\0202\032\0020\025H\002JX\0203\032\n\022\004\022\00204\030\0010\0232\006\0205\032\0020\0252\006\0206\032\0020\0202\026\020\002\032\022\022\004\022\0020\020\022\004\022\0020\0300\017j\002`\0312\016\0207\032\n\022\004\022\0020\020\030\0010\0232\016\020\037\032\n\022\004\022\0020\020\030\0010\023H\002J0\0208\032\b\022\004\022\002H90\023\"\b\b\000\0209*\0020:*\b\022\004\022\002H90\0232\f\020;\032\b\022\004\022\0020\0200\023H\002J'\020<\032\0020+2\006\020=\032\0020>2\006\020,\032\0020\0252\f\020?\032\b\022\004\022\0020\0200@H\bJ\020\020A\032\0020\0212\006\020,\032\0020\025H\002J\020\020B\032\0020\0012\006\020,\032\0020\025H\002J\020\020C\032\0020D2\006\020E\032\0020\025H\002J\020\020F\032\0020G2\006\020\036\032\0020\025H\002J\020\020H\032\0020I2\006\020J\032\0020\025H\002J\020\020K\032\0020L2\006\020\036\032\0020\025H\002J\020\020M\032\0020N2\006\020O\032\0020\025H\002J\020\020P\032\0020Q2\006\020\036\032\0020\025H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\030\020\006\032\n \b*\004\030\0010\0070\007X\004¢\006\004\n\002\020\tR\016\020\n\032\0020\013X\004¢\006\002\n\000¨\006S"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;", "", "library", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;)V", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "kotlin.jvm.PlatformType", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "jsonMapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "build", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibrary;", "readSharedChatSchemas", "", "", "Lcom/fasterxml/jackson/databind/JsonNode;", "readChatTasks", "", "Lkotlin/Pair;", "Ljava/nio/file/Path;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityChatTask;", "functionLibrary", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctions;", "readTasks", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask;", "createChatTagTask", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityChatTask$Tag;", "tagFile", "taskFunctions", "createTagTask", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask$Tag;", "velocityPromptPath", "promptPath", "readFunctions", "readFunctions$tasks_provider_llm_prompt_velocity_model", "createTagFunction", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag;", "functionName", "schema", "validateEntityPath", "", "path", "validateEntityName", "name", "validateFunctionName", "validateFunctions", "functions", "taskPath", "buildTagTaskFunctions", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTagDescriptor;", "file", "llmProfileId", "tagFunctions", "sortedByDefinition", "TagT", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;", "definition", "check", "condition", "", "message", "Lkotlin/Function0;", "safeReadJsonSchema", "relativePath", "parseFunction", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunction;", "functionFile", "parseFunctionTag", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunctionTag;", "parseChatTask", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskDescriptor;", "chatFile", "parseChatTaskTag", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskTagDescriptor;", "parseTask", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskDescriptor;", "taskFile", "parseTaskTag", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskTagDescriptor;", "Companion", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nVelocityLibraryBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityLibraryBuilder.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder\n+ 2 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt\n+ 3 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt$checkOrVelocityLibraryException$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Extensions.kt\ncom/fasterxml/jackson/module/kotlin/ExtensionsKt\n*L\n1#1,288:1\n236#1:323\n237#1:329\n236#1:351\n237#1:357\n236#1:360\n237#1:366\n236#1:368\n237#1:374\n236#1:375\n237#1:381\n236#1:382\n237#1:388\n236#1:389\n237#1:395\n236#1:396\n237#1:405\n236#1:406\n237#1:412\n236#1:414\n237#1:420\n236#1:421\n237#1:427\n236#1:428\n237#1:434\n236#1:435\n237#1:441\n236#1:444\n237#1:450\n236#1:451\n237#1:457\n7#2,7:289\n29#2:296\n15#2:299\n7#2,7:308\n29#2:315\n15#2:322\n12#2,2:324\n29#2:326\n15#2:328\n7#2,7:340\n29#2:347\n15#2:350\n12#2,2:352\n29#2:354\n15#2:356\n12#2,2:361\n29#2:363\n15#2:365\n12#2,2:369\n29#2:371\n15#2:373\n12#2,2:376\n29#2:378\n15#2:380\n12#2,2:383\n29#2:385\n15#2:387\n12#2,2:390\n29#2:392\n15#2:394\n12#2,2:397\n29#2:399\n15#2:404\n12#2,2:407\n29#2:409\n15#2:411\n12#2,2:415\n29#2:417\n15#2:419\n12#2,2:422\n29#2:424\n15#2:426\n12#2,2:429\n29#2:431\n15#2:433\n12#2,2:436\n29#2:438\n15#2:440\n12#2,2:445\n29#2:447\n15#2:449\n12#2,2:452\n29#2:454\n15#2:456\n12#2,2:459\n29#2:461\n15#2:463\n22#2,8:465\n22#2,8:477\n22#2,8:489\n22#2,8:501\n22#2,8:513\n22#2,8:525\n22#2,8:537\n8#3:297\n8#3:316\n8#3:348\n1#4:298\n1#4:317\n1#4:327\n1#4:349\n1#4:355\n1#4:358\n1#4:364\n1#4:372\n1#4:379\n1#4:386\n1#4:393\n1#4:400\n1#4:410\n1#4:418\n1#4:425\n1#4:432\n1#4:439\n1#4:448\n1#4:455\n1#4:462\n1#4:464\n1#4:473\n1#4:476\n1#4:485\n1#4:488\n1#4:497\n1#4:500\n1#4:509\n1#4:512\n1#4:521\n1#4:524\n1#4:533\n1#4:536\n1#4:545\n1#4:550\n1557#5:300\n1628#5,3:301\n1557#5:304\n1628#5,3:305\n1557#5:318\n1628#5,3:319\n1557#5:330\n1628#5,3:331\n1202#5,2:334\n1230#5,4:336\n1863#5:359\n1864#5:367\n827#5:401\n855#5,2:402\n1863#5:413\n1864#5:442\n1863#5:443\n1864#5:458\n1557#5:546\n1628#5,3:547\n1557#5:551\n1628#5,3:552\n1557#5:555\n1628#5,3:556\n56#6:474\n49#6:475\n56#6:486\n49#6:487\n56#6:498\n49#6:499\n56#6:510\n49#6:511\n56#6:522\n49#6:523\n56#6:534\n49#6:535\n*S KotlinDebug\n*F\n+ 1 VelocityLibraryBuilder.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder\n*L\n114#1:323\n114#1:329\n141#1:351\n141#1:357\n155#1:360\n155#1:366\n160#1:368\n160#1:374\n161#1:375\n161#1:381\n165#1:382\n165#1:388\n166#1:389\n166#1:395\n171#1:396\n171#1:405\n185#1:406\n185#1:412\n194#1:414\n194#1:420\n197#1:421\n197#1:427\n198#1:428\n198#1:434\n201#1:435\n201#1:441\n212#1:444\n212#1:450\n216#1:451\n216#1:457\n31#1:289,7\n31#1:296\n31#1:299\n45#1:308,7\n45#1:315\n45#1:322\n114#1:324,2\n114#1:326\n114#1:328\n131#1:340,7\n131#1:347\n131#1:350\n141#1:352,2\n141#1:354\n141#1:356\n155#1:361,2\n155#1:363\n155#1:365\n160#1:369,2\n160#1:371\n160#1:373\n161#1:376,2\n161#1:378\n161#1:380\n165#1:383,2\n165#1:385\n165#1:387\n166#1:390,2\n166#1:392\n166#1:394\n171#1:397,2\n171#1:399\n171#1:404\n185#1:407,2\n185#1:409\n185#1:411\n194#1:415,2\n194#1:417\n194#1:419\n197#1:422,2\n197#1:424\n197#1:426\n198#1:429,2\n198#1:431\n198#1:433\n201#1:436,2\n201#1:438\n201#1:440\n212#1:445,2\n212#1:447\n212#1:449\n216#1:452,2\n216#1:454\n216#1:456\n236#1:459,2\n236#1:461\n236#1:463\n241#1:465,8\n251#1:477,8\n257#1:489,8\n263#1:501,8\n269#1:513,8\n275#1:525,8\n281#1:537,8\n31#1:297\n45#1:316\n131#1:348\n31#1:298\n45#1:317\n114#1:327\n131#1:349\n141#1:355\n155#1:364\n160#1:372\n161#1:379\n165#1:386\n166#1:393\n171#1:400\n185#1:410\n194#1:418\n197#1:425\n198#1:432\n201#1:439\n212#1:448\n216#1:455\n236#1:462\n241#1:473\n251#1:485\n257#1:497\n263#1:509\n269#1:521\n275#1:533\n281#1:545\n35#1:300\n35#1:301,3\n36#1:304\n36#1:305,3\n45#1:318\n45#1:319,3\n130#1:330\n130#1:331,3\n130#1:334,2\n130#1:336,4\n154#1:359\n154#1:367\n172#1:401\n172#1:402,2\n192#1:413\n192#1:442\n208#1:443\n208#1:458\n63#1:546\n63#1:547,3\n77#1:551\n77#1:552,3\n124#1:555\n124#1:556,3\n250#1:474\n250#1:475\n256#1:486\n256#1:487\n262#1:498\n262#1:499\n268#1:510\n268#1:511\n274#1:522\n274#1:523\n280#1:534\n280#1:535\n*E\n"})
/*     */ public final class VelocityLibraryBuilder {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final VelocityLibraryWalker library;
/*     */   private final ObjectMapper mapper;
/*     */   @NotNull
/*     */   private final JsonMapper jsonMapper;
/*     */   @NotNull
/*     */   private static final String DEFAULT_TASK_TAG = "default";
/*     */   
/*     */   public VelocityLibraryBuilder(@NotNull VelocityLibraryWalker library) {
/*  18 */     this.library = library;
/*     */     
/*  20 */     this.mapper = (new ObjectMapper((JsonFactory)new YAMLFactory())).registerModule((Module)(new KotlinModule.Builder()).build());
/*  21 */     this.jsonMapper = new JsonMapper();
/*     */   }
/*     */   @NotNull
/*  24 */   public final VelocityLibrary build() { Map<String, VelocityFunction> functions = readFunctions$tasks_provider_llm_prompt_velocity_model();
/*     */     
/*  26 */     List<Pair<Path, VelocityTask>> tasks = readTasks(functions);
/*  27 */     List<Pair<Path, VelocityChatTask>> chatTasks = readChatTasks(functions);
/*     */     
/*  29 */     List allTasks = CollectionsKt.plus(tasks, chatTasks);
/*  30 */     Map duplicates = UtilsKt.findDuplicates(allTasks, this::build$lambda$0);
/*  31 */     boolean condition$iv = duplicates.isEmpty();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 289 */     int $i$f$checkOrVelocityLibraryException = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 294 */     if (!condition$iv) {
/* 295 */       int $i$f$buildMessage = 0;
/* 296 */       int $i$a$-checkOrVelocityLibraryException-UtilsKt$checkOrVelocityLibraryException$1 = 0, $i$a$-checkOrVelocityLibraryException$default-VelocityLibraryBuilder$build$1 = 0;
/*     */     }  List<Pair<Path, VelocityTask>> list1 = tasks;
/*     */     Map<String, VelocityFunction> map1 = functions;
/*     */     int $i$f$map = 0;
/* 300 */     List<Pair<Path, VelocityTask>> list2 = list1; Collection<VelocityTask> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 301 */     for (Object<Path, VelocityTask> item$iv$iv : list2) {
/* 302 */       Pair pair = (Pair)item$iv$iv; Collection<VelocityTask> collection1 = collection; int $i$a$-map-VelocityLibraryBuilder$build$2 = 0; collection1.add((VelocityTask)pair.getSecond());
/* 303 */     }  Iterable<Pair<Path, VelocityChatTask>> $this$map$iv = chatTasks; List<VelocityTask> list3 = (List)collection; map1 = map1; $i$f$map = 0;
/* 304 */     Iterable<Pair<Path, VelocityChatTask>> $this$mapTo$iv$iv = $this$map$iv; Collection<VelocityChatTask> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 305 */     for (Object<Path, VelocityChatTask> item$iv$iv : $this$mapTo$iv$iv) {
/* 306 */       Pair it = (Pair)item$iv$iv; Collection<VelocityChatTask> collection1 = destination$iv$iv; int $i$a$-map-VelocityLibraryBuilder$build$3 = 0; collection1.add((VelocityChatTask)it.getSecond());
/* 307 */     }  List<VelocityChatTask> list4 = (List)destination$iv$iv; List<VelocityChatTask> list5 = list4; List<VelocityTask> list6 = list3; Map<String, VelocityFunction> map2 = map1; return new VelocityLibrary(map2, list6, list5); }
/*     */   private static final Object build$lambda$0(VelocityLibraryBuilder this$0, Path it) { Intrinsics.checkNotNullParameter(it, "it"); return this$0.relativePath(it); } private static final Pair readSharedChatSchemas$lambda$4(VelocityLibraryBuilder this$0, Path path) { Intrinsics.checkNotNullParameter(path, "path"); return TuplesKt.to(PathsKt.getName(path), this$0.safeReadJsonSchema(path)); } private final List<Pair<Path, VelocityChatTask>> readChatTasks(Map functionLibrary) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial readSharedChatSchemas : ()Ljava/util/Map;
/*     */     //   4: astore_2
/*     */     //   5: aload_0
/*     */     //   6: getfield library : Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: aload_2
/*     */     //   12: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;Ljava/util/Map;Ljava/util/Map;)Lkotlin/jvm/functions/Function2;
/*     */     //   17: invokeinterface walkChats : (Lkotlin/jvm/functions/Function2;)Ljava/util/List;
/*     */     //   22: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 0
/*     */     //   #51	-> 5
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   5	18	2	sharedSchemas	Ljava/util/Map;
/*     */     //   0	23	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;
/*     */     //   0	23	1	functionLibrary	Ljava/util/Map; } private static final Pair readChatTasks$lambda$11(VelocityLibraryBuilder this$0, Map<String, VelocityFunction> $functionLibrary, Map $sharedSchemas, Path taskFile, TargetSatellites satellites) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc_w 'taskFile'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #4
/*     */     //   9: ldc_w 'satellites'
/*     */     //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   15: aload_0
/*     */     //   16: aload_3
/*     */     //   17: invokespecial parseChatTask : (Ljava/nio/file/Path;)Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskDescriptor;
/*     */     //   20: astore #5
/*     */     //   22: aload_0
/*     */     //   23: aload #5
/*     */     //   25: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   28: aload_3
/*     */     //   29: invokespecial validateEntityName : (Ljava/lang/String;Ljava/nio/file/Path;)V
/*     */     //   32: aload_0
/*     */     //   33: aload_3
/*     */     //   34: invokespecial validateEntityPath : (Ljava/nio/file/Path;)V
/*     */     //   37: aload_0
/*     */     //   38: aload_1
/*     */     //   39: aload #5
/*     */     //   41: invokevirtual getFunctions : ()Ljava/util/List;
/*     */     //   44: aload_3
/*     */     //   45: invokespecial validateFunctions : (Ljava/util/Map;Ljava/util/List;Ljava/nio/file/Path;)V
/*     */     //   48: new ai/grazie/tasks/provider/prompt/velocity/resources/lib/ChatTaskSchema
/*     */     //   51: dup
/*     */     //   52: aload_0
/*     */     //   53: aload #4
/*     */     //   55: invokevirtual getParameters : ()Ljava/nio/file/Path;
/*     */     //   58: invokespecial safeReadJsonSchema : (Ljava/nio/file/Path;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   61: aload_2
/*     */     //   62: invokespecial <init> : (Lcom/fasterxml/jackson/databind/JsonNode;Ljava/util/Map;)V
/*     */     //   65: aload_0
/*     */     //   66: aload #4
/*     */     //   68: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;)Lkotlin/jvm/functions/Function0;
/*     */     //   73: invokestatic validate : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/ChatTaskSchema;Lkotlin/jvm/functions/Function0;)Lai/grazie/tasks/provider/prompt/velocity/resources/lib/ChatTaskSchema;
/*     */     //   76: astore #6
/*     */     //   78: aload_0
/*     */     //   79: aload #4
/*     */     //   81: invokevirtual getTags : ()Ljava/util/List;
/*     */     //   84: checkcast java/lang/Iterable
/*     */     //   87: astore #8
/*     */     //   89: astore #17
/*     */     //   91: iconst_0
/*     */     //   92: istore #9
/*     */     //   94: aload #8
/*     */     //   96: astore #10
/*     */     //   98: new java/util/ArrayList
/*     */     //   101: dup
/*     */     //   102: aload #8
/*     */     //   104: bipush #10
/*     */     //   106: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   109: invokespecial <init> : (I)V
/*     */     //   112: checkcast java/util/Collection
/*     */     //   115: astore #11
/*     */     //   117: iconst_0
/*     */     //   118: istore #12
/*     */     //   120: aload #10
/*     */     //   122: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   127: astore #13
/*     */     //   129: aload #13
/*     */     //   131: invokeinterface hasNext : ()Z
/*     */     //   136: ifeq -> 186
/*     */     //   139: aload #13
/*     */     //   141: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   146: astore #14
/*     */     //   148: aload #11
/*     */     //   150: aload #14
/*     */     //   152: checkcast java/nio/file/Path
/*     */     //   155: astore #15
/*     */     //   157: astore #18
/*     */     //   159: iconst_0
/*     */     //   160: istore #16
/*     */     //   162: aload_0
/*     */     //   163: aload #15
/*     */     //   165: aload #5
/*     */     //   167: invokevirtual getFunctions : ()Ljava/util/List;
/*     */     //   170: aload_1
/*     */     //   171: invokespecial createChatTagTask : (Ljava/nio/file/Path;Ljava/util/List;Ljava/util/Map;)Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityChatTask$Tag;
/*     */     //   174: aload #18
/*     */     //   176: swap
/*     */     //   177: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   182: pop
/*     */     //   183: goto -> 129
/*     */     //   186: aload #11
/*     */     //   188: checkcast java/util/List
/*     */     //   191: nop
/*     */     //   192: aload #17
/*     */     //   194: swap
/*     */     //   195: aload #5
/*     */     //   197: invokevirtual getTagPriorities : ()Ljava/util/List;
/*     */     //   200: invokespecial sortedByDefinition : (Ljava/util/List;Ljava/util/List;)Ljava/util/List;
/*     */     //   203: astore #7
/*     */     //   205: aload_3
/*     */     //   206: new ai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityChatTask
/*     */     //   209: dup
/*     */     //   210: aload #5
/*     */     //   212: aload #7
/*     */     //   214: aload #6
/*     */     //   216: invokespecial <init> : (Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskDescriptor;Ljava/util/List;Lai/grazie/tasks/provider/prompt/velocity/resources/lib/ChatTaskSchema;)V
/*     */     //   219: astore #8
/*     */     //   221: aload #8
/*     */     //   223: astore #9
/*     */     //   225: astore #17
/*     */     //   227: iconst_0
/*     */     //   228: istore #10
/*     */     //   230: aload #9
/*     */     //   232: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity
/*     */     //   235: ldc_w 'default'
/*     */     //   238: aload_0
/*     */     //   239: aload_3
/*     */     //   240: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;Ljava/nio/file/Path;)Lkotlin/jvm/functions/Function0;
/*     */     //   245: invokestatic validateTags : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   248: aload #17
/*     */     //   250: aload #8
/*     */     //   252: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   255: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 15
/*     */     //   #53	-> 22
/*     */     //   #54	-> 32
/*     */     //   #55	-> 37
/*     */     //   #57	-> 48
/*     */     //   #58	-> 52
/*     */     //   #59	-> 61
/*     */     //   #57	-> 62
/*     */     //   #60	-> 65
/*     */     //   #57	-> 76
/*     */     //   #62	-> 78
/*     */     //   #63	-> 89
/*     */     //   #546	-> 94
/*     */     //   #547	-> 120
/*     */     //   #548	-> 148
/*     */     //   #63	-> 162
/*     */     //   #548	-> 177
/*     */     //   #549	-> 186
/*     */     //   #546	-> 191
/*     */     //   #64	-> 195
/*     */     //   #62	-> 203
/*     */     //   #65	-> 205
/*     */     //   #550	-> 225
/*     */     //   #65	-> 230
/*     */     //   #65	-> 250
/*     */     //   #65	-> 252
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   162	12	16	$i$a$-map-VelocityLibraryBuilder$readChatTasks$1$tagTasks$1	I
/*     */     //   159	15	15	it	Ljava/nio/file/Path;
/*     */     //   148	35	14	item$iv$iv	Ljava/lang/Object;
/*     */     //   120	68	12	$i$f$mapTo	I
/*     */     //   117	71	10	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   117	71	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   94	98	9	$i$f$map	I
/*     */     //   91	101	8	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   230	18	10	$i$a$-also-VelocityLibraryBuilder$readChatTasks$1$1	I
/*     */     //   227	21	9	it	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityChatTask;
/*     */     //   22	234	5	task	Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskDescriptor;
/*     */     //   78	178	6	taskSchema	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/ChatTaskSchema;
/*     */     //   205	51	7	tagTasks	Ljava/util/List;
/*     */     //   0	256	0	this$0	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;
/*     */     //   0	256	1	$functionLibrary	Ljava/util/Map;
/*     */     //   0	256	2	$sharedSchemas	Ljava/util/Map;
/*     */     //   0	256	3	taskFile	Ljava/nio/file/Path;
/* 308 */     //   0	256	4	satellites	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites; } private static final Object readChatTasks$lambda$11$lambda$7(VelocityLibraryBuilder this$0, TargetSatellites $satellites) { return this$0.relativePath($satellites.getParameters()); } private static final Object readChatTasks$lambda$11$lambda$10$lambda$9(VelocityLibraryBuilder this$0, Path $taskFile) { return this$0.relativePath($taskFile); } private final Map<String, JsonNode> readSharedChatSchemas() { List<?> schemas = this.library.walkSharedChatSchemas(this::readSharedChatSchemas$lambda$4); Map<String, JsonNode> result = MapsKt.toMap(schemas); boolean condition$iv = (result.size() == schemas.size()); int $i$f$checkOrVelocityLibraryException = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 313 */     if (!condition$iv)
/* 314 */     { int $i$f$buildMessage = 0;
/* 315 */       int $i$a$-checkOrVelocityLibraryException-UtilsKt$checkOrVelocityLibraryException$1 = 0, $i$a$-checkOrVelocityLibraryException$default-VelocityLibraryBuilder$readSharedChatSchemas$1 = 0;
/*     */       Iterable<?> $this$map$iv = schemas;
/*     */       int $i$f$map = 0;
/* 318 */       Iterable<?> iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 319 */       Iterator<?> iterator = iterable1.iterator(); }  return result; }
/*     */   private final List<Pair<Path, VelocityTask>> readTasks(Map functionLibrary) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield library : Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;
/*     */     //   4: aload_0
/*     */     //   5: aload_1
/*     */     //   6: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;Ljava/util/Map;)Lkotlin/jvm/functions/Function2;
/*     */     //   11: invokeinterface walkTasks : (Lkotlin/jvm/functions/Function2;)Ljava/util/List;
/*     */     //   16: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #70	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	17	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;
/*     */     //   0	17	1	functionLibrary	Ljava/util/Map; }
/*     */   private static final Pair readTasks$lambda$15(VelocityLibraryBuilder this$0, Map<String, VelocityFunction> $functionLibrary, Path taskFile, TargetSatellites satellites) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 'taskFile'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_3
/*     */     //   8: ldc_w 'satellites'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_0
/*     */     //   15: aload_2
/*     */     //   16: invokespecial parseTask : (Ljava/nio/file/Path;)Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskDescriptor;
/*     */     //   19: astore #4
/*     */     //   21: aload_0
/*     */     //   22: aload #4
/*     */     //   24: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   27: aload_2
/*     */     //   28: invokespecial validateEntityName : (Ljava/lang/String;Ljava/nio/file/Path;)V
/*     */     //   31: aload_0
/*     */     //   32: aload_2
/*     */     //   33: invokespecial validateEntityPath : (Ljava/nio/file/Path;)V
/*     */     //   36: aload_0
/*     */     //   37: aload_1
/*     */     //   38: aload #4
/*     */     //   40: invokevirtual getInChatTaskBehavior : ()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelInChatTaskBehavior;
/*     */     //   43: dup
/*     */     //   44: ifnull -> 53
/*     */     //   47: invokevirtual getFunctions : ()Ljava/util/List;
/*     */     //   50: goto -> 55
/*     */     //   53: pop
/*     */     //   54: aconst_null
/*     */     //   55: aload_2
/*     */     //   56: invokespecial validateFunctions : (Ljava/util/Map;Ljava/util/List;Ljava/nio/file/Path;)V
/*     */     //   59: aload_0
/*     */     //   60: aload_3
/*     */     //   61: invokevirtual getParameters : ()Ljava/nio/file/Path;
/*     */     //   64: invokespecial safeReadJsonSchema : (Ljava/nio/file/Path;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   67: astore #5
/*     */     //   69: aload_0
/*     */     //   70: aload_3
/*     */     //   71: invokevirtual getTags : ()Ljava/util/List;
/*     */     //   74: checkcast java/lang/Iterable
/*     */     //   77: astore #7
/*     */     //   79: astore #16
/*     */     //   81: iconst_0
/*     */     //   82: istore #8
/*     */     //   84: aload #7
/*     */     //   86: astore #9
/*     */     //   88: new java/util/ArrayList
/*     */     //   91: dup
/*     */     //   92: aload #7
/*     */     //   94: bipush #10
/*     */     //   96: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   99: invokespecial <init> : (I)V
/*     */     //   102: checkcast java/util/Collection
/*     */     //   105: astore #10
/*     */     //   107: iconst_0
/*     */     //   108: istore #11
/*     */     //   110: aload #9
/*     */     //   112: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   117: astore #12
/*     */     //   119: aload #12
/*     */     //   121: invokeinterface hasNext : ()Z
/*     */     //   126: ifeq -> 188
/*     */     //   129: aload #12
/*     */     //   131: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   136: astore #13
/*     */     //   138: aload #10
/*     */     //   140: aload #13
/*     */     //   142: checkcast java/nio/file/Path
/*     */     //   145: astore #14
/*     */     //   147: astore #17
/*     */     //   149: iconst_0
/*     */     //   150: istore #15
/*     */     //   152: aload_0
/*     */     //   153: aload #14
/*     */     //   155: aload #4
/*     */     //   157: invokevirtual getInChatTaskBehavior : ()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelInChatTaskBehavior;
/*     */     //   160: dup
/*     */     //   161: ifnull -> 170
/*     */     //   164: invokevirtual getFunctions : ()Ljava/util/List;
/*     */     //   167: goto -> 172
/*     */     //   170: pop
/*     */     //   171: aconst_null
/*     */     //   172: aload_1
/*     */     //   173: invokespecial createTagTask : (Ljava/nio/file/Path;Ljava/util/List;Ljava/util/Map;)Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask$Tag;
/*     */     //   176: aload #17
/*     */     //   178: swap
/*     */     //   179: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   184: pop
/*     */     //   185: goto -> 119
/*     */     //   188: aload #10
/*     */     //   190: checkcast java/util/List
/*     */     //   193: nop
/*     */     //   194: aload #16
/*     */     //   196: swap
/*     */     //   197: aload #4
/*     */     //   199: invokevirtual getTagPriorities : ()Ljava/util/List;
/*     */     //   202: invokespecial sortedByDefinition : (Ljava/util/List;Ljava/util/List;)Ljava/util/List;
/*     */     //   205: astore #6
/*     */     //   207: aload_2
/*     */     //   208: new ai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask
/*     */     //   211: dup
/*     */     //   212: aload #4
/*     */     //   214: aload #6
/*     */     //   216: aload #5
/*     */     //   218: invokespecial <init> : (Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskDescriptor;Ljava/util/List;Lcom/fasterxml/jackson/databind/JsonNode;)V
/*     */     //   221: astore #7
/*     */     //   223: aload #7
/*     */     //   225: astore #8
/*     */     //   227: astore #16
/*     */     //   229: iconst_0
/*     */     //   230: istore #9
/*     */     //   232: aload #8
/*     */     //   234: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity
/*     */     //   237: ldc_w 'default'
/*     */     //   240: aload_0
/*     */     //   241: aload_2
/*     */     //   242: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;Ljava/nio/file/Path;)Lkotlin/jvm/functions/Function0;
/*     */     //   247: invokestatic validateTags : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   250: aload #16
/*     */     //   252: aload #7
/*     */     //   254: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   257: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #71	-> 14
/*     */     //   #72	-> 21
/*     */     //   #73	-> 31
/*     */     //   #74	-> 36
/*     */     //   #75	-> 59
/*     */     //   #76	-> 69
/*     */     //   #77	-> 79
/*     */     //   #551	-> 84
/*     */     //   #552	-> 110
/*     */     //   #553	-> 138
/*     */     //   #77	-> 152
/*     */     //   #553	-> 179
/*     */     //   #554	-> 188
/*     */     //   #551	-> 193
/*     */     //   #78	-> 197
/*     */     //   #76	-> 205
/*     */     //   #79	-> 207
/*     */     //   #550	-> 227
/*     */     //   #79	-> 232
/*     */     //   #79	-> 252
/*     */     //   #79	-> 254
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   152	24	15	$i$a$-map-VelocityLibraryBuilder$readTasks$1$tagTasks$1	I
/*     */     //   149	27	14	it	Ljava/nio/file/Path;
/*     */     //   138	47	13	item$iv$iv	Ljava/lang/Object;
/*     */     //   110	80	11	$i$f$mapTo	I
/*     */     //   107	83	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   107	83	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   84	110	8	$i$f$map	I
/*     */     //   81	113	7	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   232	18	9	$i$a$-also-VelocityLibraryBuilder$readTasks$1$1	I
/*     */     //   229	21	8	it	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask;
/*     */     //   21	237	4	task	Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskDescriptor;
/*     */     //   69	189	5	schema	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   207	51	6	tagTasks	Ljava/util/List;
/*     */     //   0	258	0	this$0	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;
/*     */     //   0	258	1	$functionLibrary	Ljava/util/Map;
/*     */     //   0	258	2	taskFile	Ljava/nio/file/Path;
/*     */     //   0	258	3	satellites	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites; }
/*     */   private static final Object readTasks$lambda$15$lambda$14$lambda$13(VelocityLibraryBuilder this$0, Path $taskFile) { return this$0.relativePath($taskFile); }
/* 323 */   private final VelocityChatTask.Tag createChatTagTask(Path tagFile, List<String> taskFunctions, Map<String, VelocityFunction> functionLibrary) { VelocityModelChatTaskTagDescriptor tag = parseChatTaskTag(tagFile); validateEntityName(tag.getTag(), tagFile); return new VelocityChatTask.Tag(tag, velocityPromptPath(tagFile, tag.getPromptPath()), buildTagTaskFunctions(tagFile, tag.getModel(), functionLibrary, tag.getFunctions(), taskFunctions)); } private final VelocityTask.Tag createTagTask(Path tagFile, List<String> taskFunctions, Map<String, VelocityFunction> functionLibrary) { VelocityModelTaskTagDescriptor tag = parseTaskTag(tagFile); validateEntityName(tag.getTag(), tagFile); buildTagTaskFunctions(tagFile, tag.getModel(), functionLibrary, null, taskFunctions); return new VelocityTask.Tag(tag, velocityPromptPath(tagFile, tag.getPromptPath())); } private final Path velocityPromptPath(Path tagFile, String promptPath) { Path path1 = tagFile.resolveSibling(promptPath).normalize(), it = path1; int $i$a$-also-VelocityLibraryBuilder$velocityPromptPath$1 = 0; VelocityLibraryBuilder velocityLibraryBuilder = this; Intrinsics.checkNotNull(it); boolean condition$iv = (Files.exists(it, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) && Files.isRegularFile(it, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length))); int $i$f$check = 0; int $i$f$checkOrVelocityLibraryException = 0;
/* 324 */     if (!condition$iv) {
/* 325 */       int $i$f$buildMessage = 0;
/* 326 */       int $i$a$-checkOrVelocityLibraryException-VelocityLibraryBuilder$check$1$iv = 0; if (velocityLibraryBuilder.relativePath(tagFile) != null) { Object it$iv$iv$iv = velocityLibraryBuilder.relativePath(tagFile);
/* 327 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv$iv = 0; Object object1 = it$iv$iv$iv; int $i$a$-check-VelocityLibraryBuilder$velocityPromptPath$1$1 = 0; if ("[" + object1 + "] " + "failed to find template prompt file at `" + it + "`" == null) { "[" + object1 + "] " + "failed to find template prompt file at `" + it + "`"; $i$a$-check-VelocityLibraryBuilder$velocityPromptPath$1$1 = 0; UtilsKt.velocityLibraryException$default("failed to find template prompt file at `" + it + "`", null, 2, null); throw new KotlinNothingValueException(); }
/*     */          UtilsKt.velocityLibraryException$default("[" + object1 + "] " + "failed to find template prompt file at `" + it + "`", null, 2, null); throw new KotlinNothingValueException(); }
/*     */     
/* 330 */     }  Intrinsics.checkNotNullExpressionValue(path1, "also(...)"); return path1; } @NotNull public final Map<String, VelocityFunction> readFunctions$tasks_provider_llm_prompt_velocity_model() { List<?> rawFunctions = this.library.walkFunctions(this::readFunctions$lambda$22); Iterable<?> $this$map$iv = rawFunctions; int $i$f$map = 0; Iterable<?> iterable1 = $this$map$iv; Collection<VelocityFunction> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 331 */     for (Object item$iv$iv : iterable1) {
/* 332 */       Pair pair = (Pair)item$iv$iv; Collection<VelocityFunction> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryBuilder$readFunctions$library$1 = 0; collection.add((VelocityFunction)pair.getSecond());
/* 333 */     }  $this$map$iv = destination$iv$iv; int $i$f$associateBy = 0;
/* 334 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)), 16);
/* 335 */     Iterable<?> iterable2 = $this$map$iv; Map<Object, Object> map1 = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0;
/* 336 */     for (Object element$iv$iv : iterable2) {
/* 337 */       VelocityFunction velocityFunction = (VelocityFunction)element$iv$iv; Map<Object, Object> map = map1; int $i$a$-associateBy-VelocityLibraryBuilder$readFunctions$library$2 = 0; map.put(velocityFunction.getDescriptor().getName(), element$iv$iv);
/*     */     } 
/* 339 */     Map<Object, Object> library = map1; boolean condition$iv = (library.size() == rawFunctions.size());
/* 340 */     int $i$f$checkOrVelocityLibraryException = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 345 */     if (!condition$iv) {
/* 346 */       int $i$f$buildMessage = 0;
/* 347 */       int $i$a$-checkOrVelocityLibraryException-UtilsKt$checkOrVelocityLibraryException$1 = 0, $i$a$-checkOrVelocityLibraryException$default-VelocityLibraryBuilder$readFunctions$1 = 0;
/*     */     }  return (Map)library; } private static final Pair readFunctions$lambda$22(VelocityLibraryBuilder this$0, Path functionFile, TargetSatellites satellites) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'functionFile'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 'satellites'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_0
/*     */     //   15: aload_1
/*     */     //   16: invokespecial parseFunction : (Ljava/nio/file/Path;)Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunction;
/*     */     //   19: astore_3
/*     */     //   20: aload_0
/*     */     //   21: aload_2
/*     */     //   22: invokevirtual getParameters : ()Ljava/nio/file/Path;
/*     */     //   25: invokespecial safeReadJsonSchema : (Ljava/nio/file/Path;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   28: aload_0
/*     */     //   29: aload_2
/*     */     //   30: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;)Lkotlin/jvm/functions/Function0;
/*     */     //   35: invokestatic validateFunctionEtalonSchema : (Lcom/fasterxml/jackson/databind/JsonNode;Lkotlin/jvm/functions/Function0;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   38: astore #4
/*     */     //   40: aload_0
/*     */     //   41: aload_3
/*     */     //   42: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   45: aload_1
/*     */     //   46: invokespecial validateFunctionName : (Ljava/lang/String;Ljava/nio/file/Path;)V
/*     */     //   49: aload_0
/*     */     //   50: aload_2
/*     */     //   51: invokevirtual getTags : ()Ljava/util/List;
/*     */     //   54: checkcast java/lang/Iterable
/*     */     //   57: astore #6
/*     */     //   59: astore #15
/*     */     //   61: iconst_0
/*     */     //   62: istore #7
/*     */     //   64: aload #6
/*     */     //   66: astore #8
/*     */     //   68: new java/util/ArrayList
/*     */     //   71: dup
/*     */     //   72: aload #6
/*     */     //   74: bipush #10
/*     */     //   76: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   79: invokespecial <init> : (I)V
/*     */     //   82: checkcast java/util/Collection
/*     */     //   85: astore #9
/*     */     //   87: iconst_0
/*     */     //   88: istore #10
/*     */     //   90: aload #8
/*     */     //   92: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   97: astore #11
/*     */     //   99: aload #11
/*     */     //   101: invokeinterface hasNext : ()Z
/*     */     //   106: ifeq -> 156
/*     */     //   109: aload #11
/*     */     //   111: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   116: astore #12
/*     */     //   118: aload #9
/*     */     //   120: aload #12
/*     */     //   122: checkcast java/nio/file/Path
/*     */     //   125: astore #13
/*     */     //   127: astore #16
/*     */     //   129: iconst_0
/*     */     //   130: istore #14
/*     */     //   132: aload_0
/*     */     //   133: aload #13
/*     */     //   135: aload_3
/*     */     //   136: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   139: aload #4
/*     */     //   141: invokespecial createTagFunction : (Ljava/nio/file/Path;Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag;
/*     */     //   144: aload #16
/*     */     //   146: swap
/*     */     //   147: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   152: pop
/*     */     //   153: goto -> 99
/*     */     //   156: aload #9
/*     */     //   158: checkcast java/util/List
/*     */     //   161: nop
/*     */     //   162: aload #15
/*     */     //   164: swap
/*     */     //   165: aload_3
/*     */     //   166: invokevirtual getTagPriorities : ()Ljava/util/List;
/*     */     //   169: invokespecial sortedByDefinition : (Ljava/util/List;Ljava/util/List;)Ljava/util/List;
/*     */     //   172: astore #5
/*     */     //   174: aload_1
/*     */     //   175: new ai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction
/*     */     //   178: dup
/*     */     //   179: aload_3
/*     */     //   180: aload #5
/*     */     //   182: invokespecial <init> : (Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunction;Ljava/util/List;)V
/*     */     //   185: astore #6
/*     */     //   187: aload #6
/*     */     //   189: astore #7
/*     */     //   191: astore #15
/*     */     //   193: iconst_0
/*     */     //   194: istore #8
/*     */     //   196: aload #7
/*     */     //   198: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity
/*     */     //   201: ldc_w 'default'
/*     */     //   204: aload_0
/*     */     //   205: aload_1
/*     */     //   206: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;Ljava/nio/file/Path;)Lkotlin/jvm/functions/Function0;
/*     */     //   211: invokestatic validateTags : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   214: aload #15
/*     */     //   216: aload #6
/*     */     //   218: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   221: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 14
/*     */     //   #121	-> 20
/*     */     //   #122	-> 40
/*     */     //   #123	-> 49
/*     */     //   #124	-> 59
/*     */     //   #555	-> 64
/*     */     //   #556	-> 90
/*     */     //   #557	-> 118
/*     */     //   #124	-> 132
/*     */     //   #557	-> 147
/*     */     //   #558	-> 156
/*     */     //   #555	-> 161
/*     */     //   #125	-> 165
/*     */     //   #123	-> 172
/*     */     //   #126	-> 174
/*     */     //   #127	-> 187
/*     */     //   #550	-> 191
/*     */     //   #127	-> 196
/*     */     //   #127	-> 216
/*     */     //   #126	-> 218
/*     */     //   #127	-> 221
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   132	12	14	$i$a$-map-VelocityLibraryBuilder$readFunctions$rawFunctions$1$taggedImplementations$1	I
/*     */     //   129	15	13	it	Ljava/nio/file/Path;
/*     */     //   118	35	12	item$iv$iv	Ljava/lang/Object;
/*     */     //   90	68	10	$i$f$mapTo	I
/*     */     //   87	71	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   87	71	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   64	98	7	$i$f$map	I
/*     */     //   61	101	6	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   196	18	8	$i$a$-also-VelocityLibraryBuilder$readFunctions$rawFunctions$1$1	I
/*     */     //   193	21	7	it	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction;
/*     */     //   20	202	3	function	Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunction;
/*     */     //   40	182	4	schema	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   174	48	5	taggedImplementations	Ljava/util/List;
/*     */     //   0	222	0	this$0	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;
/*     */     //   0	222	1	functionFile	Ljava/nio/file/Path;
/*     */     //   0	222	2	satellites	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites; }
/*     */   private static final Object readFunctions$lambda$22$lambda$18(VelocityLibraryBuilder this$0, TargetSatellites $satellites) { return this$0.relativePath($satellites.getParameters()); }
/*     */   private static final Object readFunctions$lambda$22$lambda$21$lambda$20(VelocityLibraryBuilder this$0, Path $functionFile) { return this$0.relativePath($functionFile); }
/*     */   private static final Object readFunctions$lambda$26$lambda$25(VelocityLibraryBuilder this$0, Path it) { Intrinsics.checkNotNullParameter(it, "it"); return this$0.relativePath(it); }
/*     */   private final VelocityFunction.Tag createTagFunction(Path tagFile, String functionName, JsonNode schema) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial parseFunctionTag : (Ljava/nio/file/Path;)Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunctionTag;
/*     */     //   5: astore #4
/*     */     //   7: aload_0
/*     */     //   8: aload #4
/*     */     //   10: invokevirtual getTag : ()Ljava/lang/String;
/*     */     //   13: aload_1
/*     */     //   14: invokespecial validateEntityName : (Ljava/lang/String;Ljava/nio/file/Path;)V
/*     */     //   17: aload_1
/*     */     //   18: ldc_w 'schema.yaml'
/*     */     //   21: invokeinterface resolveSibling : (Ljava/lang/String;)Ljava/nio/file/Path;
/*     */     //   26: astore #5
/*     */     //   28: aload_0
/*     */     //   29: astore #6
/*     */     //   31: aload #5
/*     */     //   33: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   36: aload #5
/*     */     //   38: iconst_0
/*     */     //   39: anewarray java/nio/file/LinkOption
/*     */     //   42: dup
/*     */     //   43: arraylength
/*     */     //   44: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   47: checkcast [Ljava/nio/file/LinkOption;
/*     */     //   50: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
/*     */     //   53: istore #7
/*     */     //   55: nop
/*     */     //   56: iconst_0
/*     */     //   57: istore #8
/*     */     //   59: iconst_0
/*     */     //   60: istore #9
/*     */     //   62: iload #7
/*     */     //   64: ifne -> 150
/*     */     //   67: iconst_0
/*     */     //   68: istore #10
/*     */     //   70: iconst_0
/*     */     //   71: istore #11
/*     */     //   73: aload #6
/*     */     //   75: aload_1
/*     */     //   76: invokespecial relativePath : (Ljava/nio/file/Path;)Ljava/lang/Object;
/*     */     //   79: dup
/*     */     //   80: ifnull -> 119
/*     */     //   83: astore #12
/*     */     //   85: iconst_0
/*     */     //   86: istore #13
/*     */     //   88: aload #12
/*     */     //   90: astore #15
/*     */     //   92: iconst_0
/*     */     //   93: istore #14
/*     */     //   95: aload_2
/*     */     //   96: aload #4
/*     */     //   98: invokevirtual getTag : ()Ljava/lang/String;
/*     */     //   101: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   106: aload #15
/*     */     //   108: swap
/*     */     //   109: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   114: nop
/*     */     //   115: dup
/*     */     //   116: ifnonnull -> 135
/*     */     //   119: pop
/*     */     //   120: iconst_0
/*     */     //   121: istore #14
/*     */     //   123: aload_2
/*     */     //   124: aload #4
/*     */     //   126: invokevirtual getTag : ()Ljava/lang/String;
/*     */     //   129: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   134: nop
/*     */     //   135: aconst_null
/*     */     //   136: iconst_2
/*     */     //   137: aconst_null
/*     */     //   138: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   141: pop
/*     */     //   142: new kotlin/KotlinNothingValueException
/*     */     //   145: dup
/*     */     //   146: invokespecial <init> : ()V
/*     */     //   149: athrow
/*     */     //   150: nop
/*     */     //   151: nop
/*     */     //   152: aload_0
/*     */     //   153: aload #5
/*     */     //   155: invokespecial safeReadJsonSchema : (Ljava/nio/file/Path;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   158: aload_3
/*     */     //   159: aload_0
/*     */     //   160: aload #5
/*     */     //   162: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;Ljava/nio/file/Path;)Lkotlin/jvm/functions/Function0;
/*     */     //   167: invokestatic validateFunctionTagSchema : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Lkotlin/jvm/functions/Function0;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   170: astore #8
/*     */     //   172: iconst_0
/*     */     //   173: istore #9
/*     */     //   175: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   178: aload_0
/*     */     //   179: getfield jsonMapper : Lcom/fasterxml/jackson/databind/json/JsonMapper;
/*     */     //   182: aload #8
/*     */     //   184: invokevirtual writeValueAsString : (Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   187: dup
/*     */     //   188: ldc_w 'writeValueAsString(...)'
/*     */     //   191: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   194: invokevirtual parseToJsonElement : (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
/*     */     //   197: invokestatic getJsonObject : (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
/*     */     //   200: nop
/*     */     //   201: astore #6
/*     */     //   203: new ai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag
/*     */     //   206: dup
/*     */     //   207: new ai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag
/*     */     //   210: dup
/*     */     //   211: aload #4
/*     */     //   213: invokevirtual getTag : ()Ljava/lang/String;
/*     */     //   216: aload #4
/*     */     //   218: invokevirtual getModel : ()Ljava/lang/String;
/*     */     //   221: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   224: new ai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionImpl
/*     */     //   227: dup
/*     */     //   228: aload #4
/*     */     //   230: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   233: aload #6
/*     */     //   235: invokespecial <init> : (Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V
/*     */     //   238: invokespecial <init> : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionImpl;)V
/*     */     //   241: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #138	-> 0
/*     */     //   #139	-> 7
/*     */     //   #140	-> 17
/*     */     //   #141	-> 28
/*     */     //   #141	-> 55
/*     */     //   #351	-> 59
/*     */     //   #352	-> 62
/*     */     //   #353	-> 67
/*     */     //   #354	-> 70
/*     */     //   #351	-> 73
/*     */     //   #354	-> 79
/*     */     //   #355	-> 85
/*     */     //   #354	-> 88
/*     */     //   #141	-> 95
/*     */     //   #354	-> 109
/*     */     //   #354	-> 114
/*     */     //   #354	-> 115
/*     */     //   #141	-> 123
/*     */     //   #354	-> 134
/*     */     //   #353	-> 135
/*     */     //   #356	-> 150
/*     */     //   #357	-> 151
/*     */     //   #143	-> 152
/*     */     //   #144	-> 158
/*     */     //   #145	-> 170
/*     */     //   #358	-> 172
/*     */     //   #145	-> 175
/*     */     //   #145	-> 200
/*     */     //   #145	-> 201
/*     */     //   #143	-> 201
/*     */     //   #147	-> 203
/*     */     //   #148	-> 207
/*     */     //   #149	-> 224
/*     */     //   #147	-> 238
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   95	11	14	$i$a$-check-VelocityLibraryBuilder$createTagFunction$1	I
/*     */     //   123	11	14	$i$a$-check-VelocityLibraryBuilder$createTagFunction$1	I
/*     */     //   73	6	11	$i$a$-checkOrVelocityLibraryException-VelocityLibraryBuilder$check$1$iv	I
/*     */     //   88	26	13	$i$a$-let-UtilsKt$buildMessage$1$iv$iv$iv	I
/*     */     //   85	29	12	it$iv$iv$iv	Ljava/lang/Object;
/*     */     //   70	65	10	$i$f$buildMessage	I
/*     */     //   62	89	9	$i$f$checkOrVelocityLibraryException	I
/*     */     //   59	93	8	$i$f$check	I
/*     */     //   56	96	6	this_$iv	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;
/*     */     //   56	96	7	condition$iv	Z
/*     */     //   175	25	9	$i$a$-let-VelocityLibraryBuilder$createTagFunction$parameters$2	I
/*     */     //   172	28	8	it	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   7	235	4	tag	Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunctionTag;
/*     */     //   28	214	5	tagSchemaPath	Ljava/nio/file/Path;
/*     */     //   203	39	6	parameters	Lkotlinx/serialization/json/JsonObject;
/*     */     //   0	242	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder;
/*     */     //   0	242	1	tagFile	Ljava/nio/file/Path;
/*     */     //   0	242	2	functionName	Ljava/lang/String;
/*     */     //   0	242	3	schema	Lcom/fasterxml/jackson/databind/JsonNode; }
/*     */   private static final Object createTagFunction$lambda$28(VelocityLibraryBuilder this$0, Path $tagSchemaPath) { Intrinsics.checkNotNull($tagSchemaPath); return this$0.relativePath($tagSchemaPath); }
/*     */   private final void validateEntityPath(Path path) { Intrinsics.checkNotNullExpressionValue(path.getParent(), "getParent(...)"); char[] arrayOfChar = new char[1]; arrayOfChar[0] = '/';
/*     */     arrayOfChar = new char[1];
/*     */     arrayOfChar[0] = '/';
/*     */     Iterable $this$forEach$iv = StringsKt.split$default(StringsKt.trim(PathKt.relativeUriString(this.library.getRootUri(), path.getParent()), arrayOfChar), arrayOfChar, false, 0, 6, null);
/*     */     int $i$f$forEach = 0;
/* 359 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); String it = (String)element$iv; int $i$a$-forEach-VelocityLibraryBuilder$validateEntityPath$1 = 0; VelocityLibraryBuilder velocityLibraryBuilder = this; boolean condition$iv = FormatKt.getFOLDER_NAME_FORMAT().matches(it); int $i$f$check = 0;
/* 360 */       int $i$f$checkOrVelocityLibraryException = 0; }
/*     */      }
/*     */ 
/*     */   
/*     */   private final void validateEntityName(String name, Path path) {
/*     */     VelocityLibraryBuilder velocityLibraryBuilder1 = this;
/*     */     boolean condition$iv = (name.length() <= 64);
/*     */     int $i$f$check = 0;
/* 368 */     int $i$f$checkOrVelocityLibraryException = 0;
/* 369 */     if (!condition$iv) {
/* 370 */       int $i$f$buildMessage = 0;
/* 371 */       int $i$a$-checkOrVelocityLibraryException-VelocityLibraryBuilder$check$1$iv = 0; if (velocityLibraryBuilder1.relativePath(path) != null) { Object it$iv$iv$iv = velocityLibraryBuilder1.relativePath(path);
/* 372 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv$iv = 0; Object object1 = it$iv$iv$iv; int $i$a$-check-VelocityLibraryBuilder$validateEntityName$1 = 0; if ("[" + object1 + "] " + "name '" + name + "' exceeds 64 characters" == null) { "[" + object1 + "] " + "name '" + name + "' exceeds 64 characters"; $i$a$-check-VelocityLibraryBuilder$validateEntityName$1 = 0; UtilsKt.velocityLibraryException$default("name '" + name + "' exceeds 64 characters", null, 2, null); throw new KotlinNothingValueException(); }
/*     */          UtilsKt.velocityLibraryException$default("[" + object1 + "] " + "name '" + name + "' exceeds 64 characters", null, 2, null); throw new KotlinNothingValueException(); }
/*     */     
/* 375 */     }  VelocityLibraryBuilder this_$iv = this; condition$iv = FormatKt.getNAME_FORMAT().matches(name); $i$f$check = 0; $i$f$checkOrVelocityLibraryException = 0;
/* 376 */     if (!condition$iv) {
/* 377 */       int $i$f$buildMessage = 0;
/* 378 */       int $i$a$-checkOrVelocityLibraryException-VelocityLibraryBuilder$check$1$iv = 0; if (this_$iv.relativePath(path) != null) { Object it$iv$iv$iv = this_$iv.relativePath(path);
/* 379 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv$iv = 0; Object object1 = it$iv$iv$iv; int $i$a$-check-VelocityLibraryBuilder$validateEntityName$2 = 0; if ("[" + object1 + "] " + "name '" + name + "' does not satisfy the format (" + FormatKt.getNAME_FORMAT_DESCRIPTION() + ")" == null) { "[" + object1 + "] " + "name '" + name + "' does not satisfy the format (" + FormatKt.getNAME_FORMAT_DESCRIPTION() + ")"; $i$a$-check-VelocityLibraryBuilder$validateEntityName$2 = 0; UtilsKt.velocityLibraryException$default("name '" + name + "' does not satisfy the format (" + FormatKt.getNAME_FORMAT_DESCRIPTION() + ")", null, 2, null); throw new KotlinNothingValueException(); }
/*     */          UtilsKt.velocityLibraryException$default("[" + object1 + "] " + "name '" + name + "' does not satisfy the format (" + FormatKt.getNAME_FORMAT_DESCRIPTION() + ")", null, 2, null); throw new KotlinNothingValueException(); }
/*     */     
/* 382 */     }  } private final void validateFunctionName(String functionName, Path path) { VelocityLibraryBuilder velocityLibraryBuilder1 = this; boolean condition$iv = (functionName.length() <= 64); int $i$f$check = 0; int $i$f$checkOrVelocityLibraryException = 0;
/* 383 */     if (!condition$iv) {
/* 384 */       int $i$f$buildMessage = 0;
/* 385 */       int $i$a$-checkOrVelocityLibraryException-VelocityLibraryBuilder$check$1$iv = 0; if (velocityLibraryBuilder1.relativePath(path) != null) { Object it$iv$iv$iv = velocityLibraryBuilder1.relativePath(path);
/* 386 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv$iv = 0; Object object1 = it$iv$iv$iv; int $i$a$-check-VelocityLibraryBuilder$validateFunctionName$1 = 0; if ("[" + object1 + "] " + "name '" + functionName + "' exceeds 64 characters" == null) { "[" + object1 + "] " + "name '" + functionName + "' exceeds 64 characters"; $i$a$-check-VelocityLibraryBuilder$validateFunctionName$1 = 0; UtilsKt.velocityLibraryException$default("name '" + functionName + "' exceeds 64 characters", null, 2, null); throw new KotlinNothingValueException(); }
/*     */          UtilsKt.velocityLibraryException$default("[" + object1 + "] " + "name '" + functionName + "' exceeds 64 characters", null, 2, null); throw new KotlinNothingValueException(); }
/*     */     
/* 389 */     }  VelocityLibraryBuilder this_$iv = this; condition$iv = FormatKt.getFUNCTION_NAME_FORMAT().matches(functionName); $i$f$check = 0; $i$f$checkOrVelocityLibraryException = 0;
/* 390 */     if (!condition$iv) {
/* 391 */       int $i$f$buildMessage = 0;
/* 392 */       int $i$a$-checkOrVelocityLibraryException-VelocityLibraryBuilder$check$1$iv = 0; if (this_$iv.relativePath(path) != null) { Object it$iv$iv$iv = this_$iv.relativePath(path);
/* 393 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv$iv = 0; Object object1 = it$iv$iv$iv; int $i$a$-check-VelocityLibraryBuilder$validateFunctionName$2 = 0; if ("[" + object1 + "] " + "name '" + functionName + "' does not satisfy the format (" + FormatKt.getFUNCTION_NAME_FORMAT_DESCRIPTION() + ")" == null) { "[" + object1 + "] " + "name '" + functionName + "' does not satisfy the format (" + FormatKt.getFUNCTION_NAME_FORMAT_DESCRIPTION() + ")"; $i$a$-check-VelocityLibraryBuilder$validateFunctionName$2 = 0; UtilsKt.velocityLibraryException$default("name '" + functionName + "' does not satisfy the format (" + FormatKt.getFUNCTION_NAME_FORMAT_DESCRIPTION() + ")", null, 2, null); throw new KotlinNothingValueException(); }  UtilsKt.velocityLibraryException$default("[" + object1 + "] " + "name '" + functionName + "' does not satisfy the format (" + FormatKt.getFUNCTION_NAME_FORMAT_DESCRIPTION() + ")", null, 2, null); throw new KotlinNothingValueException(); }
/*     */     
/*     */     }  } private final void validateFunctions(Map functionLibrary, List<?> functions, Path taskPath) { if (functions == null)
/* 396 */       return;  VelocityLibraryBuilder velocityLibraryBuilder = this; boolean condition$iv = functionLibrary.keySet().containsAll(functions); int $i$f$check = 0; int $i$f$checkOrVelocityLibraryException = 0;
/* 397 */     if (!condition$iv) {
/* 398 */       int $i$f$buildMessage = 0;
/* 399 */       int $i$a$-checkOrVelocityLibraryException-VelocityLibraryBuilder$check$1$iv = 0; if (velocityLibraryBuilder.relativePath(taskPath) != null) { Object it$iv$iv$iv = velocityLibraryBuilder.relativePath(taskPath);
/* 400 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv$iv = 0; Object object1 = it$iv$iv$iv; int $i$a$-check-VelocityLibraryBuilder$validateFunctions$1 = 0; Iterable<?> $this$filterNot$iv = functions; int $i$f$filterNot = 0;
/* 401 */         Iterable<?> iterable1 = $this$filterNot$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0;
/* 402 */         for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filterNot-VelocityLibraryBuilder$validateFunctions$1$1 = 0; if (!functionLibrary.containsKey(it)) destination$iv$iv.add(element$iv$iv);  }
/* 403 */          if ("[" + object1 + "] " + "functions " + (List)destination$iv$iv + " are not defined in library" == null) { "[" + object1 + "] " + "functions " + (List)destination$iv$iv + " are not defined in library"; $i$a$-check-VelocityLibraryBuilder$validateFunctions$1 = 0; Iterable<?> iterable2 = functions; $i$f$filterNot = 0; Iterable<?> $this$filterNotTo$iv$iv = iterable2; Collection<Object> collection = new ArrayList(); $i$f$filterNotTo = 0; for (Object element$iv$iv : $this$filterNotTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filterNot-VelocityLibraryBuilder$validateFunctions$1$1 = 0; if (!functionLibrary.containsKey(it)) collection.add(element$iv$iv);  }  UtilsKt.velocityLibraryException$default("functions " + (List)collection + " are not defined in library", null, 2, null); throw new KotlinNothingValueException(); }  UtilsKt.velocityLibraryException$default("[" + object1 + "] " + "functions " + (List)destination$iv$iv + " are not defined in library", null, 2, null); throw new KotlinNothingValueException(); }
/*     */     
/*     */     }  } private final List<VelocityFunctionTagDescriptor> buildTagTaskFunctions(Path file, String llmProfileId, Map library, List tagFunctions, List taskFunctions) { if (taskFunctions == null) {
/* 406 */       VelocityLibraryBuilder velocityLibraryBuilder = this; boolean condition$iv = (tagFunctions == null); int $i$f$check = 0; int $i$f$checkOrVelocityLibraryException = 0;
/* 407 */       if (!condition$iv) {
/* 408 */         int $i$f$buildMessage = 0;
/* 409 */         int $i$a$-checkOrVelocityLibraryException-VelocityLibraryBuilder$check$1$iv = 0; if (velocityLibraryBuilder.relativePath(file) != null) { Object it$iv$iv$iv = velocityLibraryBuilder.relativePath(file);
/* 410 */           int $i$a$-let-UtilsKt$buildMessage$1$iv$iv$iv = 0; Object object1 = it$iv$iv$iv; int $i$a$-check-VelocityLibraryBuilder$buildTagTaskFunctions$1 = 0; if ("[" + object1 + "] " + "only functions declared at task level can be overridden: " + tagFunctions == null) { "[" + object1 + "] " + "only functions declared at task level can be overridden: " + tagFunctions; $i$a$-check-VelocityLibraryBuilder$buildTagTaskFunctions$1 = 0; UtilsKt.velocityLibraryException$default("only functions declared at task level can be overridden: " + tagFunctions, null, 2, null); throw new KotlinNothingValueException(); }  UtilsKt.velocityLibraryException$default("[" + object1 + "] " + "only functions declared at task level can be overridden: " + tagFunctions, null, 2, null); throw new KotlinNothingValueException(); }
/*     */       
/*     */       }  return null;
/* 413 */     }  HashSet allowedFunctions = CollectionsKt.toHashSet(taskFunctions); HashMap<Object, Object> overriddenFunctions = new HashMap<>(); if (tagFunctions == null); List list = CollectionsKt.emptyList(); int $i$f$forEach = 0; Iterator iterator1 = list.iterator(); if (iterator1.hasNext()) { Object element$iv = iterator1.next(); String it = (String)element$iv; int $i$a$-forEach-VelocityLibraryBuilder$buildTagTaskFunctions$2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       int index = StringsKt.indexOf$default(it, ':', 0, false, 6, null);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       VelocityLibraryBuilder velocityLibraryBuilder = this; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     List<VelocityFunctionTagDescriptor> result = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Iterable $this$forEach$iv = allowedFunctions;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int i = 0;
/*     */ 
/*     */ 
/*     */     
/* 443 */     Iterator iterator2 = $this$forEach$iv.iterator(); if (iterator2.hasNext()) { Object element$iv = iterator2.next(); String functionName = (String)element$iv; int $i$a$-forEach-VelocityLibraryBuilder$buildTagTaskFunctions$3 = 0;
/*     */       if ((VelocityFunction)library.get(functionName) == null) {
/*     */         (VelocityFunction)library.get(functionName);
/*     */         UtilsKt.velocityLibraryException$default("not found function `" + functionName + "`", null, 2, null);
/*     */         throw new KotlinNothingValueException();
/*     */       }  }
/*     */     
/*     */     return result; } private final <TagT extends EntityTag> List<TagT> sortedByDefinition(List $this$sortedByDefinition, List<String> definition) { return CollectionsKt.sortedWith($this$sortedByDefinition, new VelocityLibraryBuilder$sortedByDefinition$1(definition)); } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\006*\001\000\b\n\030\0002\022\022\004\022\0028\0000\001j\b\022\004\022\0028\000`\002J!\020\003\032\0020\0042\b\020\005\032\004\030\0018\0002\b\020\006\032\004\030\0018\000H\026¢\006\002\020\007J\023\020\b\032\0020\004*\004\030\0018\000H\002¢\006\002\020\t¨\006\n"}, d2 = {"ai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder$sortedByDefinition$1", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "compare", "", "o1", "o2", "(Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;)I", "comparatorValue", "(Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;)I", "tasks-provider-llm-prompt-velocity-model"}) @SourceDebugExtension({"SMAP\nVelocityLibraryBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityLibraryBuilder.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder$sortedByDefinition$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"}) public static final class VelocityLibraryBuilder$sortedByDefinition$1 implements Comparator<TagT> {
/*     */     VelocityLibraryBuilder$sortedByDefinition$1(List<String> $definition) {}
/*     */     public int compare(EntityTag o1, EntityTag o2) { return Intrinsics.compare(comparatorValue((TagT)o1), comparatorValue((TagT)o2)); }
/*     */     private final int comparatorValue(EntityTag $this$comparatorValue) { EntityTag entityTag1 = $this$comparatorValue;
/*     */       List<String> list = this.$definition;
/*     */       EntityTag it = entityTag1;
/*     */       int $i$a$-let-VelocityLibraryBuilder$sortedByDefinition$1$comparatorValue$1 = 0;
/*     */       return ($this$comparatorValue != null) ? list.indexOf($this$comparatorValue.getTagName()) : -1; } }
/*     */   private final void check(boolean condition, Path path, Function0 message) { int $i$f$check = 0, $i$f$checkOrVelocityLibraryException = 0;
/* 459 */     if (!condition) {
/* 460 */       int $i$f$buildMessage = 0;
/* 461 */       int $i$a$-checkOrVelocityLibraryException-VelocityLibraryBuilder$check$1 = 0; if (relativePath(path) != null) { Object it$iv$iv = relativePath(path);
/* 462 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv = 0; if ("[" + it$iv$iv + "] " + message.invoke() == null) { "[" + it$iv$iv + "] " + message.invoke(); UtilsKt.velocityLibraryException$default((String)message.invoke(), null, 2, null); throw new KotlinNothingValueException(); }  UtilsKt.velocityLibraryException$default("[" + it$iv$iv + "] " + message.invoke(), null, 2, null); throw new KotlinNothingValueException(); }
/*     */     
/* 464 */     }  } private final JsonNode safeReadJsonSchema(Path path) { Object object2; VelocityLibraryBuilder velocityLibraryBuilder = this; try { VelocityLibraryBuilder $this$safeReadJsonSchema_u24lambda_u2450 = velocityLibraryBuilder; int $i$a$-runCatching-VelocityLibraryBuilder$safeReadJsonSchema$1 = 0; object2 = Result.constructor-impl(JsonSchemaReader.INSTANCE.readSchema(path)); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object object1 = object2; if (Result.exceptionOrNull-impl(object1) == null) { Result.exceptionOrNull-impl(object1); } else { Object object = object1; int $i$a$-getOrElse-VelocityLibraryBuilder$safeReadJsonSchema$2 = 0; int $i$f$velocityParseException = 0;
/* 465 */       int $i$f$buildMessage = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 472 */       int $i$a$-velocityParseException-VelocityLibraryBuilder$safeReadJsonSchema$2$1 = 0; if (relativePath(path) != null) { Object it$iv$iv = relativePath(path);
/* 473 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv = 0; Object object3 = it$iv$iv; int $i$a$-velocityParseException-VelocityLibraryBuilder$safeReadJsonSchema$2$2 = 0; if (object.getMessage() == null) object.getMessage();  if ("[" + object3 + "] " + "is not a valid JSON schema" == null) { "[" + object3 + "] " + "is not a valid JSON schema"; $i$a$-velocityParseException-VelocityLibraryBuilder$safeReadJsonSchema$2$2 = 0; }  UtilsKt.velocityParseException("[" + object3 + "] " + "is not a valid JSON schema", (Throwable)object); throw new KotlinNothingValueException(); }  relativePath(path); $i$a$-velocityParseException-VelocityLibraryBuilder$safeReadJsonSchema$2$1 = 0; }  return (JsonNode)Result.exceptionOrNull-impl(object1); } private final Object relativePath(Path path) { return PathKt.relativeUriString(this.library.getRootUri(), path); }
/* 474 */   private final VelocityModelFunction parseFunction(Path functionFile) { Object object2; VelocityLibraryBuilder velocityLibraryBuilder = this; try { VelocityLibraryBuilder $this$parseFunction_u24lambda_u2454 = velocityLibraryBuilder; int $i$a$-runCatching-VelocityLibraryBuilder$parseFunction$1 = 0; Intrinsics.checkNotNullExpressionValue($this$parseFunction_u24lambda_u2454.mapper, "mapper"); ObjectMapper objectMapper = $this$parseFunction_u24lambda_u2454.mapper; String content$iv = PathsKt.readText$default(functionFile, null, 1, null); int $i$f$readValue = 0; int $i$f$jacksonTypeRef = 0; object2 = Result.constructor-impl(objectMapper.readValue(content$iv, 
/* 475 */             new VelocityLibraryBuilder$parseFunction$lambda$54$$inlined$readValue$1())); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object object1 = object2; if (Result.exceptionOrNull-impl(object1) == null) { Result.exceptionOrNull-impl(object1); }
/* 476 */     else { Object object = object1; int $i$a$-getOrElse-VelocityLibraryBuilder$parseFunction$2 = 0; int $i$f$velocityParseException = 0;
/* 477 */       int $i$f$buildMessage = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 484 */       int $i$a$-velocityParseException-VelocityLibraryBuilder$parseFunction$2$1 = 0; if (relativePath(functionFile) != null) { Object it$iv$iv = relativePath(functionFile);
/* 485 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv = 0; Object object3 = it$iv$iv; int $i$a$-velocityParseException-VelocityLibraryBuilder$parseFunction$2$2 = 0; if ("[" + object3 + "] " + "is not a valid function" == null) { "[" + object3 + "] " + "is not a valid function"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseFunction$2$2 = 0; }  UtilsKt.velocityParseException("[" + object3 + "] " + "is not a valid function", (Throwable)object); throw new KotlinNothingValueException(); }  "[" + object3 + "] " + "is not a valid function"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseFunction$2$1 = 0; }
/* 486 */      return (VelocityModelFunction)Result.exceptionOrNull-impl(object1); } private final VelocityModelFunctionTag parseFunctionTag(Path tagFile) { Object object2; VelocityLibraryBuilder velocityLibraryBuilder = this; try { VelocityLibraryBuilder $this$parseFunctionTag_u24lambda_u2458 = velocityLibraryBuilder; int $i$a$-runCatching-VelocityLibraryBuilder$parseFunctionTag$1 = 0; Intrinsics.checkNotNullExpressionValue($this$parseFunctionTag_u24lambda_u2458.mapper, "mapper"); ObjectMapper objectMapper = $this$parseFunctionTag_u24lambda_u2458.mapper; String content$iv = PathsKt.readText$default(tagFile, null, 1, null); int $i$f$readValue = 0; int $i$f$jacksonTypeRef = 0; object2 = Result.constructor-impl(objectMapper.readValue(content$iv, 
/* 487 */             new VelocityLibraryBuilder$parseFunctionTag$lambda$58$$inlined$readValue$1())); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object object1 = object2; if (Result.exceptionOrNull-impl(object1) == null) { Result.exceptionOrNull-impl(object1); }
/* 488 */     else { Object object = object1; int $i$a$-getOrElse-VelocityLibraryBuilder$parseFunctionTag$2 = 0; int $i$f$velocityParseException = 0;
/* 489 */       int $i$f$buildMessage = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 496 */       int $i$a$-velocityParseException-VelocityLibraryBuilder$parseFunctionTag$2$1 = 0; if (relativePath(tagFile) != null) { Object it$iv$iv = relativePath(tagFile);
/* 497 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv = 0; Object object3 = it$iv$iv; int $i$a$-velocityParseException-VelocityLibraryBuilder$parseFunctionTag$2$2 = 0; if ("[" + object3 + "] " + "is not a valid function tag" == null) { "[" + object3 + "] " + "is not a valid function tag"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseFunctionTag$2$2 = 0; }  UtilsKt.velocityParseException("[" + object3 + "] " + "is not a valid function tag", (Throwable)object); throw new KotlinNothingValueException(); }  "[" + object3 + "] " + "is not a valid function tag"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseFunctionTag$2$1 = 0; }
/* 498 */      return (VelocityModelFunctionTag)Result.exceptionOrNull-impl(object1); } private final VelocityModelChatTaskDescriptor parseChatTask(Path chatFile) { Object object2; VelocityLibraryBuilder velocityLibraryBuilder = this; try { VelocityLibraryBuilder $this$parseChatTask_u24lambda_u2462 = velocityLibraryBuilder; int $i$a$-runCatching-VelocityLibraryBuilder$parseChatTask$1 = 0; Intrinsics.checkNotNullExpressionValue($this$parseChatTask_u24lambda_u2462.mapper, "mapper"); ObjectMapper objectMapper = $this$parseChatTask_u24lambda_u2462.mapper; String content$iv = PathsKt.readText$default(chatFile, null, 1, null); int $i$f$readValue = 0; int $i$f$jacksonTypeRef = 0; object2 = Result.constructor-impl(objectMapper.readValue(content$iv, 
/* 499 */             new VelocityLibraryBuilder$parseChatTask$lambda$62$$inlined$readValue$1())); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object object1 = object2; if (Result.exceptionOrNull-impl(object1) == null) { Result.exceptionOrNull-impl(object1); }
/* 500 */     else { Object object = object1; int $i$a$-getOrElse-VelocityLibraryBuilder$parseChatTask$2 = 0; int $i$f$velocityParseException = 0;
/* 501 */       int $i$f$buildMessage = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 508 */       int $i$a$-velocityParseException-VelocityLibraryBuilder$parseChatTask$2$1 = 0; if (relativePath(chatFile) != null) { Object it$iv$iv = relativePath(chatFile);
/* 509 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv = 0; Object object3 = it$iv$iv; int $i$a$-velocityParseException-VelocityLibraryBuilder$parseChatTask$2$2 = 0; if ("[" + object3 + "] " + "is not a valid velocity chat task" == null) { "[" + object3 + "] " + "is not a valid velocity chat task"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseChatTask$2$2 = 0; }  UtilsKt.velocityParseException("[" + object3 + "] " + "is not a valid velocity chat task", (Throwable)object); throw new KotlinNothingValueException(); }  "[" + object3 + "] " + "is not a valid velocity chat task"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseChatTask$2$1 = 0; }
/* 510 */      return (VelocityModelChatTaskDescriptor)Result.exceptionOrNull-impl(object1); } private final VelocityModelChatTaskTagDescriptor parseChatTaskTag(Path tagFile) { Object object2; VelocityLibraryBuilder velocityLibraryBuilder = this; try { VelocityLibraryBuilder $this$parseChatTaskTag_u24lambda_u2466 = velocityLibraryBuilder; int $i$a$-runCatching-VelocityLibraryBuilder$parseChatTaskTag$1 = 0; Intrinsics.checkNotNullExpressionValue($this$parseChatTaskTag_u24lambda_u2466.mapper, "mapper"); ObjectMapper objectMapper = $this$parseChatTaskTag_u24lambda_u2466.mapper; String content$iv = PathsKt.readText$default(tagFile, null, 1, null); int $i$f$readValue = 0; int $i$f$jacksonTypeRef = 0; object2 = Result.constructor-impl(objectMapper.readValue(content$iv, 
/* 511 */             new VelocityLibraryBuilder$parseChatTaskTag$lambda$66$$inlined$readValue$1())); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object object1 = object2; if (Result.exceptionOrNull-impl(object1) == null) { Result.exceptionOrNull-impl(object1); }
/* 512 */     else { Object object = object1; int $i$a$-getOrElse-VelocityLibraryBuilder$parseChatTaskTag$2 = 0; int $i$f$velocityParseException = 0;
/* 513 */       int $i$f$buildMessage = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 520 */       int $i$a$-velocityParseException-VelocityLibraryBuilder$parseChatTaskTag$2$1 = 0; if (relativePath(tagFile) != null) { Object it$iv$iv = relativePath(tagFile);
/* 521 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv = 0; Object object3 = it$iv$iv; int $i$a$-velocityParseException-VelocityLibraryBuilder$parseChatTaskTag$2$2 = 0; if ("[" + object3 + "] " + "is not a valid velocity chat task tag" == null) { "[" + object3 + "] " + "is not a valid velocity chat task tag"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseChatTaskTag$2$2 = 0; }  UtilsKt.velocityParseException("[" + object3 + "] " + "is not a valid velocity chat task tag", (Throwable)object); throw new KotlinNothingValueException(); }  "[" + object3 + "] " + "is not a valid velocity chat task tag"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseChatTaskTag$2$1 = 0; }
/* 522 */      return (VelocityModelChatTaskTagDescriptor)Result.exceptionOrNull-impl(object1); } private final VelocityModelTaskDescriptor parseTask(Path taskFile) { Object object2; VelocityLibraryBuilder velocityLibraryBuilder = this; try { VelocityLibraryBuilder $this$parseTask_u24lambda_u2470 = velocityLibraryBuilder; int $i$a$-runCatching-VelocityLibraryBuilder$parseTask$1 = 0; Intrinsics.checkNotNullExpressionValue($this$parseTask_u24lambda_u2470.mapper, "mapper"); ObjectMapper objectMapper = $this$parseTask_u24lambda_u2470.mapper; String content$iv = PathsKt.readText$default(taskFile, null, 1, null); int $i$f$readValue = 0; int $i$f$jacksonTypeRef = 0; object2 = Result.constructor-impl(objectMapper.readValue(content$iv, 
/* 523 */             new VelocityLibraryBuilder$parseTask$lambda$70$$inlined$readValue$1())); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object object1 = object2; if (Result.exceptionOrNull-impl(object1) == null) { Result.exceptionOrNull-impl(object1); }
/* 524 */     else { Object object = object1; int $i$a$-getOrElse-VelocityLibraryBuilder$parseTask$2 = 0; int $i$f$velocityParseException = 0;
/* 525 */       int $i$f$buildMessage = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 532 */       int $i$a$-velocityParseException-VelocityLibraryBuilder$parseTask$2$1 = 0; if (relativePath(taskFile) != null) { Object it$iv$iv = relativePath(taskFile);
/* 533 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv = 0; Object object3 = it$iv$iv; int $i$a$-velocityParseException-VelocityLibraryBuilder$parseTask$2$2 = 0; if ("[" + object3 + "] " + "is not a valid velocity task" == null) { "[" + object3 + "] " + "is not a valid velocity task"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseTask$2$2 = 0; }  UtilsKt.velocityParseException("[" + object3 + "] " + "is not a valid velocity task", (Throwable)object); throw new KotlinNothingValueException(); }  "[" + object3 + "] " + "is not a valid velocity task"; $i$a$-velocityParseException-VelocityLibraryBuilder$parseTask$2$1 = 0; }
/* 534 */      return (VelocityModelTaskDescriptor)Result.exceptionOrNull-impl(object1); } private final VelocityModelTaskTagDescriptor parseTaskTag(Path tagFile) { Object object2; VelocityLibraryBuilder velocityLibraryBuilder = this; try { VelocityLibraryBuilder $this$parseTaskTag_u24lambda_u2474 = velocityLibraryBuilder; int $i$a$-runCatching-VelocityLibraryBuilder$parseTaskTag$1 = 0; Intrinsics.checkNotNullExpressionValue($this$parseTaskTag_u24lambda_u2474.mapper, "mapper"); ObjectMapper objectMapper = $this$parseTaskTag_u24lambda_u2474.mapper; String content$iv = PathsKt.readText$default(tagFile, null, 1, null); int $i$f$readValue = 0; int $i$f$jacksonTypeRef = 0; object2 = Result.constructor-impl(objectMapper.readValue(content$iv, 
/* 535 */             new VelocityLibraryBuilder$parseTaskTag$lambda$74$$inlined$readValue$1())); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object object1 = object2; if (Result.exceptionOrNull-impl(object1) == null) { Result.exceptionOrNull-impl(object1); }
/* 536 */     else { Object object = object1; int $i$a$-getOrElse-VelocityLibraryBuilder$parseTaskTag$2 = 0; int $i$f$velocityParseException = 0;
/* 537 */       int $i$f$buildMessage = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 544 */       int $i$a$-velocityParseException-VelocityLibraryBuilder$parseTaskTag$2$1 = 0; if (relativePath(tagFile) != null) { Object it$iv$iv = relativePath(tagFile);
/* 545 */         int $i$a$-let-UtilsKt$buildMessage$1$iv$iv = 0;
/*     */         Object object3 = it$iv$iv;
/*     */         int $i$a$-velocityParseException-VelocityLibraryBuilder$parseTaskTag$2$2 = 0;
/*     */         if ("[" + object3 + "] " + "is not a valid velocity task tag" == null) {
/*     */           "[" + object3 + "] " + "is not a valid velocity task tag";
/*     */           $i$a$-velocityParseException-VelocityLibraryBuilder$parseTaskTag$2$2 = 0;
/*     */         } 
/*     */         UtilsKt.velocityParseException("[" + object3 + "] " + "is not a valid velocity task tag", (Throwable)object);
/*     */         throw new KotlinNothingValueException(); }
/*     */       
/*     */       "[" + object3 + "] " + "is not a valid velocity task tag";
/*     */       $i$a$-velocityParseException-VelocityLibraryBuilder$parseTaskTag$2$1 = 0; }
/*     */     
/*     */     return (VelocityModelTaskTagDescriptor)Result.exceptionOrNull-impl(object1); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryBuilder$Companion;", "", "<init>", "()V", "DEFAULT_TASK_TAG", "", "tasks-provider-llm-prompt-velocity-model"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityLibraryBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */