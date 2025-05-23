/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.InputStream;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.io.FilesKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\022\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\026J\026\020\006\032\0020\0072\006\020\005\032\0020\004H@¢\006\002\020\bJ\020\020\t\032\0020\n2\006\020\005\032\0020\004H\026J\026\020\013\032\0020\f2\006\020\005\032\0020\004H@¢\006\002\020\b¨\006\r"}, d2 = {"Lai/grazie/utils/mpp/FromServerResourcesDataLoader;", "Lai/grazie/utils/mpp/RootStreamDataLoader;", "()V", "absolute", "Lai/grazie/utils/mpp/DataLoader$Path;", "path", "bytes", "", "(Lai/grazie/utils/mpp/DataLoader$Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "Ljava/io/InputStream;", "text", "", "utils-common"})
/*    */ public final class FromServerResourcesDataLoader
/*    */   implements RootStreamDataLoader
/*    */ {
/*    */   @NotNull
/*    */   public static final FromServerResourcesDataLoader INSTANCE = new FromServerResourcesDataLoader();
/*    */   
/*    */   @NotNull
/*    */   public InputStream stream(@NotNull DataLoader.Path path) {
/* 50 */     Intrinsics.checkNotNullParameter(path, "path"); if (Resources.INSTANCE.streamOrNull(path.toAbsolutePath()) == null) Resources.INSTANCE.streamOrNull(path.toAbsolutePath());  return new FileInputStream(new File(absolute(path).toAbsolutePath()));
/*    */   }
/*    */   @Nullable
/*    */   public Object bytes(@NotNull DataLoader.Path path, @NotNull Continuation $completion) {
/* 54 */     if (Resources.INSTANCE.bytesOrNull(path.toAbsolutePath()) == null) Resources.INSTANCE.bytesOrNull(path.toAbsolutePath());  return FilesKt.readBytes(new File(absolute(path).toAbsolutePath()));
/*    */   }
/*    */   @Nullable
/*    */   public Object text(@NotNull DataLoader.Path path, @NotNull Continuation $completion) {
/* 58 */     if (Resources.INSTANCE.textOrNull(path.toAbsolutePath()) == null) Resources.INSTANCE.textOrNull(path.toAbsolutePath());  return FilesKt.readText$default(new File(absolute(path).toAbsolutePath()), null, 1, null);
/*    */   }
/*    */   @NotNull
/*    */   public DataLoader.Path absolute(@NotNull DataLoader.Path path) {
/* 62 */     Intrinsics.checkNotNullParameter(path, "path"); DataLoader.Path serverRoot = new DataLoader.Path("/server/lib", path);
/* 63 */     if ((new File(serverRoot.toAbsolutePath())).exists()) return serverRoot;
/*    */     
/* 65 */     DataLoader.Path serverUser = new DataLoader.Path("/home/grazie/server/lib", path);
/* 66 */     if ((new File(serverUser.toAbsolutePath())).exists()) return serverUser;
/*    */ 
/*    */     
/* 69 */     DataLoader.Path test = new DataLoader.Path("build/resources/main", path);
/* 70 */     if ((new File(test.toRelativePath())).exists()) { Intrinsics.checkNotNullExpressionValue((new File(test.toRelativePath())).getAbsolutePath(), "File(test.toRelativePath()).absolutePath"); return new DataLoader.Path((new File(test.toRelativePath())).getAbsolutePath()); }
/* 71 */      DataLoader.Path lfsFilePath = new DataLoader.Path("build/processedResources/lfs", path);
/* 72 */     if ((new File(lfsFilePath.toRelativePath())).exists()) { Intrinsics.checkNotNullExpressionValue((new File(lfsFilePath.toRelativePath())).getAbsolutePath(), "File(lfsFilePath.toRelativePath()).absolutePath"); return new DataLoader.Path((new File(lfsFilePath.toRelativePath())).getAbsolutePath()); }  throw new IllegalStateException(("Can't find " + 
/*    */         
/* 74 */         path.toAbsolutePath() + " in test resources or in server/lib directory").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\FromServerResourcesDataLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */