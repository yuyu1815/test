/*    */ package androidx.lifecycle.viewmodel;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\001¢\006\002\020\003J$\020\004\032\004\030\001H\005\"\004\b\000\020\0052\f\020\006\032\b\022\004\022\002H\0050\007H\002¢\006\002\020\bJ*\020\t\032\0020\n\"\004\b\000\020\0052\f\020\006\032\b\022\004\022\002H\0050\0072\006\020\013\032\002H\005H\002¢\006\002\020\f¨\006\r"}, d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initialExtras", "(Landroidx/lifecycle/viewmodel/CreationExtras;)V", "get", "T", "key", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", "set", "", "t", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;Ljava/lang/Object;)V", "lifecycle-viewmodel"})
/*    */ public final class MutableCreationExtras
/*    */   extends CreationExtras
/*    */ {
/*    */   public MutableCreationExtras(@NotNull CreationExtras initialExtras) {
/* 54 */     getMap$lifecycle_viewmodel().putAll(initialExtras.getMap$lifecycle_viewmodel());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final <T> void set(@NotNull CreationExtras.Key<?> key, Object t) {
/* 60 */     Intrinsics.checkNotNullParameter(key, "key"); getMap$lifecycle_viewmodel().put(key, t);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public <T> T get(@NotNull CreationExtras.Key key) {
/* 65 */     Intrinsics.checkNotNullParameter(key, "key"); return (T)getMap$lifecycle_viewmodel().get(key);
/*    */   }
/*    */   
/*    */   public MutableCreationExtras() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\MutableCreationExtras.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */