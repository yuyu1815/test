/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\022\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\006H@¢\006\002\020\007J\020\020\b\032\0020\t2\006\020\005\032\0020\006H\026J\026\020\n\032\0020\0132\006\020\005\032\0020\006H@¢\006\002\020\007¨\006\f"}, d2 = {"Lai/grazie/utils/mpp/FromResourcesDataLoader;", "Lai/grazie/utils/mpp/RootStreamDataLoader;", "()V", "bytes", "", "path", "Lai/grazie/utils/mpp/DataLoader$Path;", "(Lai/grazie/utils/mpp/DataLoader$Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "Ljava/io/InputStream;", "text", "", "utils-common"})
/*    */ public final class FromResourcesDataLoader
/*    */   implements RootStreamDataLoader
/*    */ {
/*    */   @NotNull
/*    */   public static final FromResourcesDataLoader INSTANCE = new FromResourcesDataLoader();
/*    */   
/*    */   @NotNull
/*    */   public InputStream stream(@NotNull DataLoader.Path path) {
/* 30 */     Intrinsics.checkNotNullParameter(path, "path"); if (Resources.INSTANCE.streamOrNull(path.toAbsolutePath()) == null) { Resources.INSTANCE.streamOrNull(path.toAbsolutePath()); throw new IllegalStateException(("Missing '" + path.toAbsolutePath() + "'").toString()); }  return Resources.INSTANCE.streamOrNull(path.toAbsolutePath());
/*    */   }
/*    */   @Nullable
/*    */   public Object bytes(@NotNull DataLoader.Path path, @NotNull Continuation $completion) {
/* 34 */     return Resources.INSTANCE.bytes(path.toAbsolutePath());
/*    */   }
/*    */   @Nullable
/*    */   public Object text(@NotNull DataLoader.Path path, @NotNull Continuation $completion) {
/* 38 */     return Resources.INSTANCE.text(path.toAbsolutePath());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\FromResourcesDataLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */