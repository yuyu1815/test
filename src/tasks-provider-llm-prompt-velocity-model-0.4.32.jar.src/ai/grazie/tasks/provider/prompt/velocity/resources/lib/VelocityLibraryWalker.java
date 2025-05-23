/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020 \n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bv\030\000 \0272\0020\001:\003\027\030\031J.\020\f\032\b\022\004\022\002H\0160\r\"\004\b\000\020\0162\030\020\017\032\024\022\004\022\0020\021\022\004\022\0020\022\022\004\022\002H\0160\020H&J.\020\023\032\b\022\004\022\002H\0160\r\"\004\b\000\020\0162\030\020\017\032\024\022\004\022\0020\021\022\004\022\0020\022\022\004\022\002H\0160\020H&J.\020\024\032\b\022\004\022\002H\0160\r\"\004\b\000\020\0162\030\020\017\032\024\022\004\022\0020\021\022\004\022\0020\022\022\004\022\002H\0160\020H&J(\020\025\032\b\022\004\022\002H\0160\r\"\004\b\000\020\0162\022\020\017\032\016\022\004\022\0020\021\022\004\022\002H\0160\026H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\032\020\006\032\0020\0078&X§\004¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013\001\002\032\033ø\001\000\002\006\n\004\b!0\001¨\006\034À\006\001"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;", "", "rootUri", "Ljava/net/URI;", "getRootUri", "()Ljava/net/URI;", "templateEngine", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "getTemplateEngine$annotations", "()V", "getTemplateEngine", "()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "walkTasks", "", "T", "processor", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;", "walkChats", "walkFunctions", "walkSharedChatSchemas", "Lkotlin/Function1;", "Companion", "Classpath", "Relative", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Relative;", "tasks-provider-llm-prompt-velocity-model"})
/*     */ public interface VelocityLibraryWalker { @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   @NotNull
/*     */   URI getRootUri();
/*     */   @NotNull
/*     */   VelocityTemplateEngine getTemplateEngine();
/*     */   @NotNull
/*     */   <T> List<T> walkTasks(@NotNull Function2<? super Path, ? super TargetSatellites, ? extends T> paramFunction2);
/*     */   @NotNull
/*     */   <T> List<T> walkChats(@NotNull Function2<? super Path, ? super TargetSatellites, ? extends T> paramFunction2);
/*     */   @NotNull
/*     */   <T> List<T> walkFunctions(@NotNull Function2<? super Path, ? super TargetSatellites, ? extends T> paramFunction2);
/*     */   @NotNull
/*     */   <T> List<T> walkSharedChatSchemas(@NotNull Function1<? super Path, ? extends T> paramFunction1);
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\007¨\006\b"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Companion;", "", "<init>", "()V", "create", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;", "templateDir", "Ljava/nio/file/Path;", "tasks-provider-llm-prompt-velocity-model"})
/*     */   @SourceDebugExtension({"SMAP\nVelocityLibraryWalker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/*     */   public static final class Companion { @NotNull
/*  20 */     public final VelocityLibraryWalker create(@Nullable Path templateDir) { Path it = templateDir;
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
/* 237 */       int $i$a$-let-VelocityLibraryWalker$Companion$create$1 = 0; return (templateDir != null) ? new VelocityLibraryWalker.Relative(it) : new VelocityLibraryWalker.Classpath(); } } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\003\030\0002\0020\001B\t\b\026¢\006\004\b\002\020\003B\021\b\027\022\006\020\004\032\0020\005¢\006\004\b\002\020\006B\"\b\027\022\027\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\004\b\002\020\fB*\b\027\022\006\020\004\032\0020\005\022\027\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\004\b\002\020\rJ.\020\031\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\030\020\034\032\024\022\004\022\0020\036\022\004\022\0020\037\022\004\022\002H\0330\035H\026J(\020 \032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\022\020\034\032\016\022\004\022\0020\036\022\004\022\002H\0330\bH\026J.\020!\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\030\020\034\032\024\022\004\022\0020\036\022\004\022\0020\037\022\004\022\002H\0330\035H\026J.\020\"\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\030\020\034\032\024\022\004\022\0020\036\022\004\022\0020\037\022\004\022\002H\0330\035H\026J6\020#\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\006\020$\032\0020%2\030\020&\032\024\022\004\022\0020\036\022\n\022\b\022\004\022\002H\0330\0320\bH\002J6\020'\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\006\020$\032\0020%2\030\020&\032\024\022\004\022\0020\036\022\n\022\b\022\004\022\002H\0330\0320\bH\002R\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\020\020\021R\034\020\022\032\0020\0238\026X\004¢\006\016\n\000\022\004\b\024\020\003\032\004\b\025\020\026R\016\020\027\032\0020\030X\004¢\006\002\n\000¨\006("}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;", "<init>", "()V", "enableTracing", "", "(Z)V", "configureVelocityEngine", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "(ZLkotlin/jvm/functions/Function1;)V", "rootUri", "Ljava/net/URI;", "getRootUri", "()Ljava/net/URI;", "templateEngine", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "getTemplateEngine$annotations", "getTemplateEngine", "()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "walker", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/Walker;", "walkTasks", "", "T", "processor", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;", "walkSharedChatSchemas", "walkChats", "walkFunctions", "walkResources", "subdirectory", "", "body", "resolveAndApply", "tasks-provider-llm-prompt-velocity-model"}) @SourceDebugExtension({"SMAP\nVelocityLibraryWalker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,236:1\n126#2:237\n153#2,3:238\n126#2:241\n153#2,3:242\n126#2:245\n153#2,3:246\n*S KotlinDebug\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath\n*L\n62#1:237\n62#1:238,3\n75#1:241\n75#1:242,3\n82#1:245\n82#1:246,3\n*E\n"}) public static final class Classpath implements VelocityLibraryWalker { @NotNull private final URI rootUri; @NotNull private final VelocityTemplateEngine templateEngine; @NotNull private final Walker walker; @NotNull public URI getRootUri() { return this.rootUri; } @NotNull public VelocityTemplateEngine getTemplateEngine() { return this.templateEngine; } public Classpath() { this(false, Classpath::_init_$lambda$0); } private static final List walkTasks$lambda$3(Classpath this$0, Function2 $processor, Path it) { Intrinsics.checkNotNullParameter(it, "it"); Map<Path, TargetSatellites> tasks = this$0.walker.walk(it, VtyEntityFileDescriptor.TASK); Map<Path, TargetSatellites> $this$map$iv = tasks; int $i$f$map = 0; Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 238 */       for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 239 */         Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Classpath$walkTasks$1$1 = 0; collection.add($processor.invoke(entry1.getKey(), entry1.getValue()));
/* 240 */       }  return (List)destination$iv$iv; }
/*     */     private static final Unit _init_$lambda$0(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @Deprecated(message = "In favour of no-args constructor, since 05 Feb 2025") public Classpath(boolean enableTracing) { this(enableTracing, Classpath::_init_$lambda$1); } private static final Unit _init_$lambda$1(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @Deprecated(message = "In favour of no-args constructor, since 05 Feb 2025") public Classpath(@NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) { this(false, configureVelocityEngine); } @Deprecated(message = "In favour of no-args constructor, since 05 Feb 2025") public Classpath(boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) { if (getClass().getClassLoader().getResource("tasksLibrary") == null || getClass().getClassLoader().getResource("tasksLibrary").toURI() == null) { getClass().getClassLoader().getResource("tasksLibrary").toURI(); UtilsKt.velocityLibraryException$default("`tasksLibrary` not found on classpath", null, 2, null); throw new KotlinNothingValueException(); }  ((Classpath)getClass().getClassLoader().getResource("tasksLibrary").toURI()).rootUri = getClass().getClassLoader().getResource("tasksLibrary").toURI(); this.walker = new Walker(getRootUri()); this.templateEngine = VelocityTemplateEngine.Companion.create(getRootUri(), enableTracing, configureVelocityEngine); } @NotNull public <T> List<T> walkTasks(@NotNull Function2 processor) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'processor'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: ldc 'tasks'
/*     */       //   9: aload_0
/*     */       //   10: aload_1
/*     */       //   11: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
/*     */       //   16: invokespecial walkResources : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */       //   19: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #60	-> 6
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	20	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;
/*     */       //   0	20	1	processor	Lkotlin/jvm/functions/Function2; } @NotNull public <T> List<T> walkSharedChatSchemas(@NotNull Function1 processor) { Intrinsics.checkNotNullParameter(processor, "processor"); return walkResources("chatTasks", processor::walkSharedChatSchemas$lambda$4); } private static final List walkSharedChatSchemas$lambda$4(Function1 $processor, Path it) { Intrinsics.checkNotNullParameter(it, "it"); return VelocityLibraryWalkerKt.access$doWalkSharedChatSchemas(it, $processor); } @NotNull public <T> List<T> walkChats(@NotNull Function2 processor) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'processor'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: ldc 'chatTasks'
/*     */       //   9: aload_0
/*     */       //   10: aload_1
/*     */       //   11: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
/*     */       //   16: invokespecial walkResources : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */       //   19: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #73	-> 6
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	20	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;
/* 241 */       //   0	20	1	processor	Lkotlin/jvm/functions/Function2; } private static final List walkChats$lambda$6(Classpath this$0, Function2 $processor, Path it) { Intrinsics.checkNotNullParameter(it, "it"); Map<Path, TargetSatellites> tasks = this$0.walker.walk(it, VtyEntityFileDescriptor.CHAT_TASK); Map<Path, TargetSatellites> $this$map$iv = tasks; int $i$f$map = 0; Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 242 */       for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 243 */         Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Classpath$walkChats$1$1 = 0; collection.add($processor.invoke(entry1.getKey(), entry1.getValue()));
/* 244 */       }  return (List)destination$iv$iv; } @NotNull public <T> List<T> walkFunctions(@NotNull Function2 processor) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'processor'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: ldc 'functions'
/*     */       //   9: aload_0
/*     */       //   10: aload_1
/*     */       //   11: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
/*     */       //   16: invokespecial walkResources : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */       //   19: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #80	-> 6
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	20	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;
/*     */       //   0	20	1	processor	Lkotlin/jvm/functions/Function2; }
/* 245 */     private static final List walkFunctions$lambda$8(Classpath this$0, Function2 $processor, Path it) { Intrinsics.checkNotNullParameter(it, "it"); Map<Path, TargetSatellites> descriptors = this$0.walker.walk(it, VtyEntityFileDescriptor.FUNCTION); Map<Path, TargetSatellites> $this$map$iv = descriptors; int $i$f$map = 0; Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 246 */       for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 247 */         Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Classpath$walkFunctions$1$1 = 0; collection.add($processor.invoke(entry1.getKey(), entry1.getValue()));
/* 248 */       }  return (List)destination$iv$iv; } private final <T> List<T> walkResources(String subdirectory, Function1<? super Path, ? extends List<?>> body) { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokevirtual getRootUri : ()Ljava/net/URI;
/*     */       //   4: invokevirtual getScheme : ()Ljava/lang/String;
/*     */       //   7: astore_3
/*     */       //   8: aload_3
/*     */       //   9: ldc 'jar'
/*     */       //   11: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   14: ifeq -> 84
/*     */       //   17: aload_0
/*     */       //   18: invokevirtual getRootUri : ()Ljava/net/URI;
/*     */       //   21: invokestatic getFileSystem : (Ljava/net/URI;)Ljava/nio/file/FileSystem;
/*     */       //   24: checkcast java/io/Closeable
/*     */       //   27: astore #4
/*     */       //   29: aconst_null
/*     */       //   30: astore #5
/*     */       //   32: nop
/*     */       //   33: aload #4
/*     */       //   35: checkcast java/nio/file/FileSystem
/*     */       //   38: astore #6
/*     */       //   40: iconst_0
/*     */       //   41: istore #7
/*     */       //   43: aload_0
/*     */       //   44: aload_1
/*     */       //   45: aload_2
/*     */       //   46: invokespecial resolveAndApply : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */       //   49: astore #6
/*     */       //   51: aload #4
/*     */       //   53: aload #5
/*     */       //   55: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
/*     */       //   58: aload #6
/*     */       //   60: goto -> 129
/*     */       //   63: astore #7
/*     */       //   65: aload #7
/*     */       //   67: astore #5
/*     */       //   69: aload #7
/*     */       //   71: athrow
/*     */       //   72: astore #7
/*     */       //   74: aload #4
/*     */       //   76: aload #5
/*     */       //   78: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
/*     */       //   81: aload #7
/*     */       //   83: athrow
/*     */       //   84: aload_3
/*     */       //   85: ldc 'file'
/*     */       //   87: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   90: ifeq -> 102
/*     */       //   93: aload_0
/*     */       //   94: aload_1
/*     */       //   95: aload_2
/*     */       //   96: invokespecial resolveAndApply : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */       //   99: goto -> 129
/*     */       //   102: aload_0
/*     */       //   103: invokevirtual getRootUri : ()Ljava/net/URI;
/*     */       //   106: invokevirtual getScheme : ()Ljava/lang/String;
/*     */       //   109: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   114: aconst_null
/*     */       //   115: iconst_2
/*     */       //   116: aconst_null
/*     */       //   117: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */       //   120: pop
/*     */       //   121: new kotlin/KotlinNothingValueException
/*     */       //   124: dup
/*     */       //   125: invokespecial <init> : ()V
/*     */       //   128: athrow
/*     */       //   129: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #87	-> 0
/*     */       //   #88	-> 8
/*     */       //   #89	-> 43
/*     */       //   #88	-> 49
/*     */       //   #91	-> 84
/*     */       //   #92	-> 93
/*     */       //   #94	-> 102
/*     */       //   #87	-> 129
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   43	6	7	$i$a$-use-VelocityLibraryWalker$Classpath$walkResources$1	I
/*     */       //   40	9	6	it	Ljava/nio/file/FileSystem;
/*     */       //   0	130	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;
/*     */       //   0	130	1	subdirectory	Ljava/lang/String;
/*     */       //   0	130	2	body	Lkotlin/jvm/functions/Function1;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   32	51	63	java/lang/Throwable
/*     */       //   32	51	72	finally
/*     */       //   63	72	72	finally
/* 248 */       //   72	74	72	finally } private final <T> List<T> resolveAndApply(String subdirectory, Function1 body) { Path path = Paths.get(getRootUri()).resolve(subdirectory); Intrinsics.checkNotNull(path); return Files.exists(path, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) ? (List<T>)body.invoke(path) : CollectionsKt.emptyList(); } } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\030\0002\0020\001B\021\b\026\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B\031\b\027\022\006\020\002\032\0020\003\022\006\020\006\032\0020\007¢\006\004\b\004\020\bB*\b\027\022\006\020\002\032\0020\003\022\027\020\t\032\023\022\004\022\0020\013\022\004\022\0020\f0\n¢\006\002\b\r¢\006\004\b\004\020\016B2\b\027\022\006\020\002\032\0020\003\022\006\020\006\032\0020\007\022\027\020\t\032\023\022\004\022\0020\013\022\004\022\0020\f0\n¢\006\002\b\r¢\006\004\b\004\020\017J.\020\034\032\b\022\004\022\002H\0360\035\"\004\b\000\020\0362\030\020\037\032\024\022\004\022\0020\003\022\004\022\0020!\022\004\022\002H\0360 H\026J(\020\"\032\b\022\004\022\002H\0360\035\"\004\b\000\020\0362\022\020\037\032\016\022\004\022\0020\003\022\004\022\002H\0360\nH\026J.\020#\032\b\022\004\022\002H\0360\035\"\004\b\000\020\0362\030\020\037\032\024\022\004\022\0020\003\022\004\022\0020!\022\004\022\002H\0360 H\026J.\020$\032\b\022\004\022\002H\0360\035\"\004\b\000\020\0362\030\020\037\032\024\022\004\022\0020\003\022\004\022\0020!\022\004\022\002H\0360 H\026R\024\020\020\032\0020\021X\004¢\006\b\n\000\032\004\b\022\020\023R\034\020\024\032\0020\0258\026X\004¢\006\016\n\000\022\004\b\026\020\027\032\004\b\030\020\031R\016\020\032\032\0020\033X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006%"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Relative;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;", "templateDir", "Ljava/nio/file/Path;", "<init>", "(Ljava/nio/file/Path;)V", "enableTracing", "", "(Ljava/nio/file/Path;Z)V", "configureVelocityEngine", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/nio/file/Path;Lkotlin/jvm/functions/Function1;)V", "(Ljava/nio/file/Path;ZLkotlin/jvm/functions/Function1;)V", "rootUri", "Ljava/net/URI;", "getRootUri", "()Ljava/net/URI;", "templateEngine", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "getTemplateEngine$annotations", "()V", "getTemplateEngine", "()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "walker", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/Walker;", "walkTasks", "", "T", "processor", "Lkotlin/Function2;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;", "walkSharedChatSchemas", "walkChats", "walkFunctions", "tasks-provider-llm-prompt-velocity-model"}) @SourceDebugExtension({"SMAP\nVelocityLibraryWalker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Relative\n+ 2 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt\n+ 3 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt$checkOrVelocityLibraryException$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,236:1\n7#2,7:237\n29#2:244\n15#2:247\n7#2,7:248\n29#2:255\n15#2:258\n7#2,7:259\n29#2:266\n15#2:269\n8#3:245\n8#3:256\n8#3:267\n1#4:246\n1#4:257\n1#4:268\n126#5:270\n153#5,3:271\n126#5:274\n153#5,3:275\n126#5:278\n153#5,3:279\n*S KotlinDebug\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Relative\n*L\n129#1:237,7\n129#1:244\n129#1:247\n130#1:248,7\n130#1:255\n130#1:258\n131#1:259,7\n131#1:266\n131#1:269\n129#1:245\n130#1:256\n131#1:267\n129#1:246\n130#1:257\n131#1:268\n142#1:270\n142#1:271,3\n151#1:274\n151#1:275,3\n156#1:278\n156#1:279,3\n*E\n"}) public static final class Relative implements VelocityLibraryWalker { @NotNull private final URI rootUri; @NotNull private final VelocityTemplateEngine templateEngine; @NotNull private final Walker walker; @NotNull private final Path templateDir; @NotNull public URI getRootUri() { return this.rootUri; } @NotNull public VelocityTemplateEngine getTemplateEngine() { return this.templateEngine; } public Relative(@NotNull Path templateDir) { this(templateDir, false, Relative::_init_$lambda$0); } private static final Unit _init_$lambda$0(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @Deprecated(message = "In favour of single-argument constructor, since 05 Feb 2025") public Relative(@NotNull Path templateDir, boolean enableTracing) { this(templateDir, enableTracing, Relative::_init_$lambda$1); } private static final Unit _init_$lambda$1(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @Deprecated(message = "In favour of single-argument constructor, since 05 Feb 2025") public Relative(@NotNull Path templateDir, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) { this(templateDir, false, configureVelocityEngine); } @Deprecated(message = "In favour of single-argument constructor, since 05 Feb 2025") public Relative(@NotNull Path templateDir, boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) { boolean condition$iv = Files.exists(templateDir, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)); int $i$f$checkOrVelocityLibraryException = 0; if (!condition$iv) { int $i$f$buildMessage = 0; int $i$a$-checkOrVelocityLibraryException-UtilsKt$checkOrVelocityLibraryException$1 = 0, $i$a$-checkOrVelocityLibraryException$default-VelocityLibraryWalker$Relative$3 = 0; }  condition$iv = Files.isDirectory(templateDir, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)); $i$f$checkOrVelocityLibraryException = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 253 */       if (!condition$iv) {
/* 254 */         int $i$f$buildMessage = 0;
/* 255 */         int $i$a$-checkOrVelocityLibraryException-UtilsKt$checkOrVelocityLibraryException$1 = 0, $i$a$-checkOrVelocityLibraryException$default-VelocityLibraryWalker$Relative$4 = 0;
/*     */       } 
/*     */       
/*     */       condition$iv = templateDir.isAbsolute();
/* 259 */       $i$f$checkOrVelocityLibraryException = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 264 */       if (!condition$iv) {
/* 265 */         int $i$f$buildMessage = 0;
/* 266 */         int $i$a$-checkOrVelocityLibraryException-UtilsKt$checkOrVelocityLibraryException$1 = 0, $i$a$-checkOrVelocityLibraryException$default-VelocityLibraryWalker$Relative$5 = 0;
/*     */       }  this.templateDir = templateDir; this.rootUri = templateDir.toUri(); this.walker = new Walker(getRootUri()); this.templateEngine = VelocityTemplateEngine.Relative.Companion.create(templateDir, enableTracing, configureVelocityEngine); } @NotNull public <T> List<T> walkTasks(@NotNull Function2 processor) { Intrinsics.checkNotNullParameter(processor, "processor"); Intrinsics.checkNotNullExpressionValue(this.templateDir.resolve("tasks"), "resolve(...)"); Map<Path, TargetSatellites> tasks = this.walker.walk(this.templateDir.resolve("tasks"), VtyEntityFileDescriptor.TASK);
/*     */       Map<Path, TargetSatellites> $this$map$iv = tasks;
/*     */       int $i$f$map = 0;
/* 270 */       Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 271 */       for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 272 */         Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Relative$walkTasks$1 = 0; collection.add(processor.invoke(entry1.getKey(), entry1.getValue()));
/* 273 */       }  return (List)destination$iv$iv; } @NotNull public <T> List<T> walkSharedChatSchemas(@NotNull Function1 processor) { Intrinsics.checkNotNullParameter(processor, "processor"); Intrinsics.checkNotNullExpressionValue(this.templateDir.resolve("chatTasks"), "resolve(...)"); return VelocityLibraryWalkerKt.access$doWalkSharedChatSchemas(this.templateDir.resolve("chatTasks"), processor); }
/* 274 */     @NotNull public <T> List<T> walkChats(@NotNull Function2 processor) { Intrinsics.checkNotNullParameter(processor, "processor"); Intrinsics.checkNotNullExpressionValue(this.templateDir.resolve("chatTasks"), "resolve(...)"); Map<Path, TargetSatellites> tasks = this.walker.walk(this.templateDir.resolve("chatTasks"), VtyEntityFileDescriptor.CHAT_TASK); Map<Path, TargetSatellites> $this$map$iv = tasks; int $i$f$map = 0; Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 275 */       for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 276 */         Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Relative$walkChats$1 = 0; collection.add(processor.invoke(entry1.getKey(), entry1.getValue()));
/* 277 */       }  return (List)destination$iv$iv; } @NotNull public <T> List<T> walkFunctions(@NotNull Function2 processor) { Intrinsics.checkNotNullParameter(processor, "processor"); Intrinsics.checkNotNullExpressionValue(this.templateDir.resolve("functions"), "resolve(...)"); Map<Path, TargetSatellites> descriptors = this.walker.walk(this.templateDir.resolve("functions"), VtyEntityFileDescriptor.FUNCTION); Map<Path, TargetSatellites> $this$map$iv = descriptors; int $i$f$map = 0;
/* 278 */       Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 279 */       for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 280 */         Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Relative$walkFunctions$1 = 0; collection.add(processor.invoke(entry1.getKey(), entry1.getValue()));
/* 281 */       }  return (List)destination$iv$iv; }
/*     */      }
/*     */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityLibraryWalker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */