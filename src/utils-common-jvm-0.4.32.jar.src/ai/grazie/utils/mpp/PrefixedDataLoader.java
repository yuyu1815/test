/*    */ package ai.grazie.utils.mpp;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\022\n\002\b\002\n\002\020\016\n\000\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\001¢\006\002\020\005J\020\020\006\032\0020\0032\006\020\007\032\0020\003H\026J\026\020\b\032\0020\t2\006\020\007\032\0020\003H@¢\006\002\020\nJ\026\020\013\032\0020\f2\006\020\007\032\0020\003H@¢\006\002\020\nR\016\020\004\032\0020\001X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lai/grazie/utils/mpp/PrefixedDataLoader;", "Lai/grazie/utils/mpp/DataLoader;", "prefix", "Lai/grazie/utils/mpp/DataLoader$Path;", "loader", "(Lai/grazie/utils/mpp/DataLoader$Path;Lai/grazie/utils/mpp/DataLoader;)V", "absolute", "path", "bytes", "", "(Lai/grazie/utils/mpp/DataLoader$Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "text", "", "utils-common"})
/*    */ public final class PrefixedDataLoader
/*    */   implements DataLoader
/*    */ {
/*    */   @NotNull
/*    */   private final DataLoader.Path prefix;
/*    */   @NotNull
/*    */   private final DataLoader loader;
/*    */   
/*    */   public PrefixedDataLoader(@NotNull DataLoader.Path prefix, @NotNull DataLoader loader) {
/* 66 */     this.prefix = prefix; this.loader = loader; } @Nullable
/*    */   public Object bytes(@NotNull DataLoader.Path path, @NotNull Continuation<? super byte[]> $completion) {
/* 68 */     return this.loader.bytes(new DataLoader.Path(this.prefix, path), $completion);
/*    */   }
/*    */   @Nullable
/*    */   public Object text(@NotNull DataLoader.Path path, @NotNull Continuation<? super String> $completion) {
/* 72 */     return this.loader.text(new DataLoader.Path(this.prefix, path), $completion);
/*    */   }
/*    */   @NotNull
/*    */   public DataLoader.Path absolute(@NotNull DataLoader.Path path) {
/* 76 */     Intrinsics.checkNotNullParameter(path, "path"); return this.loader.absolute(new DataLoader.Path(this.prefix, path));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\PrefixedDataLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */