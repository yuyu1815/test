/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import java.net.URI;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.apache.velocity.app.VelocityEngine;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\030\0002\0020\001B\021\b\026\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B\031\b\027\022\006\020\002\032\0020\003\022\006\020\006\032\0020\007¢\006\004\b\004\020\bB*\b\027\022\006\020\002\032\0020\003\022\027\020\t\032\023\022\004\022\0020\013\022\004\022\0020\f0\n¢\006\002\b\r¢\006\004\b\004\020\016B2\b\027\022\006\020\002\032\0020\003\022\006\020\006\032\0020\007\022\027\020\t\032\023\022\004\022\0020\013\022\004\022\0020\f0\n¢\006\002\b\r¢\006\004\b\004\020\017J.\020\034\032\b\022\004\022\002H\0360\035\"\004\b\000\020\0362\030\020\037\032\024\022\004\022\0020\003\022\004\022\0020!\022\004\022\002H\0360 H\026J(\020\"\032\b\022\004\022\002H\0360\035\"\004\b\000\020\0362\022\020\037\032\016\022\004\022\0020\003\022\004\022\002H\0360\nH\026J.\020#\032\b\022\004\022\002H\0360\035\"\004\b\000\020\0362\030\020\037\032\024\022\004\022\0020\003\022\004\022\0020!\022\004\022\002H\0360 H\026J.\020$\032\b\022\004\022\002H\0360\035\"\004\b\000\020\0362\030\020\037\032\024\022\004\022\0020\003\022\004\022\0020!\022\004\022\002H\0360 H\026R\024\020\020\032\0020\021X\004¢\006\b\n\000\032\004\b\022\020\023R\034\020\024\032\0020\0258\026X\004¢\006\016\n\000\022\004\b\026\020\027\032\004\b\030\020\031R\016\020\032\032\0020\033X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006%"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Relative;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker;", "templateDir", "Ljava/nio/file/Path;", "<init>", "(Ljava/nio/file/Path;)V", "enableTracing", "", "(Ljava/nio/file/Path;Z)V", "configureVelocityEngine", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/nio/file/Path;Lkotlin/jvm/functions/Function1;)V", "(Ljava/nio/file/Path;ZLkotlin/jvm/functions/Function1;)V", "rootUri", "Ljava/net/URI;", "getRootUri", "()Ljava/net/URI;", "templateEngine", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "getTemplateEngine$annotations", "()V", "getTemplateEngine", "()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "walker", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/Walker;", "walkTasks", "", "T", "processor", "Lkotlin/Function2;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;", "walkSharedChatSchemas", "walkChats", "walkFunctions", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nVelocityLibraryWalker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Relative\n+ 2 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt\n+ 3 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt$checkOrVelocityLibraryException$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,236:1\n7#2,7:237\n29#2:244\n15#2:247\n7#2,7:248\n29#2:255\n15#2:258\n7#2,7:259\n29#2:266\n15#2:269\n8#3:245\n8#3:256\n8#3:267\n1#4:246\n1#4:257\n1#4:268\n126#5:270\n153#5,3:271\n126#5:274\n153#5,3:275\n126#5:278\n153#5,3:279\n*S KotlinDebug\n*F\n+ 1 VelocityLibraryWalker.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibraryWalker$Relative\n*L\n129#1:237,7\n129#1:244\n129#1:247\n130#1:248,7\n130#1:255\n130#1:258\n131#1:259,7\n131#1:266\n131#1:269\n129#1:245\n130#1:256\n131#1:267\n129#1:246\n130#1:257\n131#1:268\n142#1:270\n142#1:271,3\n151#1:274\n151#1:275,3\n156#1:278\n156#1:279,3\n*E\n"})
/*     */ public final class Relative
/*     */   implements VelocityLibraryWalker
/*     */ {
/*     */   @NotNull
/*     */   private final URI rootUri;
/*     */   @NotNull
/*     */   private final VelocityTemplateEngine templateEngine;
/*     */   @NotNull
/*     */   private final Walker walker;
/*     */   @NotNull
/*     */   private final Path templateDir;
/*     */   
/*     */   @NotNull
/*     */   public URI getRootUri() {
/* 110 */     return this.rootUri; } @NotNull
/*     */   public VelocityTemplateEngine getTemplateEngine() {
/* 112 */     return this.templateEngine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Relative(@NotNull Path templateDir)
/*     */   {
/* 119 */     this(templateDir, false, Relative::_init_$lambda$0); } private static final Unit _init_$lambda$0(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; }
/*     */   
/*     */   @Deprecated(message = "In favour of single-argument constructor, since 05 Feb 2025")
/* 122 */   public Relative(@NotNull Path templateDir, boolean enableTracing) { this(templateDir, enableTracing, Relative::_init_$lambda$1); } private static final Unit _init_$lambda$1(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; }
/*     */    @Deprecated(message = "In favour of single-argument constructor, since 05 Feb 2025")
/*     */   public Relative(@NotNull Path templateDir, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) {
/* 125 */     this(templateDir, false, configureVelocityEngine);
/*     */   }
/*     */   
/*     */   @Deprecated(message = "In favour of single-argument constructor, since 05 Feb 2025")
/* 129 */   public Relative(@NotNull Path templateDir, boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) { boolean condition$iv = Files.exists(templateDir, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 237 */     int $i$f$checkOrVelocityLibraryException = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 242 */     if (!condition$iv) {
/* 243 */       int $i$f$buildMessage = 0;
/* 244 */       int $i$a$-checkOrVelocityLibraryException-UtilsKt$checkOrVelocityLibraryException$1 = 0, $i$a$-checkOrVelocityLibraryException$default-VelocityLibraryWalker$Relative$3 = 0;
/*     */     } 
/*     */     
/*     */     condition$iv = Files.isDirectory(templateDir, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length));
/* 248 */     $i$f$checkOrVelocityLibraryException = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 253 */     if (!condition$iv) {
/* 254 */       int $i$f$buildMessage = 0;
/* 255 */       int $i$a$-checkOrVelocityLibraryException-UtilsKt$checkOrVelocityLibraryException$1 = 0, $i$a$-checkOrVelocityLibraryException$default-VelocityLibraryWalker$Relative$4 = 0;
/*     */     } 
/*     */     
/*     */     condition$iv = templateDir.isAbsolute();
/* 259 */     $i$f$checkOrVelocityLibraryException = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 264 */     if (!condition$iv) {
/* 265 */       int $i$f$buildMessage = 0;
/* 266 */       int $i$a$-checkOrVelocityLibraryException-UtilsKt$checkOrVelocityLibraryException$1 = 0, $i$a$-checkOrVelocityLibraryException$default-VelocityLibraryWalker$Relative$5 = 0;
/*     */     }  this.templateDir = templateDir; this.rootUri = templateDir.toUri(); this.walker = new Walker(getRootUri()); this.templateEngine = VelocityTemplateEngine.Relative.Companion.create(templateDir, enableTracing, configureVelocityEngine); } @NotNull public <T> List<T> walkTasks(@NotNull Function2 processor) { Intrinsics.checkNotNullParameter(processor, "processor"); Intrinsics.checkNotNullExpressionValue(this.templateDir.resolve("tasks"), "resolve(...)"); Map<Path, TargetSatellites> tasks = this.walker.walk(this.templateDir.resolve("tasks"), VtyEntityFileDescriptor.TASK);
/*     */     Map<Path, TargetSatellites> $this$map$iv = tasks;
/*     */     int $i$f$map = 0;
/* 270 */     Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 271 */     for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 272 */       Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Relative$walkTasks$1 = 0; collection.add(processor.invoke(entry1.getKey(), entry1.getValue()));
/* 273 */     }  return (List)destination$iv$iv; } @NotNull public <T> List<T> walkChats(@NotNull Function2 processor) { Intrinsics.checkNotNullParameter(processor, "processor"); Intrinsics.checkNotNullExpressionValue(this.templateDir.resolve("chatTasks"), "resolve(...)"); Map<Path, TargetSatellites> tasks = this.walker.walk(this.templateDir.resolve("chatTasks"), VtyEntityFileDescriptor.CHAT_TASK); Map<Path, TargetSatellites> $this$map$iv = tasks; int $i$f$map = 0;
/* 274 */     Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 275 */     for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 276 */       Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Relative$walkChats$1 = 0; collection.add(processor.invoke(entry1.getKey(), entry1.getValue()));
/* 277 */     }  return (List)destination$iv$iv; }
/* 278 */   @NotNull public <T> List<T> walkSharedChatSchemas(@NotNull Function1 processor) { Intrinsics.checkNotNullParameter(processor, "processor"); Intrinsics.checkNotNullExpressionValue(this.templateDir.resolve("chatTasks"), "resolve(...)"); return VelocityLibraryWalkerKt.access$doWalkSharedChatSchemas(this.templateDir.resolve("chatTasks"), processor); } @NotNull public <T> List<T> walkFunctions(@NotNull Function2 processor) { Intrinsics.checkNotNullParameter(processor, "processor"); Intrinsics.checkNotNullExpressionValue(this.templateDir.resolve("functions"), "resolve(...)"); Map<Path, TargetSatellites> descriptors = this.walker.walk(this.templateDir.resolve("functions"), VtyEntityFileDescriptor.FUNCTION); Map<Path, TargetSatellites> $this$map$iv = descriptors; int $i$f$map = 0; Map<Path, TargetSatellites> map1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 279 */     for (Map.Entry<Path, TargetSatellites> item$iv$iv : map1.entrySet()) {
/* 280 */       Map.Entry<Path, TargetSatellites> entry1 = item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-VelocityLibraryWalker$Relative$walkFunctions$1 = 0; collection.add(processor.invoke(entry1.getKey(), entry1.getValue()));
/* 281 */     }  return (List)destination$iv$iv; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityLibraryWalker$Relative.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */