/*    */ package androidx.lifecycle.compose;
/*    */ 
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import androidx.lifecycle.LifecycleOwner;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmName;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\003\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004¨\006\005"}, d2 = {"LocalLifecycleOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lifecycle-runtime-compose"})
/*    */ @JvmName(name = "LocalLifecycleOwnerKt")
/*    */ public final class LocalLifecycleOwnerKt
/*    */ {
/*    */   @NotNull
/*    */   public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
/* 26 */     return LocalLifecycleOwner; } @NotNull
/* 27 */   private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner = CompositionLocalKt.staticCompositionLocalOf(LocalLifecycleOwnerKt$LocalLifecycleOwner$1.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleOwner;", "invoke"}) static final class LocalLifecycleOwnerKt$LocalLifecycleOwner$1 extends Lambda implements Function0<LifecycleOwner> { @NotNull
/* 28 */     public final LifecycleOwner invoke() { throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present".toString()); }
/*    */ 
/*    */     
/*    */     public static final LocalLifecycleOwnerKt$LocalLifecycleOwner$1 INSTANCE = new LocalLifecycleOwnerKt$LocalLifecycleOwner$1();
/*    */     
/*    */     LocalLifecycleOwnerKt$LocalLifecycleOwner$1() {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-compose-desktop-2.8.4.jar!\androidx\lifecycle\compose\LocalLifecycleOwnerKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */