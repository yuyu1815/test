/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.io.path.PathsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\000\n\002\020\016\n\002\b\003\0320\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\022\020\005\032\016\022\004\022\0020\004\022\004\022\002H\0020\006H\002\"\016\020\n\032\0020\013XT¢\006\002\n\000\"\016\020\f\032\0020\013XT¢\006\002\n\000\"\016\020\r\032\0020\013XT¢\006\002\n\000*$\b\002\020\007\"\016\022\004\022\0020\004\022\004\022\0020\t0\b2\016\022\004\022\0020\004\022\004\022\0020\t0\b¨\006\016"}, d2 = {"doWalkSharedChatSchemas", "", "T", "chatTasksDir", "Ljava/nio/file/Path;", "processor", "Lkotlin/Function1;", "VelocityLibraryFiles", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TargetSatellites;", "DESCRIPTOR_EXT", "", "TAG_FILENAME", "PARAMS_FILENAME", "tasks-provider-llm-prompt-velocity-model"})
/*     */ public final class VelocityLibraryWalkerKt
/*     */ {
/*     */   @NotNull
/*     */   private static final String DESCRIPTOR_EXT = "yaml";
/*     */   @NotNull
/*     */   private static final String TAG_FILENAME = "tag.yaml";
/*     */   @NotNull
/*     */   private static final String PARAMS_FILENAME = "parameters.yaml";
/*     */   
/*     */   private static final <T> List<T> doWalkSharedChatSchemas(Path chatTasksDir, Function1 processor) {
/* 163 */     Path schemasDir = chatTasksDir.resolve("_shared");
/* 164 */     Intrinsics.checkNotNull(schemasDir); return 
/*     */ 
/*     */       
/* 167 */       SequencesKt.toList(SequencesKt.map(SequencesKt.filter(PathsKt.walk(schemasDir, new kotlin.io.path.PathWalkOption[0]), VelocityLibraryWalkerKt::doWalkSharedChatSchemas$lambda$0), processor));
/*     */   }
/*     */   
/*     */   private static final boolean doWalkSharedChatSchemas$lambda$0(Path it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return Files.isRegularFile(it, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityLibraryWalkerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */