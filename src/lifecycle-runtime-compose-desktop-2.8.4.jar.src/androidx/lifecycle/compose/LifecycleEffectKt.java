/*     */ package androidx.lifecycle.compose;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.DisposableEffectResult;
/*     */ import androidx.compose.runtime.DisposableEffectScope;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.lifecycle.Lifecycle;
/*     */ import androidx.lifecycle.LifecycleOwner;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000T\n\000\n\002\020\016\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\006\n\002\020\021\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\004\032-\020\003\032\0020\0042\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0040\nH\007¢\006\002\020\013\0320\020\f\032\0020\0042\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020\017\022\004\022\0020\0200\016¢\006\002\b\021H\007¢\006\002\020\022\032:\020\f\032\0020\0042\b\020\023\032\004\030\0010\0242\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020\017\022\004\022\0020\0200\016¢\006\002\b\021H\007¢\006\002\020\025\032D\020\f\032\0020\0042\b\020\023\032\004\030\0010\0242\b\020\026\032\004\030\0010\0242\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020\017\022\004\022\0020\0200\016¢\006\002\b\021H\007¢\006\002\020\027\032N\020\f\032\0020\0042\b\020\023\032\004\030\0010\0242\b\020\026\032\004\030\0010\0242\b\020\030\032\004\030\0010\0242\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020\017\022\004\022\0020\0200\016¢\006\002\b\021H\007¢\006\002\020\031\032H\020\f\032\0020\0042\026\020\032\032\f\022\b\b\001\022\004\030\0010\0240\033\"\004\030\0010\0242\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020\017\022\004\022\0020\0200\016¢\006\002\b\021H\007¢\006\002\020\034\0326\020\035\032\0020\0042\006\020\007\032\0020\b2\006\020\036\032\0020\0172\027\020\r\032\023\022\004\022\0020\017\022\004\022\0020\0200\016¢\006\002\b\021H\003¢\006\002\020\037\0320\020 \032\0020\0042\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020!\022\004\022\0020\"0\016¢\006\002\b\021H\007¢\006\002\020\022\032:\020 \032\0020\0042\b\020\023\032\004\030\0010\0242\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020!\022\004\022\0020\"0\016¢\006\002\b\021H\007¢\006\002\020\025\032D\020 \032\0020\0042\b\020\023\032\004\030\0010\0242\b\020\026\032\004\030\0010\0242\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020!\022\004\022\0020\"0\016¢\006\002\b\021H\007¢\006\002\020\027\032N\020 \032\0020\0042\b\020\023\032\004\030\0010\0242\b\020\026\032\004\030\0010\0242\b\020\030\032\004\030\0010\0242\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020!\022\004\022\0020\"0\016¢\006\002\b\021H\007¢\006\002\020\031\032H\020 \032\0020\0042\026\020\032\032\f\022\b\b\001\022\004\030\0010\0240\033\"\004\030\0010\0242\b\b\002\020\007\032\0020\b2\027\020\r\032\023\022\004\022\0020!\022\004\022\0020\"0\016¢\006\002\b\021H\007¢\006\002\020\034\0326\020#\032\0020\0042\006\020\007\032\0020\b2\006\020\036\032\0020!2\027\020\r\032\023\022\004\022\0020!\022\004\022\0020\"0\016¢\006\002\b\021H\003¢\006\002\020$\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000¨\006%²\006\020\020&\032\b\022\004\022\0020\0040\nX\002"}, d2 = {"LifecycleResumeEffectNoParamError", "", "LifecycleStartEffectNoParamError", "LifecycleEventEffect", "", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onEvent", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LifecycleResumeEffect", "effects", "Lkotlin/Function1;", "Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key1", "", "(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "keys", "", "([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LifecycleResumeEffectImpl", "scope", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LifecycleStartEffect", "Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "LifecycleStartEffectImpl", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lifecycle-runtime-compose", "currentOnEvent"})
/*     */ @SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,745:1\n74#2:746\n74#2:753\n74#2:760\n74#2:767\n74#2:774\n74#2:784\n74#2:791\n74#2:798\n74#2:805\n74#2:812\n74#2:822\n1117#3,6:747\n1117#3,6:754\n1117#3,6:761\n1117#3,6:768\n1117#3,6:778\n1117#3,6:785\n1117#3,6:792\n1117#3,6:799\n1117#3,6:806\n1117#3,6:816\n1117#3,6:823\n83#4,3:775\n83#4,3:813\n81#5:829\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n56#1:746\n134#1:753\n197#1:760\n262#1:767\n323#1:774\n349#1:784\n466#1:791\n529#1:798\n594#1:805\n655#1:812\n681#1:822\n67#1:747,6\n137#1:754,6\n200#1:761,6\n265#1:768,6\n326#1:778,6\n359#1:785,6\n469#1:792,6\n532#1:799,6\n597#1:806,6\n658#1:816,6\n691#1:823,6\n326#1:775,3\n658#1:813,3\n66#1:829\n*E\n"})
/*     */ public final class LifecycleEffectKt
/*     */ {
/*     */   @NotNull
/*     */   private static final String LifecycleStartEffectNoParamError = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";
/*     */   @NotNull
/*     */   private static final String LifecycleResumeEffectNoParamError = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";
/*     */   
/*     */   @Composable
/*     */   public static final void LifecycleEventEffect(@NotNull Lifecycle.Event event, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function0 onEvent, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'event'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'onEvent'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc -709389590
/*     */     //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   20: astore_3
/*     */     //   21: aload_3
/*     */     //   22: ldc 'C(LifecycleEventEffect)55@2410L7,65@2841L29,66@2908L299,66@2875L332:LifecycleEffect.kt#2vxrgp'
/*     */     //   24: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   27: iload #4
/*     */     //   29: istore #6
/*     */     //   31: iload #5
/*     */     //   33: iconst_1
/*     */     //   34: iand
/*     */     //   35: ifeq -> 48
/*     */     //   38: iload #6
/*     */     //   40: bipush #6
/*     */     //   42: ior
/*     */     //   43: istore #6
/*     */     //   45: goto -> 76
/*     */     //   48: iload #4
/*     */     //   50: bipush #6
/*     */     //   52: iand
/*     */     //   53: ifne -> 76
/*     */     //   56: iload #6
/*     */     //   58: aload_3
/*     */     //   59: aload_0
/*     */     //   60: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   65: ifeq -> 72
/*     */     //   68: iconst_4
/*     */     //   69: goto -> 73
/*     */     //   72: iconst_2
/*     */     //   73: ior
/*     */     //   74: istore #6
/*     */     //   76: iload #4
/*     */     //   78: bipush #48
/*     */     //   80: iand
/*     */     //   81: ifne -> 113
/*     */     //   84: iload #6
/*     */     //   86: iload #5
/*     */     //   88: iconst_2
/*     */     //   89: iand
/*     */     //   90: ifne -> 108
/*     */     //   93: aload_3
/*     */     //   94: aload_1
/*     */     //   95: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   100: ifeq -> 108
/*     */     //   103: bipush #32
/*     */     //   105: goto -> 110
/*     */     //   108: bipush #16
/*     */     //   110: ior
/*     */     //   111: istore #6
/*     */     //   113: iload #5
/*     */     //   115: iconst_4
/*     */     //   116: iand
/*     */     //   117: ifeq -> 131
/*     */     //   120: iload #6
/*     */     //   122: sipush #384
/*     */     //   125: ior
/*     */     //   126: istore #6
/*     */     //   128: goto -> 164
/*     */     //   131: iload #4
/*     */     //   133: sipush #384
/*     */     //   136: iand
/*     */     //   137: ifne -> 164
/*     */     //   140: iload #6
/*     */     //   142: aload_3
/*     */     //   143: aload_2
/*     */     //   144: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   149: ifeq -> 158
/*     */     //   152: sipush #256
/*     */     //   155: goto -> 161
/*     */     //   158: sipush #128
/*     */     //   161: ior
/*     */     //   162: istore #6
/*     */     //   164: iload #6
/*     */     //   166: sipush #147
/*     */     //   169: iand
/*     */     //   170: sipush #146
/*     */     //   173: if_icmpne -> 185
/*     */     //   176: aload_3
/*     */     //   177: invokeinterface getSkipping : ()Z
/*     */     //   182: ifne -> 502
/*     */     //   185: aload_3
/*     */     //   186: invokeinterface startDefaults : ()V
/*     */     //   191: iload #4
/*     */     //   193: iconst_1
/*     */     //   194: iand
/*     */     //   195: ifeq -> 207
/*     */     //   198: aload_3
/*     */     //   199: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   204: ifeq -> 267
/*     */     //   207: iload #5
/*     */     //   209: iconst_2
/*     */     //   210: iand
/*     */     //   211: ifeq -> 287
/*     */     //   214: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   217: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   220: astore #7
/*     */     //   222: bipush #6
/*     */     //   224: istore #8
/*     */     //   226: iconst_0
/*     */     //   227: istore #9
/*     */     //   229: aload_3
/*     */     //   230: ldc 2023513938
/*     */     //   232: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   234: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   237: aload_3
/*     */     //   238: aload #7
/*     */     //   240: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   245: astore #10
/*     */     //   247: aload_3
/*     */     //   248: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   251: aload #10
/*     */     //   253: checkcast androidx/lifecycle/LifecycleOwner
/*     */     //   256: astore_1
/*     */     //   257: iload #6
/*     */     //   259: bipush #-113
/*     */     //   261: iand
/*     */     //   262: istore #6
/*     */     //   264: goto -> 287
/*     */     //   267: aload_3
/*     */     //   268: invokeinterface skipToGroupEnd : ()V
/*     */     //   273: iload #5
/*     */     //   275: iconst_2
/*     */     //   276: iand
/*     */     //   277: ifeq -> 287
/*     */     //   280: iload #6
/*     */     //   282: bipush #-113
/*     */     //   284: iand
/*     */     //   285: istore #6
/*     */     //   287: aload_3
/*     */     //   288: invokeinterface endDefaults : ()V
/*     */     //   293: invokestatic isTraceInProgress : ()Z
/*     */     //   296: ifeq -> 309
/*     */     //   299: ldc -709389590
/*     */     //   301: iload #6
/*     */     //   303: iconst_m1
/*     */     //   304: ldc 'androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:57)'
/*     */     //   306: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   309: aload_0
/*     */     //   310: getstatic androidx/lifecycle/Lifecycle$Event.ON_DESTROY : Landroidx/lifecycle/Lifecycle$Event;
/*     */     //   313: if_acmpne -> 326
/*     */     //   316: new java/lang/IllegalArgumentException
/*     */     //   319: dup
/*     */     //   320: ldc 'LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.'
/*     */     //   322: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   325: athrow
/*     */     //   326: aload_2
/*     */     //   327: aload_3
/*     */     //   328: bipush #14
/*     */     //   330: iload #6
/*     */     //   332: bipush #6
/*     */     //   334: ishr
/*     */     //   335: iand
/*     */     //   336: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   339: astore #7
/*     */     //   341: aload_1
/*     */     //   342: aload_3
/*     */     //   343: ldc 380955345
/*     */     //   345: invokeinterface startReplaceableGroup : (I)V
/*     */     //   350: aload_3
/*     */     //   351: ldc 'CC(remember):LifecycleEffect.kt#9igjgp'
/*     */     //   353: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   356: aload_3
/*     */     //   357: astore #9
/*     */     //   359: iload #6
/*     */     //   361: bipush #14
/*     */     //   363: iand
/*     */     //   364: iconst_4
/*     */     //   365: if_icmpne -> 372
/*     */     //   368: iconst_1
/*     */     //   369: goto -> 373
/*     */     //   372: iconst_0
/*     */     //   373: aload_3
/*     */     //   374: aload #7
/*     */     //   376: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   381: ior
/*     */     //   382: aload_3
/*     */     //   383: aload_1
/*     */     //   384: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   389: ior
/*     */     //   390: istore #10
/*     */     //   392: iconst_0
/*     */     //   393: istore #11
/*     */     //   395: aload #9
/*     */     //   397: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   402: astore #12
/*     */     //   404: iconst_0
/*     */     //   405: istore #13
/*     */     //   407: iload #10
/*     */     //   409: ifne -> 423
/*     */     //   412: aload #12
/*     */     //   414: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   417: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   420: if_acmpne -> 461
/*     */     //   423: astore #16
/*     */     //   425: iconst_0
/*     */     //   426: istore #14
/*     */     //   428: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1
/*     */     //   431: dup
/*     */     //   432: aload_1
/*     */     //   433: aload_0
/*     */     //   434: aload #7
/*     */     //   436: invokespecial <init> : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/State;)V
/*     */     //   439: checkcast kotlin/jvm/functions/Function1
/*     */     //   442: aload #16
/*     */     //   444: swap
/*     */     //   445: astore #15
/*     */     //   447: aload #9
/*     */     //   449: aload #15
/*     */     //   451: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   456: aload #15
/*     */     //   458: goto -> 463
/*     */     //   461: aload #12
/*     */     //   463: nop
/*     */     //   464: nop
/*     */     //   465: nop
/*     */     //   466: checkcast kotlin/jvm/functions/Function1
/*     */     //   469: astore #8
/*     */     //   471: aload_3
/*     */     //   472: invokeinterface endReplaceableGroup : ()V
/*     */     //   477: aload #8
/*     */     //   479: aload_3
/*     */     //   480: bipush #14
/*     */     //   482: iload #6
/*     */     //   484: iconst_3
/*     */     //   485: ishr
/*     */     //   486: iand
/*     */     //   487: invokestatic DisposableEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   490: invokestatic isTraceInProgress : ()Z
/*     */     //   493: ifeq -> 508
/*     */     //   496: invokestatic traceEventEnd : ()V
/*     */     //   499: goto -> 508
/*     */     //   502: aload_3
/*     */     //   503: invokeinterface skipToGroupEnd : ()V
/*     */     //   508: aload_3
/*     */     //   509: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   514: dup
/*     */     //   515: ifnull -> 543
/*     */     //   518: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$2
/*     */     //   521: dup
/*     */     //   522: aload_0
/*     */     //   523: aload_1
/*     */     //   524: aload_2
/*     */     //   525: iload #4
/*     */     //   527: iload #5
/*     */     //   529: invokespecial <init> : (Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;II)V
/*     */     //   532: checkcast kotlin/jvm/functions/Function2
/*     */     //   535: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   540: goto -> 544
/*     */     //   543: pop
/*     */     //   544: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #58	-> 12
/*     */     //   #56	-> 214
/*     */     //   #746	-> 234
/*     */     //   #58	-> 306
/*     */     //   #59	-> 309
/*     */     //   #60	-> 316
/*     */     //   #66	-> 326
/*     */     //   #67	-> 341
/*     */     //   #747	-> 395
/*     */     //   #748	-> 407
/*     */     //   #749	-> 423
/*     */     //   #67	-> 428
/*     */     //   #749	-> 445
/*     */     //   #750	-> 447
/*     */     //   #751	-> 456
/*     */     //   #752	-> 461
/*     */     //   #748	-> 463
/*     */     //   #747	-> 464
/*     */     //   #747	-> 465
/*     */     //   #67	-> 466
/*     */     //   #80	-> 502
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   229	24	9	$i$f$getCurrent	I
/*     */     //   226	27	7	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   226	27	8	$changed$iv	I
/*     */     //   428	14	14	$i$a$-cache-LifecycleEffectKt$LifecycleEventEffect$1	I
/*     */     //   447	11	15	value$iv	Ljava/lang/Object;
/*     */     //   407	57	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   404	60	12	it$iv	Ljava/lang/Object;
/*     */     //   395	71	11	$i$f$cache	I
/*     */     //   392	74	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   392	74	10	invalid$iv	Z
/*     */     //   341	158	7	currentOnEvent$delegate	Landroidx/compose/runtime/State;
/*     */     //   31	514	6	$dirty	I
/*     */     //   0	545	0	event	Landroidx/lifecycle/Lifecycle$Event;
/*     */     //   0	545	1	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	545	2	onEvent	Lkotlin/jvm/functions/Function0;
/*     */     //   0	545	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	545	4	$changed	I
/*     */   }
/*     */   
/*     */   private static final Function0<Unit> LifecycleEventEffect$lambda$0(State $currentOnEvent$delegate) {
/*  66 */     State state = $currentOnEvent$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 829 */       (Function0<Unit>)state.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,745:1\n63#2,5:746\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n*L\n76#1:746,5\n*E\n"})
/*     */   static final class LifecycleEffectKt$LifecycleEventEffect$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/*     */     @NotNull
/*     */     public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$DisposableEffect'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield $event : Landroidx/lifecycle/Lifecycle$Event;
/*     */       //   10: aload_0
/*     */       //   11: getfield $currentOnEvent$delegate : Landroidx/compose/runtime/State;
/*     */       //   14: <illegal opcode> onStateChanged : (Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/State;)Landroidx/lifecycle/LifecycleEventObserver;
/*     */       //   19: astore_2
/*     */       //   20: aload_0
/*     */       //   21: getfield $lifecycleOwner : Landroidx/lifecycle/LifecycleOwner;
/*     */       //   24: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */       //   29: aload_2
/*     */       //   30: checkcast androidx/lifecycle/LifecycleObserver
/*     */       //   33: invokevirtual addObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*     */       //   36: aload_1
/*     */       //   37: astore_3
/*     */       //   38: aload_0
/*     */       //   39: getfield $lifecycleOwner : Landroidx/lifecycle/LifecycleOwner;
/*     */       //   42: astore #4
/*     */       //   44: iconst_0
/*     */       //   45: istore #5
/*     */       //   47: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1$invoke$$inlined$onDispose$1
/*     */       //   50: dup
/*     */       //   51: aload #4
/*     */       //   53: aload_2
/*     */       //   54: invokespecial <init> : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/LifecycleEventObserver;)V
/*     */       //   57: checkcast androidx/compose/runtime/DisposableEffectResult
/*     */       //   60: nop
/*     */       //   61: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #68	-> 6
/*     */       //   #74	-> 20
/*     */       //   #76	-> 36
/*     */       //   #746	-> 47
/*     */       //   #750	-> 60
/*     */       //   #76	-> 61
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   47	14	5	$i$f$onDispose	I
/*     */       //   44	17	3	this_$iv	Landroidx/compose/runtime/DisposableEffectScope;
/*     */       //   20	42	2	observer	Landroidx/lifecycle/LifecycleEventObserver;
/*     */       //   0	62	0	this	Landroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1;
/*     */       //   0	62	1	$this$DisposableEffect	Landroidx/compose/runtime/DisposableEffectScope;
/*     */     }
/*     */     
/*     */     private static final void invoke$lambda$0(Lifecycle.Event $event, State<? extends Function0<Unit>> $currentOnEvent$delegate, LifecycleOwner param1LifecycleOwner, Lifecycle.Event e) {
/*     */       Intrinsics.checkNotNullParameter($event, "$event");
/*     */       Intrinsics.checkNotNullParameter($currentOnEvent$delegate, "$currentOnEvent$delegate");
/*     */       Intrinsics.checkNotNullParameter(param1LifecycleOwner, "<anonymous parameter 0>");
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       if (e == $event)
/*     */         LifecycleEffectKt.LifecycleEventEffect$lambda$0($currentOnEvent$delegate).invoke(); 
/*     */     }
/*     */     
/*     */     LifecycleEffectKt$LifecycleEventEffect$1$1(LifecycleOwner $lifecycleOwner, Lifecycle.Event $event, State<Function0<Unit>> $currentOnEvent$delegate) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final void LifecycleStartEffect(@Nullable Object key1, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1 effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'effects'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc -1408314671
/*     */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   14: astore_3
/*     */     //   15: aload_3
/*     */     //   16: ldc 'C(LifecycleStartEffect)P(1,2)133@5830L7,136@5967L102,139@6074L80:LifecycleEffect.kt#2vxrgp'
/*     */     //   18: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   21: iload #4
/*     */     //   23: istore #6
/*     */     //   25: iload #5
/*     */     //   27: iconst_1
/*     */     //   28: iand
/*     */     //   29: ifeq -> 42
/*     */     //   32: iload #6
/*     */     //   34: bipush #6
/*     */     //   36: ior
/*     */     //   37: istore #6
/*     */     //   39: goto -> 70
/*     */     //   42: iload #4
/*     */     //   44: bipush #6
/*     */     //   46: iand
/*     */     //   47: ifne -> 70
/*     */     //   50: iload #6
/*     */     //   52: aload_3
/*     */     //   53: aload_0
/*     */     //   54: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   59: ifeq -> 66
/*     */     //   62: iconst_4
/*     */     //   63: goto -> 67
/*     */     //   66: iconst_2
/*     */     //   67: ior
/*     */     //   68: istore #6
/*     */     //   70: iload #4
/*     */     //   72: bipush #48
/*     */     //   74: iand
/*     */     //   75: ifne -> 107
/*     */     //   78: iload #6
/*     */     //   80: iload #5
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifne -> 102
/*     */     //   87: aload_3
/*     */     //   88: aload_1
/*     */     //   89: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   94: ifeq -> 102
/*     */     //   97: bipush #32
/*     */     //   99: goto -> 104
/*     */     //   102: bipush #16
/*     */     //   104: ior
/*     */     //   105: istore #6
/*     */     //   107: iload #5
/*     */     //   109: iconst_4
/*     */     //   110: iand
/*     */     //   111: ifeq -> 125
/*     */     //   114: iload #6
/*     */     //   116: sipush #384
/*     */     //   119: ior
/*     */     //   120: istore #6
/*     */     //   122: goto -> 158
/*     */     //   125: iload #4
/*     */     //   127: sipush #384
/*     */     //   130: iand
/*     */     //   131: ifne -> 158
/*     */     //   134: iload #6
/*     */     //   136: aload_3
/*     */     //   137: aload_2
/*     */     //   138: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   143: ifeq -> 152
/*     */     //   146: sipush #256
/*     */     //   149: goto -> 155
/*     */     //   152: sipush #128
/*     */     //   155: ior
/*     */     //   156: istore #6
/*     */     //   158: iload #6
/*     */     //   160: sipush #147
/*     */     //   163: iand
/*     */     //   164: sipush #146
/*     */     //   167: if_icmpne -> 179
/*     */     //   170: aload_3
/*     */     //   171: invokeinterface getSkipping : ()Z
/*     */     //   176: ifne -> 454
/*     */     //   179: aload_3
/*     */     //   180: invokeinterface startDefaults : ()V
/*     */     //   185: iload #4
/*     */     //   187: iconst_1
/*     */     //   188: iand
/*     */     //   189: ifeq -> 201
/*     */     //   192: aload_3
/*     */     //   193: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   198: ifeq -> 261
/*     */     //   201: iload #5
/*     */     //   203: iconst_2
/*     */     //   204: iand
/*     */     //   205: ifeq -> 281
/*     */     //   208: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   211: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   214: astore #7
/*     */     //   216: bipush #6
/*     */     //   218: istore #8
/*     */     //   220: iconst_0
/*     */     //   221: istore #9
/*     */     //   223: aload_3
/*     */     //   224: ldc 2023513938
/*     */     //   226: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   228: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   231: aload_3
/*     */     //   232: aload #7
/*     */     //   234: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   239: astore #10
/*     */     //   241: aload_3
/*     */     //   242: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   245: aload #10
/*     */     //   247: checkcast androidx/lifecycle/LifecycleOwner
/*     */     //   250: astore_1
/*     */     //   251: iload #6
/*     */     //   253: bipush #-113
/*     */     //   255: iand
/*     */     //   256: istore #6
/*     */     //   258: goto -> 281
/*     */     //   261: aload_3
/*     */     //   262: invokeinterface skipToGroupEnd : ()V
/*     */     //   267: iload #5
/*     */     //   269: iconst_2
/*     */     //   270: iand
/*     */     //   271: ifeq -> 281
/*     */     //   274: iload #6
/*     */     //   276: bipush #-113
/*     */     //   278: iand
/*     */     //   279: istore #6
/*     */     //   281: aload_3
/*     */     //   282: invokeinterface endDefaults : ()V
/*     */     //   287: invokestatic isTraceInProgress : ()Z
/*     */     //   290: ifeq -> 303
/*     */     //   293: ldc -1408314671
/*     */     //   295: iload #6
/*     */     //   297: iconst_m1
/*     */     //   298: ldc 'androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:135)'
/*     */     //   300: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   303: aload_3
/*     */     //   304: ldc -1877970380
/*     */     //   306: invokeinterface startReplaceableGroup : (I)V
/*     */     //   311: aload_3
/*     */     //   312: ldc 'CC(remember):LifecycleEffect.kt#9igjgp'
/*     */     //   314: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   317: aload_3
/*     */     //   318: astore #9
/*     */     //   320: aload_3
/*     */     //   321: aload_0
/*     */     //   322: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   327: aload_3
/*     */     //   328: aload_1
/*     */     //   329: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   334: ior
/*     */     //   335: istore #10
/*     */     //   337: iconst_0
/*     */     //   338: istore #11
/*     */     //   340: aload #9
/*     */     //   342: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   347: astore #12
/*     */     //   349: iconst_0
/*     */     //   350: istore #13
/*     */     //   352: iload #10
/*     */     //   354: ifne -> 368
/*     */     //   357: aload #12
/*     */     //   359: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   362: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   365: if_acmpne -> 400
/*     */     //   368: iconst_0
/*     */     //   369: istore #14
/*     */     //   371: new androidx/lifecycle/compose/LifecycleStartStopEffectScope
/*     */     //   374: dup
/*     */     //   375: aload_1
/*     */     //   376: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   381: invokespecial <init> : (Landroidx/lifecycle/Lifecycle;)V
/*     */     //   384: astore #15
/*     */     //   386: aload #9
/*     */     //   388: aload #15
/*     */     //   390: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   395: aload #15
/*     */     //   397: goto -> 402
/*     */     //   400: aload #12
/*     */     //   402: nop
/*     */     //   403: nop
/*     */     //   404: nop
/*     */     //   405: checkcast androidx/lifecycle/compose/LifecycleStartStopEffectScope
/*     */     //   408: astore #8
/*     */     //   410: aload_3
/*     */     //   411: invokeinterface endReplaceableGroup : ()V
/*     */     //   416: aload #8
/*     */     //   418: astore #7
/*     */     //   420: aload_1
/*     */     //   421: aload #7
/*     */     //   423: aload_2
/*     */     //   424: aload_3
/*     */     //   425: bipush #14
/*     */     //   427: iload #6
/*     */     //   429: iconst_3
/*     */     //   430: ishr
/*     */     //   431: iand
/*     */     //   432: sipush #896
/*     */     //   435: iload #6
/*     */     //   437: iand
/*     */     //   438: ior
/*     */     //   439: invokestatic LifecycleStartEffectImpl : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   442: invokestatic isTraceInProgress : ()Z
/*     */     //   445: ifeq -> 460
/*     */     //   448: invokestatic traceEventEnd : ()V
/*     */     //   451: goto -> 460
/*     */     //   454: aload_3
/*     */     //   455: invokeinterface skipToGroupEnd : ()V
/*     */     //   460: aload_3
/*     */     //   461: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   466: dup
/*     */     //   467: ifnull -> 495
/*     */     //   470: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffect$1
/*     */     //   473: dup
/*     */     //   474: aload_0
/*     */     //   475: aload_1
/*     */     //   476: aload_2
/*     */     //   477: iload #4
/*     */     //   479: iload #5
/*     */     //   481: invokespecial <init> : (Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;II)V
/*     */     //   484: checkcast kotlin/jvm/functions/Function2
/*     */     //   487: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   492: goto -> 496
/*     */     //   495: pop
/*     */     //   496: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 6
/*     */     //   #134	-> 208
/*     */     //   #753	-> 228
/*     */     //   #136	-> 300
/*     */     //   #137	-> 321
/*     */     //   #754	-> 340
/*     */     //   #755	-> 352
/*     */     //   #756	-> 368
/*     */     //   #138	-> 371
/*     */     //   #756	-> 384
/*     */     //   #757	-> 386
/*     */     //   #758	-> 395
/*     */     //   #759	-> 400
/*     */     //   #755	-> 402
/*     */     //   #754	-> 403
/*     */     //   #754	-> 404
/*     */     //   #137	-> 405
/*     */     //   #140	-> 420
/*     */     //   #141	-> 454
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   223	24	9	$i$f$getCurrent	I
/*     */     //   220	27	7	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   220	27	8	$changed$iv	I
/*     */     //   371	13	14	$i$a$-cache-LifecycleEffectKt$LifecycleStartEffect$lifecycleStartStopEffectScope$1	I
/*     */     //   386	11	15	value$iv	Ljava/lang/Object;
/*     */     //   352	51	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   349	54	12	it$iv	Ljava/lang/Object;
/*     */     //   340	65	11	$i$f$cache	I
/*     */     //   337	68	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   337	68	10	invalid$iv	Z
/*     */     //   420	31	7	lifecycleStartStopEffectScope	Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;
/*     */     //   25	472	6	$dirty	I
/*     */     //   0	497	0	key1	Ljava/lang/Object;
/*     */     //   0	497	1	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	497	2	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	497	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	497	4	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final void LifecycleStartEffect(@Nullable Object key1, @Nullable Object key2, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1 effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc 'effects'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #4
/*     */     //   8: ldc 696924721
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #4
/*     */     //   17: aload #4
/*     */     //   19: ldc 'C(LifecycleStartEffect)P(1,2,3)196@8866L7,199@9003L108,202@9116L80:LifecycleEffect.kt#2vxrgp'
/*     */     //   21: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   24: iload #5
/*     */     //   26: istore #7
/*     */     //   28: iload #6
/*     */     //   30: iconst_1
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #7
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #7
/*     */     //   42: goto -> 74
/*     */     //   45: iload #5
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 74
/*     */     //   53: iload #7
/*     */     //   55: aload #4
/*     */     //   57: aload_0
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 70
/*     */     //   66: iconst_4
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_2
/*     */     //   71: ior
/*     */     //   72: istore #7
/*     */     //   74: iload #6
/*     */     //   76: iconst_2
/*     */     //   77: iand
/*     */     //   78: ifeq -> 91
/*     */     //   81: iload #7
/*     */     //   83: bipush #48
/*     */     //   85: ior
/*     */     //   86: istore #7
/*     */     //   88: goto -> 122
/*     */     //   91: iload #5
/*     */     //   93: bipush #48
/*     */     //   95: iand
/*     */     //   96: ifne -> 122
/*     */     //   99: iload #7
/*     */     //   101: aload #4
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 117
/*     */     //   112: bipush #32
/*     */     //   114: goto -> 119
/*     */     //   117: bipush #16
/*     */     //   119: ior
/*     */     //   120: istore #7
/*     */     //   122: iload #5
/*     */     //   124: sipush #384
/*     */     //   127: iand
/*     */     //   128: ifne -> 163
/*     */     //   131: iload #7
/*     */     //   133: iload #6
/*     */     //   135: iconst_4
/*     */     //   136: iand
/*     */     //   137: ifne -> 157
/*     */     //   140: aload #4
/*     */     //   142: aload_2
/*     */     //   143: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   148: ifeq -> 157
/*     */     //   151: sipush #256
/*     */     //   154: goto -> 160
/*     */     //   157: sipush #128
/*     */     //   160: ior
/*     */     //   161: istore #7
/*     */     //   163: iload #6
/*     */     //   165: bipush #8
/*     */     //   167: iand
/*     */     //   168: ifeq -> 182
/*     */     //   171: iload #7
/*     */     //   173: sipush #3072
/*     */     //   176: ior
/*     */     //   177: istore #7
/*     */     //   179: goto -> 216
/*     */     //   182: iload #5
/*     */     //   184: sipush #3072
/*     */     //   187: iand
/*     */     //   188: ifne -> 216
/*     */     //   191: iload #7
/*     */     //   193: aload #4
/*     */     //   195: aload_3
/*     */     //   196: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   201: ifeq -> 210
/*     */     //   204: sipush #2048
/*     */     //   207: goto -> 213
/*     */     //   210: sipush #1024
/*     */     //   213: ior
/*     */     //   214: istore #7
/*     */     //   216: iload #7
/*     */     //   218: sipush #1171
/*     */     //   221: iand
/*     */     //   222: sipush #1170
/*     */     //   225: if_icmpne -> 238
/*     */     //   228: aload #4
/*     */     //   230: invokeinterface getSkipping : ()Z
/*     */     //   235: ifne -> 541
/*     */     //   238: aload #4
/*     */     //   240: invokeinterface startDefaults : ()V
/*     */     //   245: iload #5
/*     */     //   247: iconst_1
/*     */     //   248: iand
/*     */     //   249: ifeq -> 262
/*     */     //   252: aload #4
/*     */     //   254: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   259: ifeq -> 326
/*     */     //   262: iload #6
/*     */     //   264: iconst_4
/*     */     //   265: iand
/*     */     //   266: ifeq -> 348
/*     */     //   269: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   272: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   275: astore #8
/*     */     //   277: bipush #6
/*     */     //   279: istore #9
/*     */     //   281: iconst_0
/*     */     //   282: istore #10
/*     */     //   284: aload #4
/*     */     //   286: ldc 2023513938
/*     */     //   288: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   290: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   293: aload #4
/*     */     //   295: aload #8
/*     */     //   297: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   302: astore #11
/*     */     //   304: aload #4
/*     */     //   306: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   309: aload #11
/*     */     //   311: checkcast androidx/lifecycle/LifecycleOwner
/*     */     //   314: astore_2
/*     */     //   315: iload #7
/*     */     //   317: sipush #-897
/*     */     //   320: iand
/*     */     //   321: istore #7
/*     */     //   323: goto -> 348
/*     */     //   326: aload #4
/*     */     //   328: invokeinterface skipToGroupEnd : ()V
/*     */     //   333: iload #6
/*     */     //   335: iconst_4
/*     */     //   336: iand
/*     */     //   337: ifeq -> 348
/*     */     //   340: iload #7
/*     */     //   342: sipush #-897
/*     */     //   345: iand
/*     */     //   346: istore #7
/*     */     //   348: aload #4
/*     */     //   350: invokeinterface endDefaults : ()V
/*     */     //   355: invokestatic isTraceInProgress : ()Z
/*     */     //   358: ifeq -> 371
/*     */     //   361: ldc 696924721
/*     */     //   363: iload #7
/*     */     //   365: iconst_m1
/*     */     //   366: ldc 'androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:198)'
/*     */     //   368: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   371: aload #4
/*     */     //   373: ldc -1877873222
/*     */     //   375: invokeinterface startReplaceableGroup : (I)V
/*     */     //   380: aload #4
/*     */     //   382: ldc 'CC(remember):LifecycleEffect.kt#9igjgp'
/*     */     //   384: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   387: aload #4
/*     */     //   389: astore #10
/*     */     //   391: aload #4
/*     */     //   393: aload_0
/*     */     //   394: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   399: aload #4
/*     */     //   401: aload_1
/*     */     //   402: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   407: ior
/*     */     //   408: aload #4
/*     */     //   410: aload_2
/*     */     //   411: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   416: ior
/*     */     //   417: istore #11
/*     */     //   419: iconst_0
/*     */     //   420: istore #12
/*     */     //   422: aload #10
/*     */     //   424: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   429: astore #13
/*     */     //   431: iconst_0
/*     */     //   432: istore #14
/*     */     //   434: iload #11
/*     */     //   436: ifne -> 450
/*     */     //   439: aload #13
/*     */     //   441: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   444: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   447: if_acmpne -> 482
/*     */     //   450: iconst_0
/*     */     //   451: istore #15
/*     */     //   453: new androidx/lifecycle/compose/LifecycleStartStopEffectScope
/*     */     //   456: dup
/*     */     //   457: aload_2
/*     */     //   458: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   463: invokespecial <init> : (Landroidx/lifecycle/Lifecycle;)V
/*     */     //   466: astore #16
/*     */     //   468: aload #10
/*     */     //   470: aload #16
/*     */     //   472: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   477: aload #16
/*     */     //   479: goto -> 484
/*     */     //   482: aload #13
/*     */     //   484: nop
/*     */     //   485: nop
/*     */     //   486: nop
/*     */     //   487: checkcast androidx/lifecycle/compose/LifecycleStartStopEffectScope
/*     */     //   490: astore #9
/*     */     //   492: aload #4
/*     */     //   494: invokeinterface endReplaceableGroup : ()V
/*     */     //   499: aload #9
/*     */     //   501: astore #8
/*     */     //   503: aload_2
/*     */     //   504: aload #8
/*     */     //   506: aload_3
/*     */     //   507: aload #4
/*     */     //   509: bipush #14
/*     */     //   511: iload #7
/*     */     //   513: bipush #6
/*     */     //   515: ishr
/*     */     //   516: iand
/*     */     //   517: sipush #896
/*     */     //   520: iload #7
/*     */     //   522: iconst_3
/*     */     //   523: ishr
/*     */     //   524: iand
/*     */     //   525: ior
/*     */     //   526: invokestatic LifecycleStartEffectImpl : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   529: invokestatic isTraceInProgress : ()Z
/*     */     //   532: ifeq -> 548
/*     */     //   535: invokestatic traceEventEnd : ()V
/*     */     //   538: goto -> 548
/*     */     //   541: aload #4
/*     */     //   543: invokeinterface skipToGroupEnd : ()V
/*     */     //   548: aload #4
/*     */     //   550: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   555: dup
/*     */     //   556: ifnull -> 585
/*     */     //   559: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffect$2
/*     */     //   562: dup
/*     */     //   563: aload_0
/*     */     //   564: aload_1
/*     */     //   565: aload_2
/*     */     //   566: aload_3
/*     */     //   567: iload #5
/*     */     //   569: iload #6
/*     */     //   571: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;II)V
/*     */     //   574: checkcast kotlin/jvm/functions/Function2
/*     */     //   577: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   582: goto -> 586
/*     */     //   585: pop
/*     */     //   586: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #199	-> 6
/*     */     //   #197	-> 269
/*     */     //   #760	-> 290
/*     */     //   #199	-> 368
/*     */     //   #200	-> 393
/*     */     //   #761	-> 422
/*     */     //   #762	-> 434
/*     */     //   #763	-> 450
/*     */     //   #201	-> 453
/*     */     //   #763	-> 466
/*     */     //   #764	-> 468
/*     */     //   #765	-> 477
/*     */     //   #766	-> 482
/*     */     //   #762	-> 484
/*     */     //   #761	-> 485
/*     */     //   #761	-> 486
/*     */     //   #200	-> 487
/*     */     //   #203	-> 503
/*     */     //   #204	-> 541
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   284	27	10	$i$f$getCurrent	I
/*     */     //   281	30	8	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   281	30	9	$changed$iv	I
/*     */     //   453	13	15	$i$a$-cache-LifecycleEffectKt$LifecycleStartEffect$lifecycleStartStopEffectScope$2	I
/*     */     //   468	11	16	value$iv	Ljava/lang/Object;
/*     */     //   434	51	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   431	54	13	it$iv	Ljava/lang/Object;
/*     */     //   422	65	12	$i$f$cache	I
/*     */     //   419	68	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   419	68	11	invalid$iv	Z
/*     */     //   503	35	8	lifecycleStartStopEffectScope	Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;
/*     */     //   28	559	7	$dirty	I
/*     */     //   0	587	0	key1	Ljava/lang/Object;
/*     */     //   0	587	1	key2	Ljava/lang/Object;
/*     */     //   0	587	2	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	587	3	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	587	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	587	5	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final void LifecycleStartEffect(@Nullable Object key1, @Nullable Object key2, @Nullable Object key3, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1 effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc 'effects'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #5
/*     */     //   9: ldc 574812561
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore #5
/*     */     //   18: aload #5
/*     */     //   20: ldc 'C(LifecycleStartEffect)P(1,2,3,4)261@12007L7,264@12144L114,267@12263L80:LifecycleEffect.kt#2vxrgp'
/*     */     //   22: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   25: iload #6
/*     */     //   27: istore #8
/*     */     //   29: iload #7
/*     */     //   31: iconst_1
/*     */     //   32: iand
/*     */     //   33: ifeq -> 46
/*     */     //   36: iload #8
/*     */     //   38: bipush #6
/*     */     //   40: ior
/*     */     //   41: istore #8
/*     */     //   43: goto -> 75
/*     */     //   46: iload #6
/*     */     //   48: bipush #6
/*     */     //   50: iand
/*     */     //   51: ifne -> 75
/*     */     //   54: iload #8
/*     */     //   56: aload #5
/*     */     //   58: aload_0
/*     */     //   59: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_4
/*     */     //   68: goto -> 72
/*     */     //   71: iconst_2
/*     */     //   72: ior
/*     */     //   73: istore #8
/*     */     //   75: iload #7
/*     */     //   77: iconst_2
/*     */     //   78: iand
/*     */     //   79: ifeq -> 92
/*     */     //   82: iload #8
/*     */     //   84: bipush #48
/*     */     //   86: ior
/*     */     //   87: istore #8
/*     */     //   89: goto -> 123
/*     */     //   92: iload #6
/*     */     //   94: bipush #48
/*     */     //   96: iand
/*     */     //   97: ifne -> 123
/*     */     //   100: iload #8
/*     */     //   102: aload #5
/*     */     //   104: aload_1
/*     */     //   105: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 118
/*     */     //   113: bipush #32
/*     */     //   115: goto -> 120
/*     */     //   118: bipush #16
/*     */     //   120: ior
/*     */     //   121: istore #8
/*     */     //   123: iload #7
/*     */     //   125: iconst_4
/*     */     //   126: iand
/*     */     //   127: ifeq -> 141
/*     */     //   130: iload #8
/*     */     //   132: sipush #384
/*     */     //   135: ior
/*     */     //   136: istore #8
/*     */     //   138: goto -> 175
/*     */     //   141: iload #6
/*     */     //   143: sipush #384
/*     */     //   146: iand
/*     */     //   147: ifne -> 175
/*     */     //   150: iload #8
/*     */     //   152: aload #5
/*     */     //   154: aload_2
/*     */     //   155: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   160: ifeq -> 169
/*     */     //   163: sipush #256
/*     */     //   166: goto -> 172
/*     */     //   169: sipush #128
/*     */     //   172: ior
/*     */     //   173: istore #8
/*     */     //   175: iload #6
/*     */     //   177: sipush #3072
/*     */     //   180: iand
/*     */     //   181: ifne -> 217
/*     */     //   184: iload #8
/*     */     //   186: iload #7
/*     */     //   188: bipush #8
/*     */     //   190: iand
/*     */     //   191: ifne -> 211
/*     */     //   194: aload #5
/*     */     //   196: aload_3
/*     */     //   197: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   202: ifeq -> 211
/*     */     //   205: sipush #2048
/*     */     //   208: goto -> 214
/*     */     //   211: sipush #1024
/*     */     //   214: ior
/*     */     //   215: istore #8
/*     */     //   217: iload #7
/*     */     //   219: bipush #16
/*     */     //   221: iand
/*     */     //   222: ifeq -> 236
/*     */     //   225: iload #8
/*     */     //   227: sipush #24576
/*     */     //   230: ior
/*     */     //   231: istore #8
/*     */     //   233: goto -> 271
/*     */     //   236: iload #6
/*     */     //   238: sipush #24576
/*     */     //   241: iand
/*     */     //   242: ifne -> 271
/*     */     //   245: iload #8
/*     */     //   247: aload #5
/*     */     //   249: aload #4
/*     */     //   251: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   256: ifeq -> 265
/*     */     //   259: sipush #16384
/*     */     //   262: goto -> 268
/*     */     //   265: sipush #8192
/*     */     //   268: ior
/*     */     //   269: istore #8
/*     */     //   271: iload #8
/*     */     //   273: sipush #9363
/*     */     //   276: iand
/*     */     //   277: sipush #9362
/*     */     //   280: if_icmpne -> 293
/*     */     //   283: aload #5
/*     */     //   285: invokeinterface getSkipping : ()Z
/*     */     //   290: ifne -> 611
/*     */     //   293: aload #5
/*     */     //   295: invokeinterface startDefaults : ()V
/*     */     //   300: iload #6
/*     */     //   302: iconst_1
/*     */     //   303: iand
/*     */     //   304: ifeq -> 317
/*     */     //   307: aload #5
/*     */     //   309: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   314: ifeq -> 382
/*     */     //   317: iload #7
/*     */     //   319: bipush #8
/*     */     //   321: iand
/*     */     //   322: ifeq -> 405
/*     */     //   325: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   328: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   331: astore #9
/*     */     //   333: bipush #6
/*     */     //   335: istore #10
/*     */     //   337: iconst_0
/*     */     //   338: istore #11
/*     */     //   340: aload #5
/*     */     //   342: ldc 2023513938
/*     */     //   344: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   346: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   349: aload #5
/*     */     //   351: aload #9
/*     */     //   353: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   358: astore #12
/*     */     //   360: aload #5
/*     */     //   362: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   365: aload #12
/*     */     //   367: checkcast androidx/lifecycle/LifecycleOwner
/*     */     //   370: astore_3
/*     */     //   371: iload #8
/*     */     //   373: sipush #-7169
/*     */     //   376: iand
/*     */     //   377: istore #8
/*     */     //   379: goto -> 405
/*     */     //   382: aload #5
/*     */     //   384: invokeinterface skipToGroupEnd : ()V
/*     */     //   389: iload #7
/*     */     //   391: bipush #8
/*     */     //   393: iand
/*     */     //   394: ifeq -> 405
/*     */     //   397: iload #8
/*     */     //   399: sipush #-7169
/*     */     //   402: iand
/*     */     //   403: istore #8
/*     */     //   405: aload #5
/*     */     //   407: invokeinterface endDefaults : ()V
/*     */     //   412: invokestatic isTraceInProgress : ()Z
/*     */     //   415: ifeq -> 429
/*     */     //   418: ldc 574812561
/*     */     //   420: iload #8
/*     */     //   422: iconst_m1
/*     */     //   423: ldc_w 'androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:263)'
/*     */     //   426: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   429: aload #5
/*     */     //   431: ldc_w -1877772704
/*     */     //   434: invokeinterface startReplaceableGroup : (I)V
/*     */     //   439: aload #5
/*     */     //   441: ldc 'CC(remember):LifecycleEffect.kt#9igjgp'
/*     */     //   443: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   446: aload #5
/*     */     //   448: astore #11
/*     */     //   450: aload #5
/*     */     //   452: aload_0
/*     */     //   453: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   458: aload #5
/*     */     //   460: aload_1
/*     */     //   461: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   466: ior
/*     */     //   467: aload #5
/*     */     //   469: aload_2
/*     */     //   470: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   475: ior
/*     */     //   476: aload #5
/*     */     //   478: aload_3
/*     */     //   479: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   484: ior
/*     */     //   485: istore #12
/*     */     //   487: iconst_0
/*     */     //   488: istore #13
/*     */     //   490: aload #11
/*     */     //   492: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   497: astore #14
/*     */     //   499: iconst_0
/*     */     //   500: istore #15
/*     */     //   502: iload #12
/*     */     //   504: ifne -> 518
/*     */     //   507: aload #14
/*     */     //   509: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   512: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   515: if_acmpne -> 550
/*     */     //   518: iconst_0
/*     */     //   519: istore #16
/*     */     //   521: new androidx/lifecycle/compose/LifecycleStartStopEffectScope
/*     */     //   524: dup
/*     */     //   525: aload_3
/*     */     //   526: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   531: invokespecial <init> : (Landroidx/lifecycle/Lifecycle;)V
/*     */     //   534: astore #17
/*     */     //   536: aload #11
/*     */     //   538: aload #17
/*     */     //   540: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   545: aload #17
/*     */     //   547: goto -> 552
/*     */     //   550: aload #14
/*     */     //   552: nop
/*     */     //   553: nop
/*     */     //   554: nop
/*     */     //   555: checkcast androidx/lifecycle/compose/LifecycleStartStopEffectScope
/*     */     //   558: astore #10
/*     */     //   560: aload #5
/*     */     //   562: invokeinterface endReplaceableGroup : ()V
/*     */     //   567: aload #10
/*     */     //   569: astore #9
/*     */     //   571: aload_3
/*     */     //   572: aload #9
/*     */     //   574: aload #4
/*     */     //   576: aload #5
/*     */     //   578: bipush #14
/*     */     //   580: iload #8
/*     */     //   582: bipush #9
/*     */     //   584: ishr
/*     */     //   585: iand
/*     */     //   586: sipush #896
/*     */     //   589: iload #8
/*     */     //   591: bipush #6
/*     */     //   593: ishr
/*     */     //   594: iand
/*     */     //   595: ior
/*     */     //   596: invokestatic LifecycleStartEffectImpl : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   599: invokestatic isTraceInProgress : ()Z
/*     */     //   602: ifeq -> 618
/*     */     //   605: invokestatic traceEventEnd : ()V
/*     */     //   608: goto -> 618
/*     */     //   611: aload #5
/*     */     //   613: invokeinterface skipToGroupEnd : ()V
/*     */     //   618: aload #5
/*     */     //   620: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   625: dup
/*     */     //   626: ifnull -> 657
/*     */     //   629: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffect$3
/*     */     //   632: dup
/*     */     //   633: aload_0
/*     */     //   634: aload_1
/*     */     //   635: aload_2
/*     */     //   636: aload_3
/*     */     //   637: aload #4
/*     */     //   639: iload #6
/*     */     //   641: iload #7
/*     */     //   643: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;II)V
/*     */     //   646: checkcast kotlin/jvm/functions/Function2
/*     */     //   649: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   654: goto -> 658
/*     */     //   657: pop
/*     */     //   658: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #264	-> 7
/*     */     //   #262	-> 325
/*     */     //   #767	-> 346
/*     */     //   #264	-> 426
/*     */     //   #265	-> 452
/*     */     //   #768	-> 490
/*     */     //   #769	-> 502
/*     */     //   #770	-> 518
/*     */     //   #266	-> 521
/*     */     //   #770	-> 534
/*     */     //   #771	-> 536
/*     */     //   #772	-> 545
/*     */     //   #773	-> 550
/*     */     //   #769	-> 552
/*     */     //   #768	-> 553
/*     */     //   #768	-> 554
/*     */     //   #265	-> 555
/*     */     //   #268	-> 571
/*     */     //   #269	-> 611
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   340	27	11	$i$f$getCurrent	I
/*     */     //   337	30	9	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   337	30	10	$changed$iv	I
/*     */     //   521	13	16	$i$a$-cache-LifecycleEffectKt$LifecycleStartEffect$lifecycleStartStopEffectScope$3	I
/*     */     //   536	11	17	value$iv	Ljava/lang/Object;
/*     */     //   502	51	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   499	54	14	it$iv	Ljava/lang/Object;
/*     */     //   490	65	13	$i$f$cache	I
/*     */     //   487	68	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   487	68	12	invalid$iv	Z
/*     */     //   571	37	9	lifecycleStartStopEffectScope	Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;
/*     */     //   29	630	8	$dirty	I
/*     */     //   0	659	0	key1	Ljava/lang/Object;
/*     */     //   0	659	1	key2	Ljava/lang/Object;
/*     */     //   0	659	2	key3	Ljava/lang/Object;
/*     */     //   0	659	3	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	659	4	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	659	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	659	6	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final void LifecycleStartEffect(@NotNull Object[] keys, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1 effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'keys'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc 'effects'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_3
/*     */     //   14: ldc_w -1510305724
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore_3
/*     */     //   23: aload_3
/*     */     //   24: ldc_w 'C(LifecycleStartEffect)P(1,2)325@15110L103,328@15218L80:LifecycleEffect.kt#2vxrgp'
/*     */     //   27: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   30: iload #4
/*     */     //   32: istore #6
/*     */     //   34: iload #4
/*     */     //   36: bipush #48
/*     */     //   38: iand
/*     */     //   39: ifne -> 71
/*     */     //   42: iload #6
/*     */     //   44: iload #5
/*     */     //   46: iconst_2
/*     */     //   47: iand
/*     */     //   48: ifne -> 66
/*     */     //   51: aload_3
/*     */     //   52: aload_1
/*     */     //   53: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 66
/*     */     //   61: bipush #32
/*     */     //   63: goto -> 68
/*     */     //   66: bipush #16
/*     */     //   68: ior
/*     */     //   69: istore #6
/*     */     //   71: iload #5
/*     */     //   73: iconst_4
/*     */     //   74: iand
/*     */     //   75: ifeq -> 89
/*     */     //   78: iload #6
/*     */     //   80: sipush #384
/*     */     //   83: ior
/*     */     //   84: istore #6
/*     */     //   86: goto -> 122
/*     */     //   89: iload #4
/*     */     //   91: sipush #384
/*     */     //   94: iand
/*     */     //   95: ifne -> 122
/*     */     //   98: iload #6
/*     */     //   100: aload_3
/*     */     //   101: aload_2
/*     */     //   102: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   107: ifeq -> 116
/*     */     //   110: sipush #256
/*     */     //   113: goto -> 119
/*     */     //   116: sipush #128
/*     */     //   119: ior
/*     */     //   120: istore #6
/*     */     //   122: aload_3
/*     */     //   123: ldc_w -1877684705
/*     */     //   126: aload_0
/*     */     //   127: arraylength
/*     */     //   128: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   131: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*     */     //   136: aload_3
/*     */     //   137: ldc_w '322@14973L7'
/*     */     //   140: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   143: iconst_0
/*     */     //   144: istore #7
/*     */     //   146: aload_0
/*     */     //   147: arraylength
/*     */     //   148: istore #8
/*     */     //   150: iload #7
/*     */     //   152: iload #8
/*     */     //   154: if_icmpge -> 190
/*     */     //   157: aload_0
/*     */     //   158: iload #7
/*     */     //   160: aaload
/*     */     //   161: astore #9
/*     */     //   163: iload #6
/*     */     //   165: aload_3
/*     */     //   166: aload #9
/*     */     //   168: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   173: ifeq -> 180
/*     */     //   176: iconst_4
/*     */     //   177: goto -> 181
/*     */     //   180: iconst_0
/*     */     //   181: ior
/*     */     //   182: istore #6
/*     */     //   184: iinc #7, 1
/*     */     //   187: goto -> 150
/*     */     //   190: aload_3
/*     */     //   191: invokeinterface endMovableGroup : ()V
/*     */     //   196: iload #6
/*     */     //   198: bipush #14
/*     */     //   200: iand
/*     */     //   201: ifne -> 210
/*     */     //   204: iload #6
/*     */     //   206: iconst_2
/*     */     //   207: ior
/*     */     //   208: istore #6
/*     */     //   210: iload #6
/*     */     //   212: sipush #147
/*     */     //   215: iand
/*     */     //   216: sipush #146
/*     */     //   219: if_icmpne -> 231
/*     */     //   222: aload_3
/*     */     //   223: invokeinterface getSkipping : ()Z
/*     */     //   228: ifne -> 581
/*     */     //   231: aload_3
/*     */     //   232: invokeinterface startDefaults : ()V
/*     */     //   237: iload #4
/*     */     //   239: iconst_1
/*     */     //   240: iand
/*     */     //   241: ifeq -> 253
/*     */     //   244: aload_3
/*     */     //   245: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   250: ifeq -> 313
/*     */     //   253: iload #5
/*     */     //   255: iconst_2
/*     */     //   256: iand
/*     */     //   257: ifeq -> 333
/*     */     //   260: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   263: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   266: astore #7
/*     */     //   268: bipush #6
/*     */     //   270: istore #8
/*     */     //   272: iconst_0
/*     */     //   273: istore #9
/*     */     //   275: aload_3
/*     */     //   276: ldc 2023513938
/*     */     //   278: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   280: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   283: aload_3
/*     */     //   284: aload #7
/*     */     //   286: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   291: astore #10
/*     */     //   293: aload_3
/*     */     //   294: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   297: aload #10
/*     */     //   299: checkcast androidx/lifecycle/LifecycleOwner
/*     */     //   302: astore_1
/*     */     //   303: iload #6
/*     */     //   305: bipush #-113
/*     */     //   307: iand
/*     */     //   308: istore #6
/*     */     //   310: goto -> 333
/*     */     //   313: aload_3
/*     */     //   314: invokeinterface skipToGroupEnd : ()V
/*     */     //   319: iload #5
/*     */     //   321: iconst_2
/*     */     //   322: iand
/*     */     //   323: ifeq -> 333
/*     */     //   326: iload #6
/*     */     //   328: bipush #-113
/*     */     //   330: iand
/*     */     //   331: istore #6
/*     */     //   333: aload_3
/*     */     //   334: invokeinterface endDefaults : ()V
/*     */     //   339: invokestatic isTraceInProgress : ()Z
/*     */     //   342: ifeq -> 357
/*     */     //   345: ldc_w -1510305724
/*     */     //   348: iload #6
/*     */     //   350: iconst_m1
/*     */     //   351: ldc_w 'androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:324)'
/*     */     //   354: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   357: new kotlin/jvm/internal/SpreadBuilder
/*     */     //   360: dup
/*     */     //   361: iconst_2
/*     */     //   362: invokespecial <init> : (I)V
/*     */     //   365: astore #8
/*     */     //   367: aload #8
/*     */     //   369: aload_0
/*     */     //   370: invokevirtual addSpread : (Ljava/lang/Object;)V
/*     */     //   373: aload #8
/*     */     //   375: aload_1
/*     */     //   376: invokevirtual add : (Ljava/lang/Object;)V
/*     */     //   379: aload #8
/*     */     //   381: aload #8
/*     */     //   383: invokevirtual size : ()I
/*     */     //   386: anewarray java/lang/Object
/*     */     //   389: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*     */     //   392: astore #8
/*     */     //   394: iconst_0
/*     */     //   395: istore #9
/*     */     //   397: iconst_0
/*     */     //   398: istore #10
/*     */     //   400: aload_3
/*     */     //   401: ldc_w -568225417
/*     */     //   404: invokeinterface startReplaceableGroup : (I)V
/*     */     //   409: aload_3
/*     */     //   410: ldc_w 'CC(remember)P(1):Composables.kt#9igjgp'
/*     */     //   413: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   416: iconst_0
/*     */     //   417: istore #11
/*     */     //   419: iconst_0
/*     */     //   420: istore #12
/*     */     //   422: aload #8
/*     */     //   424: arraylength
/*     */     //   425: istore #13
/*     */     //   427: iload #12
/*     */     //   429: iload #13
/*     */     //   431: if_icmpge -> 460
/*     */     //   434: aload #8
/*     */     //   436: iload #12
/*     */     //   438: aaload
/*     */     //   439: astore #14
/*     */     //   441: iload #11
/*     */     //   443: aload_3
/*     */     //   444: aload #14
/*     */     //   446: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   451: ior
/*     */     //   452: istore #11
/*     */     //   454: iinc #12, 1
/*     */     //   457: goto -> 427
/*     */     //   460: aload_3
/*     */     //   461: astore #13
/*     */     //   463: nop
/*     */     //   464: iconst_0
/*     */     //   465: istore #14
/*     */     //   467: aload #13
/*     */     //   469: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   474: astore #15
/*     */     //   476: iconst_0
/*     */     //   477: istore #16
/*     */     //   479: iload #11
/*     */     //   481: ifne -> 495
/*     */     //   484: aload #15
/*     */     //   486: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   489: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   492: if_acmpne -> 527
/*     */     //   495: iconst_0
/*     */     //   496: istore #17
/*     */     //   498: new androidx/lifecycle/compose/LifecycleStartStopEffectScope
/*     */     //   501: dup
/*     */     //   502: aload_1
/*     */     //   503: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   508: invokespecial <init> : (Landroidx/lifecycle/Lifecycle;)V
/*     */     //   511: astore #18
/*     */     //   513: aload #13
/*     */     //   515: aload #18
/*     */     //   517: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   522: aload #18
/*     */     //   524: goto -> 529
/*     */     //   527: aload #15
/*     */     //   529: nop
/*     */     //   530: nop
/*     */     //   531: nop
/*     */     //   532: astore #12
/*     */     //   534: aload_3
/*     */     //   535: invokeinterface endReplaceableGroup : ()V
/*     */     //   540: aload #12
/*     */     //   542: checkcast androidx/lifecycle/compose/LifecycleStartStopEffectScope
/*     */     //   545: astore #7
/*     */     //   547: aload_1
/*     */     //   548: aload #7
/*     */     //   550: aload_2
/*     */     //   551: aload_3
/*     */     //   552: bipush #14
/*     */     //   554: iload #6
/*     */     //   556: iconst_3
/*     */     //   557: ishr
/*     */     //   558: iand
/*     */     //   559: sipush #896
/*     */     //   562: iload #6
/*     */     //   564: iand
/*     */     //   565: ior
/*     */     //   566: invokestatic LifecycleStartEffectImpl : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   569: invokestatic isTraceInProgress : ()Z
/*     */     //   572: ifeq -> 587
/*     */     //   575: invokestatic traceEventEnd : ()V
/*     */     //   578: goto -> 587
/*     */     //   581: aload_3
/*     */     //   582: invokeinterface skipToGroupEnd : ()V
/*     */     //   587: aload_3
/*     */     //   588: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   593: dup
/*     */     //   594: ifnull -> 622
/*     */     //   597: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffect$4
/*     */     //   600: dup
/*     */     //   601: aload_0
/*     */     //   602: aload_1
/*     */     //   603: aload_2
/*     */     //   604: iload #4
/*     */     //   606: iload #5
/*     */     //   608: invokespecial <init> : ([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;II)V
/*     */     //   611: checkcast kotlin/jvm/functions/Function2
/*     */     //   614: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   619: goto -> 623
/*     */     //   622: pop
/*     */     //   623: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #325	-> 13
/*     */     //   #322	-> 131
/*     */     //   #325	-> 210
/*     */     //   #323	-> 260
/*     */     //   #774	-> 280
/*     */     //   #325	-> 354
/*     */     //   #326	-> 357
/*     */     //   #775	-> 416
/*     */     //   #776	-> 419
/*     */     //   #777	-> 463
/*     */     //   #778	-> 467
/*     */     //   #779	-> 479
/*     */     //   #780	-> 495
/*     */     //   #327	-> 498
/*     */     //   #780	-> 511
/*     */     //   #781	-> 513
/*     */     //   #782	-> 522
/*     */     //   #783	-> 527
/*     */     //   #779	-> 529
/*     */     //   #778	-> 530
/*     */     //   #778	-> 531
/*     */     //   #777	-> 532
/*     */     //   #326	-> 542
/*     */     //   #329	-> 547
/*     */     //   #330	-> 581
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   163	21	9	value	Ljava/lang/Object;
/*     */     //   275	24	9	$i$f$getCurrent	I
/*     */     //   272	27	7	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   272	27	8	$changed$iv	I
/*     */     //   498	13	17	$i$a$-remember-LifecycleEffectKt$LifecycleStartEffect$lifecycleStartStopEffectScope$4	I
/*     */     //   441	13	14	key$iv	Ljava/lang/Object;
/*     */     //   513	11	18	value$iv$iv	Ljava/lang/Object;
/*     */     //   479	51	16	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   476	54	15	it$iv$iv	Ljava/lang/Object;
/*     */     //   467	65	14	$i$f$cache	I
/*     */     //   464	68	13	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   400	142	10	$i$f$remember	I
/*     */     //   419	123	11	invalid$iv	Z
/*     */     //   397	145	8	keys$iv	[Ljava/lang/Object;
/*     */     //   397	145	9	$changed$iv	I
/*     */     //   547	31	7	lifecycleStartStopEffectScope	Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;
/*     */     //   34	590	6	$dirty	I
/*     */     //   0	624	0	keys	[Ljava/lang/Object;
/*     */     //   0	624	1	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	624	2	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	624	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	624	4	$changed	I
/*     */   }
/*     */   
/*     */   @Deprecated(message = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.", level = DeprecationLevel.ERROR)
/*     */   @Composable
/*     */   public static final void LifecycleStartEffect(@Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     Intrinsics.checkNotNullParameter(effects, "effects");
/*     */     $composer = $composer.startRestartGroup(-50807951);
/*     */     ComposerKt.sourceInformation($composer, "C(LifecycleStartEffect)P(1)348@16079L7:LifecycleEffect.kt#2vxrgp");
/*     */     int $dirty = $changed;
/*     */     if (($dirty & 0x1) != 0 || !$composer.getSkipping()) {
/*     */       $composer.startDefaults();
/*     */       if (($changed & 0x1) == 0 || $composer.getDefaultsInvalid()) {
/*     */         if ((paramInt1 & 0x1) != 0) {
/*     */           CompositionLocal compositionLocal = (CompositionLocal)LocalLifecycleOwnerKt.getLocalLifecycleOwner();
/*     */           int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*     */           Object object = $composer.consume(compositionLocal);
/*     */           ComposerKt.sourceInformationMarkerEnd($composer);
/*     */           lifecycleOwner = (LifecycleOwner)object;
/*     */           $dirty &= 0xFFFFFFF1;
/*     */         } 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */         if ((paramInt1 & 0x1) != 0)
/*     */           $dirty &= 0xFFFFFFF1; 
/*     */       } 
/*     */       $composer.endDefaults();
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-50807951, $dirty, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:350)"); 
/*     */       throw new IllegalStateException("LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString());
/*     */     } 
/*     */     $composer.skipToGroupEnd();
/*     */     if ($composer.endRestartGroup() != null) {
/*     */       $composer.endRestartGroup().updateScope(new LifecycleEffectKt$LifecycleStartEffect$5(lifecycleOwner, effects, $changed, paramInt1));
/*     */     } else {
/*     */       $composer.endRestartGroup();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final void LifecycleStartEffectImpl(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope scope, Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> effects, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc_w 228371534
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore_3
/*     */     //   10: aload_3
/*     */     //   11: ldc_w 'C(LifecycleStartEffectImpl)P(1,2)358@16483L661,358@16443L701:LifecycleEffect.kt#2vxrgp'
/*     */     //   14: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   17: iload #4
/*     */     //   19: istore #5
/*     */     //   21: iload #4
/*     */     //   23: bipush #6
/*     */     //   25: iand
/*     */     //   26: ifne -> 49
/*     */     //   29: iload #5
/*     */     //   31: aload_3
/*     */     //   32: aload_0
/*     */     //   33: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   38: ifeq -> 45
/*     */     //   41: iconst_4
/*     */     //   42: goto -> 46
/*     */     //   45: iconst_2
/*     */     //   46: ior
/*     */     //   47: istore #5
/*     */     //   49: iload #4
/*     */     //   51: bipush #48
/*     */     //   53: iand
/*     */     //   54: ifne -> 79
/*     */     //   57: iload #5
/*     */     //   59: aload_3
/*     */     //   60: aload_1
/*     */     //   61: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   66: ifeq -> 74
/*     */     //   69: bipush #32
/*     */     //   71: goto -> 76
/*     */     //   74: bipush #16
/*     */     //   76: ior
/*     */     //   77: istore #5
/*     */     //   79: iload #4
/*     */     //   81: sipush #384
/*     */     //   84: iand
/*     */     //   85: ifne -> 112
/*     */     //   88: iload #5
/*     */     //   90: aload_3
/*     */     //   91: aload_2
/*     */     //   92: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   97: ifeq -> 106
/*     */     //   100: sipush #256
/*     */     //   103: goto -> 109
/*     */     //   106: sipush #128
/*     */     //   109: ior
/*     */     //   110: istore #5
/*     */     //   112: iload #5
/*     */     //   114: sipush #147
/*     */     //   117: iand
/*     */     //   118: sipush #146
/*     */     //   121: if_icmpne -> 133
/*     */     //   124: aload_3
/*     */     //   125: invokeinterface getSkipping : ()Z
/*     */     //   130: ifne -> 326
/*     */     //   133: invokestatic isTraceInProgress : ()Z
/*     */     //   136: ifeq -> 151
/*     */     //   139: ldc_w 228371534
/*     */     //   142: iload #5
/*     */     //   144: iconst_m1
/*     */     //   145: ldc_w 'androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:357)'
/*     */     //   148: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   151: aload_0
/*     */     //   152: aload_1
/*     */     //   153: aload_3
/*     */     //   154: ldc_w -1076218333
/*     */     //   157: invokeinterface startReplaceableGroup : (I)V
/*     */     //   162: aload_3
/*     */     //   163: ldc 'CC(remember):LifecycleEffect.kt#9igjgp'
/*     */     //   165: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   168: aload_3
/*     */     //   169: astore #7
/*     */     //   171: aload_3
/*     */     //   172: aload_1
/*     */     //   173: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   178: iload #5
/*     */     //   180: sipush #896
/*     */     //   183: iand
/*     */     //   184: sipush #256
/*     */     //   187: if_icmpne -> 194
/*     */     //   190: iconst_1
/*     */     //   191: goto -> 195
/*     */     //   194: iconst_0
/*     */     //   195: ior
/*     */     //   196: aload_3
/*     */     //   197: aload_0
/*     */     //   198: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   203: ior
/*     */     //   204: istore #8
/*     */     //   206: iconst_0
/*     */     //   207: istore #9
/*     */     //   209: aload #7
/*     */     //   211: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   216: astore #10
/*     */     //   218: iconst_0
/*     */     //   219: istore #11
/*     */     //   221: iload #8
/*     */     //   223: ifne -> 237
/*     */     //   226: aload #10
/*     */     //   228: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   231: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   234: if_acmpne -> 281
/*     */     //   237: astore #15
/*     */     //   239: astore #14
/*     */     //   241: iconst_0
/*     */     //   242: istore #12
/*     */     //   244: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1
/*     */     //   247: dup
/*     */     //   248: aload_0
/*     */     //   249: aload_1
/*     */     //   250: aload_2
/*     */     //   251: invokespecial <init> : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;)V
/*     */     //   254: checkcast kotlin/jvm/functions/Function1
/*     */     //   257: astore #16
/*     */     //   259: aload #14
/*     */     //   261: aload #15
/*     */     //   263: aload #16
/*     */     //   265: astore #13
/*     */     //   267: aload #7
/*     */     //   269: aload #13
/*     */     //   271: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   276: aload #13
/*     */     //   278: goto -> 283
/*     */     //   281: aload #10
/*     */     //   283: nop
/*     */     //   284: nop
/*     */     //   285: nop
/*     */     //   286: checkcast kotlin/jvm/functions/Function1
/*     */     //   289: astore #6
/*     */     //   291: aload_3
/*     */     //   292: invokeinterface endReplaceableGroup : ()V
/*     */     //   297: aload #6
/*     */     //   299: aload_3
/*     */     //   300: bipush #14
/*     */     //   302: iload #5
/*     */     //   304: iand
/*     */     //   305: bipush #112
/*     */     //   307: iload #5
/*     */     //   309: iand
/*     */     //   310: ior
/*     */     //   311: invokestatic DisposableEffect : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   314: invokestatic isTraceInProgress : ()Z
/*     */     //   317: ifeq -> 332
/*     */     //   320: invokestatic traceEventEnd : ()V
/*     */     //   323: goto -> 332
/*     */     //   326: aload_3
/*     */     //   327: invokeinterface skipToGroupEnd : ()V
/*     */     //   332: aload_3
/*     */     //   333: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   338: dup
/*     */     //   339: ifnull -> 365
/*     */     //   342: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$2
/*     */     //   345: dup
/*     */     //   346: aload_0
/*     */     //   347: aload_1
/*     */     //   348: aload_2
/*     */     //   349: iload #4
/*     */     //   351: invokespecial <init> : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;I)V
/*     */     //   354: checkcast kotlin/jvm/functions/Function2
/*     */     //   357: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   362: goto -> 366
/*     */     //   365: pop
/*     */     //   366: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #358	-> 0
/*     */     //   #359	-> 151
/*     */     //   #785	-> 209
/*     */     //   #786	-> 221
/*     */     //   #787	-> 237
/*     */     //   #359	-> 244
/*     */     //   #787	-> 265
/*     */     //   #788	-> 267
/*     */     //   #789	-> 276
/*     */     //   #790	-> 281
/*     */     //   #786	-> 283
/*     */     //   #785	-> 284
/*     */     //   #785	-> 285
/*     */     //   #359	-> 286
/*     */     //   #379	-> 326
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   244	13	12	$i$a$-cache-LifecycleEffectKt$LifecycleStartEffectImpl$1	I
/*     */     //   267	11	13	value$iv	Ljava/lang/Object;
/*     */     //   221	63	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   218	66	10	it$iv	Ljava/lang/Object;
/*     */     //   209	77	9	$i$f$cache	I
/*     */     //   206	80	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   206	80	8	invalid$iv	Z
/*     */     //   21	346	5	$dirty	I
/*     */     //   0	367	0	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	367	1	scope	Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;
/*     */     //   0	367	2	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	367	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	367	4	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,745:1\n63#2,5:746\n1#3:751\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1\n*L\n374#1:746,5\n*E\n"})
/*     */   static final class LifecycleEffectKt$LifecycleStartEffectImpl$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/*     */     @NotNull
/*     */     public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$DisposableEffect'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: new kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   9: dup
/*     */       //   10: invokespecial <init> : ()V
/*     */       //   13: astore_2
/*     */       //   14: aload_0
/*     */       //   15: getfield $scope : Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;
/*     */       //   18: aload_2
/*     */       //   19: aload_0
/*     */       //   20: getfield $effects : Lkotlin/jvm/functions/Function1;
/*     */       //   23: <illegal opcode> onStateChanged : (Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LifecycleEventObserver;
/*     */       //   28: astore_3
/*     */       //   29: aload_0
/*     */       //   30: getfield $lifecycleOwner : Landroidx/lifecycle/LifecycleOwner;
/*     */       //   33: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */       //   38: aload_3
/*     */       //   39: checkcast androidx/lifecycle/LifecycleObserver
/*     */       //   42: invokevirtual addObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*     */       //   45: aload_1
/*     */       //   46: astore #4
/*     */       //   48: aload_0
/*     */       //   49: getfield $lifecycleOwner : Landroidx/lifecycle/LifecycleOwner;
/*     */       //   52: astore #5
/*     */       //   54: iconst_0
/*     */       //   55: istore #6
/*     */       //   57: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1$invoke$$inlined$onDispose$1
/*     */       //   60: dup
/*     */       //   61: aload #5
/*     */       //   63: aload_3
/*     */       //   64: aload_2
/*     */       //   65: invokespecial <init> : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/LifecycleEventObserver;Lkotlin/jvm/internal/Ref$ObjectRef;)V
/*     */       //   68: checkcast androidx/compose/runtime/DisposableEffectResult
/*     */       //   71: nop
/*     */       //   72: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #360	-> 6
/*     */       //   #361	-> 14
/*     */       //   #372	-> 29
/*     */       //   #374	-> 45
/*     */       //   #746	-> 57
/*     */       //   #750	-> 71
/*     */       //   #374	-> 72
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   57	15	6	$i$f$onDispose	I
/*     */       //   54	18	4	this_$iv	Landroidx/compose/runtime/DisposableEffectScope;
/*     */       //   14	59	2	effectResult	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   29	44	3	observer	Landroidx/lifecycle/LifecycleEventObserver;
/*     */       //   0	73	0	this	Landroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1;
/*     */       //   0	73	1	$this$DisposableEffect	Landroidx/compose/runtime/DisposableEffectScope;
/*     */     }
/*     */     
/*     */     private static final void invoke$lambda$1(LifecycleStartStopEffectScope $scope, Ref.ObjectRef $effectResult, Function1 $effects, LifecycleOwner param1LifecycleOwner, Lifecycle.Event event) {
/*     */       LifecycleStartStopEffectScope $this$invoke_u24lambda_u241_u24lambda_u240;
/*     */       int $i$a$-with-LifecycleEffectKt$LifecycleStartEffectImpl$1$1$observer$1$1;
/*     */       Intrinsics.checkNotNullParameter($scope, "$scope");
/*     */       Intrinsics.checkNotNullParameter($effectResult, "$effectResult");
/*     */       Intrinsics.checkNotNullParameter($effects, "$effects");
/*     */       Intrinsics.checkNotNullParameter(param1LifecycleOwner, "<anonymous parameter 0>");
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
/*     */         case 1:
/*     */           $this$invoke_u24lambda_u241_u24lambda_u240 = $scope;
/*     */           $i$a$-with-LifecycleEffectKt$LifecycleStartEffectImpl$1$1$observer$1$1 = 0;
/*     */           $effectResult.element = $effects.invoke($this$invoke_u24lambda_u241_u24lambda_u240);
/*     */           break;
/*     */         case 2:
/*     */           if ((LifecycleStopOrDisposeEffectResult)$effectResult.element != null) {
/*     */             ((LifecycleStopOrDisposeEffectResult)$effectResult.element).runStopOrDisposeEffect();
/*     */           } else {
/*     */             (LifecycleStopOrDisposeEffectResult)$effectResult.element;
/*     */           } 
/*     */           $effectResult.element = null;
/*     */           break;
/*     */       } 
/*     */     }
/*     */     
/*     */     LifecycleEffectKt$LifecycleStartEffectImpl$1$1(LifecycleOwner $lifecycleOwner, LifecycleStartStopEffectScope $scope, Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final void LifecycleResumeEffect(@Nullable Object key1, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1 effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'effects'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc_w 1220373486
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore_3
/*     */     //   16: aload_3
/*     */     //   17: ldc_w 'C(LifecycleResumeEffect)P(1,2)465@21161L7,468@21303L104,471@21412L83:LifecycleEffect.kt#2vxrgp'
/*     */     //   20: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   23: iload #4
/*     */     //   25: istore #6
/*     */     //   27: iload #5
/*     */     //   29: iconst_1
/*     */     //   30: iand
/*     */     //   31: ifeq -> 44
/*     */     //   34: iload #6
/*     */     //   36: bipush #6
/*     */     //   38: ior
/*     */     //   39: istore #6
/*     */     //   41: goto -> 72
/*     */     //   44: iload #4
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 72
/*     */     //   52: iload #6
/*     */     //   54: aload_3
/*     */     //   55: aload_0
/*     */     //   56: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   61: ifeq -> 68
/*     */     //   64: iconst_4
/*     */     //   65: goto -> 69
/*     */     //   68: iconst_2
/*     */     //   69: ior
/*     */     //   70: istore #6
/*     */     //   72: iload #4
/*     */     //   74: bipush #48
/*     */     //   76: iand
/*     */     //   77: ifne -> 109
/*     */     //   80: iload #6
/*     */     //   82: iload #5
/*     */     //   84: iconst_2
/*     */     //   85: iand
/*     */     //   86: ifne -> 104
/*     */     //   89: aload_3
/*     */     //   90: aload_1
/*     */     //   91: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   96: ifeq -> 104
/*     */     //   99: bipush #32
/*     */     //   101: goto -> 106
/*     */     //   104: bipush #16
/*     */     //   106: ior
/*     */     //   107: istore #6
/*     */     //   109: iload #5
/*     */     //   111: iconst_4
/*     */     //   112: iand
/*     */     //   113: ifeq -> 127
/*     */     //   116: iload #6
/*     */     //   118: sipush #384
/*     */     //   121: ior
/*     */     //   122: istore #6
/*     */     //   124: goto -> 160
/*     */     //   127: iload #4
/*     */     //   129: sipush #384
/*     */     //   132: iand
/*     */     //   133: ifne -> 160
/*     */     //   136: iload #6
/*     */     //   138: aload_3
/*     */     //   139: aload_2
/*     */     //   140: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   145: ifeq -> 154
/*     */     //   148: sipush #256
/*     */     //   151: goto -> 157
/*     */     //   154: sipush #128
/*     */     //   157: ior
/*     */     //   158: istore #6
/*     */     //   160: iload #6
/*     */     //   162: sipush #147
/*     */     //   165: iand
/*     */     //   166: sipush #146
/*     */     //   169: if_icmpne -> 181
/*     */     //   172: aload_3
/*     */     //   173: invokeinterface getSkipping : ()Z
/*     */     //   178: ifne -> 459
/*     */     //   181: aload_3
/*     */     //   182: invokeinterface startDefaults : ()V
/*     */     //   187: iload #4
/*     */     //   189: iconst_1
/*     */     //   190: iand
/*     */     //   191: ifeq -> 203
/*     */     //   194: aload_3
/*     */     //   195: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   200: ifeq -> 263
/*     */     //   203: iload #5
/*     */     //   205: iconst_2
/*     */     //   206: iand
/*     */     //   207: ifeq -> 283
/*     */     //   210: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   213: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   216: astore #7
/*     */     //   218: bipush #6
/*     */     //   220: istore #8
/*     */     //   222: iconst_0
/*     */     //   223: istore #9
/*     */     //   225: aload_3
/*     */     //   226: ldc 2023513938
/*     */     //   228: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   230: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   233: aload_3
/*     */     //   234: aload #7
/*     */     //   236: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   241: astore #10
/*     */     //   243: aload_3
/*     */     //   244: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   247: aload #10
/*     */     //   249: checkcast androidx/lifecycle/LifecycleOwner
/*     */     //   252: astore_1
/*     */     //   253: iload #6
/*     */     //   255: bipush #-113
/*     */     //   257: iand
/*     */     //   258: istore #6
/*     */     //   260: goto -> 283
/*     */     //   263: aload_3
/*     */     //   264: invokeinterface skipToGroupEnd : ()V
/*     */     //   269: iload #5
/*     */     //   271: iconst_2
/*     */     //   272: iand
/*     */     //   273: ifeq -> 283
/*     */     //   276: iload #6
/*     */     //   278: bipush #-113
/*     */     //   280: iand
/*     */     //   281: istore #6
/*     */     //   283: aload_3
/*     */     //   284: invokeinterface endDefaults : ()V
/*     */     //   289: invokestatic isTraceInProgress : ()Z
/*     */     //   292: ifeq -> 307
/*     */     //   295: ldc_w 1220373486
/*     */     //   298: iload #6
/*     */     //   300: iconst_m1
/*     */     //   301: ldc_w 'androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:467)'
/*     */     //   304: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   307: aload_3
/*     */     //   308: ldc_w 1469999915
/*     */     //   311: invokeinterface startReplaceableGroup : (I)V
/*     */     //   316: aload_3
/*     */     //   317: ldc 'CC(remember):LifecycleEffect.kt#9igjgp'
/*     */     //   319: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   322: aload_3
/*     */     //   323: astore #9
/*     */     //   325: aload_3
/*     */     //   326: aload_0
/*     */     //   327: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   332: aload_3
/*     */     //   333: aload_1
/*     */     //   334: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   339: ior
/*     */     //   340: istore #10
/*     */     //   342: iconst_0
/*     */     //   343: istore #11
/*     */     //   345: aload #9
/*     */     //   347: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   352: astore #12
/*     */     //   354: iconst_0
/*     */     //   355: istore #13
/*     */     //   357: iload #10
/*     */     //   359: ifne -> 373
/*     */     //   362: aload #12
/*     */     //   364: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   367: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   370: if_acmpne -> 405
/*     */     //   373: iconst_0
/*     */     //   374: istore #14
/*     */     //   376: new androidx/lifecycle/compose/LifecycleResumePauseEffectScope
/*     */     //   379: dup
/*     */     //   380: aload_1
/*     */     //   381: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   386: invokespecial <init> : (Landroidx/lifecycle/Lifecycle;)V
/*     */     //   389: astore #15
/*     */     //   391: aload #9
/*     */     //   393: aload #15
/*     */     //   395: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   400: aload #15
/*     */     //   402: goto -> 407
/*     */     //   405: aload #12
/*     */     //   407: nop
/*     */     //   408: nop
/*     */     //   409: nop
/*     */     //   410: checkcast androidx/lifecycle/compose/LifecycleResumePauseEffectScope
/*     */     //   413: astore #8
/*     */     //   415: aload_3
/*     */     //   416: invokeinterface endReplaceableGroup : ()V
/*     */     //   421: aload #8
/*     */     //   423: astore #7
/*     */     //   425: aload_1
/*     */     //   426: aload #7
/*     */     //   428: aload_2
/*     */     //   429: aload_3
/*     */     //   430: bipush #14
/*     */     //   432: iload #6
/*     */     //   434: iconst_3
/*     */     //   435: ishr
/*     */     //   436: iand
/*     */     //   437: sipush #896
/*     */     //   440: iload #6
/*     */     //   442: iand
/*     */     //   443: ior
/*     */     //   444: invokestatic LifecycleResumeEffectImpl : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   447: invokestatic isTraceInProgress : ()Z
/*     */     //   450: ifeq -> 465
/*     */     //   453: invokestatic traceEventEnd : ()V
/*     */     //   456: goto -> 465
/*     */     //   459: aload_3
/*     */     //   460: invokeinterface skipToGroupEnd : ()V
/*     */     //   465: aload_3
/*     */     //   466: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   471: dup
/*     */     //   472: ifnull -> 500
/*     */     //   475: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffect$1
/*     */     //   478: dup
/*     */     //   479: aload_0
/*     */     //   480: aload_1
/*     */     //   481: aload_2
/*     */     //   482: iload #4
/*     */     //   484: iload #5
/*     */     //   486: invokespecial <init> : (Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;II)V
/*     */     //   489: checkcast kotlin/jvm/functions/Function2
/*     */     //   492: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   497: goto -> 501
/*     */     //   500: pop
/*     */     //   501: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #468	-> 6
/*     */     //   #466	-> 210
/*     */     //   #791	-> 230
/*     */     //   #468	-> 304
/*     */     //   #469	-> 326
/*     */     //   #792	-> 345
/*     */     //   #793	-> 357
/*     */     //   #794	-> 373
/*     */     //   #470	-> 376
/*     */     //   #794	-> 389
/*     */     //   #795	-> 391
/*     */     //   #796	-> 400
/*     */     //   #797	-> 405
/*     */     //   #793	-> 407
/*     */     //   #792	-> 408
/*     */     //   #792	-> 409
/*     */     //   #469	-> 410
/*     */     //   #472	-> 425
/*     */     //   #473	-> 459
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   225	24	9	$i$f$getCurrent	I
/*     */     //   222	27	7	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   222	27	8	$changed$iv	I
/*     */     //   376	13	14	$i$a$-cache-LifecycleEffectKt$LifecycleResumeEffect$lifecycleResumePauseEffectScope$1	I
/*     */     //   391	11	15	value$iv	Ljava/lang/Object;
/*     */     //   357	51	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   354	54	12	it$iv	Ljava/lang/Object;
/*     */     //   345	65	11	$i$f$cache	I
/*     */     //   342	68	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   342	68	10	invalid$iv	Z
/*     */     //   425	31	7	lifecycleResumePauseEffectScope	Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;
/*     */     //   27	475	6	$dirty	I
/*     */     //   0	502	0	key1	Ljava/lang/Object;
/*     */     //   0	502	1	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	502	2	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	502	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	502	4	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final void LifecycleResumeEffect(@Nullable Object key1, @Nullable Object key2, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1 effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc 'effects'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #4
/*     */     //   8: ldc_w 752680142
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore #4
/*     */     //   18: aload #4
/*     */     //   20: ldc_w 'C(LifecycleResumeEffect)P(1,2,3)528@24243L7,531@24385L110,534@24500L83:LifecycleEffect.kt#2vxrgp'
/*     */     //   23: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   26: iload #5
/*     */     //   28: istore #7
/*     */     //   30: iload #6
/*     */     //   32: iconst_1
/*     */     //   33: iand
/*     */     //   34: ifeq -> 47
/*     */     //   37: iload #7
/*     */     //   39: bipush #6
/*     */     //   41: ior
/*     */     //   42: istore #7
/*     */     //   44: goto -> 76
/*     */     //   47: iload #5
/*     */     //   49: bipush #6
/*     */     //   51: iand
/*     */     //   52: ifne -> 76
/*     */     //   55: iload #7
/*     */     //   57: aload #4
/*     */     //   59: aload_0
/*     */     //   60: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   65: ifeq -> 72
/*     */     //   68: iconst_4
/*     */     //   69: goto -> 73
/*     */     //   72: iconst_2
/*     */     //   73: ior
/*     */     //   74: istore #7
/*     */     //   76: iload #6
/*     */     //   78: iconst_2
/*     */     //   79: iand
/*     */     //   80: ifeq -> 93
/*     */     //   83: iload #7
/*     */     //   85: bipush #48
/*     */     //   87: ior
/*     */     //   88: istore #7
/*     */     //   90: goto -> 124
/*     */     //   93: iload #5
/*     */     //   95: bipush #48
/*     */     //   97: iand
/*     */     //   98: ifne -> 124
/*     */     //   101: iload #7
/*     */     //   103: aload #4
/*     */     //   105: aload_1
/*     */     //   106: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   111: ifeq -> 119
/*     */     //   114: bipush #32
/*     */     //   116: goto -> 121
/*     */     //   119: bipush #16
/*     */     //   121: ior
/*     */     //   122: istore #7
/*     */     //   124: iload #5
/*     */     //   126: sipush #384
/*     */     //   129: iand
/*     */     //   130: ifne -> 165
/*     */     //   133: iload #7
/*     */     //   135: iload #6
/*     */     //   137: iconst_4
/*     */     //   138: iand
/*     */     //   139: ifne -> 159
/*     */     //   142: aload #4
/*     */     //   144: aload_2
/*     */     //   145: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   150: ifeq -> 159
/*     */     //   153: sipush #256
/*     */     //   156: goto -> 162
/*     */     //   159: sipush #128
/*     */     //   162: ior
/*     */     //   163: istore #7
/*     */     //   165: iload #6
/*     */     //   167: bipush #8
/*     */     //   169: iand
/*     */     //   170: ifeq -> 184
/*     */     //   173: iload #7
/*     */     //   175: sipush #3072
/*     */     //   178: ior
/*     */     //   179: istore #7
/*     */     //   181: goto -> 218
/*     */     //   184: iload #5
/*     */     //   186: sipush #3072
/*     */     //   189: iand
/*     */     //   190: ifne -> 218
/*     */     //   193: iload #7
/*     */     //   195: aload #4
/*     */     //   197: aload_3
/*     */     //   198: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   203: ifeq -> 212
/*     */     //   206: sipush #2048
/*     */     //   209: goto -> 215
/*     */     //   212: sipush #1024
/*     */     //   215: ior
/*     */     //   216: istore #7
/*     */     //   218: iload #7
/*     */     //   220: sipush #1171
/*     */     //   223: iand
/*     */     //   224: sipush #1170
/*     */     //   227: if_icmpne -> 240
/*     */     //   230: aload #4
/*     */     //   232: invokeinterface getSkipping : ()Z
/*     */     //   237: ifne -> 546
/*     */     //   240: aload #4
/*     */     //   242: invokeinterface startDefaults : ()V
/*     */     //   247: iload #5
/*     */     //   249: iconst_1
/*     */     //   250: iand
/*     */     //   251: ifeq -> 264
/*     */     //   254: aload #4
/*     */     //   256: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   261: ifeq -> 328
/*     */     //   264: iload #6
/*     */     //   266: iconst_4
/*     */     //   267: iand
/*     */     //   268: ifeq -> 350
/*     */     //   271: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   274: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   277: astore #8
/*     */     //   279: bipush #6
/*     */     //   281: istore #9
/*     */     //   283: iconst_0
/*     */     //   284: istore #10
/*     */     //   286: aload #4
/*     */     //   288: ldc 2023513938
/*     */     //   290: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   292: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   295: aload #4
/*     */     //   297: aload #8
/*     */     //   299: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   304: astore #11
/*     */     //   306: aload #4
/*     */     //   308: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   311: aload #11
/*     */     //   313: checkcast androidx/lifecycle/LifecycleOwner
/*     */     //   316: astore_2
/*     */     //   317: iload #7
/*     */     //   319: sipush #-897
/*     */     //   322: iand
/*     */     //   323: istore #7
/*     */     //   325: goto -> 350
/*     */     //   328: aload #4
/*     */     //   330: invokeinterface skipToGroupEnd : ()V
/*     */     //   335: iload #6
/*     */     //   337: iconst_4
/*     */     //   338: iand
/*     */     //   339: ifeq -> 350
/*     */     //   342: iload #7
/*     */     //   344: sipush #-897
/*     */     //   347: iand
/*     */     //   348: istore #7
/*     */     //   350: aload #4
/*     */     //   352: invokeinterface endDefaults : ()V
/*     */     //   357: invokestatic isTraceInProgress : ()Z
/*     */     //   360: ifeq -> 375
/*     */     //   363: ldc_w 752680142
/*     */     //   366: iload #7
/*     */     //   368: iconst_m1
/*     */     //   369: ldc_w 'androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:530)'
/*     */     //   372: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   375: aload #4
/*     */     //   377: ldc_w 1470098545
/*     */     //   380: invokeinterface startReplaceableGroup : (I)V
/*     */     //   385: aload #4
/*     */     //   387: ldc 'CC(remember):LifecycleEffect.kt#9igjgp'
/*     */     //   389: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   392: aload #4
/*     */     //   394: astore #10
/*     */     //   396: aload #4
/*     */     //   398: aload_0
/*     */     //   399: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   404: aload #4
/*     */     //   406: aload_1
/*     */     //   407: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   412: ior
/*     */     //   413: aload #4
/*     */     //   415: aload_2
/*     */     //   416: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   421: ior
/*     */     //   422: istore #11
/*     */     //   424: iconst_0
/*     */     //   425: istore #12
/*     */     //   427: aload #10
/*     */     //   429: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   434: astore #13
/*     */     //   436: iconst_0
/*     */     //   437: istore #14
/*     */     //   439: iload #11
/*     */     //   441: ifne -> 455
/*     */     //   444: aload #13
/*     */     //   446: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   449: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   452: if_acmpne -> 487
/*     */     //   455: iconst_0
/*     */     //   456: istore #15
/*     */     //   458: new androidx/lifecycle/compose/LifecycleResumePauseEffectScope
/*     */     //   461: dup
/*     */     //   462: aload_2
/*     */     //   463: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   468: invokespecial <init> : (Landroidx/lifecycle/Lifecycle;)V
/*     */     //   471: astore #16
/*     */     //   473: aload #10
/*     */     //   475: aload #16
/*     */     //   477: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   482: aload #16
/*     */     //   484: goto -> 489
/*     */     //   487: aload #13
/*     */     //   489: nop
/*     */     //   490: nop
/*     */     //   491: nop
/*     */     //   492: checkcast androidx/lifecycle/compose/LifecycleResumePauseEffectScope
/*     */     //   495: astore #9
/*     */     //   497: aload #4
/*     */     //   499: invokeinterface endReplaceableGroup : ()V
/*     */     //   504: aload #9
/*     */     //   506: astore #8
/*     */     //   508: aload_2
/*     */     //   509: aload #8
/*     */     //   511: aload_3
/*     */     //   512: aload #4
/*     */     //   514: bipush #14
/*     */     //   516: iload #7
/*     */     //   518: bipush #6
/*     */     //   520: ishr
/*     */     //   521: iand
/*     */     //   522: sipush #896
/*     */     //   525: iload #7
/*     */     //   527: iconst_3
/*     */     //   528: ishr
/*     */     //   529: iand
/*     */     //   530: ior
/*     */     //   531: invokestatic LifecycleResumeEffectImpl : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   534: invokestatic isTraceInProgress : ()Z
/*     */     //   537: ifeq -> 553
/*     */     //   540: invokestatic traceEventEnd : ()V
/*     */     //   543: goto -> 553
/*     */     //   546: aload #4
/*     */     //   548: invokeinterface skipToGroupEnd : ()V
/*     */     //   553: aload #4
/*     */     //   555: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   560: dup
/*     */     //   561: ifnull -> 590
/*     */     //   564: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffect$2
/*     */     //   567: dup
/*     */     //   568: aload_0
/*     */     //   569: aload_1
/*     */     //   570: aload_2
/*     */     //   571: aload_3
/*     */     //   572: iload #5
/*     */     //   574: iload #6
/*     */     //   576: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;II)V
/*     */     //   579: checkcast kotlin/jvm/functions/Function2
/*     */     //   582: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   587: goto -> 591
/*     */     //   590: pop
/*     */     //   591: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #531	-> 6
/*     */     //   #529	-> 271
/*     */     //   #798	-> 292
/*     */     //   #531	-> 372
/*     */     //   #532	-> 398
/*     */     //   #799	-> 427
/*     */     //   #800	-> 439
/*     */     //   #801	-> 455
/*     */     //   #533	-> 458
/*     */     //   #801	-> 471
/*     */     //   #802	-> 473
/*     */     //   #803	-> 482
/*     */     //   #804	-> 487
/*     */     //   #800	-> 489
/*     */     //   #799	-> 490
/*     */     //   #799	-> 491
/*     */     //   #532	-> 492
/*     */     //   #535	-> 508
/*     */     //   #536	-> 546
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   286	27	10	$i$f$getCurrent	I
/*     */     //   283	30	8	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   283	30	9	$changed$iv	I
/*     */     //   458	13	15	$i$a$-cache-LifecycleEffectKt$LifecycleResumeEffect$lifecycleResumePauseEffectScope$2	I
/*     */     //   473	11	16	value$iv	Ljava/lang/Object;
/*     */     //   439	51	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   436	54	13	it$iv	Ljava/lang/Object;
/*     */     //   427	65	12	$i$f$cache	I
/*     */     //   424	68	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   424	68	11	invalid$iv	Z
/*     */     //   508	35	8	lifecycleResumePauseEffectScope	Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;
/*     */     //   30	562	7	$dirty	I
/*     */     //   0	592	0	key1	Ljava/lang/Object;
/*     */     //   0	592	1	key2	Ljava/lang/Object;
/*     */     //   0	592	2	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	592	3	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	592	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	592	5	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final void LifecycleResumeEffect(@Nullable Object key1, @Nullable Object key2, @Nullable Object key3, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1 effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc 'effects'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #5
/*     */     //   9: ldc_w -485941842
/*     */     //   12: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   17: astore #5
/*     */     //   19: aload #5
/*     */     //   21: ldc_w 'C(LifecycleResumeEffect)P(1,2,3,4)593@27424L7,596@27566L116,599@27687L83:LifecycleEffect.kt#2vxrgp'
/*     */     //   24: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   27: iload #6
/*     */     //   29: istore #8
/*     */     //   31: iload #7
/*     */     //   33: iconst_1
/*     */     //   34: iand
/*     */     //   35: ifeq -> 48
/*     */     //   38: iload #8
/*     */     //   40: bipush #6
/*     */     //   42: ior
/*     */     //   43: istore #8
/*     */     //   45: goto -> 77
/*     */     //   48: iload #6
/*     */     //   50: bipush #6
/*     */     //   52: iand
/*     */     //   53: ifne -> 77
/*     */     //   56: iload #8
/*     */     //   58: aload #5
/*     */     //   60: aload_0
/*     */     //   61: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   66: ifeq -> 73
/*     */     //   69: iconst_4
/*     */     //   70: goto -> 74
/*     */     //   73: iconst_2
/*     */     //   74: ior
/*     */     //   75: istore #8
/*     */     //   77: iload #7
/*     */     //   79: iconst_2
/*     */     //   80: iand
/*     */     //   81: ifeq -> 94
/*     */     //   84: iload #8
/*     */     //   86: bipush #48
/*     */     //   88: ior
/*     */     //   89: istore #8
/*     */     //   91: goto -> 125
/*     */     //   94: iload #6
/*     */     //   96: bipush #48
/*     */     //   98: iand
/*     */     //   99: ifne -> 125
/*     */     //   102: iload #8
/*     */     //   104: aload #5
/*     */     //   106: aload_1
/*     */     //   107: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   112: ifeq -> 120
/*     */     //   115: bipush #32
/*     */     //   117: goto -> 122
/*     */     //   120: bipush #16
/*     */     //   122: ior
/*     */     //   123: istore #8
/*     */     //   125: iload #7
/*     */     //   127: iconst_4
/*     */     //   128: iand
/*     */     //   129: ifeq -> 143
/*     */     //   132: iload #8
/*     */     //   134: sipush #384
/*     */     //   137: ior
/*     */     //   138: istore #8
/*     */     //   140: goto -> 177
/*     */     //   143: iload #6
/*     */     //   145: sipush #384
/*     */     //   148: iand
/*     */     //   149: ifne -> 177
/*     */     //   152: iload #8
/*     */     //   154: aload #5
/*     */     //   156: aload_2
/*     */     //   157: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   162: ifeq -> 171
/*     */     //   165: sipush #256
/*     */     //   168: goto -> 174
/*     */     //   171: sipush #128
/*     */     //   174: ior
/*     */     //   175: istore #8
/*     */     //   177: iload #6
/*     */     //   179: sipush #3072
/*     */     //   182: iand
/*     */     //   183: ifne -> 219
/*     */     //   186: iload #8
/*     */     //   188: iload #7
/*     */     //   190: bipush #8
/*     */     //   192: iand
/*     */     //   193: ifne -> 213
/*     */     //   196: aload #5
/*     */     //   198: aload_3
/*     */     //   199: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   204: ifeq -> 213
/*     */     //   207: sipush #2048
/*     */     //   210: goto -> 216
/*     */     //   213: sipush #1024
/*     */     //   216: ior
/*     */     //   217: istore #8
/*     */     //   219: iload #7
/*     */     //   221: bipush #16
/*     */     //   223: iand
/*     */     //   224: ifeq -> 238
/*     */     //   227: iload #8
/*     */     //   229: sipush #24576
/*     */     //   232: ior
/*     */     //   233: istore #8
/*     */     //   235: goto -> 273
/*     */     //   238: iload #6
/*     */     //   240: sipush #24576
/*     */     //   243: iand
/*     */     //   244: ifne -> 273
/*     */     //   247: iload #8
/*     */     //   249: aload #5
/*     */     //   251: aload #4
/*     */     //   253: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   258: ifeq -> 267
/*     */     //   261: sipush #16384
/*     */     //   264: goto -> 270
/*     */     //   267: sipush #8192
/*     */     //   270: ior
/*     */     //   271: istore #8
/*     */     //   273: iload #8
/*     */     //   275: sipush #9363
/*     */     //   278: iand
/*     */     //   279: sipush #9362
/*     */     //   282: if_icmpne -> 295
/*     */     //   285: aload #5
/*     */     //   287: invokeinterface getSkipping : ()Z
/*     */     //   292: ifne -> 614
/*     */     //   295: aload #5
/*     */     //   297: invokeinterface startDefaults : ()V
/*     */     //   302: iload #6
/*     */     //   304: iconst_1
/*     */     //   305: iand
/*     */     //   306: ifeq -> 319
/*     */     //   309: aload #5
/*     */     //   311: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   316: ifeq -> 384
/*     */     //   319: iload #7
/*     */     //   321: bipush #8
/*     */     //   323: iand
/*     */     //   324: ifeq -> 407
/*     */     //   327: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   330: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   333: astore #9
/*     */     //   335: bipush #6
/*     */     //   337: istore #10
/*     */     //   339: iconst_0
/*     */     //   340: istore #11
/*     */     //   342: aload #5
/*     */     //   344: ldc 2023513938
/*     */     //   346: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   348: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   351: aload #5
/*     */     //   353: aload #9
/*     */     //   355: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   360: astore #12
/*     */     //   362: aload #5
/*     */     //   364: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   367: aload #12
/*     */     //   369: checkcast androidx/lifecycle/LifecycleOwner
/*     */     //   372: astore_3
/*     */     //   373: iload #8
/*     */     //   375: sipush #-7169
/*     */     //   378: iand
/*     */     //   379: istore #8
/*     */     //   381: goto -> 407
/*     */     //   384: aload #5
/*     */     //   386: invokeinterface skipToGroupEnd : ()V
/*     */     //   391: iload #7
/*     */     //   393: bipush #8
/*     */     //   395: iand
/*     */     //   396: ifeq -> 407
/*     */     //   399: iload #8
/*     */     //   401: sipush #-7169
/*     */     //   404: iand
/*     */     //   405: istore #8
/*     */     //   407: aload #5
/*     */     //   409: invokeinterface endDefaults : ()V
/*     */     //   414: invokestatic isTraceInProgress : ()Z
/*     */     //   417: ifeq -> 432
/*     */     //   420: ldc_w -485941842
/*     */     //   423: iload #8
/*     */     //   425: iconst_m1
/*     */     //   426: ldc_w 'androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:595)'
/*     */     //   429: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   432: aload #5
/*     */     //   434: ldc_w 1470200343
/*     */     //   437: invokeinterface startReplaceableGroup : (I)V
/*     */     //   442: aload #5
/*     */     //   444: ldc 'CC(remember):LifecycleEffect.kt#9igjgp'
/*     */     //   446: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   449: aload #5
/*     */     //   451: astore #11
/*     */     //   453: aload #5
/*     */     //   455: aload_0
/*     */     //   456: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   461: aload #5
/*     */     //   463: aload_1
/*     */     //   464: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   469: ior
/*     */     //   470: aload #5
/*     */     //   472: aload_2
/*     */     //   473: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   478: ior
/*     */     //   479: aload #5
/*     */     //   481: aload_3
/*     */     //   482: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   487: ior
/*     */     //   488: istore #12
/*     */     //   490: iconst_0
/*     */     //   491: istore #13
/*     */     //   493: aload #11
/*     */     //   495: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   500: astore #14
/*     */     //   502: iconst_0
/*     */     //   503: istore #15
/*     */     //   505: iload #12
/*     */     //   507: ifne -> 521
/*     */     //   510: aload #14
/*     */     //   512: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   515: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   518: if_acmpne -> 553
/*     */     //   521: iconst_0
/*     */     //   522: istore #16
/*     */     //   524: new androidx/lifecycle/compose/LifecycleResumePauseEffectScope
/*     */     //   527: dup
/*     */     //   528: aload_3
/*     */     //   529: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   534: invokespecial <init> : (Landroidx/lifecycle/Lifecycle;)V
/*     */     //   537: astore #17
/*     */     //   539: aload #11
/*     */     //   541: aload #17
/*     */     //   543: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   548: aload #17
/*     */     //   550: goto -> 555
/*     */     //   553: aload #14
/*     */     //   555: nop
/*     */     //   556: nop
/*     */     //   557: nop
/*     */     //   558: checkcast androidx/lifecycle/compose/LifecycleResumePauseEffectScope
/*     */     //   561: astore #10
/*     */     //   563: aload #5
/*     */     //   565: invokeinterface endReplaceableGroup : ()V
/*     */     //   570: aload #10
/*     */     //   572: astore #9
/*     */     //   574: aload_3
/*     */     //   575: aload #9
/*     */     //   577: aload #4
/*     */     //   579: aload #5
/*     */     //   581: bipush #14
/*     */     //   583: iload #8
/*     */     //   585: bipush #9
/*     */     //   587: ishr
/*     */     //   588: iand
/*     */     //   589: sipush #896
/*     */     //   592: iload #8
/*     */     //   594: bipush #6
/*     */     //   596: ishr
/*     */     //   597: iand
/*     */     //   598: ior
/*     */     //   599: invokestatic LifecycleResumeEffectImpl : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   602: invokestatic isTraceInProgress : ()Z
/*     */     //   605: ifeq -> 621
/*     */     //   608: invokestatic traceEventEnd : ()V
/*     */     //   611: goto -> 621
/*     */     //   614: aload #5
/*     */     //   616: invokeinterface skipToGroupEnd : ()V
/*     */     //   621: aload #5
/*     */     //   623: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   628: dup
/*     */     //   629: ifnull -> 660
/*     */     //   632: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffect$3
/*     */     //   635: dup
/*     */     //   636: aload_0
/*     */     //   637: aload_1
/*     */     //   638: aload_2
/*     */     //   639: aload_3
/*     */     //   640: aload #4
/*     */     //   642: iload #6
/*     */     //   644: iload #7
/*     */     //   646: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;II)V
/*     */     //   649: checkcast kotlin/jvm/functions/Function2
/*     */     //   652: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   657: goto -> 661
/*     */     //   660: pop
/*     */     //   661: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #596	-> 7
/*     */     //   #594	-> 327
/*     */     //   #805	-> 348
/*     */     //   #596	-> 429
/*     */     //   #597	-> 455
/*     */     //   #806	-> 493
/*     */     //   #807	-> 505
/*     */     //   #808	-> 521
/*     */     //   #598	-> 524
/*     */     //   #808	-> 537
/*     */     //   #809	-> 539
/*     */     //   #810	-> 548
/*     */     //   #811	-> 553
/*     */     //   #807	-> 555
/*     */     //   #806	-> 556
/*     */     //   #806	-> 557
/*     */     //   #597	-> 558
/*     */     //   #600	-> 574
/*     */     //   #601	-> 614
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   342	27	11	$i$f$getCurrent	I
/*     */     //   339	30	9	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   339	30	10	$changed$iv	I
/*     */     //   524	13	16	$i$a$-cache-LifecycleEffectKt$LifecycleResumeEffect$lifecycleResumePauseEffectScope$3	I
/*     */     //   539	11	17	value$iv	Ljava/lang/Object;
/*     */     //   505	51	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   502	54	14	it$iv	Ljava/lang/Object;
/*     */     //   493	65	13	$i$f$cache	I
/*     */     //   490	68	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   490	68	12	invalid$iv	Z
/*     */     //   574	37	9	lifecycleResumePauseEffectScope	Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;
/*     */     //   31	631	8	$dirty	I
/*     */     //   0	662	0	key1	Ljava/lang/Object;
/*     */     //   0	662	1	key2	Ljava/lang/Object;
/*     */     //   0	662	2	key3	Ljava/lang/Object;
/*     */     //   0	662	3	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	662	4	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	662	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	662	6	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final void LifecycleResumeEffect(@NotNull Object[] keys, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1 effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'keys'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc 'effects'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_3
/*     */     //   14: ldc_w -781756895
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore_3
/*     */     //   23: aload_3
/*     */     //   24: ldc_w 'C(LifecycleResumeEffect)P(1,2)657@30578L105,660@30688L83:LifecycleEffect.kt#2vxrgp'
/*     */     //   27: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   30: iload #4
/*     */     //   32: istore #6
/*     */     //   34: iload #4
/*     */     //   36: bipush #48
/*     */     //   38: iand
/*     */     //   39: ifne -> 71
/*     */     //   42: iload #6
/*     */     //   44: iload #5
/*     */     //   46: iconst_2
/*     */     //   47: iand
/*     */     //   48: ifne -> 66
/*     */     //   51: aload_3
/*     */     //   52: aload_1
/*     */     //   53: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 66
/*     */     //   61: bipush #32
/*     */     //   63: goto -> 68
/*     */     //   66: bipush #16
/*     */     //   68: ior
/*     */     //   69: istore #6
/*     */     //   71: iload #5
/*     */     //   73: iconst_4
/*     */     //   74: iand
/*     */     //   75: ifeq -> 89
/*     */     //   78: iload #6
/*     */     //   80: sipush #384
/*     */     //   83: ior
/*     */     //   84: istore #6
/*     */     //   86: goto -> 122
/*     */     //   89: iload #4
/*     */     //   91: sipush #384
/*     */     //   94: iand
/*     */     //   95: ifne -> 122
/*     */     //   98: iload #6
/*     */     //   100: aload_3
/*     */     //   101: aload_2
/*     */     //   102: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   107: ifeq -> 116
/*     */     //   110: sipush #256
/*     */     //   113: goto -> 119
/*     */     //   116: sipush #128
/*     */     //   119: ior
/*     */     //   120: istore #6
/*     */     //   122: aload_3
/*     */     //   123: ldc_w 1470289652
/*     */     //   126: aload_0
/*     */     //   127: arraylength
/*     */     //   128: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   131: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*     */     //   136: aload_3
/*     */     //   137: ldc_w '654@30436L7'
/*     */     //   140: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   143: iconst_0
/*     */     //   144: istore #7
/*     */     //   146: aload_0
/*     */     //   147: arraylength
/*     */     //   148: istore #8
/*     */     //   150: iload #7
/*     */     //   152: iload #8
/*     */     //   154: if_icmpge -> 190
/*     */     //   157: aload_0
/*     */     //   158: iload #7
/*     */     //   160: aaload
/*     */     //   161: astore #9
/*     */     //   163: iload #6
/*     */     //   165: aload_3
/*     */     //   166: aload #9
/*     */     //   168: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   173: ifeq -> 180
/*     */     //   176: iconst_4
/*     */     //   177: goto -> 181
/*     */     //   180: iconst_0
/*     */     //   181: ior
/*     */     //   182: istore #6
/*     */     //   184: iinc #7, 1
/*     */     //   187: goto -> 150
/*     */     //   190: aload_3
/*     */     //   191: invokeinterface endMovableGroup : ()V
/*     */     //   196: iload #6
/*     */     //   198: bipush #14
/*     */     //   200: iand
/*     */     //   201: ifne -> 210
/*     */     //   204: iload #6
/*     */     //   206: iconst_2
/*     */     //   207: ior
/*     */     //   208: istore #6
/*     */     //   210: iload #6
/*     */     //   212: sipush #147
/*     */     //   215: iand
/*     */     //   216: sipush #146
/*     */     //   219: if_icmpne -> 231
/*     */     //   222: aload_3
/*     */     //   223: invokeinterface getSkipping : ()Z
/*     */     //   228: ifne -> 581
/*     */     //   231: aload_3
/*     */     //   232: invokeinterface startDefaults : ()V
/*     */     //   237: iload #4
/*     */     //   239: iconst_1
/*     */     //   240: iand
/*     */     //   241: ifeq -> 253
/*     */     //   244: aload_3
/*     */     //   245: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   250: ifeq -> 313
/*     */     //   253: iload #5
/*     */     //   255: iconst_2
/*     */     //   256: iand
/*     */     //   257: ifeq -> 333
/*     */     //   260: invokestatic getLocalLifecycleOwner : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   263: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   266: astore #7
/*     */     //   268: bipush #6
/*     */     //   270: istore #8
/*     */     //   272: iconst_0
/*     */     //   273: istore #9
/*     */     //   275: aload_3
/*     */     //   276: ldc 2023513938
/*     */     //   278: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   280: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   283: aload_3
/*     */     //   284: aload #7
/*     */     //   286: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   291: astore #10
/*     */     //   293: aload_3
/*     */     //   294: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   297: aload #10
/*     */     //   299: checkcast androidx/lifecycle/LifecycleOwner
/*     */     //   302: astore_1
/*     */     //   303: iload #6
/*     */     //   305: bipush #-113
/*     */     //   307: iand
/*     */     //   308: istore #6
/*     */     //   310: goto -> 333
/*     */     //   313: aload_3
/*     */     //   314: invokeinterface skipToGroupEnd : ()V
/*     */     //   319: iload #5
/*     */     //   321: iconst_2
/*     */     //   322: iand
/*     */     //   323: ifeq -> 333
/*     */     //   326: iload #6
/*     */     //   328: bipush #-113
/*     */     //   330: iand
/*     */     //   331: istore #6
/*     */     //   333: aload_3
/*     */     //   334: invokeinterface endDefaults : ()V
/*     */     //   339: invokestatic isTraceInProgress : ()Z
/*     */     //   342: ifeq -> 357
/*     */     //   345: ldc_w -781756895
/*     */     //   348: iload #6
/*     */     //   350: iconst_m1
/*     */     //   351: ldc_w 'androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:656)'
/*     */     //   354: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   357: new kotlin/jvm/internal/SpreadBuilder
/*     */     //   360: dup
/*     */     //   361: iconst_2
/*     */     //   362: invokespecial <init> : (I)V
/*     */     //   365: astore #8
/*     */     //   367: aload #8
/*     */     //   369: aload_0
/*     */     //   370: invokevirtual addSpread : (Ljava/lang/Object;)V
/*     */     //   373: aload #8
/*     */     //   375: aload_1
/*     */     //   376: invokevirtual add : (Ljava/lang/Object;)V
/*     */     //   379: aload #8
/*     */     //   381: aload #8
/*     */     //   383: invokevirtual size : ()I
/*     */     //   386: anewarray java/lang/Object
/*     */     //   389: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*     */     //   392: astore #8
/*     */     //   394: iconst_0
/*     */     //   395: istore #9
/*     */     //   397: iconst_0
/*     */     //   398: istore #10
/*     */     //   400: aload_3
/*     */     //   401: ldc_w -568225417
/*     */     //   404: invokeinterface startReplaceableGroup : (I)V
/*     */     //   409: aload_3
/*     */     //   410: ldc_w 'CC(remember)P(1):Composables.kt#9igjgp'
/*     */     //   413: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   416: iconst_0
/*     */     //   417: istore #11
/*     */     //   419: iconst_0
/*     */     //   420: istore #12
/*     */     //   422: aload #8
/*     */     //   424: arraylength
/*     */     //   425: istore #13
/*     */     //   427: iload #12
/*     */     //   429: iload #13
/*     */     //   431: if_icmpge -> 460
/*     */     //   434: aload #8
/*     */     //   436: iload #12
/*     */     //   438: aaload
/*     */     //   439: astore #14
/*     */     //   441: iload #11
/*     */     //   443: aload_3
/*     */     //   444: aload #14
/*     */     //   446: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   451: ior
/*     */     //   452: istore #11
/*     */     //   454: iinc #12, 1
/*     */     //   457: goto -> 427
/*     */     //   460: aload_3
/*     */     //   461: astore #13
/*     */     //   463: nop
/*     */     //   464: iconst_0
/*     */     //   465: istore #14
/*     */     //   467: aload #13
/*     */     //   469: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   474: astore #15
/*     */     //   476: iconst_0
/*     */     //   477: istore #16
/*     */     //   479: iload #11
/*     */     //   481: ifne -> 495
/*     */     //   484: aload #15
/*     */     //   486: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   489: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   492: if_acmpne -> 527
/*     */     //   495: iconst_0
/*     */     //   496: istore #17
/*     */     //   498: new androidx/lifecycle/compose/LifecycleResumePauseEffectScope
/*     */     //   501: dup
/*     */     //   502: aload_1
/*     */     //   503: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */     //   508: invokespecial <init> : (Landroidx/lifecycle/Lifecycle;)V
/*     */     //   511: astore #18
/*     */     //   513: aload #13
/*     */     //   515: aload #18
/*     */     //   517: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   522: aload #18
/*     */     //   524: goto -> 529
/*     */     //   527: aload #15
/*     */     //   529: nop
/*     */     //   530: nop
/*     */     //   531: nop
/*     */     //   532: astore #12
/*     */     //   534: aload_3
/*     */     //   535: invokeinterface endReplaceableGroup : ()V
/*     */     //   540: aload #12
/*     */     //   542: checkcast androidx/lifecycle/compose/LifecycleResumePauseEffectScope
/*     */     //   545: astore #7
/*     */     //   547: aload_1
/*     */     //   548: aload #7
/*     */     //   550: aload_2
/*     */     //   551: aload_3
/*     */     //   552: bipush #14
/*     */     //   554: iload #6
/*     */     //   556: iconst_3
/*     */     //   557: ishr
/*     */     //   558: iand
/*     */     //   559: sipush #896
/*     */     //   562: iload #6
/*     */     //   564: iand
/*     */     //   565: ior
/*     */     //   566: invokestatic LifecycleResumeEffectImpl : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   569: invokestatic isTraceInProgress : ()Z
/*     */     //   572: ifeq -> 587
/*     */     //   575: invokestatic traceEventEnd : ()V
/*     */     //   578: goto -> 587
/*     */     //   581: aload_3
/*     */     //   582: invokeinterface skipToGroupEnd : ()V
/*     */     //   587: aload_3
/*     */     //   588: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   593: dup
/*     */     //   594: ifnull -> 622
/*     */     //   597: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffect$4
/*     */     //   600: dup
/*     */     //   601: aload_0
/*     */     //   602: aload_1
/*     */     //   603: aload_2
/*     */     //   604: iload #4
/*     */     //   606: iload #5
/*     */     //   608: invokespecial <init> : ([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;II)V
/*     */     //   611: checkcast kotlin/jvm/functions/Function2
/*     */     //   614: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   619: goto -> 623
/*     */     //   622: pop
/*     */     //   623: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #657	-> 13
/*     */     //   #654	-> 131
/*     */     //   #657	-> 210
/*     */     //   #655	-> 260
/*     */     //   #812	-> 280
/*     */     //   #657	-> 354
/*     */     //   #658	-> 357
/*     */     //   #813	-> 416
/*     */     //   #814	-> 419
/*     */     //   #815	-> 463
/*     */     //   #816	-> 467
/*     */     //   #817	-> 479
/*     */     //   #818	-> 495
/*     */     //   #659	-> 498
/*     */     //   #818	-> 511
/*     */     //   #819	-> 513
/*     */     //   #820	-> 522
/*     */     //   #821	-> 527
/*     */     //   #817	-> 529
/*     */     //   #816	-> 530
/*     */     //   #816	-> 531
/*     */     //   #815	-> 532
/*     */     //   #658	-> 542
/*     */     //   #661	-> 547
/*     */     //   #662	-> 581
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   163	21	9	value	Ljava/lang/Object;
/*     */     //   275	24	9	$i$f$getCurrent	I
/*     */     //   272	27	7	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   272	27	8	$changed$iv	I
/*     */     //   498	13	17	$i$a$-remember-LifecycleEffectKt$LifecycleResumeEffect$lifecycleResumePauseEffectScope$4	I
/*     */     //   441	13	14	key$iv	Ljava/lang/Object;
/*     */     //   513	11	18	value$iv$iv	Ljava/lang/Object;
/*     */     //   479	51	16	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   476	54	15	it$iv$iv	Ljava/lang/Object;
/*     */     //   467	65	14	$i$f$cache	I
/*     */     //   464	68	13	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   400	142	10	$i$f$remember	I
/*     */     //   419	123	11	invalid$iv	Z
/*     */     //   397	145	8	keys$iv	[Ljava/lang/Object;
/*     */     //   397	145	9	$changed$iv	I
/*     */     //   547	31	7	lifecycleResumePauseEffectScope	Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;
/*     */     //   34	590	6	$dirty	I
/*     */     //   0	624	0	keys	[Ljava/lang/Object;
/*     */     //   0	624	1	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	624	2	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	624	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	624	4	$changed	I
/*     */   }
/*     */   
/*     */   @Deprecated(message = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.", level = DeprecationLevel.ERROR)
/*     */   @Composable
/*     */   public static final void LifecycleResumeEffect(@Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> effects, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     Intrinsics.checkNotNullParameter(effects, "effects");
/*     */     $composer = $composer.startRestartGroup(-747476210);
/*     */     ComposerKt.sourceInformation($composer, "C(LifecycleResumeEffect)P(1)680@31558L7:LifecycleEffect.kt#2vxrgp");
/*     */     int $dirty = $changed;
/*     */     if (($dirty & 0x1) != 0 || !$composer.getSkipping()) {
/*     */       $composer.startDefaults();
/*     */       if (($changed & 0x1) == 0 || $composer.getDefaultsInvalid()) {
/*     */         if ((paramInt1 & 0x1) != 0) {
/*     */           CompositionLocal compositionLocal = (CompositionLocal)LocalLifecycleOwnerKt.getLocalLifecycleOwner();
/*     */           int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*     */           Object object = $composer.consume(compositionLocal);
/*     */           ComposerKt.sourceInformationMarkerEnd($composer);
/*     */           lifecycleOwner = (LifecycleOwner)object;
/*     */           $dirty &= 0xFFFFFFF1;
/*     */         } 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */         if ((paramInt1 & 0x1) != 0)
/*     */           $dirty &= 0xFFFFFFF1; 
/*     */       } 
/*     */       $composer.endDefaults();
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-747476210, $dirty, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:682)"); 
/*     */       throw new IllegalStateException("LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString());
/*     */     } 
/*     */     $composer.skipToGroupEnd();
/*     */     if ($composer.endRestartGroup() != null) {
/*     */       $composer.endRestartGroup().updateScope(new LifecycleEffectKt$LifecycleResumeEffect$5(lifecycleOwner, effects, $changed, paramInt1));
/*     */     } else {
/*     */       $composer.endRestartGroup();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final void LifecycleResumeEffectImpl(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope scope, Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> effects, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc_w 912823238
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore_3
/*     */     //   10: aload_3
/*     */     //   11: ldc_w 'C(LifecycleResumeEffectImpl)P(1,2)690@31972L670,690@31932L710:LifecycleEffect.kt#2vxrgp'
/*     */     //   14: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   17: iload #4
/*     */     //   19: istore #5
/*     */     //   21: iload #4
/*     */     //   23: bipush #6
/*     */     //   25: iand
/*     */     //   26: ifne -> 49
/*     */     //   29: iload #5
/*     */     //   31: aload_3
/*     */     //   32: aload_0
/*     */     //   33: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   38: ifeq -> 45
/*     */     //   41: iconst_4
/*     */     //   42: goto -> 46
/*     */     //   45: iconst_2
/*     */     //   46: ior
/*     */     //   47: istore #5
/*     */     //   49: iload #4
/*     */     //   51: bipush #48
/*     */     //   53: iand
/*     */     //   54: ifne -> 79
/*     */     //   57: iload #5
/*     */     //   59: aload_3
/*     */     //   60: aload_1
/*     */     //   61: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   66: ifeq -> 74
/*     */     //   69: bipush #32
/*     */     //   71: goto -> 76
/*     */     //   74: bipush #16
/*     */     //   76: ior
/*     */     //   77: istore #5
/*     */     //   79: iload #4
/*     */     //   81: sipush #384
/*     */     //   84: iand
/*     */     //   85: ifne -> 112
/*     */     //   88: iload #5
/*     */     //   90: aload_3
/*     */     //   91: aload_2
/*     */     //   92: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   97: ifeq -> 106
/*     */     //   100: sipush #256
/*     */     //   103: goto -> 109
/*     */     //   106: sipush #128
/*     */     //   109: ior
/*     */     //   110: istore #5
/*     */     //   112: iload #5
/*     */     //   114: sipush #147
/*     */     //   117: iand
/*     */     //   118: sipush #146
/*     */     //   121: if_icmpne -> 133
/*     */     //   124: aload_3
/*     */     //   125: invokeinterface getSkipping : ()Z
/*     */     //   130: ifne -> 326
/*     */     //   133: invokestatic isTraceInProgress : ()Z
/*     */     //   136: ifeq -> 151
/*     */     //   139: ldc_w 912823238
/*     */     //   142: iload #5
/*     */     //   144: iconst_m1
/*     */     //   145: ldc_w 'androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:689)'
/*     */     //   148: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   151: aload_0
/*     */     //   152: aload_1
/*     */     //   153: aload_3
/*     */     //   154: ldc_w 657407937
/*     */     //   157: invokeinterface startReplaceableGroup : (I)V
/*     */     //   162: aload_3
/*     */     //   163: ldc 'CC(remember):LifecycleEffect.kt#9igjgp'
/*     */     //   165: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   168: aload_3
/*     */     //   169: astore #7
/*     */     //   171: aload_3
/*     */     //   172: aload_1
/*     */     //   173: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   178: iload #5
/*     */     //   180: sipush #896
/*     */     //   183: iand
/*     */     //   184: sipush #256
/*     */     //   187: if_icmpne -> 194
/*     */     //   190: iconst_1
/*     */     //   191: goto -> 195
/*     */     //   194: iconst_0
/*     */     //   195: ior
/*     */     //   196: aload_3
/*     */     //   197: aload_0
/*     */     //   198: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   203: ior
/*     */     //   204: istore #8
/*     */     //   206: iconst_0
/*     */     //   207: istore #9
/*     */     //   209: aload #7
/*     */     //   211: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   216: astore #10
/*     */     //   218: iconst_0
/*     */     //   219: istore #11
/*     */     //   221: iload #8
/*     */     //   223: ifne -> 237
/*     */     //   226: aload #10
/*     */     //   228: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   231: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   234: if_acmpne -> 281
/*     */     //   237: astore #15
/*     */     //   239: astore #14
/*     */     //   241: iconst_0
/*     */     //   242: istore #12
/*     */     //   244: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1
/*     */     //   247: dup
/*     */     //   248: aload_0
/*     */     //   249: aload_1
/*     */     //   250: aload_2
/*     */     //   251: invokespecial <init> : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;)V
/*     */     //   254: checkcast kotlin/jvm/functions/Function1
/*     */     //   257: astore #16
/*     */     //   259: aload #14
/*     */     //   261: aload #15
/*     */     //   263: aload #16
/*     */     //   265: astore #13
/*     */     //   267: aload #7
/*     */     //   269: aload #13
/*     */     //   271: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   276: aload #13
/*     */     //   278: goto -> 283
/*     */     //   281: aload #10
/*     */     //   283: nop
/*     */     //   284: nop
/*     */     //   285: nop
/*     */     //   286: checkcast kotlin/jvm/functions/Function1
/*     */     //   289: astore #6
/*     */     //   291: aload_3
/*     */     //   292: invokeinterface endReplaceableGroup : ()V
/*     */     //   297: aload #6
/*     */     //   299: aload_3
/*     */     //   300: bipush #14
/*     */     //   302: iload #5
/*     */     //   304: iand
/*     */     //   305: bipush #112
/*     */     //   307: iload #5
/*     */     //   309: iand
/*     */     //   310: ior
/*     */     //   311: invokestatic DisposableEffect : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   314: invokestatic isTraceInProgress : ()Z
/*     */     //   317: ifeq -> 332
/*     */     //   320: invokestatic traceEventEnd : ()V
/*     */     //   323: goto -> 332
/*     */     //   326: aload_3
/*     */     //   327: invokeinterface skipToGroupEnd : ()V
/*     */     //   332: aload_3
/*     */     //   333: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   338: dup
/*     */     //   339: ifnull -> 365
/*     */     //   342: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$2
/*     */     //   345: dup
/*     */     //   346: aload_0
/*     */     //   347: aload_1
/*     */     //   348: aload_2
/*     */     //   349: iload #4
/*     */     //   351: invokespecial <init> : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;I)V
/*     */     //   354: checkcast kotlin/jvm/functions/Function2
/*     */     //   357: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   362: goto -> 366
/*     */     //   365: pop
/*     */     //   366: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #690	-> 0
/*     */     //   #691	-> 151
/*     */     //   #823	-> 209
/*     */     //   #824	-> 221
/*     */     //   #825	-> 237
/*     */     //   #691	-> 244
/*     */     //   #825	-> 265
/*     */     //   #826	-> 267
/*     */     //   #827	-> 276
/*     */     //   #828	-> 281
/*     */     //   #824	-> 283
/*     */     //   #823	-> 284
/*     */     //   #823	-> 285
/*     */     //   #691	-> 286
/*     */     //   #711	-> 326
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   244	13	12	$i$a$-cache-LifecycleEffectKt$LifecycleResumeEffectImpl$1	I
/*     */     //   267	11	13	value$iv	Ljava/lang/Object;
/*     */     //   221	63	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   218	66	10	it$iv	Ljava/lang/Object;
/*     */     //   209	77	9	$i$f$cache	I
/*     */     //   206	80	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   206	80	8	invalid$iv	Z
/*     */     //   21	346	5	$dirty	I
/*     */     //   0	367	0	lifecycleOwner	Landroidx/lifecycle/LifecycleOwner;
/*     */     //   0	367	1	scope	Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;
/*     */     //   0	367	2	effects	Lkotlin/jvm/functions/Function1;
/*     */     //   0	367	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	367	4	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,745:1\n63#2,5:746\n1#3:751\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1\n*L\n706#1:746,5\n*E\n"})
/*     */   static final class LifecycleEffectKt$LifecycleResumeEffectImpl$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/*     */     @NotNull
/*     */     public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$DisposableEffect'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: new kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   9: dup
/*     */       //   10: invokespecial <init> : ()V
/*     */       //   13: astore_2
/*     */       //   14: aload_0
/*     */       //   15: getfield $scope : Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;
/*     */       //   18: aload_2
/*     */       //   19: aload_0
/*     */       //   20: getfield $effects : Lkotlin/jvm/functions/Function1;
/*     */       //   23: <illegal opcode> onStateChanged : (Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LifecycleEventObserver;
/*     */       //   28: astore_3
/*     */       //   29: aload_0
/*     */       //   30: getfield $lifecycleOwner : Landroidx/lifecycle/LifecycleOwner;
/*     */       //   33: invokeinterface getLifecycle : ()Landroidx/lifecycle/Lifecycle;
/*     */       //   38: aload_3
/*     */       //   39: checkcast androidx/lifecycle/LifecycleObserver
/*     */       //   42: invokevirtual addObserver : (Landroidx/lifecycle/LifecycleObserver;)V
/*     */       //   45: aload_1
/*     */       //   46: astore #4
/*     */       //   48: aload_0
/*     */       //   49: getfield $lifecycleOwner : Landroidx/lifecycle/LifecycleOwner;
/*     */       //   52: astore #5
/*     */       //   54: iconst_0
/*     */       //   55: istore #6
/*     */       //   57: new androidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1$invoke$$inlined$onDispose$1
/*     */       //   60: dup
/*     */       //   61: aload #5
/*     */       //   63: aload_3
/*     */       //   64: aload_2
/*     */       //   65: invokespecial <init> : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/LifecycleEventObserver;Lkotlin/jvm/internal/Ref$ObjectRef;)V
/*     */       //   68: checkcast androidx/compose/runtime/DisposableEffectResult
/*     */       //   71: nop
/*     */       //   72: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #692	-> 6
/*     */       //   #693	-> 14
/*     */       //   #704	-> 29
/*     */       //   #706	-> 45
/*     */       //   #746	-> 57
/*     */       //   #750	-> 71
/*     */       //   #706	-> 72
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   57	15	6	$i$f$onDispose	I
/*     */       //   54	18	4	this_$iv	Landroidx/compose/runtime/DisposableEffectScope;
/*     */       //   14	59	2	effectResult	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   29	44	3	observer	Landroidx/lifecycle/LifecycleEventObserver;
/*     */       //   0	73	0	this	Landroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1;
/*     */       //   0	73	1	$this$DisposableEffect	Landroidx/compose/runtime/DisposableEffectScope;
/*     */     }
/*     */     
/*     */     private static final void invoke$lambda$1(LifecycleResumePauseEffectScope $scope, Ref.ObjectRef $effectResult, Function1 $effects, LifecycleOwner param1LifecycleOwner, Lifecycle.Event event) {
/*     */       LifecycleResumePauseEffectScope $this$invoke_u24lambda_u241_u24lambda_u240;
/*     */       int $i$a$-with-LifecycleEffectKt$LifecycleResumeEffectImpl$1$1$observer$1$1;
/*     */       Intrinsics.checkNotNullParameter($scope, "$scope");
/*     */       Intrinsics.checkNotNullParameter($effectResult, "$effectResult");
/*     */       Intrinsics.checkNotNullParameter($effects, "$effects");
/*     */       Intrinsics.checkNotNullParameter(param1LifecycleOwner, "<anonymous parameter 0>");
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
/*     */         case 1:
/*     */           $this$invoke_u24lambda_u241_u24lambda_u240 = $scope;
/*     */           $i$a$-with-LifecycleEffectKt$LifecycleResumeEffectImpl$1$1$observer$1$1 = 0;
/*     */           $effectResult.element = $effects.invoke($this$invoke_u24lambda_u241_u24lambda_u240);
/*     */           break;
/*     */         case 2:
/*     */           if ((LifecyclePauseOrDisposeEffectResult)$effectResult.element != null) {
/*     */             ((LifecyclePauseOrDisposeEffectResult)$effectResult.element).runPauseOrOnDisposeEffect();
/*     */           } else {
/*     */             (LifecyclePauseOrDisposeEffectResult)$effectResult.element;
/*     */           } 
/*     */           $effectResult.element = null;
/*     */           break;
/*     */       } 
/*     */     }
/*     */     
/*     */     LifecycleEffectKt$LifecycleResumeEffectImpl$1$1(LifecycleOwner $lifecycleOwner, LifecycleResumePauseEffectScope $scope, Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> $effects) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleEventEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleEventEffect$2(Lifecycle.Event $event, LifecycleOwner $lifecycleOwner, Function0<Unit> $onEvent, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleEventEffect(this.$event, this.$lifecycleOwner, this.$onEvent, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleResumeEffect$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleResumeEffect$1(Object $key1, LifecycleOwner $lifecycleOwner, Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleResumeEffect(this.$key1, this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleResumeEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleResumeEffect$2(Object $key1, Object $key2, LifecycleOwner $lifecycleOwner, Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleResumeEffect(this.$key1, this.$key2, this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleResumeEffect$3 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleResumeEffect$3(Object $key1, Object $key2, Object $key3, LifecycleOwner $lifecycleOwner, Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleResumeEffect(this.$key1, this.$key2, this.$key3, this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleResumeEffect$4 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleResumeEffect$4(Object[] $keys, LifecycleOwner $lifecycleOwner, Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleResumeEffect(Arrays.copyOf(this.$keys, this.$keys.length), this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleResumeEffect$5 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleResumeEffect$5(LifecycleOwner $lifecycleOwner, Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleResumeEffect(this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleResumeEffectImpl$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleResumeEffectImpl$2(LifecycleOwner $lifecycleOwner, LifecycleResumePauseEffectScope $scope, Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> $effects, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleResumeEffectImpl(this.$lifecycleOwner, this.$scope, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleStartEffect$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleStartEffect$1(Object $key1, LifecycleOwner $lifecycleOwner, Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleStartEffect(this.$key1, this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleStartEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleStartEffect$2(Object $key1, Object $key2, LifecycleOwner $lifecycleOwner, Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleStartEffect(this.$key1, this.$key2, this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleStartEffect$3 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleStartEffect$3(Object $key1, Object $key2, Object $key3, LifecycleOwner $lifecycleOwner, Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleStartEffect(this.$key1, this.$key2, this.$key3, this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleStartEffect$4 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleStartEffect$4(Object[] $keys, LifecycleOwner $lifecycleOwner, Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleStartEffect(Arrays.copyOf(this.$keys, this.$keys.length), this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleStartEffect$5 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleStartEffect$5(LifecycleOwner $lifecycleOwner, Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleStartEffect(this.$lifecycleOwner, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class LifecycleEffectKt$LifecycleStartEffectImpl$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     LifecycleEffectKt$LifecycleStartEffectImpl$2(LifecycleOwner $lifecycleOwner, LifecycleStartStopEffectScope $scope, Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       LifecycleEffectKt.LifecycleStartEffectImpl(this.$lifecycleOwner, this.$scope, this.$effects, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-compose-desktop-2.8.4.jar!\androidx\lifecycle\compose\LifecycleEffectKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */