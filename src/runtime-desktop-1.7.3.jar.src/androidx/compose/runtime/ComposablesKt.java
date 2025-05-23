/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NotImplementedError;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000v\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\021\n\002\b\r\n\002\030\002\n\002\b\002\032_\020\022\032\0020\023\"\b\b\000\020\024*\0020\025\"\016\b\001\020\026\030\001*\006\022\002\b\0030\0272\016\b\b\020\030\032\b\022\004\022\002H\0240\0312\"\020\032\032\036\022\n\022\b\022\004\022\002H\0240\034\022\004\022\0020\0230\033¢\006\002\b\035¢\006\002\b\036H\bø\001\000¢\006\002\020\037\032n\020\022\032\0020\023\"\004\b\000\020\024\"\016\b\001\020\026\030\001*\006\022\002\b\0030\0272\016\b\b\020\030\032\b\022\004\022\002H\0240\0312\"\020\032\032\036\022\n\022\b\022\004\022\002H\0240\034\022\004\022\0020\0230\033¢\006\002\b\035¢\006\002\b\0362\021\020 \032\r\022\004\022\0020\0230\031¢\006\002\b!H\bø\001\000¢\006\002\020\"\032\001\020\022\032\0020\023\"\004\b\000\020\024\"\016\b\001\020\026\030\001*\006\022\002\b\0030\0272\016\b\b\020\030\032\b\022\004\022\002H\0240\0312\"\020\032\032\036\022\n\022\b\022\004\022\002H\0240\034\022\004\022\0020\0230\033¢\006\002\b\035¢\006\002\b\0362$\b\b\020#\032\036\022\n\022\b\022\004\022\002H\0240$\022\004\022\0020\0230\033¢\006\002\b!¢\006\002\b\0362\021\020 \032\r\022\004\022\0020\0230\031¢\006\002\b!H\bø\001\000¢\006\002\020%\032_\020&\032\0020\023\"\b\b\000\020\024*\0020\025\"\016\b\001\020\026\030\001*\006\022\002\b\0030\0272\016\b\b\020\030\032\b\022\004\022\002H\0240\0312\"\020\032\032\036\022\n\022\b\022\004\022\002H\0240\034\022\004\022\0020\0230\033¢\006\002\b\035¢\006\002\b\036H\bø\001\000¢\006\002\020\037\032n\020&\032\0020\023\"\004\b\000\020\024\"\016\b\001\020\026\030\001*\006\022\002\b\0030\0272\016\b\b\020\030\032\b\022\004\022\002H\0240\0312\"\020\032\032\036\022\n\022\b\022\004\022\002H\0240\034\022\004\022\0020\0230\033¢\006\002\b\035¢\006\002\b\0362\021\020 \032\r\022\004\022\0020\0230\031¢\006\002\b!H\bø\001\000¢\006\002\020\"\032\001\020&\032\0020\023\"\004\b\000\020\024\"\016\b\001\020\026\030\001*\006\022\002\b\0030\0272\016\b\b\020\030\032\b\022\004\022\002H\0240\0312\"\020\032\032\036\022\n\022\b\022\004\022\002H\0240\034\022\004\022\0020\0230\033¢\006\002\b\035¢\006\002\b\0362$\b\b\020#\032\036\022\n\022\b\022\004\022\002H\0240$\022\004\022\0020\0230\033¢\006\002\b!¢\006\002\b\0362\021\020 \032\r\022\004\022\0020\0230\031¢\006\002\b!H\bø\001\000¢\006\002\020%\032.\020'\032\0020\0232\b\020(\032\004\030\0010\0252\021\020 \032\r\022\004\022\0020\0230\031¢\006\002\b!H\bø\001\000¢\006\002\020)\032.\020*\032\0020\0232\006\020+\032\0020,2\023\b\004\020 \032\r\022\004\022\0020\0230\031¢\006\002\b!H\bø\001\000¢\006\002\020-\032\b\020.\032\0020\023H\001\032B\020(\032\002H\024\"\004\b\000\020\0242\026\020/\032\f\022\b\b\001\022\004\030\0010\02500\"\004\030\0010\0252\021\0201\032\r\022\004\022\002H\0240\031¢\006\002\b!H\bø\001\000¢\006\002\0202\032,\0203\032\002H\024\"\004\b\000\020\0242\023\b\004\0204\032\r\022\004\022\002H\0240\031¢\006\002\b\035H\bø\001\000¢\006\002\0205\0326\0203\032\002H\024\"\004\b\000\020\0242\b\0206\032\004\030\0010\0252\023\b\004\0204\032\r\022\004\022\002H\0240\031¢\006\002\b\035H\bø\001\000¢\006\002\0207\032@\0203\032\002H\024\"\004\b\000\020\0242\b\0206\032\004\030\0010\0252\b\0208\032\004\030\0010\0252\023\b\004\0204\032\r\022\004\022\002H\0240\031¢\006\002\b\035H\bø\001\000¢\006\002\0209\032J\0203\032\002H\024\"\004\b\000\020\0242\b\0206\032\004\030\0010\0252\b\0208\032\004\030\0010\0252\b\020:\032\004\030\0010\0252\023\b\004\0204\032\r\022\004\022\002H\0240\031¢\006\002\b\035H\bø\001\000¢\006\002\020;\032D\0203\032\002H\024\"\004\b\000\020\0242\026\020/\032\f\022\b\b\001\022\004\030\0010\02500\"\004\030\0010\0252\023\b\004\0204\032\r\022\004\022\002H\0240\031¢\006\002\b\035H\bø\001\000¢\006\002\020<\032\r\020=\032\0020>H\007¢\006\002\020?\"\021\020\000\032\0020\0018G¢\006\006\032\004\b\002\020\003\"\021\020\004\032\0020\0058G¢\006\006\032\004\b\006\020\007\"\027\020\b\032\0020\t8G¢\006\f\022\004\b\n\020\013\032\004\b\f\020\r\"\021\020\016\032\0020\0178G¢\006\006\032\004\b\020\020\021\002\007\n\005\b20\001¨\006@"}, d2 = {"currentComposer", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentCompositeKeyHash", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositionLocalContext", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "()V", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "ComposeNode", "", "T", "", "E", "Landroidx/compose/runtime/Applier;", "factory", "Lkotlin/Function0;", "update", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Landroidx/compose/runtime/DisallowComposableCalls;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "skippableUpdate", "Landroidx/compose/runtime/SkippableUpdater;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "ReusableContent", "key", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableContentHost", "active", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "keys", "", "block", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "remember", "calculation", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "rememberCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,488:1\n1225#2,6:489\n1225#2,6:495\n1225#2,6:501\n1225#2,6:507\n1225#2,6:513\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:489,6\n37#1:495,6\n51#1:501,6\n69#1:507,6\n89#1:513,6\n*E\n"})
/*     */ public final class ComposablesKt
/*     */ {
/*     */   @Composable
/*     */   public static final <T> T remember(@NotNull Function0 calculation, @Nullable Composer $composer, int $changed) {
/*  25 */     Intrinsics.checkNotNullParameter(calculation, "calculation"); int $i$f$remember = 0; ComposerKt.sourceInformationMarkerStart($composer, -492369756, "CC(remember):Composables.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 489 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     
/* 491 */     Object value$iv = calculation.invoke();
/* 492 */     composer.updateRememberedValue(value$iv);
/* 493 */     Object object1 = (it$iv == Composer.Companion.getEmpty()) ? value$iv : 
/* 494 */       it$iv; ComposerKt.sourceInformationMarkerEnd($composer); return (T)object1; } @Composable public static final <T> T remember(@Nullable Object key1, @NotNull Function0 calculation, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(calculation, "calculation"); int $i$f$remember = 0; ComposerKt.sourceInformationMarkerStart($composer, 1157296644, "CC(remember)P(1):Composables.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = $composer.changed(key1); int $i$f$cache = 0;
/* 495 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     
/* 497 */     Object value$iv = calculation.invoke();
/* 498 */     composer.updateRememberedValue(value$iv);
/* 499 */     Object object1 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? value$iv : 
/* 500 */       it$iv; ComposerKt.sourceInformationMarkerEnd($composer); return (T)object1; } @Composable public static final <T> T remember(@Nullable Object key1, @Nullable Object key2, @NotNull Function0 calculation, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(calculation, "calculation"); int $i$f$remember = 0; ComposerKt.sourceInformationMarkerStart($composer, 511388516, "CC(remember)P(1,2):Composables.kt#9igjgp"); Composer composer = $composer; int i = $composer.changed(key1) | $composer.changed(key2); int $i$f$cache = 0;
/* 501 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     
/* 503 */     Object value$iv = calculation.invoke();
/* 504 */     composer.updateRememberedValue(value$iv);
/* 505 */     Object object1 = (i != 0 || it$iv == Composer.Companion.getEmpty()) ? value$iv : 
/* 506 */       it$iv; ComposerKt.sourceInformationMarkerEnd($composer); return (T)object1; } @Composable public static final <T> T remember(@Nullable Object key1, @Nullable Object key2, @Nullable Object key3, @NotNull Function0 calculation, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(calculation, "calculation"); int $i$f$remember = 0; ComposerKt.sourceInformationMarkerStart($composer, 1618982084, "CC(remember)P(1,2,3):Composables.kt#9igjgp"); Composer composer = $composer; int i = $composer.changed(key1) | $composer.changed(key2) | $composer.changed(key3); int $i$f$cache = 0;
/* 507 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     
/* 509 */     Object value$iv = calculation.invoke();
/* 510 */     composer.updateRememberedValue(value$iv);
/* 511 */     Object object1 = (i != 0 || it$iv == Composer.Companion.getEmpty()) ? value$iv : 
/* 512 */       it$iv; ComposerKt.sourceInformationMarkerEnd($composer); return (T)object1; } @Composable public static final <T> T remember(@NotNull Object[] keys, @NotNull Function0 calculation, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(calculation, "calculation"); int $i$f$remember = 0; ComposerKt.sourceInformationMarkerStart($composer, -568225417, "CC(remember)P(1):Composables.kt#9igjgp"); boolean invalid = false; byte b; int i; for (b = 0, i = keys.length; b < i; ) { Object key = keys[b]; invalid |= $composer.changed(key); b++; }
/* 513 */      Composer composer = $composer; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     
/* 515 */     Object value$iv = calculation.invoke();
/* 516 */     composer.updateRememberedValue(value$iv);
/* 517 */     Object object1 = (invalid || it$iv == Composer.Companion.getEmpty()) ? value$iv : 
/* 518 */       it$iv;
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return (T)object1; }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final <T> T key(@NotNull Object[] keys, @NotNull Function2 block, @Nullable Composer $composer, int $changed) {
/*     */     Intrinsics.checkNotNullParameter(keys, "keys");
/*     */     Intrinsics.checkNotNullParameter(block, "block");
/*     */     int $i$f$key = 0;
/*     */     ComposerKt.sourceInformationMarkerStart($composer, -11941951, "CC(key)P(1)132@4789L7:Composables.kt#9igjgp");
/*     */     Object object = block.invoke($composer, Integer.valueOf(0xE & $changed >> 3));
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return (T)object;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final void ReusableContent(@Nullable Object key, @NotNull Function2 content, @Nullable Composer $composer, int $changed) {
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     int $i$f$ReusableContent = 0;
/*     */     ComposerKt.sourceInformationMarkerStart($composer, 444418301, "CC(ReusableContent)P(1)149@5444L9:Composables.kt#9igjgp");
/*     */     $composer.startReusableGroup(207, key);
/*     */     content.invoke($composer, Integer.valueOf(0xE & $changed >> 3));
/*     */     $composer.endReusableGroup();
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void ReusableContentHost(boolean active, @NotNull Function2 content, @Nullable Composer $composer, int $changed) {
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     int $i$f$ReusableContentHost = 0;
/*     */     $composer.startReusableGroup(207, Boolean.valueOf(active));
/*     */     boolean activeChanged = $composer.changed(active);
/*     */     $composer.startReplaceGroup(-869707859);
/*     */     ComposerKt.sourceInformation($composer, "175@6712L9");
/*     */     if (active) {
/*     */       content.invoke($composer, Integer.valueOf(0xE & $changed >> 3));
/*     */     } else {
/*     */       $composer.deactivateToEndGroup(activeChanged);
/*     */     } 
/*     */     $composer.endReplaceGroup();
/*     */     $composer.endReusableGroup();
/*     */   }
/*     */   
/*     */   @ReadOnlyComposable
/*     */   @Composable
/*     */   @JvmName(name = "getCurrentComposer")
/*     */   @NotNull
/*     */   public static final Composer getCurrentComposer(@Nullable Composer $composer, int $changed) {
/*     */     ComposerKt.sourceInformationMarkerStart($composer, -554250212, "C:Composables.kt#9igjgp");
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-554250212, $changed, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:187)"); 
/*     */     throw new NotImplementedError("Implemented as an intrinsic");
/*     */   }
/*     */   
/*     */   @ReadOnlyComposable
/*     */   @Composable
/*     */   @JvmName(name = "getCurrentRecomposeScope")
/*     */   @NotNull
/*     */   public static final RecomposeScope getCurrentRecomposeScope(@Nullable Composer $composer, int $changed) {
/*     */     RecomposeScope scope;
/*     */     ComposerKt.sourceInformationMarkerStart($composer, 394957799, "C:Composables.kt#9igjgp");
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(394957799, $changed, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)"); 
/*     */     if ($composer.getRecomposeScope() == null) {
/*     */       $composer.getRecomposeScope();
/*     */       throw new IllegalStateException("no recompose scope found".toString());
/*     */     } 
/*     */     $composer.recordUsed(scope);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return scope;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @JvmName(name = "getCurrentCompositionLocalContext")
/*     */   @NotNull
/*     */   public static final CompositionLocalContext getCurrentCompositionLocalContext(@Nullable Composer $composer, int $changed) {
/*     */     ComposerKt.sourceInformationMarkerStart($composer, -43352356, "C:Composables.kt#9igjgp");
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-43352356, $changed, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:211)"); 
/*     */     CompositionLocalContext compositionLocalContext = new CompositionLocalContext($composer.buildContext().getCompositionLocalScope$runtime());
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return compositionLocalContext;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @JvmName(name = "getCurrentCompositeKeyHash")
/*     */   public static final int getCurrentCompositeKeyHash(@Nullable Composer $composer, int $changed) {
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(524444915, $changed, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)"); 
/*     */     int i = $composer.getCompoundKeyHash();
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     return i;
/*     */   }
/*     */   
/*     */   @PublishedApi
/*     */   public static final void invalidApplier() {
/*     */     throw new IllegalStateException("Invalid applier".toString());
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final CompositionContext rememberCompositionContext(@Nullable Composer $composer, int $changed) {
/*     */     ComposerKt.sourceInformationMarkerStart($composer, -1165786124, "C(rememberCompositionContext):Composables.kt#9igjgp");
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-1165786124, $changed, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)"); 
/*     */     CompositionContext compositionContext = $composer.buildContext();
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return compositionContext;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ComposablesKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */