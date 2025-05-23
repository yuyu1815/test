/*     */ package androidx.compose.runtime.internal;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposeCompilerApi;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.RecomposeScope;
/*     */ import androidx.compose.runtime.RecomposeScopeImpl;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\b\n\002\b\002\n\002\020\000\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\007\n\002\030\002\n\002\b\002\032\030\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020\007\032\0020\001H\000\032(\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0012\006\020\r\032\0020\0162\006\020\017\032\0020\004H\007\032 \020\020\032\0020\t2\006\020\f\032\0020\0012\006\020\r\032\0020\0162\006\020\017\032\0020\004H\007\032\020\020\021\032\0020\0012\006\020\007\032\0020\001H\000\032%\020\022\032\0020\t2\006\020\f\032\0020\0012\006\020\r\032\0020\0162\006\020\017\032\0020\004H\007¢\006\002\020\023\032\020\020\024\032\0020\0012\006\020\007\032\0020\001H\000\032\026\020\025\032\0020\016*\004\030\0010\0262\006\020\027\032\0020\026H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\030"}, d2 = {"BITS_PER_SLOT", "", "SLOTS_PER_INT", "lambdaKey", "", "bitsForSlot", "bits", "slot", "composableLambda", "Landroidx/compose/runtime/internal/ComposableLambda;", "composer", "Landroidx/compose/runtime/Composer;", "key", "tracked", "", "block", "composableLambdaInstance", "differentBits", "rememberComposableLambda", "(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;", "sameBits", "replacableWith", "Landroidx/compose/runtime/RecomposeScope;", "other", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,632:1\n26#2:633\n1225#3,6:634\n*S KotlinDebug\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n*L\n596#1:633\n629#1:634,6\n*E\n"})
/*     */ public final class ComposableLambdaKt
/*     */ {
/*     */   public static final int SLOTS_PER_INT = 10;
/*     */   private static final int BITS_PER_SLOT = 3;
/*     */   
/*     */   public static final int bitsForSlot(int bits, int slot) {
/*  34 */     int realSlot = slot % 10;
/*  35 */     return bits << realSlot * 3 + 1;
/*     */   }
/*     */   
/*  38 */   public static final int sameBits(int slot) { return bitsForSlot(1, slot); } public static final int differentBits(int slot) {
/*  39 */     return bitsForSlot(2, slot);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean replacableWith(@Nullable RecomposeScope $this$replacableWith, @NotNull RecomposeScope other) {
/* 317 */     Intrinsics.checkNotNullParameter(other, "other"); return ($this$replacableWith == null || (
/* 318 */       $this$replacableWith instanceof RecomposeScopeImpl && other instanceof RecomposeScopeImpl && (
/* 319 */       !((RecomposeScopeImpl)$this$replacableWith).getValid() || Intrinsics.areEqual($this$replacableWith, other) || Intrinsics.areEqual(((RecomposeScopeImpl)$this$replacableWith).getAnchor(), ((RecomposeScopeImpl)other).getAnchor()))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ComposeCompilerApi
/*     */   @NotNull
/*     */   public static final ComposableLambda composableLambda(@NotNull Composer composer, int key, boolean tracked, @NotNull Object block)
/*     */   {
/* 596 */     Intrinsics.checkNotNullParameter(composer, "composer"); Intrinsics.checkNotNullParameter(block, "block"); int i = key, other$iv = 1, $i$f$rol = 0; composer.startMovableGroup(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 633 */         Integer.rotateLeft(i, other$iv), lambdaKey); Object slot = composer.rememberedValue(); ComposableLambdaImpl value = new ComposableLambdaImpl(key, tracked, block); composer.updateRememberedValue(value); Intrinsics.checkNotNull(slot, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl"); (ComposableLambdaImpl)slot; ((ComposableLambdaImpl)slot).update(block); ComposableLambdaImpl result = (slot == Composer.Companion.getEmpty()) ? value : (ComposableLambdaImpl)slot; composer.endMovableGroup(); return result; } @ComposeCompilerApi @Composable @NotNull public static final ComposableLambda rememberComposableLambda(int key, boolean tracked, @NotNull Object block, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(block, "block"); ComposerKt.sourceInformationMarkerStart($composer, -1573003438, "C(rememberComposableLambda)P(1,2)*628@13280L54:ComposableLambda.kt#9drcc"); if (ComposerKt.isTraceInProgress())
/* 634 */       ComposerKt.traceEventStart(-1573003438, $changed, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");  ComposerKt.sourceInformationMarkerStart($composer, 1920923313, "CC(remember):ComposableLambda.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 635 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 636 */       int $i$a$-cache-ComposableLambdaKt$rememberComposableLambda$1 = 0; Object value$iv = new ComposableLambdaImpl(key, tracked, block);
/* 637 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 639 */     ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl)it$iv;
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     ComposableLambdaImpl it = composableLambdaImpl2 = composableLambdaImpl2;
/*     */     int $i$a$-also-ComposableLambdaKt$rememberComposableLambda$2 = 0;
/*     */     it.update(block);
/*     */     ComposableLambdaImpl composableLambdaImpl1 = composableLambdaImpl2;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return composableLambdaImpl1; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final Object lambdaKey = new Object();
/*     */   
/*     */   @ComposeCompilerApi
/*     */   @NotNull
/*     */   public static final ComposableLambda composableLambdaInstance(int key, boolean tracked, @NotNull Object block) {
/*     */     Intrinsics.checkNotNullParameter(block, "block");
/*     */     return new ComposableLambdaImpl(key, tracked, block);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\ComposableLambdaKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */