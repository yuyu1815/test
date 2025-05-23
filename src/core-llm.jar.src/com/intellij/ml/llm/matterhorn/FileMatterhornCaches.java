/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.util.io.Compressor;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.OpenOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.io.path.PathsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Charsets;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\000\n\002\b\023\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\034\n\002\b\003\n\002\020\022\n\002\b\006\n\002\030\002\n\002\b\004\030\000 92\0020\001:\0019B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J \020 \032\0020!2\006\020\"\032\0020#2\006\020$\032\0020%2\006\020&\032\0020%H\026J\030\020'\032\0020(2\006\020\"\032\0020#2\006\020$\032\0020%H\026J\032\020)\032\004\030\0010%2\006\020\"\032\0020#2\006\020$\032\0020%H\026J\026\020*\032\b\022\004\022\0020%0+2\006\020\"\032\0020#H\026J\020\020,\032\0020(2\006\020\"\032\0020#H\026J\030\020-\032\0020!2\006\020\"\032\0020#2\006\020$\032\0020%H\026J \020.\032\0020!2\006\020\"\032\0020#2\006\020$\032\0020%2\006\020&\032\0020/H\026J\032\0200\032\004\030\0010/2\006\020\"\032\0020#2\006\020$\032\0020%H\026J\030\0201\032\0020!2\006\020\"\032\0020#2\006\020&\032\0020%H\026J\022\0202\032\004\030\0010%2\006\020\"\032\0020#H\026J\b\0203\032\0020!H\026J\020\0204\032\0020!2\006\0205\032\00206H\026J\b\0207\032\0020\013H\002J\020\0208\032\0020\0132\006\020\"\032\0020#H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\006\032\0020\0078BX\004¢\006\006\032\004\b\b\020\tR\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\021\020\016\032\0020\013¢\006\b\n\000\032\004\b\017\020\020R\021\020\021\032\0020\013¢\006\b\n\000\032\004\b\022\020\020R\021\020\023\032\0020\013¢\006\b\n\000\032\004\b\024\020\020R\021\020\025\032\0020\013¢\006\b\n\000\032\004\b\026\020\020R\021\020\027\032\0020\013¢\006\b\n\000\032\004\b\030\020\020R\016\020\031\032\0020\013X\004¢\006\002\n\000R\021\020\032\032\0020\013¢\006\b\n\000\032\004\b\033\020\020R\016\020\034\032\0020\013X\004¢\006\002\n\000R\016\020\035\032\0020\013X\004¢\006\002\n\000R\016\020\036\032\0020\013X\004¢\006\002\n\000R\016\020\037\032\0020\013X\004¢\006\002\n\000¨\006:"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/FileMatterhornCaches;", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "projectPath", "Lcom/intellij/openapi/vfs/VirtualFile;", "getProjectPath", "()Lcom/intellij/openapi/vfs/VirtualFile;", "root", "Ljava/nio/file/Path;", "lock", "", "artifacts", "getArtifacts", "()Ljava/nio/file/Path;", "caches", "getCaches", "logs", "getLogs", "sources", "getSources", "serializableEvents", "getSerializableEvents", "trajectory", "presentations", "getPresentations", "exitStatus", "media", "nonCachedRequests", "issues", "save", "", "type", "Lcom/intellij/ml/llm/matterhorn/CacheType;", "path", "", "content", "contains", "", "load", "loadAllPaths", "", "hasAnyOfType", "remove", "saveBinary", "", "loadBinary", "saveSingle", "loadSingle", "clear", "dumpToZip", "zip", "Lcom/intellij/util/io/Compressor$Zip;", "calculateCachesPath", "getPath", "Companion", "core"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornCaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornCaches.kt\ncom/intellij/ml/llm/matterhorn/FileMatterhornCaches\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,290:1\n1755#2,3:291\n14#3:294\n*S KotlinDebug\n*F\n+ 1 MatterhornCaches.kt\ncom/intellij/ml/llm/matterhorn/FileMatterhornCaches\n*L\n128#1:291,3\n46#1:294\n*E\n"})
/*     */ public final class FileMatterhornCaches
/*     */   implements MatterhornCaches
/*     */ {
/*     */   public FileMatterhornCaches(@NotNull Project project) {
/*  44 */     this.project = project;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     this.root = calculateCachesPath();
/*  51 */     this.lock = new Object();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  56 */     Intrinsics.checkNotNullExpressionValue(this.root.resolve(".matterhorn"), "resolve(...)"); this.artifacts = this.root.resolve(".matterhorn");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     Intrinsics.checkNotNullExpressionValue(this.root.resolve(".caches"), "resolve(...)"); this.caches = this.root.resolve(".caches");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  66 */     Intrinsics.checkNotNullExpressionValue(this.artifacts.resolve("logs"), "resolve(...)"); this.logs = this.artifacts.resolve("logs");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     Intrinsics.checkNotNullExpressionValue(this.artifacts.resolve("sources"), "resolve(...)"); this.sources = this.artifacts.resolve("sources");
/*  72 */     Intrinsics.checkNotNullExpressionValue(this.artifacts.resolve("events"), "resolve(...)"); this.serializableEvents = this.artifacts.resolve("events");
/*  73 */     Intrinsics.checkNotNullExpressionValue(this.artifacts.resolve("trajectory"), "resolve(...)"); this.trajectory = this.artifacts.resolve("trajectory");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     Intrinsics.checkNotNullExpressionValue(this.artifacts.resolve("representations"), "resolve(...)"); this.presentations = this.artifacts.resolve("representations");
/*  79 */     Intrinsics.checkNotNullExpressionValue(this.artifacts.resolve("exit.status"), "resolve(...)"); this.exitStatus = this.artifacts.resolve("exit.status");
/*  80 */     Intrinsics.checkNotNullExpressionValue(this.artifacts.resolve("media"), "resolve(...)"); this.media = this.artifacts.resolve("media");
/*  81 */     Intrinsics.checkNotNullExpressionValue(this.artifacts.resolve("non_cached_requests.txt"), "resolve(...)"); this.nonCachedRequests = this.artifacts.resolve("non_cached_requests.txt");
/*  82 */     Intrinsics.checkNotNullExpressionValue(this.artifacts.resolve("issues"), "resolve(...)"); this.issues = this.artifacts.resolve("issues");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/FileMatterhornCaches$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Logger getLogger() {
/*     */       return FileMatterhornCaches.logger;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Project project;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path root;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Object lock;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path artifacts;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path caches;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path logs;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path sources;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path serializableEvents;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path trajectory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path presentations;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path exitStatus;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path media;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path nonCachedRequests;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Path issues;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static
/*     */   {
/*     */     int $i$f$logger = 0;
/* 294 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(FileMatterhornCaches.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(FileMatterhornCaches.class);
/*     */   
/*     */   private final VirtualFile getProjectPath() {
/*     */     Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(this.project));
/*     */     return ProjectUtil.guessProjectDir(this.project);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path getArtifacts() {
/*     */     return this.artifacts;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path getCaches() {
/*     */     return this.caches;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path getLogs() {
/*     */     return this.logs;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path getSources() {
/*     */     return this.sources;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path getSerializableEvents() {
/*     */     return this.serializableEvents;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path getPresentations() {
/*     */     return this.presentations;
/*     */   }
/*     */   
/*     */   public void save(@NotNull CacheType type, @NotNull String path, @NotNull String content) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     if (!BuildConfigKt.getConfig().getSaveCachesOnDisk() && type != CacheType.Issues)
/*     */       return; 
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$save$1 = 0;
/*     */       Path typePath = getPath(type);
/*     */       Path targetFile = typePath.resolve(path);
/*     */       Files.createDirectories(targetFile.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       Intrinsics.checkNotNull(targetFile);
/*     */       PathsKt.writeText(targetFile, content, Charsets.UTF_8, new OpenOption[0]);
/*     */       Unit unit = Unit.INSTANCE;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean contains(@NotNull CacheType type, @NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$contains$1 = 0;
/*     */       Path typePath = getPath(type);
/*     */       Path targetFile = typePath.resolve(path);
/*     */       Intrinsics.checkNotNull(targetFile);
/*     */       return Files.exists(targetFile, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length));
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String load(@NotNull CacheType type, @NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$load$1 = 0;
/*     */       Path typePath = getPath(type);
/*     */       Path targetFile = typePath.resolve(path);
/*     */       Intrinsics.checkNotNull(targetFile);
/*     */       if (!Files.exists(targetFile, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)))
/*     */         return null; 
/*     */       return PathsKt.readText(targetFile, Charsets.UTF_8);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Iterable<String> loadAllPaths(@NotNull CacheType type) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$loadAllPaths$1 = 0;
/*     */       Path cacheTypePath = getPath(type);
/*     */       if (!Files.exists(cacheTypePath, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)))
/*     */         return CollectionsKt.emptyList(); 
/*     */       List<String> list = Files.walk(cacheTypePath, new java.nio.file.FileVisitOption[0]).filter(FileMatterhornCaches::loadAllPaths$lambda$7$lambda$3::loadAllPaths$lambda$7$lambda$4).map(cacheTypePath::loadAllPaths$lambda$7$lambda$5::loadAllPaths$lambda$7$lambda$6).toList();
/*     */       Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
/*     */       return list;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final boolean loadAllPaths$lambda$7$lambda$3(Path it) {
/*     */     Intrinsics.checkNotNull(it);
/*     */     return Files.isRegularFile(it, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length));
/*     */   }
/*     */   
/*     */   private static final boolean loadAllPaths$lambda$7$lambda$4(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   private static final String loadAllPaths$lambda$7$lambda$5(Path $cacheTypePath, Path it) {
/*     */     Intrinsics.checkNotNull(it);
/*     */     return PathsKt.relativeTo(it, $cacheTypePath).toString();
/*     */   }
/*     */   
/*     */   private static final String loadAllPaths$lambda$7$lambda$6(Function1 $tmp0, Object p0) {
/*     */     return (String)$tmp0.invoke(p0);
/*     */   }
/*     */   
/*     */   public boolean hasAnyOfType(@NotNull CacheType type) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'type'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield lock : Ljava/lang/Object;
/*     */     //   10: astore_2
/*     */     //   11: aload_2
/*     */     //   12: monitorenter
/*     */     //   13: nop
/*     */     //   14: iconst_0
/*     */     //   15: istore_3
/*     */     //   16: aload_0
/*     */     //   17: aload_1
/*     */     //   18: invokespecial getPath : (Lcom/intellij/ml/llm/matterhorn/CacheType;)Ljava/nio/file/Path;
/*     */     //   21: astore #4
/*     */     //   23: aload #4
/*     */     //   25: iconst_0
/*     */     //   26: anewarray java/nio/file/LinkOption
/*     */     //   29: dup
/*     */     //   30: arraylength
/*     */     //   31: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   34: checkcast [Ljava/nio/file/LinkOption;
/*     */     //   37: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
/*     */     //   40: ifeq -> 155
/*     */     //   43: aload #4
/*     */     //   45: aconst_null
/*     */     //   46: iconst_1
/*     */     //   47: aconst_null
/*     */     //   48: invokestatic listDirectoryEntries$default : (Ljava/nio/file/Path;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
/*     */     //   51: checkcast java/lang/Iterable
/*     */     //   54: astore #5
/*     */     //   56: iconst_0
/*     */     //   57: istore #6
/*     */     //   59: aload #5
/*     */     //   61: instanceof java/util/Collection
/*     */     //   64: ifeq -> 84
/*     */     //   67: aload #5
/*     */     //   69: checkcast java/util/Collection
/*     */     //   72: invokeinterface isEmpty : ()Z
/*     */     //   77: ifeq -> 84
/*     */     //   80: iconst_0
/*     */     //   81: goto -> 148
/*     */     //   84: aload #5
/*     */     //   86: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   91: astore #7
/*     */     //   93: aload #7
/*     */     //   95: invokeinterface hasNext : ()Z
/*     */     //   100: ifeq -> 147
/*     */     //   103: aload #7
/*     */     //   105: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   110: astore #8
/*     */     //   112: aload #8
/*     */     //   114: checkcast java/nio/file/Path
/*     */     //   117: astore #9
/*     */     //   119: iconst_0
/*     */     //   120: istore #10
/*     */     //   122: aload #9
/*     */     //   124: iconst_0
/*     */     //   125: anewarray java/nio/file/LinkOption
/*     */     //   128: dup
/*     */     //   129: arraylength
/*     */     //   130: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   133: checkcast [Ljava/nio/file/LinkOption;
/*     */     //   136: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
/*     */     //   139: nop
/*     */     //   140: ifeq -> 93
/*     */     //   143: iconst_1
/*     */     //   144: goto -> 148
/*     */     //   147: iconst_0
/*     */     //   148: ifeq -> 155
/*     */     //   151: iconst_1
/*     */     //   152: goto -> 156
/*     */     //   155: iconst_0
/*     */     //   156: istore #11
/*     */     //   158: aload_2
/*     */     //   159: monitorexit
/*     */     //   160: iload #11
/*     */     //   162: ireturn
/*     */     //   163: astore_3
/*     */     //   164: aload_2
/*     */     //   165: monitorexit
/*     */     //   166: aload_3
/*     */     //   167: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #126	-> 6
/*     */     //   #127	-> 16
/*     */     //   #128	-> 23
/*     */     //   #128	-> 40
/*     */     //   #291	-> 59
/*     */     //   #292	-> 84
/*     */     //   #128	-> 122
/*     */     //   #128	-> 139
/*     */     //   #292	-> 140
/*     */     //   #293	-> 147
/*     */     //   #128	-> 148
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   122	18	10	$i$a$-any-FileMatterhornCaches$hasAnyOfType$1$1	I
/*     */     //   119	21	9	it	Ljava/nio/file/Path;
/*     */     //   112	35	8	element$iv	Ljava/lang/Object;
/*     */     //   59	89	6	$i$f$any	I
/*     */     //   56	92	5	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   16	140	3	$i$a$-synchronized-FileMatterhornCaches$hasAnyOfType$1	I
/*     */     //   23	133	4	typePath	Ljava/nio/file/Path;
/*     */     //   0	168	0	this	Lcom/intellij/ml/llm/matterhorn/FileMatterhornCaches;
/*     */     //   0	168	1	type	Lcom/intellij/ml/llm/matterhorn/CacheType;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   13	158	163	finally
/*     */     //   163	164	163	finally
/*     */   }
/*     */   
/*     */   public void remove(@NotNull CacheType type, @NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$remove$1 = 0;
/*     */       Path typePath = getPath(type);
/*     */       Path targetFile = typePath.resolve(path);
/*     */       Intrinsics.checkNotNull(targetFile);
/*     */       if (Files.exists(targetFile, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)))
/*     */         if (Files.isDirectory(targetFile, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length))) {
/*     */           PathsKt.deleteRecursively(targetFile);
/*     */         } else {
/*     */           Files.deleteIfExists(targetFile);
/*     */         }  
/*     */       Unit unit = Unit.INSTANCE;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void saveBinary(@NotNull CacheType type, @NotNull String path, @NotNull byte[] content) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     if (!BuildConfigKt.getConfig().getSaveCachesOnDisk() && type == CacheType.Issues)
/*     */       return; 
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$saveBinary$1 = 0;
/*     */       Path typePath = getPath(type);
/*     */       Path targetFile = typePath.resolve(path);
/*     */       Files.createDirectories(targetFile.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       Intrinsics.checkNotNull(targetFile);
/*     */       Files.write(targetFile, content, Arrays.<OpenOption>copyOf(new OpenOption[0], (new OpenOption[0]).length));
/*     */       Unit unit = Unit.INSTANCE;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public byte[] loadBinary(@NotNull CacheType type, @NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$loadBinary$1 = 0;
/*     */       Path typePath = getPath(type);
/*     */       Path targetFile = typePath.resolve(path);
/*     */       Intrinsics.checkNotNull(targetFile);
/*     */       if (!Files.exists(targetFile, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)))
/*     */         return null; 
/*     */       Intrinsics.checkNotNullExpressionValue(Files.readAllBytes(targetFile), "readAllBytes(...)");
/*     */       return Files.readAllBytes(targetFile);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void saveSingle(@NotNull CacheType type, @NotNull String content) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     if (!BuildConfigKt.getConfig().getSaveCachesOnDisk() && type == CacheType.Issues)
/*     */       return; 
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$saveSingle$1 = 0;
/*     */       Path typePath = getPath(type);
/*     */       Files.createDirectories(typePath.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/*     */       PathsKt.writeText(typePath, content, Charsets.UTF_8, new OpenOption[0]);
/*     */       Unit unit = Unit.INSTANCE;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String loadSingle(@NotNull CacheType type) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$loadSingle$1 = 0;
/*     */       Path typePath = getPath(type);
/*     */       if (!Files.exists(typePath, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)))
/*     */         return null; 
/*     */       return PathsKt.readText(typePath, Charsets.UTF_8);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void clear() {
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$clear$1 = 0;
/*     */       if (Files.exists(this.artifacts, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)))
/*     */         PathsKt.deleteRecursively(this.artifacts); 
/*     */       if (Files.exists(this.caches, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)))
/*     */         PathsKt.deleteRecursively(this.caches); 
/*     */       Unit unit = Unit.INSTANCE;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void dumpToZip(@NotNull Compressor.Zip zip) {
/*     */     Intrinsics.checkNotNullParameter(zip, "zip");
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-FileMatterhornCaches$dumpToZip$1 = 0;
/*     */       zip.addDirectory(".matterhorn", this.artifacts);
/*     */       Unit unit = Unit.INSTANCE;
/*     */     } 
/*     */   }
/*     */   
/*     */   private final Path calculateCachesPath() {
/*     */     if (System.getenv(RootExecutionContextKt.getMATTERHORN_CACHES_ENV_VAR()) != null) {
/*     */       Path path1;
/*     */       String it = System.getenv(RootExecutionContextKt.getMATTERHORN_CACHES_ENV_VAR());
/*     */       int $i$a$-let-FileMatterhornCaches$calculateCachesPath$result$1 = 0;
/*     */       if (Paths.get(getProjectPath().getPath(), new String[0]).resolve(it) == null) {
/*     */         Paths.get(getProjectPath().getPath(), new String[0]).resolve(it);
/*     */         Path result = ProjectUtil.getProjectDataPath(this.project, "matterhorn");
/*     */         logger.info("Matterhorn caches path: " + result.toString());
/*     */         return result;
/*     */       } 
/*     */       logger.info("Matterhorn caches path: " + path1.toString());
/*     */       return path1;
/*     */     } 
/*     */     path1 = Paths.get(getProjectPath().getPath(), new String[0]).resolve(it);
/*     */     Path path = ProjectUtil.getProjectDataPath(this.project, "matterhorn");
/*     */     logger.info("Matterhorn caches path: " + path.toString());
/*     */     return path;
/*     */   }
/*     */   
/*     */   private final Path getPath(CacheType type) {
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
/*     */       case 1:
/*     */       
/*     */       case 2:
/*     */       
/*     */       case 3:
/*     */       
/*     */       case 4:
/*     */       
/*     */       case 5:
/*     */       
/*     */       case 6:
/*     */       
/*     */       case 7:
/*     */       
/*     */       case 8:
/*     */       
/*     */       case 9:
/*     */       
/*     */       case 10:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\FileMatterhornCaches.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */