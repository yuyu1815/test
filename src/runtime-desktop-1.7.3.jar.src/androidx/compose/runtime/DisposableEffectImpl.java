/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\b\002\030\0002\0020\001B\036\022\027\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006¢\006\002\020\007J\b\020\t\032\0020\nH\026J\b\020\013\032\0020\nH\026J\b\020\f\032\0020\nH\026R\037\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006X\004¢\006\002\n\000R\020\020\b\032\004\030\0010\005X\016¢\006\002\n\000¨\006\r"}, d2 = {"Landroidx/compose/runtime/DisposableEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "effect", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "onDispose", "onAbandoned", "", "onForgotten", "onRemembered", "runtime"})
/*    */ final class DisposableEffectImpl
/*    */   implements RememberObserver
/*    */ {
/*    */   @NotNull
/*    */   private final Function1<DisposableEffectScope, DisposableEffectResult> effect;
/*    */   @Nullable
/*    */   private DisposableEffectResult onDispose;
/*    */   
/*    */   public DisposableEffectImpl(@NotNull Function1<DisposableEffectScope, DisposableEffectResult> effect) {
/* 77 */     this.effect = effect;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onRemembered() {
/* 82 */     this.onDispose = (DisposableEffectResult)this.effect.invoke(EffectsKt.access$getInternalDisposableEffectScope$p());
/*    */   }
/*    */   
/*    */   public void onForgotten() {
/* 86 */     if (this.onDispose != null) { this.onDispose.dispose(); } else {  }
/* 87 */      this.onDispose = null;
/*    */   }
/*    */   
/*    */   public void onAbandoned() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\DisposableEffectImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */