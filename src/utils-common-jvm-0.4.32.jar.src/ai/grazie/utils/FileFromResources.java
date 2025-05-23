/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import ai.grazie.utils.mpp.StreamDataLoader;
/*    */ import java.io.FileOutputStream;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\006\b&\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\004J\030\020\r\032\0020\f2\006\020\016\032\0020\n2\006\020\017\032\0020\nH\004J\020\020\020\032\0020\f2\006\020\021\032\0020\nH\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\022"}, d2 = {"Lai/grazie/utils/FileFromResources;", "", "loader", "Lai/grazie/utils/mpp/StreamDataLoader;", "(Lai/grazie/utils/mpp/StreamDataLoader;)V", "getLoader", "()Lai/grazie/utils/mpp/StreamDataLoader;", "copy", "", "resource", "", "path", "Ljava/nio/file/Path;", "file", "fileName", "fileExt", "folder", "folderName", "utils-common"})
/*    */ public abstract class FileFromResources {
/* 11 */   public FileFromResources(@NotNull StreamDataLoader loader) { this.loader = loader; } @NotNull private final StreamDataLoader loader; @NotNull public final StreamDataLoader getLoader() { return this.loader; } @NotNull
/* 12 */   protected final Path file(@NotNull String fileName, @NotNull String fileExt) { Intrinsics.checkNotNullParameter(fileName, "fileName"); Intrinsics.checkNotNullParameter(fileExt, "fileExt"); Intrinsics.checkNotNullExpressionValue(File.createTempFile(fileName, fileExt).toPath(), "createTempFile(fileName, fileExt).toPath()"); return File.createTempFile(fileName, fileExt).toPath(); } @NotNull
/* 13 */   protected final Path folder(@NotNull String folderName) { Intrinsics.checkNotNullParameter(folderName, "folderName"); Intrinsics.checkNotNullExpressionValue(Files.createTempDirectory(folderName, (FileAttribute<?>[])new FileAttribute[0]), "createTempDirectory(folderName)"); return Files.createTempDirectory(folderName, (FileAttribute<?>[])new FileAttribute[0]); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected final void copy(@NotNull String resource, @NotNull Path path) {
/* 21 */     Intrinsics.checkNotNullParameter(resource, "resource"); Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullExpressionValue(path.toFile(), "path.toFile()"); File file = path.toFile(); FileOutputStream fileOutputStream = new FileOutputStream(file); Throwable throwable = null; try { FileOutputStream out = fileOutputStream; int $i$a$-use-FileFromResources$copy$1 = 0;
/* 22 */       InputStream inputStream = this.loader.stream(new DataLoader.Path(resource)); Throwable throwable1 = null; try { InputStream it = inputStream; int $i$a$-use-FileFromResources$copy$1$1 = 0; long l1 = 
/* 23 */           ByteStreamsKt.copyTo$default(it, out, 0, 2, null); }
/*    */       catch (Throwable throwable2)
/*    */       { throwable1 = throwable2 = null;
/*    */         throw throwable2; }
/*    */       finally
/*    */       { CloseableKt.closeFinally(inputStream, throwable1); }
/*    */       
/*    */       long l = l1; }
/*    */     catch (Throwable throwable1)
/*    */     { throwable = throwable1 = null;
/*    */       throw throwable1; }
/*    */     finally
/*    */     { CloseableKt.closeFinally(fileOutputStream, throwable); }
/*    */   
/*    */   }
/*    */   
/*    */   public FileFromResources() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\FileFromResources.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */