/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\020\002\n\002\b\005\n\002\020\b\n\002\b\f\bf\030\000*\004\b\000\020\0012\0020\002J\b\020\006\032\0020\007H&J\025\020\b\032\0020\0072\006\020\t\032\0028\000H&¢\006\002\020\nJ\035\020\013\032\0020\0072\006\020\f\032\0020\r2\006\020\016\032\0028\000H&¢\006\002\020\017J\035\020\020\032\0020\0072\006\020\f\032\0020\r2\006\020\016\032\0028\000H&¢\006\002\020\017J \020\021\032\0020\0072\006\020\022\032\0020\r2\006\020\023\032\0020\r2\006\020\024\032\0020\rH&J\b\020\025\032\0020\007H\026J\b\020\026\032\0020\007H\026J\030\020\027\032\0020\0072\006\020\f\032\0020\r2\006\020\024\032\0020\rH&J\b\020\030\032\0020\007H&R\022\020\003\032\0028\000X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\031À\006\003"}, d2 = {"Landroidx/compose/runtime/Applier;", "N", "", "current", "getCurrent", "()Ljava/lang/Object;", "clear", "", "down", "node", "(Ljava/lang/Object;)V", "insertBottomUp", "index", "", "instance", "(ILjava/lang/Object;)V", "insertTopDown", "move", "from", "to", "count", "onBeginChanges", "onEndChanges", "remove", "up", "runtime"})
/*    */ public interface Applier<N>
/*    */ {
/*    */   default void onBeginChanges() {}
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     @Deprecated
/*    */     public static <N> void onBeginChanges(@NotNull Applier $this) {
/* 47 */       $this.onBeginChanges();
/*    */     }
/*    */ 
/*    */     
/*    */     @Deprecated
/*    */     public static <N> void onEndChanges(@NotNull Applier $this) {
/* 53 */       $this.onEndChanges();
/*    */     }
/*    */   }
/*    */   
/*    */   default void onEndChanges() {}
/*    */   
/*    */   N getCurrent();
/*    */   
/*    */   void down(N paramN);
/*    */   
/*    */   void up();
/*    */   
/*    */   void insertTopDown(int paramInt, N paramN);
/*    */   
/*    */   void insertBottomUp(int paramInt, N paramN);
/*    */   
/*    */   void remove(int paramInt1, int paramInt2);
/*    */   
/*    */   void move(int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   void clear();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\Applier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */