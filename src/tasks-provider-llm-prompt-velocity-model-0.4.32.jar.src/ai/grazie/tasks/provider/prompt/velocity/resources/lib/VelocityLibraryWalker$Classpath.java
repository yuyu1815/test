/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import ai.grazie.tasks.provider.prompt.velocity.resources.lib.validation.UtilsKt;
/*     */ import java.net.URI;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.apache.velocity.app.VelocityEngine;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\003\030\0002\0020\001B\t\b\026¢\006\004\b\002\020\003B\021\b\027\022\006\020\004\032\0020\005¢\006\004\b\002\020\006B\"\b\027\022\027\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\004\b\002\020\fB*\b\027\022\006\020\004\032\0020\005\022\027\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\004\b\002\020\rJ.\020\031\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\030\020\034\032\024\022\004\022\0020\036\022\004\022\0020\037\022\004\022\002H\0330\035H\026J(\020 \032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\022\020\034\032\016\022\004\022\0020\036\022\004\022\002H\0330\bH\026J.\020!\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\030\020\034\032\024\022\004\022\0020\036\022\004\022\0020\037\022\004\022\002H\0330\035H\026J.\020\"\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\030\020\034\032\024\022\004\022\0020\036\022\004\022\0020\037\022\004\022\002H\0330\035H\026J6\020#\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\006\020$\032\0020%2\030\020&\032\024\022\004\022\0020\036\022\n\022\b\022\004\022\002H\0330\0320\bH\002J6\020'\032\b\022\004\022\002H\0330\032\"\004\b\000\020\0332\006\020$\032\0020%2\030\020&\032\024\022\004\022\0020\036\022\n\022\b\022\004\022\002H\0330\0320\bH\002R\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\020\020\021R\034\020\022\032\0020\0238\026X\004¢\006\016\n\000\022\004\b\024\020\003\032\004\b\025\020\026R\016\020\027\032\0020\030X\004¢\006\002\n\000¨\006("}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;", "<init>", "()V", "enableTracing", "", "(Z)V", "configureVelocityEngine", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "(ZLkotlin/jvm/functions/Function1;)V", "rootUri", "Ljava/net/URI;", "getRootUri", "()Ljava/net/URI;", "templateEngine", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "getTemplateEngine$annotations", "getTemplateEngine", "()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "walker", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/Walker;", "walkTasks", "", "T", "processor", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;", "walkSharedChatSchemas", "walkChats", "walkFunctions", "walkResources", "subdirectory", "", "body", "resolveAndApply", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nVelocityLibraryWalker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,236:1\n126#2:237\n153#2,3:238\n126#2:241\n153#2,3:242\n126#2:245\n153#2,3:246\n*S KotlinDebug\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath\n*L\n62#1:237\n62#1:238,3\n75#1:241\n75#1:242,3\n82#1:245\n82#1:246,3\n*E\n"})
/*     */ public final class Classpath implements VelocityLibraryWalker {
/*     */   @NotNull
/*     */   private final URI rootUri;
/*     */   @NotNull
/*     */   private final VelocityTemplateEngine templateEngine;
/*     */   @NotNull
/*     */   private final Walker walker;
/*     */   
/*     */   @NotNull
/*     */   public URI getRootUri() {
/*  39 */     return this.rootUri; } @NotNull
/*     */   public VelocityTemplateEngine getTemplateEngine() {
/*  41 */     return this.templateEngine;
/*     */   }
/*     */   
/*     */   public Classpath()
/*     */   {
/*  46 */     this(false, Classpath::_init_$lambda$0); } private static final Unit _init_$lambda$0(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; }
/*     */   
/*     */   @Deprecated(message = "In favour of no-args constructor, since 05 Feb 2025")
/*  49 */   public Classpath(boolean enableTracing) { this(enableTracing, Classpath::_init_$lambda$1); } private static final Unit _init_$lambda$1(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; }
/*     */   
/*     */   @Deprecated(message = "In favour of no-args constructor, since 05 Feb 2025")
/*  52 */   public Classpath(@NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) { this(false, configureVelocityEngine); } @Deprecated(message = "In favour of no-args constructor, since 05 Feb 2025") public Classpath(boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) { if (getClass().getClassLoader().getResource("tasksLibrary") == null || getClass().getClassLoader().getResource("tasksLibrary").toURI() == null) {
/*     */       getClass().getClassLoader().getResource("tasksLibrary").toURI(); UtilsKt.velocityLibraryException$default("`tasksLibrary` not found on classpath", null, 2, null); throw new KotlinNothingValueException();
/*     */     }  ((Classpath)getClass().getClassLoader().getResource("tasksLibrary").toURI()).rootUri = getClass().getClassLoader().getResource("tasksLibrary").toURI();
/*     */     this.walker = new Walker(getRootUri());
/*  56 */     this.templateEngine = VelocityTemplateEngine.Companion.create(getRootUri(), enableTracing, configureVelocityEngine); }
/*     */   @NotNull public <T> List<T> walkTasks(@NotNull Function2 processor) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'processor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: ldc 'tasks'
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
/*     */     //   16: invokespecial walkResources : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */     //   19: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 6
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	20	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;
/*     */     //   0	20	1	processor	Lkotlin/jvm/functions/Function2; }
/*     */   @NotNull public <T> List<T> walkSharedChatSchemas(@NotNull Function1 processor) { Intrinsics.checkNotNullParameter(processor, "processor");
/*     */     return walkResources("chatTasks", processor::walkSharedChatSchemas$lambda$4); }
/*     */   private static final List walkSharedChatSchemas$lambda$4(Function1 $processor, Path it) { Intrinsics.checkNotNullParameter(it, "it");
/*  61 */     return VelocityLibraryWalkerKt.access$doWalkSharedChatSchemas(it, $processor); } private static final List walkTasks$lambda$3(Classpath this$0, Function2 $processor, Path it) { Intrinsics.checkNotNullParameter(it, "it"); Map<Path, TargetSatellites> tasks = this$0.walker.walk(it, VtyEntityFileDescriptor.TASK);
/*  62 */     Map<Path, TargetSatellites> $this$map$iv = tasks; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 237 */     Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 238 */     for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 239 */       Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Classpath$walkTasks$1$1 = 0; collection.add($processor.invoke(entry1.getKey(), entry1.getValue()));
/* 240 */     }  return (List)destination$iv$iv; }
/*     */   @NotNull public <T> List<T> walkChats(@NotNull Function2 processor) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'processor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: ldc 'chatTasks'
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
/*     */     //   16: invokespecial walkResources : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */     //   19: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #73	-> 6
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	20	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;
/* 241 */     //   0	20	1	processor	Lkotlin/jvm/functions/Function2; } private static final List walkChats$lambda$6(Classpath this$0, Function2 $processor, Path it) { Intrinsics.checkNotNullParameter(it, "it"); Map<Path, TargetSatellites> tasks = this$0.walker.walk(it, VtyEntityFileDescriptor.CHAT_TASK); Map<Path, TargetSatellites> $this$map$iv = tasks; int $i$f$map = 0; Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 242 */     for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 243 */       Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Classpath$walkChats$1$1 = 0; collection.add($processor.invoke(entry1.getKey(), entry1.getValue()));
/* 244 */     }  return (List)destination$iv$iv; } @NotNull public <T> List<T> walkFunctions(@NotNull Function2 processor) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'processor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: ldc 'functions'
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: <illegal opcode> invoke : (Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
/*     */     //   16: invokespecial walkResources : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */     //   19: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #80	-> 6
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	20	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;
/*     */     //   0	20	1	processor	Lkotlin/jvm/functions/Function2; }
/* 245 */   private static final List walkFunctions$lambda$8(Classpath this$0, Function2 $processor, Path it) { Intrinsics.checkNotNullParameter(it, "it"); Map<Path, TargetSatellites> descriptors = this$0.walker.walk(it, VtyEntityFileDescriptor.FUNCTION); Map<Path, TargetSatellites> $this$map$iv = descriptors; int $i$f$map = 0; Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 246 */     for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 247 */       Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Classpath$walkFunctions$1$1 = 0; collection.add($processor.invoke(entry1.getKey(), entry1.getValue()));
/* 248 */     }  return (List)destination$iv$iv; }
/*     */ 
/*     */   
/*     */   private final <T> List<T> walkResources(String subdirectory, Function1<? super Path, ? extends List<?>> body) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual getRootUri : ()Ljava/net/URI;
/*     */     //   4: invokevirtual getScheme : ()Ljava/lang/String;
/*     */     //   7: astore_3
/*     */     //   8: aload_3
/*     */     //   9: ldc 'jar'
/*     */     //   11: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   14: ifeq -> 84
/*     */     //   17: aload_0
/*     */     //   18: invokevirtual getRootUri : ()Ljava/net/URI;
/*     */     //   21: invokestatic getFileSystem : (Ljava/net/URI;)Ljava/nio/file/FileSystem;
/*     */     //   24: checkcast java/io/Closeable
/*     */     //   27: astore #4
/*     */     //   29: aconst_null
/*     */     //   30: astore #5
/*     */     //   32: nop
/*     */     //   33: aload #4
/*     */     //   35: checkcast java/nio/file/FileSystem
/*     */     //   38: astore #6
/*     */     //   40: iconst_0
/*     */     //   41: istore #7
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: aload_2
/*     */     //   46: invokespecial resolveAndApply : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */     //   49: astore #6
/*     */     //   51: aload #4
/*     */     //   53: aload #5
/*     */     //   55: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
/*     */     //   58: aload #6
/*     */     //   60: goto -> 129
/*     */     //   63: astore #7
/*     */     //   65: aload #7
/*     */     //   67: astore #5
/*     */     //   69: aload #7
/*     */     //   71: athrow
/*     */     //   72: astore #7
/*     */     //   74: aload #4
/*     */     //   76: aload #5
/*     */     //   78: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
/*     */     //   81: aload #7
/*     */     //   83: athrow
/*     */     //   84: aload_3
/*     */     //   85: ldc 'file'
/*     */     //   87: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   90: ifeq -> 102
/*     */     //   93: aload_0
/*     */     //   94: aload_1
/*     */     //   95: aload_2
/*     */     //   96: invokespecial resolveAndApply : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */     //   99: goto -> 129
/*     */     //   102: aload_0
/*     */     //   103: invokevirtual getRootUri : ()Ljava/net/URI;
/*     */     //   106: invokevirtual getScheme : ()Ljava/lang/String;
/*     */     //   109: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   114: aconst_null
/*     */     //   115: iconst_2
/*     */     //   116: aconst_null
/*     */     //   117: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   120: pop
/*     */     //   121: new kotlin/KotlinNothingValueException
/*     */     //   124: dup
/*     */     //   125: invokespecial <init> : ()V
/*     */     //   128: athrow
/*     */     //   129: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 0
/*     */     //   #88	-> 8
/*     */     //   #89	-> 43
/*     */     //   #88	-> 49
/*     */     //   #91	-> 84
/*     */     //   #92	-> 93
/*     */     //   #94	-> 102
/*     */     //   #87	-> 129
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   43	6	7	$i$a$-use-VelocityLibraryWalker$Classpath$walkResources$1	I
/*     */     //   40	9	6	it	Ljava/nio/file/FileSystem;
/*     */     //   0	130	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Classpath;
/*     */     //   0	130	1	subdirectory	Ljava/lang/String;
/*     */     //   0	130	2	body	Lkotlin/jvm/functions/Function1;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   32	51	63	java/lang/Throwable
/*     */     //   32	51	72	finally
/*     */     //   63	72	72	finally
/*     */     //   72	74	72	finally
/*     */   }
/*     */   
/*     */   private final <T> List<T> resolveAndApply(String subdirectory, Function1 body) {
/*     */     Path path = Paths.get(getRootUri()).resolve(subdirectory);
/*     */     Intrinsics.checkNotNull(path);
/*     */     return Files.exists(path, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) ? (List<T>)body.invoke(path) : CollectionsKt.emptyList();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityLibraryWalker$Classpath.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */