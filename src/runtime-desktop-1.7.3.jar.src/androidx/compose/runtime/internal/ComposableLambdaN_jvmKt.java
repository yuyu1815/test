/*     */ package androidx.compose.runtime.internal;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposeCompilerApi;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\020\000\n\002\b\004\0320\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0052\006\020\t\032\0020\nH\007\032(\020\013\032\0020\0012\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0052\006\020\t\032\0020\nH\007\032-\020\f\032\0020\0012\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0052\006\020\t\032\0020\nH\007¢\006\002\020\r¨\006\016"}, d2 = {"composableLambdaN", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "composer", "Landroidx/compose/runtime/Composer;", "key", "", "tracked", "", "arity", "block", "", "composableLambdaNInstance", "rememberComposableLambdaN", "(IZILjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambdaN;", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1225#2,6:194\n1#3:200\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n*L\n177#1:194,6\n*E\n"})
/*     */ public final class ComposableLambdaN_jvmKt
/*     */ {
/*     */   @ComposeCompilerApi
/*     */   @NotNull
/*     */   public static final ComposableLambdaN composableLambdaN(@NotNull Composer composer, int key, boolean tracked, int arity, @NotNull Object block) {
/* 154 */     Intrinsics.checkNotNullParameter(composer, "composer"); Intrinsics.checkNotNullParameter(block, "block"); composer.startReplaceableGroup(key);
/* 155 */     Object slot = composer.rememberedValue();
/*     */     
/* 157 */     ComposableLambdaNImpl value = new ComposableLambdaNImpl(key, tracked, arity);
/* 158 */     composer.updateRememberedValue(value);
/*     */ 
/*     */ 
/*     */     
/* 162 */     Intrinsics.checkNotNull(slot, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl"); ComposableLambdaNImpl result = (slot == Composer.Companion.getEmpty()) ? value : (ComposableLambdaNImpl)slot;
/*     */     
/* 164 */     result.update(block);
/* 165 */     composer.endReplaceableGroup();
/* 166 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ComposeCompilerApi
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final ComposableLambdaN rememberComposableLambdaN(int key, boolean tracked, int arity, @NotNull Object block, @Nullable Composer $composer, int $changed) {
/* 177 */     Intrinsics.checkNotNullParameter(block, "block"); ComposerKt.sourceInformationMarkerStart($composer, -293456346, "C(rememberComposableLambdaN)P(2,3)*176@5693L55:ComposableLambdaN.jvm.kt#9drcc"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-293456346, $changed, -1, "androidx.compose.runtime.internal.rememberComposableLambdaN (ComposableLambdaN.jvm.kt:176)");  ComposerKt.sourceInformationMarkerStart($composer, -593837686, "CC(remember):ComposableLambdaN.jvm.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 194 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 195 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 196 */       int $i$a$-cache-ComposableLambdaN_jvmKt$rememberComposableLambdaN$1 = 0; Object value$iv = new ComposableLambdaNImpl(key, tracked, arity);
/* 197 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 199 */     ComposableLambdaNImpl composableLambdaNImpl2 = (ComposableLambdaNImpl)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); ComposableLambdaNImpl it = composableLambdaNImpl2 = composableLambdaNImpl2; int $i$a$-also-ComposableLambdaN_jvmKt$rememberComposableLambdaN$2 = 0; it.update(block); ComposableLambdaNImpl composableLambdaNImpl1 = composableLambdaNImpl2; if (ComposerKt.isTraceInProgress())
/* 200 */       ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return composableLambdaNImpl1; } @ComposeCompilerApi @NotNull public static final ComposableLambdaN composableLambdaNInstance(int key, boolean tracked, int arity, @NotNull Object block) { Intrinsics.checkNotNullParameter(block, "block"); ComposableLambdaNImpl composableLambdaNImpl1 = new ComposableLambdaNImpl(key, tracked, arity); ComposableLambdaNImpl $this$composableLambdaNInstance_u24lambda_u242 = composableLambdaNImpl1; int $i$a$-apply-ComposableLambdaN_jvmKt$composableLambdaNInstance$1 = 0;
/*     */     $this$composableLambdaNInstance_u24lambda_u242.update(block);
/*     */     return composableLambdaNImpl1; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\ComposableLambdaN_jvmKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */