/*     */ package androidx.compose.runtime.saveable;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\032\r\020\000\032\0020\001H\007¢\006\002\020\002¨\006\003"}, d2 = {"rememberSaveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/saveable/SaveableStateHolder;", "runtime-saveable"})
/*     */ @SourceDebugExtension({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,143:1\n77#2:144\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n*L\n66#1:144\n*E\n"})
/*     */ public final class SaveableStateHolderKt
/*     */ {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final SaveableStateHolder rememberSaveableStateHolder(@Nullable Composer $composer, int $changed) {
/*  61 */     ComposerKt.sourceInformationMarkerStart($composer, 15454635, "C(rememberSaveableStateHolder):SaveableStateHolder.kt#r2ddri"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(15454635, $changed, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)");  $composer.startReplaceGroup(-796080049); ComposerKt.sourceInformation($composer, "*60@2434L111,65@2619L7"); SaveableStateHolderImpl saveableStateHolderImpl3 = (SaveableStateHolderImpl)RememberSaveableKt.rememberSaveable(new Object[0], 
/*  62 */         (Saver)SaveableStateHolderImpl.Companion.getSaver(), (String)null, SaveableStateHolderKt$rememberSaveableStateHolder$1.INSTANCE, $composer, 3072, 4);
/*     */ 
/*     */     
/*  65 */     SaveableStateHolderImpl $this$rememberSaveableStateHolder_u24lambda_u240 = saveableStateHolderImpl3; int $i$a$-apply-SaveableStateHolderKt$rememberSaveableStateHolder$2 = 0;
/*  66 */     CompositionLocal compositionLocal = (CompositionLocal)SaveableStateRegistryKt.getLocalSaveableStateRegistry(); int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); $this$rememberSaveableStateHolder_u24lambda_u240.setParentSaveableStateRegistry((SaveableStateRegistry)object);
/*     */     SaveableStateHolderImpl saveableStateHolderImpl2 = saveableStateHolderImpl3;
/*     */     $composer.endReplaceGroup();
/*     */     SaveableStateHolderImpl saveableStateHolderImpl1 = saveableStateHolderImpl2;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return saveableStateHolderImpl1;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "invoke"})
/*     */   static final class SaveableStateHolderKt$rememberSaveableStateHolder$1 extends Lambda implements Function0<SaveableStateHolderImpl> {
/*     */     public static final SaveableStateHolderKt$rememberSaveableStateHolder$1 INSTANCE = new SaveableStateHolderKt$rememberSaveableStateHolder$1();
/*     */     
/*     */     @NotNull
/*     */     public final SaveableStateHolderImpl invoke() {
/*     */       return new SaveableStateHolderImpl(null, 1, null);
/*     */     }
/*     */     
/*     */     SaveableStateHolderKt$rememberSaveableStateHolder$1() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\SaveableStateHolderKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */