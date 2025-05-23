/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableInferredTarget;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.text.TextStyle;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.component.LinkKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.DefaultBannerStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000J\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\032\037\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\004\032\0020\005H\007¢\006\002\020\006\032)\020\007\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\004\032\0020\0052\b\020\b\032\004\030\0010\tH\007¢\006\002\020\n\032/\020\013\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\004\032\0020\0052\016\b\002\020\f\032\b\022\004\022\0020\t0\rH\007¢\006\002\020\016\032h\020\017\032\0020\0012\006\020\020\032\0020\0052\006\020\021\032\0020\0222\b\b\002\020\023\032\0020\0242\025\b\002\020\025\032\017\022\004\022\0020\001\030\0010\026¢\006\002\b\0272\036\020\f\032\032\022\004\022\0020\031\022\004\022\0020\001\030\0010\030¢\006\002\b\027¢\006\002\b\0322\b\b\002\020\002\032\0020\003H\003¢\006\002\020\033¨\006\034"}, d2 = {"JuniePreconditionBanner", "", "modifier", "Landroidx/compose/ui/Modifier;", "description", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "JunieErrorBanner", "action", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Landroidx/compose/runtime/Composer;II)V", "JunieWarningBanner", "actions", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "JunieBanner", "text", "style", "Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ej-ui"})
/*    */ @SourceDebugExtension({"SMAP\nJunieErrorBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieErrorBanner.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,119:1\n86#2:120\n83#2,6:121\n89#2:155\n93#2:283\n79#3,6:127\n86#3,4:142\n90#3,2:152\n79#3,6:164\n86#3,4:179\n90#3,2:189\n79#3,6:200\n86#3,4:215\n90#3,2:225\n94#3:231\n79#3,6:243\n86#3,4:258\n90#3,2:268\n94#3:274\n94#3:278\n94#3:282\n368#4,9:133\n377#4:154\n368#4,9:170\n377#4:191\n368#4,9:206\n377#4:227\n378#4,2:229\n368#4,9:249\n377#4:270\n378#4,2:272\n378#4,2:276\n378#4,2:280\n4034#5,6:146\n4034#5,6:183\n4034#5,6:219\n4034#5,6:262\n149#6:156\n149#6:193\n149#6:233\n149#6:234\n99#7:157\n96#7,6:158\n102#7:192\n99#7:235\n95#7,7:236\n102#7:271\n106#7:275\n106#7:279\n71#8:194\n69#8,5:195\n74#8:228\n78#8:232\n*S KotlinDebug\n*F\n+ 1 JunieErrorBanner.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt\n*L\n95#1:120\n95#1:121,6\n95#1:155\n95#1:283\n95#1:127,6\n95#1:142,4\n95#1:152,2\n97#1:164,6\n97#1:179,4\n97#1:189,2\n102#1:200,6\n102#1:215,4\n102#1:225,2\n102#1:231\n108#1:243,6\n108#1:258,4\n108#1:268,2\n108#1:274\n97#1:278\n95#1:282\n95#1:133,9\n95#1:154\n97#1:170,9\n97#1:191\n102#1:206,9\n102#1:227\n102#1:229,2\n108#1:249,9\n108#1:270\n108#1:272,2\n97#1:276,2\n95#1:280,2\n95#1:146,6\n97#1:183,6\n102#1:219,6\n108#1:262,6\n98#1:156\n102#1:193\n103#1:233\n109#1:234\n97#1:157\n97#1:158,6\n97#1:192\n108#1:235\n108#1:236,7\n108#1:271\n108#1:275\n97#1:279\n102#1:194\n102#1:195,5\n102#1:228\n102#1:232\n*E\n"})
/*    */ public final class JunieErrorBannerKt {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void JuniePreconditionBanner(@Nullable Modifier modifier, @NotNull String description, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'description'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc -11142421
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_2
/*    */     //   15: iload_3
/*    */     //   16: istore #5
/*    */     //   18: iload #4
/*    */     //   20: iconst_1
/*    */     //   21: iand
/*    */     //   22: ifeq -> 35
/*    */     //   25: iload #5
/*    */     //   27: bipush #6
/*    */     //   29: ior
/*    */     //   30: istore #5
/*    */     //   32: goto -> 62
/*    */     //   35: iload_3
/*    */     //   36: bipush #6
/*    */     //   38: iand
/*    */     //   39: ifne -> 62
/*    */     //   42: iload #5
/*    */     //   44: aload_2
/*    */     //   45: aload_0
/*    */     //   46: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   51: ifeq -> 58
/*    */     //   54: iconst_4
/*    */     //   55: goto -> 59
/*    */     //   58: iconst_2
/*    */     //   59: ior
/*    */     //   60: istore #5
/*    */     //   62: iload #4
/*    */     //   64: iconst_2
/*    */     //   65: iand
/*    */     //   66: ifeq -> 79
/*    */     //   69: iload #5
/*    */     //   71: bipush #48
/*    */     //   73: ior
/*    */     //   74: istore #5
/*    */     //   76: goto -> 108
/*    */     //   79: iload_3
/*    */     //   80: bipush #48
/*    */     //   82: iand
/*    */     //   83: ifne -> 108
/*    */     //   86: iload #5
/*    */     //   88: aload_2
/*    */     //   89: aload_1
/*    */     //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   95: ifeq -> 103
/*    */     //   98: bipush #32
/*    */     //   100: goto -> 105
/*    */     //   103: bipush #16
/*    */     //   105: ior
/*    */     //   106: istore #5
/*    */     //   108: iload #5
/*    */     //   110: bipush #19
/*    */     //   112: iand
/*    */     //   113: bipush #18
/*    */     //   115: if_icmpne -> 127
/*    */     //   118: aload_2
/*    */     //   119: invokeinterface getSkipping : ()Z
/*    */     //   124: ifne -> 192
/*    */     //   127: iload #4
/*    */     //   129: iconst_1
/*    */     //   130: iand
/*    */     //   131: ifeq -> 141
/*    */     //   134: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   137: checkcast androidx/compose/ui/Modifier
/*    */     //   140: astore_0
/*    */     //   141: invokestatic isTraceInProgress : ()Z
/*    */     //   144: ifeq -> 157
/*    */     //   147: ldc -11142421
/*    */     //   149: iload #5
/*    */     //   151: iconst_m1
/*    */     //   152: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JuniePreconditionBanner (JunieErrorBanner.kt:33)'
/*    */     //   154: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   157: aload_0
/*    */     //   158: aload_1
/*    */     //   159: aconst_null
/*    */     //   160: aload_2
/*    */     //   161: sipush #384
/*    */     //   164: bipush #14
/*    */     //   166: iload #5
/*    */     //   168: iand
/*    */     //   169: ior
/*    */     //   170: bipush #112
/*    */     //   172: iload #5
/*    */     //   174: iand
/*    */     //   175: ior
/*    */     //   176: iconst_0
/*    */     //   177: invokestatic JunieErrorBanner : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Landroidx/compose/runtime/Composer;II)V
/*    */     //   180: invokestatic isTraceInProgress : ()Z
/*    */     //   183: ifeq -> 198
/*    */     //   186: invokestatic traceEventEnd : ()V
/*    */     //   189: goto -> 198
/*    */     //   192: aload_2
/*    */     //   193: invokeinterface skipToGroupEnd : ()V
/*    */     //   198: aload_2
/*    */     //   199: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   204: dup
/*    */     //   205: ifnull -> 226
/*    */     //   208: aload_0
/*    */     //   209: aload_1
/*    */     //   210: iload_3
/*    */     //   211: iload #4
/*    */     //   213: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;II)Lkotlin/jvm/functions/Function2;
/*    */     //   218: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   223: goto -> 227
/*    */     //   226: pop
/*    */     //   227: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 6
/*    */     //   #33	-> 134
/*    */     //   #34	-> 154
/*    */     //   #36	-> 157
/*    */     //   #35	-> 158
/*    */     //   #37	-> 159
/*    */     //   #34	-> 177
/*    */     //   #38	-> 192
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   18	210	5	$dirty	I
/*    */     //   0	228	0	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	228	1	description	Ljava/lang/String;
/*    */     //   0	228	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	228	3	$changed	I
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void JunieErrorBanner(@Nullable Modifier modifier, @NotNull String description, @Nullable Action action, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'description'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_3
/*    */     //   7: ldc -1407547527
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_3
/*    */     //   15: iload #4
/*    */     //   17: istore #6
/*    */     //   19: iload #5
/*    */     //   21: iconst_1
/*    */     //   22: iand
/*    */     //   23: ifeq -> 36
/*    */     //   26: iload #6
/*    */     //   28: bipush #6
/*    */     //   30: ior
/*    */     //   31: istore #6
/*    */     //   33: goto -> 64
/*    */     //   36: iload #4
/*    */     //   38: bipush #6
/*    */     //   40: iand
/*    */     //   41: ifne -> 64
/*    */     //   44: iload #6
/*    */     //   46: aload_3
/*    */     //   47: aload_0
/*    */     //   48: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   53: ifeq -> 60
/*    */     //   56: iconst_4
/*    */     //   57: goto -> 61
/*    */     //   60: iconst_2
/*    */     //   61: ior
/*    */     //   62: istore #6
/*    */     //   64: iload #5
/*    */     //   66: iconst_2
/*    */     //   67: iand
/*    */     //   68: ifeq -> 81
/*    */     //   71: iload #6
/*    */     //   73: bipush #48
/*    */     //   75: ior
/*    */     //   76: istore #6
/*    */     //   78: goto -> 111
/*    */     //   81: iload #4
/*    */     //   83: bipush #48
/*    */     //   85: iand
/*    */     //   86: ifne -> 111
/*    */     //   89: iload #6
/*    */     //   91: aload_3
/*    */     //   92: aload_1
/*    */     //   93: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   98: ifeq -> 106
/*    */     //   101: bipush #32
/*    */     //   103: goto -> 108
/*    */     //   106: bipush #16
/*    */     //   108: ior
/*    */     //   109: istore #6
/*    */     //   111: iload #5
/*    */     //   113: iconst_4
/*    */     //   114: iand
/*    */     //   115: ifeq -> 129
/*    */     //   118: iload #6
/*    */     //   120: sipush #384
/*    */     //   123: ior
/*    */     //   124: istore #6
/*    */     //   126: goto -> 162
/*    */     //   129: iload #4
/*    */     //   131: sipush #384
/*    */     //   134: iand
/*    */     //   135: ifne -> 162
/*    */     //   138: iload #6
/*    */     //   140: aload_3
/*    */     //   141: aload_2
/*    */     //   142: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   147: ifeq -> 156
/*    */     //   150: sipush #256
/*    */     //   153: goto -> 159
/*    */     //   156: sipush #128
/*    */     //   159: ior
/*    */     //   160: istore #6
/*    */     //   162: iload #6
/*    */     //   164: sipush #147
/*    */     //   167: iand
/*    */     //   168: sipush #146
/*    */     //   171: if_icmpne -> 183
/*    */     //   174: aload_3
/*    */     //   175: invokeinterface getSkipping : ()Z
/*    */     //   180: ifne -> 325
/*    */     //   183: iload #5
/*    */     //   185: iconst_1
/*    */     //   186: iand
/*    */     //   187: ifeq -> 197
/*    */     //   190: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   193: checkcast androidx/compose/ui/Modifier
/*    */     //   196: astore_0
/*    */     //   197: invokestatic isTraceInProgress : ()Z
/*    */     //   200: ifeq -> 213
/*    */     //   203: ldc -1407547527
/*    */     //   205: iload #6
/*    */     //   207: iconst_m1
/*    */     //   208: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieErrorBanner (JunieErrorBanner.kt:41)'
/*    */     //   210: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   213: aload_3
/*    */     //   214: ldc 1556802681
/*    */     //   216: invokeinterface startReplaceGroup : (I)V
/*    */     //   221: aload_2
/*    */     //   222: ifnull -> 248
/*    */     //   225: ldc 2064981895
/*    */     //   227: iconst_1
/*    */     //   228: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt$JunieErrorBanner$1
/*    */     //   231: dup
/*    */     //   232: aload_2
/*    */     //   233: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V
/*    */     //   236: aload_3
/*    */     //   237: bipush #54
/*    */     //   239: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   242: checkcast kotlin/jvm/functions/Function3
/*    */     //   245: goto -> 249
/*    */     //   248: aconst_null
/*    */     //   249: astore #8
/*    */     //   251: aload_3
/*    */     //   252: invokeinterface endReplaceGroup : ()V
/*    */     //   257: aload #8
/*    */     //   259: astore #7
/*    */     //   261: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   264: aload_3
/*    */     //   265: bipush #6
/*    */     //   267: invokestatic getDefaultBannerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;
/*    */     //   270: invokevirtual getError : ()Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
/*    */     //   273: astore #8
/*    */     //   275: aload_1
/*    */     //   276: aload #8
/*    */     //   278: aconst_null
/*    */     //   279: getstatic com/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$JunieErrorBannerKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$JunieErrorBannerKt;
/*    */     //   282: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function2;
/*    */     //   285: aload #7
/*    */     //   287: aload_0
/*    */     //   288: aload_3
/*    */     //   289: sipush #3072
/*    */     //   292: bipush #14
/*    */     //   294: iload #6
/*    */     //   296: iconst_3
/*    */     //   297: ishr
/*    */     //   298: iand
/*    */     //   299: ior
/*    */     //   300: ldc 458752
/*    */     //   302: iload #6
/*    */     //   304: bipush #15
/*    */     //   306: ishl
/*    */     //   307: iand
/*    */     //   308: ior
/*    */     //   309: iconst_4
/*    */     //   310: invokestatic JunieBanner : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*    */     //   313: invokestatic isTraceInProgress : ()Z
/*    */     //   316: ifeq -> 331
/*    */     //   319: invokestatic traceEventEnd : ()V
/*    */     //   322: goto -> 331
/*    */     //   325: aload_3
/*    */     //   326: invokeinterface skipToGroupEnd : ()V
/*    */     //   331: aload_3
/*    */     //   332: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   337: dup
/*    */     //   338: ifnull -> 361
/*    */     //   341: aload_0
/*    */     //   342: aload_1
/*    */     //   343: aload_2
/*    */     //   344: iload #4
/*    */     //   346: iload #5
/*    */     //   348: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;II)Lkotlin/jvm/functions/Function2;
/*    */     //   353: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   358: goto -> 362
/*    */     //   361: pop
/*    */     //   362: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #42	-> 6
/*    */     //   #46	-> 221
/*    */     //   #47	-> 225
/*    */     //   #48	-> 248
/*    */     //   #46	-> 249
/*    */     //   #49	-> 261
/*    */     //   #44	-> 275
/*    */     //   #49	-> 276
/*    */     //   #46	-> 285
/*    */     //   #45	-> 287
/*    */     //   #43	-> 310
/*    */     //   #52	-> 325
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   19	344	6	$dirty	I
/*    */     //   0	363	0	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	363	1	description	Ljava/lang/String;
/*    */     //   0	363	2	action	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   0	363	3	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	363	4	$changed	I
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieErrorBannerKt$JunieErrorBanner$1 implements Function3<RowScope, Composer, Integer, Unit> {
/*    */     JunieErrorBannerKt$JunieErrorBanner$1(Action $action) {}
/*    */     
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(RowScope $this$JunieBanner, Composer $composer, int $changed) {
/* 47 */       Intrinsics.checkNotNullParameter($this$JunieBanner, "$this$JunieBanner"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2064981895, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieErrorBanner.<anonymous> (JunieErrorBanner.kt:46)");  LinkKt.Link-kye4rC8(this.$action.getName(), this.$action.getAction(), null, false, null, 0, null, null, $composer, 0, 252); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */     
/*    */     }
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void JunieWarningBanner(@Nullable Modifier modifier, @NotNull String description, @Nullable List actions, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'description'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_3
/*    */     //   7: ldc 2091589965
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_3
/*    */     //   15: iload #4
/*    */     //   17: istore #6
/*    */     //   19: iload #5
/*    */     //   21: iconst_1
/*    */     //   22: iand
/*    */     //   23: ifeq -> 36
/*    */     //   26: iload #6
/*    */     //   28: bipush #6
/*    */     //   30: ior
/*    */     //   31: istore #6
/*    */     //   33: goto -> 64
/*    */     //   36: iload #4
/*    */     //   38: bipush #6
/*    */     //   40: iand
/*    */     //   41: ifne -> 64
/*    */     //   44: iload #6
/*    */     //   46: aload_3
/*    */     //   47: aload_0
/*    */     //   48: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   53: ifeq -> 60
/*    */     //   56: iconst_4
/*    */     //   57: goto -> 61
/*    */     //   60: iconst_2
/*    */     //   61: ior
/*    */     //   62: istore #6
/*    */     //   64: iload #5
/*    */     //   66: iconst_2
/*    */     //   67: iand
/*    */     //   68: ifeq -> 81
/*    */     //   71: iload #6
/*    */     //   73: bipush #48
/*    */     //   75: ior
/*    */     //   76: istore #6
/*    */     //   78: goto -> 111
/*    */     //   81: iload #4
/*    */     //   83: bipush #48
/*    */     //   85: iand
/*    */     //   86: ifne -> 111
/*    */     //   89: iload #6
/*    */     //   91: aload_3
/*    */     //   92: aload_1
/*    */     //   93: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   98: ifeq -> 106
/*    */     //   101: bipush #32
/*    */     //   103: goto -> 108
/*    */     //   106: bipush #16
/*    */     //   108: ior
/*    */     //   109: istore #6
/*    */     //   111: iload #5
/*    */     //   113: iconst_4
/*    */     //   114: iand
/*    */     //   115: ifeq -> 129
/*    */     //   118: iload #6
/*    */     //   120: sipush #384
/*    */     //   123: ior
/*    */     //   124: istore #6
/*    */     //   126: goto -> 162
/*    */     //   129: iload #4
/*    */     //   131: sipush #384
/*    */     //   134: iand
/*    */     //   135: ifne -> 162
/*    */     //   138: iload #6
/*    */     //   140: aload_3
/*    */     //   141: aload_2
/*    */     //   142: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   147: ifeq -> 156
/*    */     //   150: sipush #256
/*    */     //   153: goto -> 159
/*    */     //   156: sipush #128
/*    */     //   159: ior
/*    */     //   160: istore #6
/*    */     //   162: iload #6
/*    */     //   164: sipush #147
/*    */     //   167: iand
/*    */     //   168: sipush #146
/*    */     //   171: if_icmpne -> 183
/*    */     //   174: aload_3
/*    */     //   175: invokeinterface getSkipping : ()Z
/*    */     //   180: ifne -> 306
/*    */     //   183: iload #5
/*    */     //   185: iconst_1
/*    */     //   186: iand
/*    */     //   187: ifeq -> 197
/*    */     //   190: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   193: checkcast androidx/compose/ui/Modifier
/*    */     //   196: astore_0
/*    */     //   197: iload #5
/*    */     //   199: iconst_4
/*    */     //   200: iand
/*    */     //   201: ifeq -> 208
/*    */     //   204: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   207: astore_2
/*    */     //   208: invokestatic isTraceInProgress : ()Z
/*    */     //   211: ifeq -> 224
/*    */     //   214: ldc 2091589965
/*    */     //   216: iload #6
/*    */     //   218: iconst_m1
/*    */     //   219: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieWarningBanner (JunieErrorBanner.kt:58)'
/*    */     //   221: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   224: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   227: aload_3
/*    */     //   228: bipush #6
/*    */     //   230: invokestatic getDefaultBannerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;
/*    */     //   233: invokevirtual getWarning : ()Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
/*    */     //   236: astore #7
/*    */     //   238: aload_1
/*    */     //   239: aload #7
/*    */     //   241: aconst_null
/*    */     //   242: getstatic com/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$JunieErrorBannerKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$JunieErrorBannerKt;
/*    */     //   245: invokevirtual getLambda-2$ej_ui : ()Lkotlin/jvm/functions/Function2;
/*    */     //   248: ldc -2059587615
/*    */     //   250: iconst_1
/*    */     //   251: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt$JunieWarningBanner$1
/*    */     //   254: dup
/*    */     //   255: aload_2
/*    */     //   256: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   259: aload_3
/*    */     //   260: bipush #54
/*    */     //   262: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   265: checkcast kotlin/jvm/functions/Function3
/*    */     //   268: aload_0
/*    */     //   269: aload_3
/*    */     //   270: sipush #27648
/*    */     //   273: bipush #14
/*    */     //   275: iload #6
/*    */     //   277: iconst_3
/*    */     //   278: ishr
/*    */     //   279: iand
/*    */     //   280: ior
/*    */     //   281: ldc 458752
/*    */     //   283: iload #6
/*    */     //   285: bipush #15
/*    */     //   287: ishl
/*    */     //   288: iand
/*    */     //   289: ior
/*    */     //   290: iconst_4
/*    */     //   291: invokestatic JunieBanner : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*    */     //   294: invokestatic isTraceInProgress : ()Z
/*    */     //   297: ifeq -> 312
/*    */     //   300: invokestatic traceEventEnd : ()V
/*    */     //   303: goto -> 312
/*    */     //   306: aload_3
/*    */     //   307: invokeinterface skipToGroupEnd : ()V
/*    */     //   312: aload_3
/*    */     //   313: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   318: dup
/*    */     //   319: ifnull -> 342
/*    */     //   322: aload_0
/*    */     //   323: aload_1
/*    */     //   324: aload_2
/*    */     //   325: iload #4
/*    */     //   327: iload #5
/*    */     //   329: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;II)Lkotlin/jvm/functions/Function2;
/*    */     //   334: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   339: goto -> 343
/*    */     //   342: pop
/*    */     //   343: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #59	-> 6
/*    */     //   #56	-> 190
/*    */     //   #58	-> 204
/*    */     //   #59	-> 221
/*    */     //   #72	-> 224
/*    */     //   #61	-> 238
/*    */     //   #72	-> 239
/*    */     //   #63	-> 248
/*    */     //   #62	-> 268
/*    */     //   #60	-> 291
/*    */     //   #75	-> 306
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   19	325	6	$dirty	I
/*    */     //   0	344	0	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	344	1	description	Ljava/lang/String;
/*    */     //   0	344	2	actions	Ljava/util/List;
/*    */     //   0	344	3	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	344	4	$changed	I
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   @SourceDebugExtension({"SMAP\nJunieErrorBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieErrorBanner.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt$JunieWarningBanner$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n149#2:120\n99#3:121\n95#3,7:122\n102#3:157\n106#3:163\n79#4,6:129\n86#4,4:144\n90#4,2:154\n94#4:162\n368#5,9:135\n377#5:156\n378#5,2:160\n4034#6,6:148\n1863#7,2:158\n*S KotlinDebug\n*F\n+ 1 JunieErrorBanner.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt$JunieWarningBanner$1\n*L\n65#1:120\n65#1:121\n65#1:122,7\n65#1:157\n65#1:163\n65#1:129,6\n65#1:144,4\n65#1:154,2\n65#1:162\n65#1:135,9\n65#1:156\n65#1:160,2\n65#1:148,6\n66#1:158,2\n*E\n"})
/*    */   static final class JunieErrorBannerKt$JunieWarningBanner$1 implements Function3<RowScope, Composer, Integer, Unit> {
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(RowScope $this$JunieBanner, Composer $composer, int $changed) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc '$this$JunieBanner'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: iload_3
/*    */       //   7: bipush #17
/*    */       //   9: iand
/*    */       //   10: bipush #16
/*    */       //   12: if_icmpne -> 24
/*    */       //   15: aload_2
/*    */       //   16: invokeinterface getSkipping : ()Z
/*    */       //   21: ifne -> 585
/*    */       //   24: invokestatic isTraceInProgress : ()Z
/*    */       //   27: ifeq -> 39
/*    */       //   30: ldc -2059587615
/*    */       //   32: iload_3
/*    */       //   33: iconst_m1
/*    */       //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieWarningBanner.<anonymous> (JunieErrorBanner.kt:63)'
/*    */       //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */       //   39: aload_0
/*    */       //   40: getfield $actions : Ljava/util/List;
/*    */       //   43: checkcast java/util/Collection
/*    */       //   46: invokeinterface isEmpty : ()Z
/*    */       //   51: ifne -> 58
/*    */       //   54: iconst_1
/*    */       //   55: goto -> 59
/*    */       //   58: iconst_0
/*    */       //   59: ifeq -> 573
/*    */       //   62: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */       //   65: bipush #12
/*    */       //   67: istore #5
/*    */       //   69: iconst_0
/*    */       //   70: istore #6
/*    */       //   72: iload #5
/*    */       //   74: i2f
/*    */       //   75: invokestatic constructor-impl : (F)F
/*    */       //   78: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */       //   81: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*    */       //   84: astore #5
/*    */       //   86: aload_0
/*    */       //   87: getfield $actions : Ljava/util/List;
/*    */       //   90: astore #7
/*    */       //   92: bipush #48
/*    */       //   94: istore #8
/*    */       //   96: iconst_0
/*    */       //   97: istore #9
/*    */       //   99: aload_2
/*    */       //   100: ldc 693286680
/*    */       //   102: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */       //   104: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */       //   107: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */       //   110: checkcast androidx/compose/ui/Modifier
/*    */       //   113: astore #4
/*    */       //   115: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */       //   118: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */       //   121: astore #6
/*    */       //   123: aload #5
/*    */       //   125: aload #6
/*    */       //   127: aload_2
/*    */       //   128: bipush #14
/*    */       //   130: iload #8
/*    */       //   132: iconst_3
/*    */       //   133: ishr
/*    */       //   134: iand
/*    */       //   135: bipush #112
/*    */       //   137: iload #8
/*    */       //   139: iconst_3
/*    */       //   140: ishr
/*    */       //   141: iand
/*    */       //   142: ior
/*    */       //   143: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */       //   146: astore #10
/*    */       //   148: bipush #112
/*    */       //   150: iload #8
/*    */       //   152: iconst_3
/*    */       //   153: ishl
/*    */       //   154: iand
/*    */       //   155: istore #11
/*    */       //   157: nop
/*    */       //   158: iconst_0
/*    */       //   159: istore #12
/*    */       //   161: aload_2
/*    */       //   162: ldc -1323940314
/*    */       //   164: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */       //   166: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */       //   169: aload_2
/*    */       //   170: iconst_0
/*    */       //   171: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */       //   174: istore #13
/*    */       //   176: aload_2
/*    */       //   177: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */       //   182: astore #14
/*    */       //   184: aload_2
/*    */       //   185: aload #4
/*    */       //   187: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */       //   190: astore #15
/*    */       //   192: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   195: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */       //   198: astore #16
/*    */       //   200: bipush #6
/*    */       //   202: sipush #896
/*    */       //   205: iload #11
/*    */       //   207: bipush #6
/*    */       //   209: ishl
/*    */       //   210: iand
/*    */       //   211: ior
/*    */       //   212: istore #17
/*    */       //   214: nop
/*    */       //   215: iconst_0
/*    */       //   216: istore #18
/*    */       //   218: aload_2
/*    */       //   219: ldc -692256719
/*    */       //   221: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */       //   223: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */       //   226: aload_2
/*    */       //   227: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */       //   232: instanceof androidx/compose/runtime/Applier
/*    */       //   235: ifne -> 241
/*    */       //   238: invokestatic invalidApplier : ()V
/*    */       //   241: aload_2
/*    */       //   242: invokeinterface startReusableNode : ()V
/*    */       //   247: aload_2
/*    */       //   248: invokeinterface getInserting : ()Z
/*    */       //   253: ifeq -> 267
/*    */       //   256: aload_2
/*    */       //   257: aload #16
/*    */       //   259: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */       //   264: goto -> 273
/*    */       //   267: aload_2
/*    */       //   268: invokeinterface useNode : ()V
/*    */       //   273: aload_2
/*    */       //   274: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */       //   277: astore #19
/*    */       //   279: iconst_0
/*    */       //   280: istore #20
/*    */       //   282: aload #19
/*    */       //   284: aload #10
/*    */       //   286: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   289: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */       //   292: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */       //   295: aload #19
/*    */       //   297: aload #14
/*    */       //   299: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   302: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */       //   305: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */       //   308: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   311: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */       //   314: astore #21
/*    */       //   316: iconst_0
/*    */       //   317: istore #22
/*    */       //   319: aload #19
/*    */       //   321: astore #23
/*    */       //   323: iconst_0
/*    */       //   324: istore #24
/*    */       //   326: aload #23
/*    */       //   328: invokeinterface getInserting : ()Z
/*    */       //   333: ifne -> 354
/*    */       //   336: aload #23
/*    */       //   338: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */       //   343: iload #13
/*    */       //   345: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */       //   348: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   351: ifne -> 380
/*    */       //   354: aload #23
/*    */       //   356: iload #13
/*    */       //   358: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */       //   361: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */       //   366: aload #19
/*    */       //   368: iload #13
/*    */       //   370: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */       //   373: aload #21
/*    */       //   375: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */       //   380: nop
/*    */       //   381: nop
/*    */       //   382: nop
/*    */       //   383: aload #19
/*    */       //   385: aload #15
/*    */       //   387: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   390: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */       //   393: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */       //   396: nop
/*    */       //   397: nop
/*    */       //   398: aload_2
/*    */       //   399: bipush #14
/*    */       //   401: iload #17
/*    */       //   403: bipush #6
/*    */       //   405: ishr
/*    */       //   406: iand
/*    */       //   407: istore #25
/*    */       //   409: astore #26
/*    */       //   411: iconst_0
/*    */       //   412: istore #27
/*    */       //   414: aload #26
/*    */       //   416: ldc -407840262
/*    */       //   418: ldc 'C101@5126L9:Row.kt#2w3rfo'
/*    */       //   420: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */       //   423: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */       //   426: aload #26
/*    */       //   428: bipush #6
/*    */       //   430: bipush #112
/*    */       //   432: iload #8
/*    */       //   434: bipush #6
/*    */       //   436: ishr
/*    */       //   437: iand
/*    */       //   438: ior
/*    */       //   439: istore #28
/*    */       //   441: astore #29
/*    */       //   443: checkcast androidx/compose/foundation/layout/RowScope
/*    */       //   446: astore #30
/*    */       //   448: iconst_0
/*    */       //   449: istore #31
/*    */       //   451: aload #29
/*    */       //   453: ldc 200178471
/*    */       //   455: invokeinterface startReplaceGroup : (I)V
/*    */       //   460: aload #7
/*    */       //   462: checkcast java/lang/Iterable
/*    */       //   465: astore #32
/*    */       //   467: iconst_0
/*    */       //   468: istore #33
/*    */       //   470: aload #32
/*    */       //   472: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   477: astore #34
/*    */       //   479: aload #34
/*    */       //   481: invokeinterface hasNext : ()Z
/*    */       //   486: ifeq -> 538
/*    */       //   489: aload #34
/*    */       //   491: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   496: astore #35
/*    */       //   498: aload #35
/*    */       //   500: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*    */       //   503: astore #36
/*    */       //   505: iconst_0
/*    */       //   506: istore #37
/*    */       //   508: aload #36
/*    */       //   510: invokevirtual getName : ()Ljava/lang/String;
/*    */       //   513: aload #36
/*    */       //   515: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */       //   518: aconst_null
/*    */       //   519: iconst_0
/*    */       //   520: aconst_null
/*    */       //   521: iconst_0
/*    */       //   522: aconst_null
/*    */       //   523: aconst_null
/*    */       //   524: aload #29
/*    */       //   526: iconst_0
/*    */       //   527: sipush #252
/*    */       //   530: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*    */       //   533: nop
/*    */       //   534: nop
/*    */       //   535: goto -> 479
/*    */       //   538: nop
/*    */       //   539: aload #29
/*    */       //   541: invokeinterface endReplaceGroup : ()V
/*    */       //   546: nop
/*    */       //   547: aload #26
/*    */       //   549: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */       //   552: aload_2
/*    */       //   553: invokeinterface endNode : ()V
/*    */       //   558: aload_2
/*    */       //   559: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */       //   562: nop
/*    */       //   563: aload_2
/*    */       //   564: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */       //   567: nop
/*    */       //   568: aload_2
/*    */       //   569: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */       //   572: nop
/*    */       //   573: invokestatic isTraceInProgress : ()Z
/*    */       //   576: ifeq -> 591
/*    */       //   579: invokestatic traceEventEnd : ()V
/*    */       //   582: goto -> 591
/*    */       //   585: aload_2
/*    */       //   586: invokeinterface skipToGroupEnd : ()V
/*    */       //   591: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #64	-> 6
/*    */       //   #64	-> 59
/*    */       //   #65	-> 62
/*    */       //   #120	-> 72
/*    */       //   #65	-> 78
/*    */       //   #121	-> 104
/*    */       //   #122	-> 107
/*    */       //   #124	-> 115
/*    */       //   #127	-> 123
/*    */       //   #128	-> 157
/*    */       //   #129	-> 166
/*    */       //   #130	-> 171
/*    */       //   #131	-> 177
/*    */       //   #132	-> 185
/*    */       //   #134	-> 192
/*    */       //   #133	-> 214
/*    */       //   #135	-> 223
/*    */       //   #136	-> 226
/*    */       //   #137	-> 242
/*    */       //   #138	-> 247
/*    */       //   #139	-> 257
/*    */       //   #141	-> 268
/*    */       //   #143	-> 273
/*    */       //   #144	-> 282
/*    */       //   #145	-> 295
/*    */       //   #147	-> 308
/*    */       //   #148	-> 319
/*    */       //   #149	-> 326
/*    */       //   #150	-> 354
/*    */       //   #151	-> 366
/*    */       //   #153	-> 380
/*    */       //   #148	-> 381
/*    */       //   #153	-> 382
/*    */       //   #154	-> 383
/*    */       //   #155	-> 396
/*    */       //   #143	-> 397
/*    */       //   #156	-> 398
/*    */       //   #157	-> 420
/*    */       //   #66	-> 460
/*    */       //   #158	-> 470
/*    */       //   #67	-> 508
/*    */       //   #68	-> 533
/*    */       //   #158	-> 534
/*    */       //   #159	-> 538
/*    */       //   #69	-> 546
/*    */       //   #157	-> 547
/*    */       //   #156	-> 552
/*    */       //   #160	-> 553
/*    */       //   #135	-> 559
/*    */       //   #161	-> 562
/*    */       //   #129	-> 564
/*    */       //   #162	-> 567
/*    */       //   #121	-> 569
/*    */       //   #163	-> 572
/*    */       //   #70	-> 585
/*    */       //   #71	-> 591
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   72	6	6	$i$f$getDp	I
/*    */       //   69	9	5	$this$dp$iv	I
/*    */       //   508	26	37	$i$a$-forEach-JunieErrorBannerKt$JunieWarningBanner$1$1$1	I
/*    */       //   505	29	36	action	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */       //   498	37	35	element$iv	Ljava/lang/Object;
/*    */       //   470	69	33	$i$f$forEach	I
/*    */       //   467	72	32	$this$forEach$iv	Ljava/lang/Iterable;
/*    */       //   451	96	31	$i$a$-Row-JunieErrorBannerKt$JunieWarningBanner$1$1	I
/*    */       //   448	99	30	$this$invoke_u24lambda_u241	Landroidx/compose/foundation/layout/RowScope;
/*    */       //   448	99	29	$composer	Landroidx/compose/runtime/Composer;
/*    */       //   448	99	28	$changed	I
/*    */       //   414	138	27	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */       //   411	141	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */       //   411	141	25	$changed$iv	I
/*    */       //   326	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */       //   323	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */       //   319	64	22	$i$f$set-impl	I
/*    */       //   316	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */       //   282	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */       //   279	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */       //   218	345	18	$i$f$ReusableComposeNode	I
/*    */       //   215	348	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */       //   215	348	17	$changed$iv$iv$iv	I
/*    */       //   161	407	12	$i$f$Layout	I
/*    */       //   176	392	13	compositeKeyHash$iv$iv	I
/*    */       //   184	384	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */       //   192	376	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */       //   158	410	11	$changed$iv$iv	I
/*    */       //   99	474	9	$i$f$Row	I
/*    */       //   148	425	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */       //   115	458	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */       //   96	477	5	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */       //   123	450	6	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*    */       //   96	477	8	$changed$iv	I
/*    */       //   0	592	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt$JunieWarningBanner$1;
/*    */       //   0	592	1	$this$JunieBanner	Landroidx/compose/foundation/layout/RowScope;
/*    */       //   0	592	2	$composer	Landroidx/compose/runtime/Composer;
/*    */       //   0	592	3	$changed	I
/*    */     }
/*    */     
/*    */     JunieErrorBannerKt$JunieWarningBanner$1(List<Action> $actions) {}
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*    */   private static final void JunieBanner(String text, DefaultBannerStyle style, TextStyle textStyle, Function2 icon, Function3 actions, Modifier modifier, Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload #6
/*    */     //   2: ldc 340218416
/*    */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   9: astore #6
/*    */     //   11: iload #7
/*    */     //   13: istore #9
/*    */     //   15: iload #8
/*    */     //   17: iconst_1
/*    */     //   18: iand
/*    */     //   19: ifeq -> 32
/*    */     //   22: iload #9
/*    */     //   24: bipush #6
/*    */     //   26: ior
/*    */     //   27: istore #9
/*    */     //   29: goto -> 61
/*    */     //   32: iload #7
/*    */     //   34: bipush #6
/*    */     //   36: iand
/*    */     //   37: ifne -> 61
/*    */     //   40: iload #9
/*    */     //   42: aload #6
/*    */     //   44: aload_0
/*    */     //   45: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   50: ifeq -> 57
/*    */     //   53: iconst_4
/*    */     //   54: goto -> 58
/*    */     //   57: iconst_2
/*    */     //   58: ior
/*    */     //   59: istore #9
/*    */     //   61: iload #8
/*    */     //   63: iconst_2
/*    */     //   64: iand
/*    */     //   65: ifeq -> 78
/*    */     //   68: iload #9
/*    */     //   70: bipush #48
/*    */     //   72: ior
/*    */     //   73: istore #9
/*    */     //   75: goto -> 109
/*    */     //   78: iload #7
/*    */     //   80: bipush #48
/*    */     //   82: iand
/*    */     //   83: ifne -> 109
/*    */     //   86: iload #9
/*    */     //   88: aload #6
/*    */     //   90: aload_1
/*    */     //   91: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   96: ifeq -> 104
/*    */     //   99: bipush #32
/*    */     //   101: goto -> 106
/*    */     //   104: bipush #16
/*    */     //   106: ior
/*    */     //   107: istore #9
/*    */     //   109: iload #7
/*    */     //   111: sipush #384
/*    */     //   114: iand
/*    */     //   115: ifne -> 150
/*    */     //   118: iload #9
/*    */     //   120: iload #8
/*    */     //   122: iconst_4
/*    */     //   123: iand
/*    */     //   124: ifne -> 144
/*    */     //   127: aload #6
/*    */     //   129: aload_2
/*    */     //   130: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   135: ifeq -> 144
/*    */     //   138: sipush #256
/*    */     //   141: goto -> 147
/*    */     //   144: sipush #128
/*    */     //   147: ior
/*    */     //   148: istore #9
/*    */     //   150: iload #8
/*    */     //   152: bipush #8
/*    */     //   154: iand
/*    */     //   155: ifeq -> 169
/*    */     //   158: iload #9
/*    */     //   160: sipush #3072
/*    */     //   163: ior
/*    */     //   164: istore #9
/*    */     //   166: goto -> 203
/*    */     //   169: iload #7
/*    */     //   171: sipush #3072
/*    */     //   174: iand
/*    */     //   175: ifne -> 203
/*    */     //   178: iload #9
/*    */     //   180: aload #6
/*    */     //   182: aload_3
/*    */     //   183: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   188: ifeq -> 197
/*    */     //   191: sipush #2048
/*    */     //   194: goto -> 200
/*    */     //   197: sipush #1024
/*    */     //   200: ior
/*    */     //   201: istore #9
/*    */     //   203: iload #8
/*    */     //   205: bipush #16
/*    */     //   207: iand
/*    */     //   208: ifeq -> 222
/*    */     //   211: iload #9
/*    */     //   213: sipush #24576
/*    */     //   216: ior
/*    */     //   217: istore #9
/*    */     //   219: goto -> 257
/*    */     //   222: iload #7
/*    */     //   224: sipush #24576
/*    */     //   227: iand
/*    */     //   228: ifne -> 257
/*    */     //   231: iload #9
/*    */     //   233: aload #6
/*    */     //   235: aload #4
/*    */     //   237: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   242: ifeq -> 251
/*    */     //   245: sipush #16384
/*    */     //   248: goto -> 254
/*    */     //   251: sipush #8192
/*    */     //   254: ior
/*    */     //   255: istore #9
/*    */     //   257: iload #8
/*    */     //   259: bipush #32
/*    */     //   261: iand
/*    */     //   262: ifeq -> 275
/*    */     //   265: iload #9
/*    */     //   267: ldc 196608
/*    */     //   269: ior
/*    */     //   270: istore #9
/*    */     //   272: goto -> 307
/*    */     //   275: iload #7
/*    */     //   277: ldc 196608
/*    */     //   279: iand
/*    */     //   280: ifne -> 307
/*    */     //   283: iload #9
/*    */     //   285: aload #6
/*    */     //   287: aload #5
/*    */     //   289: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   294: ifeq -> 302
/*    */     //   297: ldc 131072
/*    */     //   299: goto -> 304
/*    */     //   302: ldc 65536
/*    */     //   304: ior
/*    */     //   305: istore #9
/*    */     //   307: iload #9
/*    */     //   309: ldc 74899
/*    */     //   311: iand
/*    */     //   312: ldc 74898
/*    */     //   314: if_icmpne -> 327
/*    */     //   317: aload #6
/*    */     //   319: invokeinterface getSkipping : ()Z
/*    */     //   324: ifne -> 2444
/*    */     //   327: aload #6
/*    */     //   329: invokeinterface startDefaults : ()V
/*    */     //   334: iload #7
/*    */     //   336: iconst_1
/*    */     //   337: iand
/*    */     //   338: ifeq -> 351
/*    */     //   341: aload #6
/*    */     //   343: invokeinterface getDefaultsInvalid : ()Z
/*    */     //   348: ifeq -> 406
/*    */     //   351: iload #8
/*    */     //   353: iconst_4
/*    */     //   354: iand
/*    */     //   355: ifeq -> 377
/*    */     //   358: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   361: aload #6
/*    */     //   363: bipush #6
/*    */     //   365: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*    */     //   368: astore_2
/*    */     //   369: iload #9
/*    */     //   371: sipush #-897
/*    */     //   374: iand
/*    */     //   375: istore #9
/*    */     //   377: iload #8
/*    */     //   379: bipush #8
/*    */     //   381: iand
/*    */     //   382: ifeq -> 387
/*    */     //   385: aconst_null
/*    */     //   386: astore_3
/*    */     //   387: iload #8
/*    */     //   389: bipush #32
/*    */     //   391: iand
/*    */     //   392: ifeq -> 428
/*    */     //   395: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   398: checkcast androidx/compose/ui/Modifier
/*    */     //   401: astore #5
/*    */     //   403: goto -> 428
/*    */     //   406: aload #6
/*    */     //   408: invokeinterface skipToGroupEnd : ()V
/*    */     //   413: iload #8
/*    */     //   415: iconst_4
/*    */     //   416: iand
/*    */     //   417: ifeq -> 428
/*    */     //   420: iload #9
/*    */     //   422: sipush #-897
/*    */     //   425: iand
/*    */     //   426: istore #9
/*    */     //   428: aload #6
/*    */     //   430: invokeinterface endDefaults : ()V
/*    */     //   435: invokestatic isTraceInProgress : ()Z
/*    */     //   438: ifeq -> 451
/*    */     //   441: ldc 340218416
/*    */     //   443: iload #9
/*    */     //   445: iconst_m1
/*    */     //   446: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieBanner (JunieErrorBanner.kt:93)'
/*    */     //   448: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   451: aload #5
/*    */     //   453: astore #10
/*    */     //   455: bipush #14
/*    */     //   457: iload #9
/*    */     //   459: bipush #15
/*    */     //   461: ishr
/*    */     //   462: iand
/*    */     //   463: istore #13
/*    */     //   465: iconst_0
/*    */     //   466: istore #14
/*    */     //   468: aload #6
/*    */     //   470: ldc -483455358
/*    */     //   472: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */     //   474: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   477: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   480: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   483: astore #11
/*    */     //   485: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   488: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   491: astore #12
/*    */     //   493: aload #11
/*    */     //   495: aload #12
/*    */     //   497: aload #6
/*    */     //   499: bipush #14
/*    */     //   501: iload #13
/*    */     //   503: iconst_3
/*    */     //   504: ishr
/*    */     //   505: iand
/*    */     //   506: bipush #112
/*    */     //   508: iload #13
/*    */     //   510: iconst_3
/*    */     //   511: ishr
/*    */     //   512: iand
/*    */     //   513: ior
/*    */     //   514: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   517: astore #15
/*    */     //   519: bipush #112
/*    */     //   521: iload #13
/*    */     //   523: iconst_3
/*    */     //   524: ishl
/*    */     //   525: iand
/*    */     //   526: istore #16
/*    */     //   528: nop
/*    */     //   529: iconst_0
/*    */     //   530: istore #17
/*    */     //   532: aload #6
/*    */     //   534: ldc_w -1323940314
/*    */     //   537: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   540: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   543: aload #6
/*    */     //   545: iconst_0
/*    */     //   546: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   549: istore #18
/*    */     //   551: aload #6
/*    */     //   553: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   558: astore #19
/*    */     //   560: aload #6
/*    */     //   562: aload #10
/*    */     //   564: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   567: astore #20
/*    */     //   569: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   572: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   575: astore #21
/*    */     //   577: bipush #6
/*    */     //   579: sipush #896
/*    */     //   582: iload #16
/*    */     //   584: bipush #6
/*    */     //   586: ishl
/*    */     //   587: iand
/*    */     //   588: ior
/*    */     //   589: istore #22
/*    */     //   591: nop
/*    */     //   592: iconst_0
/*    */     //   593: istore #23
/*    */     //   595: aload #6
/*    */     //   597: ldc_w -692256719
/*    */     //   600: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   603: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   606: aload #6
/*    */     //   608: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   613: instanceof androidx/compose/runtime/Applier
/*    */     //   616: ifne -> 622
/*    */     //   619: invokestatic invalidApplier : ()V
/*    */     //   622: aload #6
/*    */     //   624: invokeinterface startReusableNode : ()V
/*    */     //   629: aload #6
/*    */     //   631: invokeinterface getInserting : ()Z
/*    */     //   636: ifeq -> 651
/*    */     //   639: aload #6
/*    */     //   641: aload #21
/*    */     //   643: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   648: goto -> 658
/*    */     //   651: aload #6
/*    */     //   653: invokeinterface useNode : ()V
/*    */     //   658: aload #6
/*    */     //   660: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   663: astore #24
/*    */     //   665: iconst_0
/*    */     //   666: istore #25
/*    */     //   668: aload #24
/*    */     //   670: aload #15
/*    */     //   672: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   675: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   678: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   681: aload #24
/*    */     //   683: aload #19
/*    */     //   685: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   688: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   691: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   694: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   697: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   700: astore #26
/*    */     //   702: iconst_0
/*    */     //   703: istore #27
/*    */     //   705: aload #24
/*    */     //   707: astore #28
/*    */     //   709: iconst_0
/*    */     //   710: istore #29
/*    */     //   712: aload #28
/*    */     //   714: invokeinterface getInserting : ()Z
/*    */     //   719: ifne -> 740
/*    */     //   722: aload #28
/*    */     //   724: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   729: iload #18
/*    */     //   731: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   734: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   737: ifne -> 766
/*    */     //   740: aload #28
/*    */     //   742: iload #18
/*    */     //   744: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   747: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   752: aload #24
/*    */     //   754: iload #18
/*    */     //   756: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   759: aload #26
/*    */     //   761: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   766: nop
/*    */     //   767: nop
/*    */     //   768: nop
/*    */     //   769: aload #24
/*    */     //   771: aload #20
/*    */     //   773: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   776: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   779: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   782: nop
/*    */     //   783: nop
/*    */     //   784: aload #6
/*    */     //   786: bipush #14
/*    */     //   788: iload #22
/*    */     //   790: bipush #6
/*    */     //   792: ishr
/*    */     //   793: iand
/*    */     //   794: istore #30
/*    */     //   796: astore #31
/*    */     //   798: iconst_0
/*    */     //   799: istore #32
/*    */     //   801: aload #31
/*    */     //   803: ldc_w -384784025
/*    */     //   806: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*    */     //   809: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   812: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */     //   815: aload #31
/*    */     //   817: bipush #6
/*    */     //   819: bipush #112
/*    */     //   821: iload #13
/*    */     //   823: bipush #6
/*    */     //   825: ishr
/*    */     //   826: iand
/*    */     //   827: ior
/*    */     //   828: istore #33
/*    */     //   830: astore #34
/*    */     //   832: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */     //   835: astore #35
/*    */     //   837: iconst_0
/*    */     //   838: istore #36
/*    */     //   840: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
/*    */     //   843: astore #37
/*    */     //   845: aload_1
/*    */     //   846: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/BannerColors;
/*    */     //   849: invokevirtual getBorder-0d7_KjU : ()J
/*    */     //   852: lstore #38
/*    */     //   854: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   857: checkcast androidx/compose/ui/Modifier
/*    */     //   860: fconst_0
/*    */     //   861: iconst_1
/*    */     //   862: aconst_null
/*    */     //   863: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   866: aload #37
/*    */     //   868: swap
/*    */     //   869: lload #38
/*    */     //   871: fconst_0
/*    */     //   872: fconst_0
/*    */     //   873: aconst_null
/*    */     //   874: aload #34
/*    */     //   876: bipush #54
/*    */     //   878: bipush #56
/*    */     //   880: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
/*    */     //   883: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   886: checkcast androidx/compose/ui/Modifier
/*    */     //   889: aload_1
/*    */     //   890: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/BannerColors;
/*    */     //   893: invokevirtual getBackground-0d7_KjU : ()J
/*    */     //   896: aconst_null
/*    */     //   897: iconst_2
/*    */     //   898: aconst_null
/*    */     //   899: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   902: bipush #10
/*    */     //   904: istore #37
/*    */     //   906: iconst_0
/*    */     //   907: istore #40
/*    */     //   909: iload #37
/*    */     //   911: i2f
/*    */     //   912: invokestatic constructor-impl : (F)F
/*    */     //   915: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*    */     //   918: astore #37
/*    */     //   920: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   923: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   926: astore #41
/*    */     //   928: sipush #384
/*    */     //   931: istore #42
/*    */     //   933: nop
/*    */     //   934: iconst_0
/*    */     //   935: istore #43
/*    */     //   937: aload #34
/*    */     //   939: ldc_w 693286680
/*    */     //   942: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   945: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   948: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   951: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   954: astore #40
/*    */     //   956: aload #40
/*    */     //   958: aload #41
/*    */     //   960: aload #34
/*    */     //   962: bipush #14
/*    */     //   964: iload #42
/*    */     //   966: iconst_3
/*    */     //   967: ishr
/*    */     //   968: iand
/*    */     //   969: bipush #112
/*    */     //   971: iload #42
/*    */     //   973: iconst_3
/*    */     //   974: ishr
/*    */     //   975: iand
/*    */     //   976: ior
/*    */     //   977: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   980: astore #44
/*    */     //   982: bipush #112
/*    */     //   984: iload #42
/*    */     //   986: iconst_3
/*    */     //   987: ishl
/*    */     //   988: iand
/*    */     //   989: istore #45
/*    */     //   991: nop
/*    */     //   992: iconst_0
/*    */     //   993: istore #46
/*    */     //   995: aload #34
/*    */     //   997: ldc_w -1323940314
/*    */     //   1000: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   1003: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1006: aload #34
/*    */     //   1008: iconst_0
/*    */     //   1009: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   1012: istore #47
/*    */     //   1014: aload #34
/*    */     //   1016: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1021: astore #48
/*    */     //   1023: aload #34
/*    */     //   1025: aload #37
/*    */     //   1027: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   1030: astore #49
/*    */     //   1032: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1035: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   1038: astore #50
/*    */     //   1040: bipush #6
/*    */     //   1042: sipush #896
/*    */     //   1045: iload #45
/*    */     //   1047: bipush #6
/*    */     //   1049: ishl
/*    */     //   1050: iand
/*    */     //   1051: ior
/*    */     //   1052: istore #51
/*    */     //   1054: nop
/*    */     //   1055: iconst_0
/*    */     //   1056: istore #52
/*    */     //   1058: aload #34
/*    */     //   1060: ldc_w -692256719
/*    */     //   1063: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   1066: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1069: aload #34
/*    */     //   1071: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   1076: instanceof androidx/compose/runtime/Applier
/*    */     //   1079: ifne -> 1085
/*    */     //   1082: invokestatic invalidApplier : ()V
/*    */     //   1085: aload #34
/*    */     //   1087: invokeinterface startReusableNode : ()V
/*    */     //   1092: aload #34
/*    */     //   1094: invokeinterface getInserting : ()Z
/*    */     //   1099: ifeq -> 1114
/*    */     //   1102: aload #34
/*    */     //   1104: aload #50
/*    */     //   1106: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   1111: goto -> 1121
/*    */     //   1114: aload #34
/*    */     //   1116: invokeinterface useNode : ()V
/*    */     //   1121: aload #34
/*    */     //   1123: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   1126: astore #53
/*    */     //   1128: iconst_0
/*    */     //   1129: istore #54
/*    */     //   1131: aload #53
/*    */     //   1133: aload #44
/*    */     //   1135: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1138: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1141: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1144: aload #53
/*    */     //   1146: aload #48
/*    */     //   1148: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1151: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1154: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1157: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1160: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1163: astore #55
/*    */     //   1165: iconst_0
/*    */     //   1166: istore #56
/*    */     //   1168: aload #53
/*    */     //   1170: astore #57
/*    */     //   1172: iconst_0
/*    */     //   1173: istore #58
/*    */     //   1175: aload #57
/*    */     //   1177: invokeinterface getInserting : ()Z
/*    */     //   1182: ifne -> 1203
/*    */     //   1185: aload #57
/*    */     //   1187: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1192: iload #47
/*    */     //   1194: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1197: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   1200: ifne -> 1229
/*    */     //   1203: aload #57
/*    */     //   1205: iload #47
/*    */     //   1207: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1210: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1215: aload #53
/*    */     //   1217: iload #47
/*    */     //   1219: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1222: aload #55
/*    */     //   1224: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1229: nop
/*    */     //   1230: nop
/*    */     //   1231: nop
/*    */     //   1232: aload #53
/*    */     //   1234: aload #49
/*    */     //   1236: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1239: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1242: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1245: nop
/*    */     //   1246: nop
/*    */     //   1247: aload #34
/*    */     //   1249: bipush #14
/*    */     //   1251: iload #51
/*    */     //   1253: bipush #6
/*    */     //   1255: ishr
/*    */     //   1256: iand
/*    */     //   1257: istore #59
/*    */     //   1259: astore #60
/*    */     //   1261: iconst_0
/*    */     //   1262: istore #61
/*    */     //   1264: aload #60
/*    */     //   1266: ldc_w -407840262
/*    */     //   1269: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   1272: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1275: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   1278: aload #60
/*    */     //   1280: bipush #6
/*    */     //   1282: bipush #112
/*    */     //   1284: iload #42
/*    */     //   1286: bipush #6
/*    */     //   1288: ishr
/*    */     //   1289: iand
/*    */     //   1290: ior
/*    */     //   1291: istore #62
/*    */     //   1293: astore #63
/*    */     //   1295: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   1298: astore #64
/*    */     //   1300: iconst_0
/*    */     //   1301: istore #65
/*    */     //   1303: aload #63
/*    */     //   1305: ldc_w -450773821
/*    */     //   1308: invokeinterface startReplaceGroup : (I)V
/*    */     //   1313: aload_3
/*    */     //   1314: ifnull -> 1779
/*    */     //   1317: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1320: checkcast androidx/compose/ui/Modifier
/*    */     //   1323: bipush #16
/*    */     //   1325: istore #66
/*    */     //   1327: iconst_0
/*    */     //   1328: istore #67
/*    */     //   1330: iload #66
/*    */     //   1332: i2f
/*    */     //   1333: invokestatic constructor-impl : (F)F
/*    */     //   1336: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*    */     //   1339: astore #66
/*    */     //   1341: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   1344: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*    */     //   1347: astore #67
/*    */     //   1349: bipush #54
/*    */     //   1351: istore #68
/*    */     //   1353: iconst_0
/*    */     //   1354: istore #69
/*    */     //   1356: aload #63
/*    */     //   1358: ldc_w 733328855
/*    */     //   1361: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*    */     //   1364: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1367: iconst_0
/*    */     //   1368: istore #70
/*    */     //   1370: aload #67
/*    */     //   1372: iload #70
/*    */     //   1374: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1377: astore #71
/*    */     //   1379: bipush #112
/*    */     //   1381: iload #68
/*    */     //   1383: iconst_3
/*    */     //   1384: ishl
/*    */     //   1385: iand
/*    */     //   1386: istore #72
/*    */     //   1388: nop
/*    */     //   1389: iconst_0
/*    */     //   1390: istore #73
/*    */     //   1392: aload #63
/*    */     //   1394: ldc_w -1323940314
/*    */     //   1397: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   1400: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1403: aload #63
/*    */     //   1405: iconst_0
/*    */     //   1406: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   1409: istore #74
/*    */     //   1411: aload #63
/*    */     //   1413: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1418: astore #75
/*    */     //   1420: aload #63
/*    */     //   1422: aload #66
/*    */     //   1424: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   1427: astore #76
/*    */     //   1429: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1432: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   1435: astore #77
/*    */     //   1437: bipush #6
/*    */     //   1439: sipush #896
/*    */     //   1442: iload #72
/*    */     //   1444: bipush #6
/*    */     //   1446: ishl
/*    */     //   1447: iand
/*    */     //   1448: ior
/*    */     //   1449: istore #78
/*    */     //   1451: nop
/*    */     //   1452: iconst_0
/*    */     //   1453: istore #79
/*    */     //   1455: aload #63
/*    */     //   1457: ldc_w -692256719
/*    */     //   1460: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   1463: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1466: aload #63
/*    */     //   1468: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   1473: instanceof androidx/compose/runtime/Applier
/*    */     //   1476: ifne -> 1482
/*    */     //   1479: invokestatic invalidApplier : ()V
/*    */     //   1482: aload #63
/*    */     //   1484: invokeinterface startReusableNode : ()V
/*    */     //   1489: aload #63
/*    */     //   1491: invokeinterface getInserting : ()Z
/*    */     //   1496: ifeq -> 1511
/*    */     //   1499: aload #63
/*    */     //   1501: aload #77
/*    */     //   1503: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   1508: goto -> 1518
/*    */     //   1511: aload #63
/*    */     //   1513: invokeinterface useNode : ()V
/*    */     //   1518: aload #63
/*    */     //   1520: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   1523: astore #80
/*    */     //   1525: iconst_0
/*    */     //   1526: istore #81
/*    */     //   1528: aload #80
/*    */     //   1530: aload #71
/*    */     //   1532: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1535: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1538: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1541: aload #80
/*    */     //   1543: aload #75
/*    */     //   1545: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1548: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1551: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1554: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1557: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1560: astore #82
/*    */     //   1562: iconst_0
/*    */     //   1563: istore #83
/*    */     //   1565: aload #80
/*    */     //   1567: astore #84
/*    */     //   1569: iconst_0
/*    */     //   1570: istore #85
/*    */     //   1572: aload #84
/*    */     //   1574: invokeinterface getInserting : ()Z
/*    */     //   1579: ifne -> 1600
/*    */     //   1582: aload #84
/*    */     //   1584: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1589: iload #74
/*    */     //   1591: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1594: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   1597: ifne -> 1626
/*    */     //   1600: aload #84
/*    */     //   1602: iload #74
/*    */     //   1604: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1607: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1612: aload #80
/*    */     //   1614: iload #74
/*    */     //   1616: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1619: aload #82
/*    */     //   1621: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1626: nop
/*    */     //   1627: nop
/*    */     //   1628: nop
/*    */     //   1629: aload #80
/*    */     //   1631: aload #76
/*    */     //   1633: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1636: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1639: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1642: nop
/*    */     //   1643: nop
/*    */     //   1644: aload #63
/*    */     //   1646: bipush #14
/*    */     //   1648: iload #78
/*    */     //   1650: bipush #6
/*    */     //   1652: ishr
/*    */     //   1653: iand
/*    */     //   1654: istore #86
/*    */     //   1656: astore #87
/*    */     //   1658: iconst_0
/*    */     //   1659: istore #88
/*    */     //   1661: aload #87
/*    */     //   1663: ldc_w -2146769399
/*    */     //   1666: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*    */     //   1669: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1672: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*    */     //   1675: aload #87
/*    */     //   1677: bipush #6
/*    */     //   1679: bipush #112
/*    */     //   1681: iload #68
/*    */     //   1683: bipush #6
/*    */     //   1685: ishr
/*    */     //   1686: iand
/*    */     //   1687: ior
/*    */     //   1688: istore #89
/*    */     //   1690: astore #90
/*    */     //   1692: checkcast androidx/compose/foundation/layout/BoxScope
/*    */     //   1695: astore #91
/*    */     //   1697: iconst_0
/*    */     //   1698: istore #92
/*    */     //   1700: aload_3
/*    */     //   1701: aload #90
/*    */     //   1703: bipush #14
/*    */     //   1705: iload #9
/*    */     //   1707: bipush #9
/*    */     //   1709: ishr
/*    */     //   1710: iand
/*    */     //   1711: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1714: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   1719: pop
/*    */     //   1720: aload #87
/*    */     //   1722: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1725: aload #63
/*    */     //   1727: invokeinterface endNode : ()V
/*    */     //   1732: aload #63
/*    */     //   1734: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1737: nop
/*    */     //   1738: aload #63
/*    */     //   1740: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1743: nop
/*    */     //   1744: aload #63
/*    */     //   1746: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1749: nop
/*    */     //   1750: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1753: checkcast androidx/compose/ui/Modifier
/*    */     //   1756: bipush #8
/*    */     //   1758: istore #66
/*    */     //   1760: iconst_0
/*    */     //   1761: istore #67
/*    */     //   1763: iload #66
/*    */     //   1765: i2f
/*    */     //   1766: invokestatic constructor-impl : (F)F
/*    */     //   1769: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*    */     //   1772: aload #63
/*    */     //   1774: bipush #6
/*    */     //   1776: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*    */     //   1779: aload #63
/*    */     //   1781: invokeinterface endReplaceGroup : ()V
/*    */     //   1786: aload #64
/*    */     //   1788: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1791: checkcast androidx/compose/ui/Modifier
/*    */     //   1794: fconst_1
/*    */     //   1795: iconst_0
/*    */     //   1796: iconst_2
/*    */     //   1797: aconst_null
/*    */     //   1798: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   1801: aload_0
/*    */     //   1802: swap
/*    */     //   1803: lconst_0
/*    */     //   1804: lconst_0
/*    */     //   1805: aconst_null
/*    */     //   1806: aconst_null
/*    */     //   1807: aconst_null
/*    */     //   1808: lconst_0
/*    */     //   1809: aconst_null
/*    */     //   1810: iconst_0
/*    */     //   1811: lconst_0
/*    */     //   1812: iconst_0
/*    */     //   1813: iconst_0
/*    */     //   1814: iconst_0
/*    */     //   1815: aconst_null
/*    */     //   1816: aload_2
/*    */     //   1817: aload #63
/*    */     //   1819: bipush #14
/*    */     //   1821: iload #9
/*    */     //   1823: iand
/*    */     //   1824: ldc 458752
/*    */     //   1826: iload #9
/*    */     //   1828: bipush #9
/*    */     //   1830: ishl
/*    */     //   1831: iand
/*    */     //   1832: sipush #32764
/*    */     //   1835: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   1838: aload #63
/*    */     //   1840: ldc_w -450766093
/*    */     //   1843: invokeinterface startReplaceGroup : (I)V
/*    */     //   1848: aload #4
/*    */     //   1850: ifnull -> 2320
/*    */     //   1853: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   1856: bipush #8
/*    */     //   1858: istore #67
/*    */     //   1860: iconst_0
/*    */     //   1861: istore #70
/*    */     //   1863: iload #67
/*    */     //   1865: i2f
/*    */     //   1866: invokestatic constructor-impl : (F)F
/*    */     //   1869: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */     //   1872: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*    */     //   1875: astore #67
/*    */     //   1877: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   1880: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   1883: astore #70
/*    */     //   1885: sipush #432
/*    */     //   1888: istore #68
/*    */     //   1890: nop
/*    */     //   1891: iconst_0
/*    */     //   1892: istore #69
/*    */     //   1894: aload #63
/*    */     //   1896: ldc_w 693286680
/*    */     //   1899: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   1902: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1905: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1908: checkcast androidx/compose/ui/Modifier
/*    */     //   1911: astore #66
/*    */     //   1913: aload #67
/*    */     //   1915: aload #70
/*    */     //   1917: aload #63
/*    */     //   1919: bipush #14
/*    */     //   1921: iload #68
/*    */     //   1923: iconst_3
/*    */     //   1924: ishr
/*    */     //   1925: iand
/*    */     //   1926: bipush #112
/*    */     //   1928: iload #68
/*    */     //   1930: iconst_3
/*    */     //   1931: ishr
/*    */     //   1932: iand
/*    */     //   1933: ior
/*    */     //   1934: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1937: astore #71
/*    */     //   1939: bipush #112
/*    */     //   1941: iload #68
/*    */     //   1943: iconst_3
/*    */     //   1944: ishl
/*    */     //   1945: iand
/*    */     //   1946: istore #72
/*    */     //   1948: nop
/*    */     //   1949: iconst_0
/*    */     //   1950: istore #73
/*    */     //   1952: aload #63
/*    */     //   1954: ldc_w -1323940314
/*    */     //   1957: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   1960: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1963: aload #63
/*    */     //   1965: iconst_0
/*    */     //   1966: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   1969: istore #74
/*    */     //   1971: aload #63
/*    */     //   1973: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1978: astore #75
/*    */     //   1980: aload #63
/*    */     //   1982: aload #66
/*    */     //   1984: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   1987: astore #76
/*    */     //   1989: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1992: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   1995: astore #77
/*    */     //   1997: bipush #6
/*    */     //   1999: sipush #896
/*    */     //   2002: iload #72
/*    */     //   2004: bipush #6
/*    */     //   2006: ishl
/*    */     //   2007: iand
/*    */     //   2008: ior
/*    */     //   2009: istore #78
/*    */     //   2011: nop
/*    */     //   2012: iconst_0
/*    */     //   2013: istore #79
/*    */     //   2015: aload #63
/*    */     //   2017: ldc_w -692256719
/*    */     //   2020: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   2023: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   2026: aload #63
/*    */     //   2028: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   2033: instanceof androidx/compose/runtime/Applier
/*    */     //   2036: ifne -> 2042
/*    */     //   2039: invokestatic invalidApplier : ()V
/*    */     //   2042: aload #63
/*    */     //   2044: invokeinterface startReusableNode : ()V
/*    */     //   2049: aload #63
/*    */     //   2051: invokeinterface getInserting : ()Z
/*    */     //   2056: ifeq -> 2071
/*    */     //   2059: aload #63
/*    */     //   2061: aload #77
/*    */     //   2063: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   2068: goto -> 2078
/*    */     //   2071: aload #63
/*    */     //   2073: invokeinterface useNode : ()V
/*    */     //   2078: aload #63
/*    */     //   2080: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   2083: astore #80
/*    */     //   2085: iconst_0
/*    */     //   2086: istore #81
/*    */     //   2088: aload #80
/*    */     //   2090: aload #71
/*    */     //   2092: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2095: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   2098: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   2101: aload #80
/*    */     //   2103: aload #75
/*    */     //   2105: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2108: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   2111: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   2114: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2117: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   2120: astore #82
/*    */     //   2122: iconst_0
/*    */     //   2123: istore #83
/*    */     //   2125: aload #80
/*    */     //   2127: astore #84
/*    */     //   2129: iconst_0
/*    */     //   2130: istore #85
/*    */     //   2132: aload #84
/*    */     //   2134: invokeinterface getInserting : ()Z
/*    */     //   2139: ifne -> 2160
/*    */     //   2142: aload #84
/*    */     //   2144: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   2149: iload #74
/*    */     //   2151: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2154: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   2157: ifne -> 2186
/*    */     //   2160: aload #84
/*    */     //   2162: iload #74
/*    */     //   2164: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2167: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   2172: aload #80
/*    */     //   2174: iload #74
/*    */     //   2176: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2179: aload #82
/*    */     //   2181: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   2186: nop
/*    */     //   2187: nop
/*    */     //   2188: nop
/*    */     //   2189: aload #80
/*    */     //   2191: aload #76
/*    */     //   2193: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2196: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   2199: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   2202: nop
/*    */     //   2203: nop
/*    */     //   2204: aload #63
/*    */     //   2206: bipush #14
/*    */     //   2208: iload #78
/*    */     //   2210: bipush #6
/*    */     //   2212: ishr
/*    */     //   2213: iand
/*    */     //   2214: istore #86
/*    */     //   2216: astore #87
/*    */     //   2218: iconst_0
/*    */     //   2219: istore #88
/*    */     //   2221: aload #87
/*    */     //   2223: ldc_w -407840262
/*    */     //   2226: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   2229: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   2232: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   2235: aload #87
/*    */     //   2237: bipush #6
/*    */     //   2239: bipush #112
/*    */     //   2241: iload #68
/*    */     //   2243: bipush #6
/*    */     //   2245: ishr
/*    */     //   2246: iand
/*    */     //   2247: ior
/*    */     //   2248: istore #89
/*    */     //   2250: astore #90
/*    */     //   2252: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   2255: astore #91
/*    */     //   2257: iconst_0
/*    */     //   2258: istore #92
/*    */     //   2260: aload #4
/*    */     //   2262: aload #91
/*    */     //   2264: aload #90
/*    */     //   2266: bipush #14
/*    */     //   2268: iload #89
/*    */     //   2270: iand
/*    */     //   2271: bipush #112
/*    */     //   2273: iload #9
/*    */     //   2275: bipush #9
/*    */     //   2277: ishr
/*    */     //   2278: iand
/*    */     //   2279: ior
/*    */     //   2280: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2283: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   2288: pop
/*    */     //   2289: nop
/*    */     //   2290: aload #87
/*    */     //   2292: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2295: aload #63
/*    */     //   2297: invokeinterface endNode : ()V
/*    */     //   2302: aload #63
/*    */     //   2304: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2307: nop
/*    */     //   2308: aload #63
/*    */     //   2310: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2313: nop
/*    */     //   2314: aload #63
/*    */     //   2316: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2319: nop
/*    */     //   2320: aload #63
/*    */     //   2322: invokeinterface endReplaceGroup : ()V
/*    */     //   2327: nop
/*    */     //   2328: aload #60
/*    */     //   2330: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2333: aload #34
/*    */     //   2335: invokeinterface endNode : ()V
/*    */     //   2340: aload #34
/*    */     //   2342: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2345: nop
/*    */     //   2346: aload #34
/*    */     //   2348: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2351: nop
/*    */     //   2352: aload #34
/*    */     //   2354: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2357: nop
/*    */     //   2358: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
/*    */     //   2361: astore #37
/*    */     //   2363: aload_1
/*    */     //   2364: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/BannerColors;
/*    */     //   2367: invokevirtual getBorder-0d7_KjU : ()J
/*    */     //   2370: lstore #38
/*    */     //   2372: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   2375: checkcast androidx/compose/ui/Modifier
/*    */     //   2378: fconst_0
/*    */     //   2379: iconst_1
/*    */     //   2380: aconst_null
/*    */     //   2381: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   2384: aload #37
/*    */     //   2386: swap
/*    */     //   2387: lload #38
/*    */     //   2389: fconst_0
/*    */     //   2390: fconst_0
/*    */     //   2391: aconst_null
/*    */     //   2392: aload #34
/*    */     //   2394: bipush #54
/*    */     //   2396: bipush #56
/*    */     //   2398: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
/*    */     //   2401: nop
/*    */     //   2402: aload #31
/*    */     //   2404: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2407: aload #6
/*    */     //   2409: invokeinterface endNode : ()V
/*    */     //   2414: aload #6
/*    */     //   2416: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2419: nop
/*    */     //   2420: aload #6
/*    */     //   2422: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2425: nop
/*    */     //   2426: aload #6
/*    */     //   2428: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2431: nop
/*    */     //   2432: invokestatic isTraceInProgress : ()Z
/*    */     //   2435: ifeq -> 2451
/*    */     //   2438: invokestatic traceEventEnd : ()V
/*    */     //   2441: goto -> 2451
/*    */     //   2444: aload #6
/*    */     //   2446: invokeinterface skipToGroupEnd : ()V
/*    */     //   2451: aload #6
/*    */     //   2453: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   2458: dup
/*    */     //   2459: ifnull -> 2487
/*    */     //   2462: aload_0
/*    */     //   2463: aload_1
/*    */     //   2464: aload_2
/*    */     //   2465: aload_3
/*    */     //   2466: aload #4
/*    */     //   2468: aload #5
/*    */     //   2470: iload #7
/*    */     //   2472: iload #8
/*    */     //   2474: <illegal opcode> invoke : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;II)Lkotlin/jvm/functions/Function2;
/*    */     //   2479: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   2484: goto -> 2488
/*    */     //   2487: pop
/*    */     //   2488: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #94	-> 0
/*    */     //   #90	-> 358
/*    */     //   #91	-> 385
/*    */     //   #93	-> 395
/*    */     //   #94	-> 448
/*    */     //   #95	-> 451
/*    */     //   #120	-> 474
/*    */     //   #121	-> 477
/*    */     //   #122	-> 485
/*    */     //   #125	-> 493
/*    */     //   #126	-> 528
/*    */     //   #127	-> 540
/*    */     //   #128	-> 546
/*    */     //   #129	-> 553
/*    */     //   #130	-> 562
/*    */     //   #132	-> 569
/*    */     //   #131	-> 591
/*    */     //   #133	-> 603
/*    */     //   #134	-> 606
/*    */     //   #135	-> 624
/*    */     //   #136	-> 629
/*    */     //   #137	-> 641
/*    */     //   #139	-> 653
/*    */     //   #141	-> 658
/*    */     //   #142	-> 668
/*    */     //   #143	-> 681
/*    */     //   #145	-> 694
/*    */     //   #146	-> 705
/*    */     //   #147	-> 712
/*    */     //   #148	-> 740
/*    */     //   #149	-> 752
/*    */     //   #151	-> 766
/*    */     //   #146	-> 767
/*    */     //   #151	-> 768
/*    */     //   #152	-> 769
/*    */     //   #153	-> 782
/*    */     //   #141	-> 783
/*    */     //   #154	-> 784
/*    */     //   #155	-> 809
/*    */     //   #96	-> 840
/*    */     //   #98	-> 883
/*    */     //   #156	-> 909
/*    */     //   #98	-> 915
/*    */     //   #99	-> 920
/*    */     //   #97	-> 933
/*    */     //   #157	-> 945
/*    */     //   #158	-> 948
/*    */     //   #162	-> 956
/*    */     //   #163	-> 991
/*    */     //   #164	-> 1003
/*    */     //   #165	-> 1009
/*    */     //   #166	-> 1016
/*    */     //   #167	-> 1025
/*    */     //   #169	-> 1032
/*    */     //   #168	-> 1054
/*    */     //   #170	-> 1066
/*    */     //   #171	-> 1069
/*    */     //   #172	-> 1087
/*    */     //   #173	-> 1092
/*    */     //   #174	-> 1104
/*    */     //   #176	-> 1116
/*    */     //   #178	-> 1121
/*    */     //   #179	-> 1131
/*    */     //   #180	-> 1144
/*    */     //   #182	-> 1157
/*    */     //   #183	-> 1168
/*    */     //   #184	-> 1175
/*    */     //   #185	-> 1203
/*    */     //   #186	-> 1215
/*    */     //   #188	-> 1229
/*    */     //   #183	-> 1230
/*    */     //   #188	-> 1231
/*    */     //   #189	-> 1232
/*    */     //   #190	-> 1245
/*    */     //   #178	-> 1246
/*    */     //   #191	-> 1247
/*    */     //   #192	-> 1272
/*    */     //   #101	-> 1313
/*    */     //   #102	-> 1317
/*    */     //   #193	-> 1330
/*    */     //   #102	-> 1336
/*    */     //   #194	-> 1364
/*    */     //   #195	-> 1367
/*    */     //   #198	-> 1370
/*    */     //   #199	-> 1388
/*    */     //   #200	-> 1400
/*    */     //   #201	-> 1406
/*    */     //   #202	-> 1413
/*    */     //   #203	-> 1422
/*    */     //   #205	-> 1429
/*    */     //   #204	-> 1451
/*    */     //   #206	-> 1463
/*    */     //   #207	-> 1466
/*    */     //   #208	-> 1484
/*    */     //   #209	-> 1489
/*    */     //   #210	-> 1501
/*    */     //   #212	-> 1513
/*    */     //   #214	-> 1518
/*    */     //   #215	-> 1528
/*    */     //   #216	-> 1541
/*    */     //   #218	-> 1554
/*    */     //   #219	-> 1565
/*    */     //   #220	-> 1572
/*    */     //   #221	-> 1600
/*    */     //   #222	-> 1612
/*    */     //   #224	-> 1626
/*    */     //   #219	-> 1627
/*    */     //   #224	-> 1628
/*    */     //   #225	-> 1629
/*    */     //   #226	-> 1642
/*    */     //   #214	-> 1643
/*    */     //   #227	-> 1644
/*    */     //   #228	-> 1669
/*    */     //   #102	-> 1700
/*    */     //   #228	-> 1720
/*    */     //   #227	-> 1725
/*    */     //   #229	-> 1727
/*    */     //   #206	-> 1734
/*    */     //   #230	-> 1737
/*    */     //   #200	-> 1740
/*    */     //   #231	-> 1743
/*    */     //   #194	-> 1746
/*    */     //   #232	-> 1749
/*    */     //   #103	-> 1750
/*    */     //   #233	-> 1763
/*    */     //   #103	-> 1769
/*    */     //   #105	-> 1786
/*    */     //   #107	-> 1848
/*    */     //   #109	-> 1853
/*    */     //   #234	-> 1863
/*    */     //   #109	-> 1869
/*    */     //   #110	-> 1877
/*    */     //   #108	-> 1890
/*    */     //   #235	-> 1902
/*    */     //   #236	-> 1905
/*    */     //   #241	-> 1913
/*    */     //   #242	-> 1948
/*    */     //   #243	-> 1960
/*    */     //   #244	-> 1966
/*    */     //   #245	-> 1973
/*    */     //   #246	-> 1982
/*    */     //   #248	-> 1989
/*    */     //   #247	-> 2011
/*    */     //   #249	-> 2023
/*    */     //   #250	-> 2026
/*    */     //   #251	-> 2044
/*    */     //   #252	-> 2049
/*    */     //   #253	-> 2061
/*    */     //   #255	-> 2073
/*    */     //   #257	-> 2078
/*    */     //   #258	-> 2088
/*    */     //   #259	-> 2101
/*    */     //   #261	-> 2114
/*    */     //   #262	-> 2125
/*    */     //   #263	-> 2132
/*    */     //   #264	-> 2160
/*    */     //   #265	-> 2172
/*    */     //   #267	-> 2186
/*    */     //   #262	-> 2187
/*    */     //   #267	-> 2188
/*    */     //   #268	-> 2189
/*    */     //   #269	-> 2202
/*    */     //   #257	-> 2203
/*    */     //   #270	-> 2204
/*    */     //   #271	-> 2229
/*    */     //   #112	-> 2260
/*    */     //   #113	-> 2289
/*    */     //   #271	-> 2290
/*    */     //   #270	-> 2295
/*    */     //   #272	-> 2297
/*    */     //   #249	-> 2304
/*    */     //   #273	-> 2307
/*    */     //   #243	-> 2310
/*    */     //   #274	-> 2313
/*    */     //   #235	-> 2316
/*    */     //   #275	-> 2319
/*    */     //   #115	-> 2327
/*    */     //   #192	-> 2328
/*    */     //   #191	-> 2333
/*    */     //   #276	-> 2335
/*    */     //   #170	-> 2342
/*    */     //   #277	-> 2345
/*    */     //   #164	-> 2348
/*    */     //   #278	-> 2351
/*    */     //   #157	-> 2354
/*    */     //   #279	-> 2357
/*    */     //   #116	-> 2358
/*    */     //   #117	-> 2401
/*    */     //   #155	-> 2402
/*    */     //   #154	-> 2407
/*    */     //   #280	-> 2409
/*    */     //   #133	-> 2416
/*    */     //   #281	-> 2419
/*    */     //   #127	-> 2422
/*    */     //   #282	-> 2425
/*    */     //   #120	-> 2428
/*    */     //   #283	-> 2431
/*    */     //   #118	-> 2444
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   909	6	40	$i$f$getDp	I
/*    */     //   906	9	37	$this$dp$iv	I
/*    */     //   1330	6	67	$i$f$getDp	I
/*    */     //   1327	9	66	$this$dp$iv	I
/*    */     //   1700	20	92	$i$a$-Box-JunieErrorBannerKt$JunieBanner$1$1$1	I
/*    */     //   1697	23	91	$this$JunieBanner_u24lambda_u246_u24lambda_u245_u24lambda_u243	Landroidx/compose/foundation/layout/BoxScope;
/*    */     //   1697	23	90	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   1697	23	89	$changed	I
/*    */     //   1661	64	88	$i$a$-Layout-BoxKt$Box$1$iv	I
/*    */     //   1658	67	87	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1658	67	86	$changed$iv	I
/*    */     //   1572	55	85	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   1569	58	84	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1565	64	83	$i$f$set-impl	I
/*    */     //   1562	67	82	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   1528	115	81	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   1525	118	80	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1455	283	79	$i$f$ReusableComposeNode	I
/*    */     //   1452	286	77	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   1452	286	78	$changed$iv$iv$iv	I
/*    */     //   1392	352	73	$i$f$Layout	I
/*    */     //   1411	333	74	compositeKeyHash$iv$iv	I
/*    */     //   1420	324	75	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1429	315	76	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1389	355	72	$changed$iv$iv	I
/*    */     //   1356	394	69	$i$f$Box	I
/*    */     //   1379	371	71	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1353	397	66	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1353	397	67	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*    */     //   1370	380	70	propagateMinConstraints$iv	Z
/*    */     //   1353	397	68	$changed$iv	I
/*    */     //   1763	6	67	$i$f$getDp	I
/*    */     //   1760	9	66	$this$dp$iv	I
/*    */     //   1863	6	70	$i$f$getDp	I
/*    */     //   1860	9	67	$this$dp$iv	I
/*    */     //   2260	30	92	$i$a$-Row-JunieErrorBannerKt$JunieBanner$1$1$2	I
/*    */     //   2257	33	91	$this$JunieBanner_u24lambda_u246_u24lambda_u245_u24lambda_u244	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   2257	33	90	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   2257	33	89	$changed	I
/*    */     //   2221	74	88	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   2218	77	87	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   2218	77	86	$changed$iv	I
/*    */     //   2132	55	85	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   2129	58	84	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   2125	64	83	$i$f$set-impl	I
/*    */     //   2122	67	82	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   2088	115	81	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   2085	118	80	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   2015	293	79	$i$f$ReusableComposeNode	I
/*    */     //   2012	296	77	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   2012	296	78	$changed$iv$iv$iv	I
/*    */     //   1952	362	73	$i$f$Layout	I
/*    */     //   1971	343	74	compositeKeyHash$iv$iv	I
/*    */     //   1980	334	75	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1989	325	76	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1949	365	72	$changed$iv$iv	I
/*    */     //   1894	426	69	$i$f$Row	I
/*    */     //   1939	381	71	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1913	407	66	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1891	429	67	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   1891	429	70	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   1891	429	68	$changed$iv	I
/*    */     //   1303	1025	65	$i$a$-Row-JunieErrorBannerKt$JunieBanner$1$1	I
/*    */     //   1300	1028	64	$this$JunieBanner_u24lambda_u246_u24lambda_u245	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   1300	1028	63	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   1300	1028	62	$changed	I
/*    */     //   1264	1069	61	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   1261	1072	60	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1261	1072	59	$changed$iv	I
/*    */     //   1175	55	58	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   1172	58	57	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1168	64	56	$i$f$set-impl	I
/*    */     //   1165	67	55	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   1131	115	54	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   1128	118	53	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1058	1288	52	$i$f$ReusableComposeNode	I
/*    */     //   1055	1291	50	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   1055	1291	51	$changed$iv$iv$iv	I
/*    */     //   995	1357	46	$i$f$Layout	I
/*    */     //   1014	1338	47	compositeKeyHash$iv$iv	I
/*    */     //   1023	1329	48	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1032	1320	49	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   992	1360	45	$changed$iv$iv	I
/*    */     //   937	1421	43	$i$f$Row	I
/*    */     //   982	1376	44	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   934	1424	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   956	1402	40	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   934	1424	41	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   934	1424	42	$changed$iv	I
/*    */     //   840	1562	36	$i$a$-Column-JunieErrorBannerKt$JunieBanner$1	I
/*    */     //   837	1565	35	$this$JunieBanner_u24lambda_u246	Landroidx/compose/foundation/layout/ColumnScope;
/*    */     //   837	1565	34	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   837	1565	33	$changed	I
/*    */     //   801	1606	32	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */     //   798	1609	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   798	1609	30	$changed$iv	I
/*    */     //   712	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   709	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   705	64	27	$i$f$set-impl	I
/*    */     //   702	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   668	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   665	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   595	1825	23	$i$f$ReusableComposeNode	I
/*    */     //   592	1828	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   592	1828	22	$changed$iv$iv$iv	I
/*    */     //   532	1894	17	$i$f$Layout	I
/*    */     //   551	1875	18	compositeKeyHash$iv$iv	I
/*    */     //   560	1866	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   569	1857	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   529	1897	16	$changed$iv$iv	I
/*    */     //   468	1964	14	$i$f$Column	I
/*    */     //   519	1913	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   465	1967	10	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   485	1947	11	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   493	1939	12	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   465	1967	13	$changed$iv	I
/*    */     //   15	2474	9	$dirty	I
/*    */     //   0	2489	0	text	Ljava/lang/String;
/*    */     //   0	2489	1	style	Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
/*    */     //   0	2489	2	textStyle	Landroidx/compose/ui/text/TextStyle;
/*    */     //   0	2489	3	icon	Lkotlin/jvm/functions/Function2;
/*    */     //   0	2489	4	actions	Lkotlin/jvm/functions/Function3;
/*    */     //   0	2489	5	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	2489	6	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	2489	7	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit JuniePreconditionBanner$lambda$0(Modifier $modifier, String $description, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     JuniePreconditionBanner($modifier, $description, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit JunieErrorBanner$lambda$1(Modifier $modifier, String $description, Action $action, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     JunieErrorBanner($modifier, $description, $action, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit JunieWarningBanner$lambda$2(Modifier $modifier, String $description, List<Action> $actions, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     JunieWarningBanner($modifier, $description, $actions, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit JunieBanner$lambda$7(String $text, DefaultBannerStyle $style, TextStyle $textStyle, Function2<? super Composer, ? super Integer, Unit> $icon, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $actions, Modifier $modifier, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     JunieBanner($text, $style, $textStyle, $icon, $actions, $modifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieErrorBannerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */