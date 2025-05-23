/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.TestOnly;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\002\030\000 \0032\0020\001:\001\003B\005¢\006\002\020\002¨\006\004"}, d2 = {"Landroidx/compose/runtime/HotReloader;", "", "()V", "Companion", "runtime"})
/*    */ final class HotReloader
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\b\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\r\020\003\032\0020\004H\001¢\006\002\b\005J\023\020\006\032\b\022\004\022\0020\b0\007H\001¢\006\002\b\tJ\025\020\n\032\0020\0042\006\020\013\032\0020\fH\001¢\006\002\b\rJ\020\020\016\032\0020\0042\006\020\017\032\0020\001H\002J\020\020\020\032\0020\0012\006\020\021\032\0020\001H\002J\025\020\022\032\0020\0042\006\020\021\032\0020\001H\001¢\006\002\b\023¨\006\024"}, d2 = {"Landroidx/compose/runtime/HotReloader$Companion;", "", "()V", "clearErrors", "", "clearErrors$runtime", "getCurrentErrors", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime", "invalidateGroupsWithKey", "key", "", "invalidateGroupsWithKey$runtime", "loadStateAndCompose", "token", "saveStateAndDispose", "context", "simulateHotReload", "simulateHotReload$runtime", "runtime"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     private final Object saveStateAndDispose(Object context) {
/* 33 */       return Recomposer.Companion.saveStateAndDisposeForHotReload$runtime();
/*    */     }
/*    */ 
/*    */     
/*    */     private final void loadStateAndCompose(Object token) {
/* 38 */       Recomposer.Companion.loadStateAndComposeForHotReload$runtime(token);
/*    */     }
/*    */     
/*    */     @TestOnly
/*    */     public final void simulateHotReload$runtime(@NotNull Object context) {
/* 43 */       Intrinsics.checkNotNullParameter(context, "context"); loadStateAndCompose(saveStateAndDispose(context));
/*    */     }
/*    */     
/*    */     @TestOnly
/*    */     public final void invalidateGroupsWithKey$runtime(int key) {
/* 48 */       Recomposer.Companion.invalidateGroupsWithKey$runtime(key);
/*    */     }
/*    */     @TestOnly
/*    */     @NotNull
/*    */     public final List<RecomposerErrorInfo> getCurrentErrors$runtime() {
/* 53 */       return Recomposer.Companion.getCurrentErrors$runtime();
/*    */     }
/*    */     
/*    */     @TestOnly
/*    */     public final void clearErrors$runtime() {
/* 58 */       Recomposer.Companion.clearErrors$runtime();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\HotReloader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */