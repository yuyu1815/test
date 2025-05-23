/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import java.net.URI;
/*     */ import java.nio.file.FileSystem;
/*     */ import java.nio.file.FileSystemNotFoundException;
/*     */ import java.nio.file.FileSystems;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\032\035\020\000\032\n \002*\004\030\0010\0010\0012\006\020\003\032\0020\004H\000¢\006\002\020\005¨\006\006"}, d2 = {"getFileSystem", "Ljava/nio/file/FileSystem;", "kotlin.jvm.PlatformType", "uri", "Ljava/net/URI;", "(Ljava/net/URI;)Ljava/nio/file/FileSystem;", "tasks-provider-llm-prompt-velocity-model"})
/*     */ public final class VelocityTemplateEngineKt
/*     */ {
/*     */   public static final FileSystem getFileSystem(@NotNull URI uri) {
/*     */     FileSystem fileSystem;
/* 155 */     Intrinsics.checkNotNullParameter(uri, "uri"); 
/* 156 */     try { fileSystem = FileSystems.getFileSystem(uri); }
/* 157 */     catch (FileSystemNotFoundException e)
/* 158 */     { fileSystem = FileSystems.newFileSystem(uri, MapsKt.emptyMap()); }  return fileSystem;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityTemplateEngineKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */