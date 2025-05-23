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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\022\n\000\n\002\020\016\n\002\b\003\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\002¢\006\002\020\004J\021\020\007\032\0020\b2\006\020\t\032\0020\bH\001J\026\020\n\032\0020\0132\006\020\t\032\0020\bHA¢\006\002\020\fJ\026\020\n\032\0020\0132\006\020\t\032\0020\rHA¢\006\002\020\016J\026\020\017\032\0020\r2\006\020\t\032\0020\bHA¢\006\002\020\fJ\026\020\017\032\0020\r2\006\020\t\032\0020\rHA¢\006\002\020\016R\021\020\003\032\0020\002¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/utils/mpp/RootDataLoaderWrapper;", "Lai/grazie/utils/mpp/RootDataLoader;", "Lai/grazie/utils/mpp/DataLoader;", "loader", "(Lai/grazie/utils/mpp/DataLoader;)V", "getLoader", "()Lai/grazie/utils/mpp/DataLoader;", "absolute", "Lai/grazie/utils/mpp/DataLoader$Path;", "path", "bytes", "", "(Lai/grazie/utils/mpp/DataLoader$Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "text", "utils-common"})
/*    */ public final class RootDataLoaderWrapper
/*    */   implements RootDataLoader, DataLoader
/*    */ {
/*    */   @NotNull
/*    */   private final DataLoader loader;
/*    */   
/*    */   public RootDataLoaderWrapper(@NotNull DataLoader loader) {
/* 58 */     this.loader = loader; } @NotNull public final DataLoader getLoader() { return this.loader; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public DataLoader.Path absolute(@NotNull DataLoader.Path path) {
/*    */     Intrinsics.checkNotNullParameter(path, "path");
/*    */     return this.loader.absolute(path);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object bytes(@NotNull DataLoader.Path path, @NotNull Continuation<? super byte[]> $completion) {
/*    */     return this.loader.bytes(path, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object bytes(@NotNull String path, @NotNull Continuation<? super byte[]> $completion) {
/*    */     return this.loader.bytes(path, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object text(@NotNull DataLoader.Path path, @NotNull Continuation<? super String> $completion) {
/*    */     return this.loader.text(path, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object text(@NotNull String path, @NotNull Continuation<? super String> $completion) {
/*    */     return this.loader.text(path, $completion);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\RootDataLoaderWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */