/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import java.io.File;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.io.FilesKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\022\n\002\b\002\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\026J\026\020\006\032\0020\0072\006\020\005\032\0020\004H@¢\006\002\020\bJ\026\020\t\032\0020\n2\006\020\005\032\0020\004H@¢\006\002\020\b¨\006\013"}, d2 = {"Lai/grazie/utils/mpp/TestDataLoader;", "Lai/grazie/utils/mpp/RootDataLoader;", "()V", "absolute", "Lai/grazie/utils/mpp/DataLoader$Path;", "path", "bytes", "", "(Lai/grazie/utils/mpp/DataLoader$Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "text", "", "utils-common"})
/*    */ public final class TestDataLoader
/*    */   implements RootDataLoader {
/*    */   @Nullable
/*    */   public Object bytes(@NotNull DataLoader.Path path, @NotNull Continuation $completion) {
/* 16 */     return FilesKt.readBytes(new File(path.toRelativePath()));
/*    */   } @NotNull
/*    */   public static final TestDataLoader INSTANCE = new TestDataLoader(); @Nullable
/*    */   public Object text(@NotNull DataLoader.Path path, @NotNull Continuation $completion) {
/* 20 */     Intrinsics.checkNotNullExpressionValue((new File(path.toRelativePath())).getCanonicalFile(), "File(path.toRelativePath()).canonicalFile"); return FilesKt.readText$default((new File(path.toRelativePath())).getCanonicalFile(), null, 1, null);
/*    */   }
/*    */   @NotNull
/*    */   public DataLoader.Path absolute(@NotNull DataLoader.Path path) {
/* 24 */     Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullExpressionValue((new File(path.toRelativePath())).getAbsolutePath(), "File(path.toRelativePath()).absolutePath"); return new DataLoader.Path((new File(path.toRelativePath())).getAbsolutePath());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\TestDataLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */