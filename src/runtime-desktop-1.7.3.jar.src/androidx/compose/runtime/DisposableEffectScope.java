/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\b\007\030\0002\0020\001B\005¢\006\002\020\002J\034\020\003\032\0020\0042\016\b\004\020\005\032\b\022\004\022\0020\0070\006H\bø\001\000\002\007\n\005\b20\001¨\006\b"}, d2 = {"Landroidx/compose/runtime/DisposableEffectScope;", "", "()V", "onDispose", "Landroidx/compose/runtime/DisposableEffectResult;", "onDisposeEffect", "Lkotlin/Function0;", "", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class DisposableEffectScope
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public final DisposableEffectResult onDispose(@NotNull Function0<Unit> onDisposeEffect) {
/* 63 */     Intrinsics.checkNotNullParameter(onDisposeEffect, "onDisposeEffect"); int $i$f$onDispose = 0; return new DisposableEffectScope$onDispose$1(onDisposeEffect); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 176, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime"})
/*    */   @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n*L\n1#1,490:1\n*E\n"})
/* 65 */   public static final class DisposableEffectScope$onDispose$1 implements DisposableEffectResult { public void dispose() { this.$onDisposeEffect.invoke(); }
/*    */ 
/*    */     
/*    */     public DisposableEffectScope$onDispose$1(Function0<Unit> $onDisposeEffect) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\DisposableEffectScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */