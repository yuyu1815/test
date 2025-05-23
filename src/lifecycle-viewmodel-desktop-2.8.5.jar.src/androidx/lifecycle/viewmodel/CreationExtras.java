/*    */ package androidx.lifecycle.viewmodel;
/*    */ 
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020%\n\002\030\002\n\002\b\t\b&\030\0002\0020\001:\002\f\rB\007\b\000¢\006\002\020\002J$\020\b\032\004\030\001H\t\"\004\b\000\020\t2\f\020\n\032\b\022\004\022\002H\t0\005H¦\002¢\006\002\020\013R&\020\003\032\024\022\b\022\006\022\002\b\0030\005\022\006\022\004\030\0010\0010\004X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\016"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "()V", "map", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "getMap$lifecycle_viewmodel", "()Ljava/util/Map;", "get", "T", "key", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", "Empty", "Key", "lifecycle-viewmodel"})
/*    */ public abstract class CreationExtras
/*    */ {
/*    */   @NotNull
/* 26 */   private final Map<Key<?>, Object> map = new LinkedHashMap<>(); @NotNull public final Map<Key<?>, Object> getMap$lifecycle_viewmodel() { return this.map; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public abstract <T> T get(@NotNull Key<T> paramKey);
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J$\020\003\032\004\030\001H\004\"\004\b\000\020\0042\f\020\005\032\b\022\004\022\002H\0040\006H\002¢\006\002\020\007¨\006\b"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "()V", "get", "T", "key", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", "lifecycle-viewmodel"})
/*    */   public static final class Empty
/*    */     extends CreationExtras
/*    */   {
/*    */     @NotNull
/*    */     public static final Empty INSTANCE = new Empty();
/*    */     
/*    */     @Nullable
/*    */     public <T> T get(@NotNull CreationExtras.Key key) {
/* 42 */       Intrinsics.checkNotNullParameter(key, "key"); return null;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\000\n\002\020\000\n\000\bf\030\000*\004\b\000\020\0012\0020\002ø\001\000\002\006\n\004\b!0\001¨\006\003À\006\001"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "T", "", "lifecycle-viewmodel"})
/*    */   public static interface Key<T> {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\CreationExtras.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */