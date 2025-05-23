/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import ai.grazie.tasks.provider.prompt.velocity.resources.lib.validation.UtilsKt;
/*     */ import java.net.URI;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.io.path.PathsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J&\020\b\032\022\022\004\022\0020\n\022\004\022\0020\0130\tj\002`\f2\006\020\r\032\0020\n2\006\020\016\032\0020\017J\020\020\020\032\0020\0132\006\020\021\032\0020\nH\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/Walker;", "", "rootUri", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getRootUri", "()Ljava/net/URI;", "walk", "", "Ljava/nio/file/Path;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryFiles;", "directory", "entity", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VtyEntityFileDescriptor;", "walkSrcDirectory", "entityPath", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nVelocityLibraryWalker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/Walker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt\n+ 6 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt$checkOrVelocityLibraryException$1\n*L\n1#1,236:1\n1#2:237\n1#2:258\n1557#3:238\n1628#3,3:239\n763#4,2:242\n779#4,4:244\n1317#4:248\n1318#4:260\n7#5,7:249\n29#5:256\n15#5:259\n8#6:257\n*S KotlinDebug\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/Walker\n*L\n226#1:258\n194#1:238\n194#1:239,3\n205#1:242,2\n205#1:244,4\n220#1:248\n220#1:260\n226#1:249,7\n226#1:256\n226#1:259\n226#1:257\n*E\n"})
/*     */ final class Walker
/*     */ {
/*     */   @NotNull
/*     */   private final URI rootUri;
/*     */   
/*     */   public Walker(@NotNull URI rootUri) {
/* 190 */     this.rootUri = rootUri; } @NotNull public final URI getRootUri() { return this.rootUri; }
/*     */    @NotNull
/*     */   public final Map<Path, TargetSatellites> walk(@NotNull Path directory, @NotNull VtyEntityFileDescriptor entity) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'directory'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'entity'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: invokevirtual getFilename : ()Ljava/lang/String;
/*     */     //   16: astore_3
/*     */     //   17: invokestatic values : ()[Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VtyEntityFileDescriptor;
/*     */     //   20: invokestatic toMutableList : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   23: astore #5
/*     */     //   25: aload #5
/*     */     //   27: astore #6
/*     */     //   29: iconst_0
/*     */     //   30: istore #7
/*     */     //   32: aload #6
/*     */     //   34: aload_2
/*     */     //   35: invokeinterface remove : (Ljava/lang/Object;)Z
/*     */     //   40: pop
/*     */     //   41: aload #5
/*     */     //   43: checkcast java/lang/Iterable
/*     */     //   46: astore #5
/*     */     //   48: nop
/*     */     //   49: iconst_0
/*     */     //   50: istore #6
/*     */     //   52: aload #5
/*     */     //   54: astore #7
/*     */     //   56: new java/util/ArrayList
/*     */     //   59: dup
/*     */     //   60: aload #5
/*     */     //   62: bipush #10
/*     */     //   64: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   67: invokespecial <init> : (I)V
/*     */     //   70: checkcast java/util/Collection
/*     */     //   73: astore #8
/*     */     //   75: iconst_0
/*     */     //   76: istore #9
/*     */     //   78: aload #7
/*     */     //   80: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   85: astore #10
/*     */     //   87: aload #10
/*     */     //   89: invokeinterface hasNext : ()Z
/*     */     //   94: ifeq -> 137
/*     */     //   97: aload #10
/*     */     //   99: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   104: astore #11
/*     */     //   106: aload #8
/*     */     //   108: aload #11
/*     */     //   110: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/lib/VtyEntityFileDescriptor
/*     */     //   113: astore #12
/*     */     //   115: astore #15
/*     */     //   117: iconst_0
/*     */     //   118: istore #13
/*     */     //   120: aload #12
/*     */     //   122: invokevirtual getFilename : ()Ljava/lang/String;
/*     */     //   125: aload #15
/*     */     //   127: swap
/*     */     //   128: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   133: pop
/*     */     //   134: goto -> 87
/*     */     //   137: aload #8
/*     */     //   139: checkcast java/util/List
/*     */     //   142: nop
/*     */     //   143: astore #4
/*     */     //   145: aload_1
/*     */     //   146: iconst_0
/*     */     //   147: anewarray kotlin/io/path/PathWalkOption
/*     */     //   150: invokestatic walk : (Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)Lkotlin/sequences/Sequence;
/*     */     //   153: aload_3
/*     */     //   154: aload #4
/*     */     //   156: aload_0
/*     */     //   157: aload_2
/*     */     //   158: <illegal opcode> invoke : (Ljava/lang/String;Ljava/util/List;Lai/grazie/tasks/provider/prompt/velocity/resources/lib/Walker;Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VtyEntityFileDescriptor;)Lkotlin/jvm/functions/Function1;
/*     */     //   163: invokestatic filter : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */     //   166: astore #5
/*     */     //   168: aload #5
/*     */     //   170: astore #6
/*     */     //   172: iconst_0
/*     */     //   173: istore #7
/*     */     //   175: new java/util/LinkedHashMap
/*     */     //   178: dup
/*     */     //   179: invokespecial <init> : ()V
/*     */     //   182: astore #8
/*     */     //   184: aload #6
/*     */     //   186: astore #9
/*     */     //   188: iconst_0
/*     */     //   189: istore #10
/*     */     //   191: aload #9
/*     */     //   193: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   198: astore #11
/*     */     //   200: aload #11
/*     */     //   202: invokeinterface hasNext : ()Z
/*     */     //   207: ifeq -> 263
/*     */     //   210: aload #11
/*     */     //   212: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   217: astore #12
/*     */     //   219: aload #8
/*     */     //   221: checkcast java/util/Map
/*     */     //   224: aload #12
/*     */     //   226: aload #12
/*     */     //   228: checkcast java/nio/file/Path
/*     */     //   231: astore #13
/*     */     //   233: astore #16
/*     */     //   235: astore #15
/*     */     //   237: iconst_0
/*     */     //   238: istore #14
/*     */     //   240: aload_0
/*     */     //   241: aload #13
/*     */     //   243: invokespecial walkSrcDirectory : (Ljava/nio/file/Path;)Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;
/*     */     //   246: astore #17
/*     */     //   248: aload #15
/*     */     //   250: aload #16
/*     */     //   252: aload #17
/*     */     //   254: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   259: pop
/*     */     //   260: goto -> 200
/*     */     //   263: aload #8
/*     */     //   265: checkcast java/util/Map
/*     */     //   268: nop
/*     */     //   269: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #193	-> 12
/*     */     //   #194	-> 17
/*     */     //   #237	-> 29
/*     */     //   #194	-> 32
/*     */     //   #194	-> 41
/*     */     //   #194	-> 48
/*     */     //   #238	-> 52
/*     */     //   #239	-> 78
/*     */     //   #240	-> 106
/*     */     //   #194	-> 120
/*     */     //   #240	-> 128
/*     */     //   #241	-> 137
/*     */     //   #238	-> 142
/*     */     //   #194	-> 143
/*     */     //   #195	-> 145
/*     */     //   #205	-> 168
/*     */     //   #242	-> 175
/*     */     //   #243	-> 184
/*     */     //   #244	-> 191
/*     */     //   #245	-> 219
/*     */     //   #206	-> 240
/*     */     //   #245	-> 254
/*     */     //   #247	-> 263
/*     */     //   #243	-> 268
/*     */     //   #205	-> 269
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   32	9	7	$i$a$-also-Walker$walk$unexpectedFilenames$1	I
/*     */     //   29	12	6	it	Ljava/util/List;
/*     */     //   120	5	13	$i$a$-map-Walker$walk$unexpectedFilenames$2	I
/*     */     //   117	8	12	it	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VtyEntityFileDescriptor;
/*     */     //   106	28	11	item$iv$iv	Ljava/lang/Object;
/*     */     //   78	61	9	$i$f$mapTo	I
/*     */     //   75	64	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   75	64	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   52	91	6	$i$f$map	I
/*     */     //   49	94	5	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   240	6	14	$i$a$-associateWith-Walker$walk$1	I
/*     */     //   237	9	13	it	Ljava/nio/file/Path;
/*     */     //   219	41	12	element$iv$iv	Ljava/lang/Object;
/*     */     //   191	77	10	$i$f$associateWithTo	I
/*     */     //   188	80	9	$this$associateWithTo$iv$iv	Lkotlin/sequences/Sequence;
/*     */     //   175	94	7	$i$f$associateWith	I
/*     */     //   184	85	8	result$iv	Ljava/util/LinkedHashMap;
/*     */     //   172	97	6	$this$associateWith$iv	Lkotlin/sequences/Sequence;
/*     */     //   17	253	3	targetFilename	Ljava/lang/String;
/*     */     //   145	125	4	unexpectedFilenames	Ljava/util/List;
/*     */     //   168	102	5	targetFiles	Lkotlin/sequences/Sequence;
/*     */     //   0	270	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/Walker;
/*     */     //   0	270	1	directory	Ljava/nio/file/Path;
/*     */     //   0	270	2	entity	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VtyEntityFileDescriptor;
/*     */   }
/*     */   private static final boolean walk$lambda$2(String $targetFilename, List $unexpectedFilenames, Walker this$0, VtyEntityFileDescriptor $entity, Path it) {
/* 196 */     Intrinsics.checkNotNullParameter(it, "it");
/* 197 */     String str = PathsKt.getName(it);
/*     */     
/* 199 */     if ($unexpectedFilenames.contains(str)) { UtilsKt.velocityLibraryException$default("[" + PathKt.relativeUriString(this$0.rootUri, it) + "] unexpected file in " + $entity + "s subdirectory (should be '" + $targetFilename + "')", null, 2, null); throw new KotlinNothingValueException(); }
/*     */     
/*     */     return (Files.isRegularFile(it, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) && Intrinsics.areEqual(PathsKt.getExtension(it), "yaml")) ? (Intrinsics.areEqual(str, $targetFilename)) : false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final TargetSatellites walkSrcDirectory(Path entityPath) {
/*     */     Object object;
/* 212 */     Path entityDir = entityPath.getParent();
/*     */     
/* 214 */     Path path1 = entityPath.resolveSibling("parameters.yaml"), it = path1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 237 */     int $i$a$-takeIf-Walker$walkSrcDirectory$params$1 = 0; Intrinsics.checkNotNull(it);
/*     */     if ((Files.exists(it, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) ? path1 : null) == null) {
/*     */       Files.exists(it, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) ? path1 : null;
/*     */       Intrinsics.checkNotNull(entityDir);
/*     */       UtilsKt.velocityLibraryException$default("[" + PathKt.relativeUriString(this.rootUri, entityDir) + "] `parameters.yaml` file was not found", null, 2, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     List<? extends Path> tags = new ArrayList();
/*     */     Intrinsics.checkNotNull(entityDir);
/*     */     Sequence sequence = SequencesKt.filter(PathsKt.walk(entityDir, new kotlin.io.path.PathWalkOption[0]), Walker::walkSrcDirectory$lambda$5);
/*     */     int $i$f$forEach = 0;
/* 248 */     Iterator iterator = sequence.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Path file = (Path)element$iv; int $i$a$-forEach-Walker$walkSrcDirectory$2 = 0;
/*     */       String str = PathsKt.getName(file); }
/*     */     
/*     */     return new TargetSatellites((Path)object, tags);
/*     */   }
/*     */   
/*     */   private static final boolean walkSrcDirectory$lambda$5(Path it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return (Files.isRegularFile(it, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) && Intrinsics.areEqual(PathsKt.getExtension(it), "yaml"));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\Walker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */