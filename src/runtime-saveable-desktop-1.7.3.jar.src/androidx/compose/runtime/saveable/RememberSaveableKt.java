/*     */ package androidx.compose.runtime.saveable;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.EffectsKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.snapshots.SnapshotMutableState;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.CharsKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\021\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\002\n\002\030\002\n\000\032\020\020\002\032\0020\0032\006\020\004\032\0020\005H\000\032>\020\006\032\034\022\n\022\b\022\004\022\002H\t0\b\022\f\022\n\022\006\022\004\030\0010\0050\b0\007\"\004\b\000\020\t2\024\020\n\032\020\022\004\022\002H\t\022\006\b\001\022\0020\0050\007H\002\032a\020\013\032\002H\t\"\b\b\000\020\t*\0020\0052\026\020\f\032\f\022\b\b\001\022\004\030\0010\0050\r\"\004\030\0010\0052\026\b\002\020\016\032\020\022\004\022\002H\t\022\006\b\001\022\0020\0050\0072\n\b\002\020\017\032\004\030\0010\0032\f\020\020\032\b\022\004\022\002H\t0\021H\007¢\006\002\020\022\032g\020\013\032\b\022\004\022\002H\t0\b\"\004\b\000\020\t2\026\020\f\032\f\022\b\b\001\022\004\030\0010\0050\r\"\004\030\0010\0052\024\020\023\032\020\022\004\022\002H\t\022\006\b\001\022\0020\0050\0072\n\b\002\020\017\032\004\030\0010\0032\022\020\020\032\016\022\n\022\b\022\004\022\002H\t0\b0\021H\007¢\006\002\020\024\032\026\020\025\032\0020\026*\0020\0272\b\020\004\032\004\030\0010\005H\002\"\016\020\000\032\0020\001XD¢\006\002\n\000¨\006\030"}, d2 = {"MaxSupportedRadix", "", "generateCannotBeSavedErrorMessage", "", "value", "", "mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", "T", "inner", "rememberSaveable", "inputs", "", "saver", "key", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "requireCanBeSaved", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "runtime-saveable"})
/*     */ @SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,274:1\n77#2:275\n1225#3,6:276\n1225#3,6:282\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n82#1:275\n84#1:276,6\n94#1:282,6\n*E\n"})
/*     */ public final class RememberSaveableKt
/*     */ {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final <T> T rememberSaveable(@NotNull Object[] inputs, @Nullable Saver<?, Object> saver, @Nullable String key, @NotNull Function0 init, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  71 */     Intrinsics.checkNotNullParameter(inputs, "inputs"); Intrinsics.checkNotNullParameter(init, "init"); ComposerKt.sourceInformationMarkerStart($composer, 441892779, "C(rememberSaveable)P(1,3,2)71@3180L23,81@3526L7,83@3552L313,93@3951L71,93@3940L82:RememberSaveable.kt#r2ddri"); if ((paramInt1 & 0x2) != 0) saver = SaverKt.autoSaver();  if ((paramInt1 & 0x4) != 0) key = null;  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(441892779, $changed, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)"); 
/*  72 */     int compositeKey = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */     
/*  74 */     CharSequence charSequence = key;
/*     */ 
/*     */     
/*  77 */     Intrinsics.checkNotNullExpressionValue(Integer.toString(compositeKey, CharsKt.checkRadix(MaxSupportedRadix)), "toString(...)"); String finalKey = !((charSequence == null || charSequence.length() == 0) ? 1 : 0) ? key : Integer.toString(compositeKey, CharsKt.checkRadix(MaxSupportedRadix));
/*     */ 
/*     */     
/*  80 */     Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
/*     */     
/*  82 */     CompositionLocal compositionLocal = (CompositionLocal)SaveableStateRegistryKt.getLocalSaveableStateRegistry(); int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 275 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object1 = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); SaveableStateRegistry registry = (SaveableStateRegistry)object1; ComposerKt.sourceInformationMarkerStart($composer, -1519365315, "CC(remember):RememberSaveable.kt#9igjgp"); Composer composer1 = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/* 276 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 277 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 278 */       int $i$a$-cache-RememberSaveableKt$rememberSaveable$holder$1 = 0; Object it = registry.consumeRestored(finalKey); int $i$a$-let-RememberSaveableKt$rememberSaveable$holder$1$restored$1 = 0;
/*     */       registry.consumeRestored(finalKey);
/*     */     } 
/* 281 */     SaveableHolder<T> saveableHolder1 = (SaveableHolder)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); SaveableHolder<T> holder = saveableHolder1; if (holder.getValueIfInputsDidntChange(inputs) == null)
/* 282 */       holder.getValueIfInputsDidntChange(inputs);  Object value = init.invoke(); ComposerKt.sourceInformationMarkerStart($composer, -1519352789, "CC(remember):RememberSaveable.kt#9igjgp"); Composer composer2 = $composer; int i = $composer.changedInstance(holder) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changedInstance(saver)) || ($changed & 0x30) == 32) ? 1 : 0) | $composer.changedInstance(registry) | $composer.changed(finalKey) | $composer.changedInstance(value) | $composer.changedInstance(inputs), j = 0; Object object2 = composer2.rememberedValue(); int k = 0;
/* 283 */     if (i != 0 || object2 == Composer.Companion.getEmpty()) {
/* 284 */       int $i$a$-cache-RememberSaveableKt$rememberSaveable$1 = 0; Object value$iv = new RememberSaveableKt$rememberSaveable$1$1(holder, (Saver)saver, registry, finalKey, (T)value, inputs);
/* 285 */       composer2.updateRememberedValue(value$iv);
/*     */     } 
/* 287 */     Function0 function0 = (Function0)object2;
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     EffectsKt.SideEffect(function0, $composer, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return (T)value;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "T", "", "invoke"})
/*     */   static final class RememberSaveableKt$rememberSaveable$1$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       this.$holder.update((Saver)this.$saver, this.$registry, this.$finalKey, this.$value, this.$inputs);
/*     */     }
/*     */     
/*     */     RememberSaveableKt$rememberSaveable$1$1(SaveableHolder<T> $holder, Saver<T, ? extends Object> $saver, SaveableStateRegistry $registry, String $finalKey, Object $value, Object[] $inputs) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final <T> MutableState<T> rememberSaveable(@NotNull Object[] inputs, @NotNull Saver<?, ? extends Object> stateSaver, @Nullable String key, @NotNull Function0<? extends MutableState> init, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     Intrinsics.checkNotNullParameter(inputs, "inputs");
/*     */     Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
/*     */     Intrinsics.checkNotNullParameter(init, "init");
/*     */     ComposerKt.sourceInformationMarkerStart($composer, -202053668, "C(rememberSaveable)P(1,3,2)127@5317L106:RememberSaveable.kt#r2ddri");
/*     */     if ((paramInt1 & 0x4) != 0)
/*     */       key = null; 
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-202053668, $changed, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)"); 
/*     */     MutableState<T> mutableState = rememberSaveable(Arrays.copyOf(inputs, inputs.length), (Saver)mutableStateSaver(stateSaver), key, init, $composer, 0x380 & $changed | 0x1C00 & $changed, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return mutableState;
/*     */   }
/*     */   
/*     */   private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(Saver<T, Object> inner) {
/*     */     Intrinsics.checkNotNull(inner, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
/*     */     Saver<T, Object> $this$mutableStateSaver_u24lambda_u243 = inner;
/*     */     int $i$a$-with-RememberSaveableKt$mutableStateSaver$1 = 0;
/*     */     return SaverKt.Saver(new RememberSaveableKt$mutableStateSaver$1$1($this$mutableStateSaver_u24lambda_u243), new RememberSaveableKt$mutableStateSaver$1$2($this$mutableStateSaver_u24lambda_u243));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\020\000\032\f\022\006\022\004\030\0010\002\030\0010\001\"\004\b\000\020\003*\0020\0042\f\020\005\032\b\022\004\022\002H\0030\001H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/MutableState;", "", "T", "Landroidx/compose/runtime/saveable/SaverScope;", "state", "invoke"})
/*     */   static final class RememberSaveableKt$mutableStateSaver$1$1 extends Lambda implements Function2<SaverScope, MutableState<T>, MutableState<Object>> {
/*     */     @Nullable
/*     */     public final MutableState<Object> invoke(@NotNull SaverScope $this$Saver, @NotNull MutableState state) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(state, "state");
/*     */       if (!(state instanceof SnapshotMutableState)) {
/*     */         int $i$a$-require-RememberSaveableKt$mutableStateSaver$1$1$1 = 0;
/*     */         String str = "If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()";
/*     */         throw new IllegalArgumentException(str.toString());
/*     */       } 
/*     */       Object saved = this.$this_with.save($this$Saver, (T)state.getValue());
/*     */       Intrinsics.checkNotNull(((SnapshotMutableState)state).getPolicy(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
/*     */       return (saved != null) ? SnapshotStateKt.mutableStateOf(saved, ((SnapshotMutableState)state).getPolicy()) : null;
/*     */     }
/*     */     
/*     */     RememberSaveableKt$mutableStateSaver$1$1(Saver<T, Object> $receiver) {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\020\000\032\n\022\004\022\002H\002\030\0010\001\"\004\b\000\020\0022\016\020\003\032\n\022\006\022\004\030\0010\0040\001H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/MutableState;", "T", "it", "", "invoke"})
/*     */   static final class RememberSaveableKt$mutableStateSaver$1$2 extends Lambda implements Function1<MutableState<Object>, MutableState<T>> {
/*     */     @Nullable
/*     */     public final MutableState<T> invoke(@NotNull MutableState it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       if (!(it instanceof SnapshotMutableState)) {
/*     */         String str = "Failed requirement.";
/*     */         throw new IllegalArgumentException(str.toString());
/*     */       } 
/*     */       Intrinsics.checkNotNull(it.getValue());
/*     */       Intrinsics.checkNotNull(((SnapshotMutableState)it).getPolicy(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
/*     */       MutableState<T> mutableState = SnapshotStateKt.mutableStateOf((it.getValue() != null) ? this.$this_with.restore(it.getValue()) : null, ((SnapshotMutableState)it).getPolicy());
/*     */       Intrinsics.checkNotNull(mutableState, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
/*     */       return mutableState;
/*     */     }
/*     */     
/*     */     RememberSaveableKt$mutableStateSaver$1$2(Saver<T, Object> $receiver) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final void requireCanBeSaved(SaveableStateRegistry $this$requireCanBeSaved, Object value) {
/*     */     if (value != null && !$this$requireCanBeSaved.canBeSaved(value))
/*     */       throw new IllegalArgumentException((value instanceof SnapshotMutableState) ? ((((SnapshotMutableState)value).getPolicy() != SnapshotStateKt.neverEqualPolicy() && ((SnapshotMutableState)value).getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && ((SnapshotMutableState)value).getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) ? "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver" : ("MutableState containing " + ((SnapshotMutableState)value).getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().")) : generateCannotBeSavedErrorMessage(value)); 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String generateCannotBeSavedErrorMessage(@NotNull Object value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     return value + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
/*     */   }
/*     */   
/*     */   private static final int MaxSupportedRadix = 36;
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\RememberSaveableKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */