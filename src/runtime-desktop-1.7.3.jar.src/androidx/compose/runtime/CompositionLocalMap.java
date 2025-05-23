/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\bv\030\000 \0072\0020\001:\001\007J\"\020\002\032\002H\003\"\004\b\000\020\0032\f\020\004\032\b\022\004\022\002H\0030\005H¦\002¢\006\002\020\006\001\001\bø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Landroidx/compose/runtime/CompositionLocalMap;", "", "get", "T", "key", "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "Companion", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime"})
/*    */ public interface CompositionLocalMap
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   <T> T get(@NotNull CompositionLocal<T> paramCompositionLocal);
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/runtime/CompositionLocalMap$Companion;", "", "()V", "Empty", "Landroidx/compose/runtime/CompositionLocalMap;", "getEmpty", "()Landroidx/compose/runtime/CompositionLocalMap;", "runtime"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/* 47 */     private static final CompositionLocalMap Empty = (CompositionLocalMap)PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(); @NotNull public final CompositionLocalMap getEmpty() { return Empty; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\CompositionLocalMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */