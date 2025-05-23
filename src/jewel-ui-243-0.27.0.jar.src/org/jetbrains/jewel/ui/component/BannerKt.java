package org.jetbrains.jewel.ui.component;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jewel.ui.component.styling.DefaultBannerStyle;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\032l\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\025\b\002\020\006\032\017\022\004\022\0020\001\030\0010\007¢\006\002\b\b2 \b\002\020\t\032\032\022\004\022\0020\013\022\004\022\0020\001\030\0010\n¢\006\002\b\f¢\006\002\b\b2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\020H\007¢\006\002\020\021\032l\020\022\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\025\b\002\020\006\032\017\022\004\022\0020\001\030\0010\007¢\006\002\b\b2 \b\002\020\t\032\032\022\004\022\0020\013\022\004\022\0020\001\030\0010\n¢\006\002\b\f¢\006\002\b\b2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\020H\007¢\006\002\020\021\032l\020\023\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\025\b\002\020\006\032\017\022\004\022\0020\001\030\0010\007¢\006\002\b\b2 \b\002\020\t\032\032\022\004\022\0020\013\022\004\022\0020\001\030\0010\n¢\006\002\b\f¢\006\002\b\b2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\020H\007¢\006\002\020\021\032l\020\024\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\025\b\002\020\006\032\017\022\004\022\0020\001\030\0010\007¢\006\002\b\b2 \b\002\020\t\032\032\022\004\022\0020\013\022\004\022\0020\001\030\0010\n¢\006\002\b\f¢\006\002\b\b2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\020H\007¢\006\002\020\021\032d\020\025\032\0020\0012\006\020\002\032\0020\0032\006\020\r\032\0020\0162\006\020\017\032\0020\0202\023\020\006\032\017\022\004\022\0020\001\030\0010\007¢\006\002\b\b2\036\020\t\032\032\022\004\022\0020\013\022\004\022\0020\001\030\0010\n¢\006\002\b\f¢\006\002\b\b2\b\b\002\020\004\032\0020\005H\003¢\006\002\020\026¨\006\027"}, d2 = {"InformationBanner", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "style", "Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "SuccessBanner", "WarningBanner", "ErrorBanner", "BannerImpl", "(Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ui"})
@SourceDebugExtension({"SMAP\nBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Banner.kt\norg/jetbrains/jewel/ui/component/BannerKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,106:1\n86#2:107\n83#2,6:108\n89#2:142\n93#2:270\n79#3,6:114\n86#3,4:129\n90#3,2:139\n79#3,6:151\n86#3,4:166\n90#3,2:176\n79#3,6:187\n86#3,4:202\n90#3,2:212\n94#3:218\n79#3,6:230\n86#3,4:245\n90#3,2:255\n94#3:261\n94#3:265\n94#3:269\n368#4,9:120\n377#4:141\n368#4,9:157\n377#4:178\n368#4,9:193\n377#4:214\n378#4,2:216\n368#4,9:236\n377#4:257\n378#4,2:259\n378#4,2:263\n378#4,2:267\n4034#5,6:133\n4034#5,6:170\n4034#5,6:206\n4034#5,6:249\n149#6:143\n149#6:180\n149#6:220\n149#6:221\n99#7:144\n96#7,6:145\n102#7:179\n99#7:222\n95#7,7:223\n102#7:258\n106#7:262\n106#7:266\n71#8:181\n69#8,5:182\n74#8:215\n78#8:219\n*S KotlinDebug\n*F\n+ 1 Banner.kt\norg/jetbrains/jewel/ui/component/BannerKt\n*L\n82#1:107\n82#1:108,6\n82#1:142\n82#1:270\n82#1:114,6\n82#1:129,4\n82#1:139,2\n84#1:151,6\n84#1:166,4\n84#1:176,2\n89#1:187,6\n89#1:202,4\n89#1:212,2\n89#1:218\n95#1:230,6\n95#1:245,4\n95#1:255,2\n95#1:261\n84#1:265\n82#1:269\n82#1:120,9\n82#1:141\n84#1:157,9\n84#1:178\n89#1:193,9\n89#1:214\n89#1:216,2\n95#1:236,9\n95#1:257\n95#1:259,2\n84#1:263,2\n82#1:267,2\n82#1:133,6\n84#1:170,6\n89#1:206,6\n95#1:249,6\n85#1:143\n89#1:180\n90#1:220\n96#1:221\n84#1:144\n84#1:145,6\n84#1:179\n95#1:222\n95#1:223,7\n95#1:258\n95#1:262\n84#1:266\n89#1:181\n89#1:182,5\n89#1:215\n89#1:219\n*E\n"})
public final class BannerKt {
  @Composable
  @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
  public static final void InformationBanner(@NotNull String text, @Nullable Modifier modifier, @Nullable Function2<Composer, Integer, Unit> icon, @Nullable Function3 actions, @Nullable DefaultBannerStyle style, @Nullable TextStyle textStyle, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'text'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #6
    //   8: ldc 846189985
    //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   15: astore #6
    //   17: iload #7
    //   19: istore #9
    //   21: iload #8
    //   23: iconst_1
    //   24: iand
    //   25: ifeq -> 38
    //   28: iload #9
    //   30: bipush #6
    //   32: ior
    //   33: istore #9
    //   35: goto -> 67
    //   38: iload #7
    //   40: bipush #6
    //   42: iand
    //   43: ifne -> 67
    //   46: iload #9
    //   48: aload #6
    //   50: aload_0
    //   51: invokeinterface changed : (Ljava/lang/Object;)Z
    //   56: ifeq -> 63
    //   59: iconst_4
    //   60: goto -> 64
    //   63: iconst_2
    //   64: ior
    //   65: istore #9
    //   67: iload #8
    //   69: iconst_2
    //   70: iand
    //   71: ifeq -> 84
    //   74: iload #9
    //   76: bipush #48
    //   78: ior
    //   79: istore #9
    //   81: goto -> 115
    //   84: iload #7
    //   86: bipush #48
    //   88: iand
    //   89: ifne -> 115
    //   92: iload #9
    //   94: aload #6
    //   96: aload_1
    //   97: invokeinterface changed : (Ljava/lang/Object;)Z
    //   102: ifeq -> 110
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #16
    //   112: ior
    //   113: istore #9
    //   115: iload #8
    //   117: iconst_4
    //   118: iand
    //   119: ifeq -> 133
    //   122: iload #9
    //   124: sipush #384
    //   127: ior
    //   128: istore #9
    //   130: goto -> 167
    //   133: iload #7
    //   135: sipush #384
    //   138: iand
    //   139: ifne -> 167
    //   142: iload #9
    //   144: aload #6
    //   146: aload_2
    //   147: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   152: ifeq -> 161
    //   155: sipush #256
    //   158: goto -> 164
    //   161: sipush #128
    //   164: ior
    //   165: istore #9
    //   167: iload #8
    //   169: bipush #8
    //   171: iand
    //   172: ifeq -> 186
    //   175: iload #9
    //   177: sipush #3072
    //   180: ior
    //   181: istore #9
    //   183: goto -> 220
    //   186: iload #7
    //   188: sipush #3072
    //   191: iand
    //   192: ifne -> 220
    //   195: iload #9
    //   197: aload #6
    //   199: aload_3
    //   200: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   205: ifeq -> 214
    //   208: sipush #2048
    //   211: goto -> 217
    //   214: sipush #1024
    //   217: ior
    //   218: istore #9
    //   220: iload #7
    //   222: sipush #24576
    //   225: iand
    //   226: ifne -> 263
    //   229: iload #9
    //   231: iload #8
    //   233: bipush #16
    //   235: iand
    //   236: ifne -> 257
    //   239: aload #6
    //   241: aload #4
    //   243: invokeinterface changed : (Ljava/lang/Object;)Z
    //   248: ifeq -> 257
    //   251: sipush #16384
    //   254: goto -> 260
    //   257: sipush #8192
    //   260: ior
    //   261: istore #9
    //   263: iload #7
    //   265: ldc 196608
    //   267: iand
    //   268: ifne -> 303
    //   271: iload #9
    //   273: iload #8
    //   275: bipush #32
    //   277: iand
    //   278: ifne -> 298
    //   281: aload #6
    //   283: aload #5
    //   285: invokeinterface changed : (Ljava/lang/Object;)Z
    //   290: ifeq -> 298
    //   293: ldc 131072
    //   295: goto -> 300
    //   298: ldc 65536
    //   300: ior
    //   301: istore #9
    //   303: iload #9
    //   305: ldc 74899
    //   307: iand
    //   308: ldc 74898
    //   310: if_icmpne -> 323
    //   313: aload #6
    //   315: invokeinterface getSkipping : ()Z
    //   320: ifne -> 581
    //   323: aload #6
    //   325: invokeinterface startDefaults : ()V
    //   330: iload #7
    //   332: iconst_1
    //   333: iand
    //   334: ifeq -> 347
    //   337: aload #6
    //   339: invokeinterface getDefaultsInvalid : ()Z
    //   344: ifeq -> 445
    //   347: iload #8
    //   349: iconst_2
    //   350: iand
    //   351: ifeq -> 361
    //   354: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   357: checkcast androidx/compose/ui/Modifier
    //   360: astore_1
    //   361: iload #8
    //   363: iconst_4
    //   364: iand
    //   365: ifeq -> 375
    //   368: getstatic org/jetbrains/jewel/ui/component/ComposableSingletons$BannerKt.INSTANCE : Lorg/jetbrains/jewel/ui/component/ComposableSingletons$BannerKt;
    //   371: invokevirtual getLambda-1$ui : ()Lkotlin/jvm/functions/Function2;
    //   374: astore_2
    //   375: iload #8
    //   377: bipush #8
    //   379: iand
    //   380: ifeq -> 385
    //   383: aconst_null
    //   384: astore_3
    //   385: iload #8
    //   387: bipush #16
    //   389: iand
    //   390: ifeq -> 415
    //   393: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   396: aload #6
    //   398: bipush #6
    //   400: invokestatic getDefaultBannerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;
    //   403: invokevirtual getInformation : ()Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
    //   406: astore #4
    //   408: iload #9
    //   410: ldc -57345
    //   412: iand
    //   413: istore #9
    //   415: iload #8
    //   417: bipush #32
    //   419: iand
    //   420: ifeq -> 482
    //   423: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   426: aload #6
    //   428: bipush #6
    //   430: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
    //   433: astore #5
    //   435: iload #9
    //   437: ldc -458753
    //   439: iand
    //   440: istore #9
    //   442: goto -> 482
    //   445: aload #6
    //   447: invokeinterface skipToGroupEnd : ()V
    //   452: iload #8
    //   454: bipush #16
    //   456: iand
    //   457: ifeq -> 467
    //   460: iload #9
    //   462: ldc -57345
    //   464: iand
    //   465: istore #9
    //   467: iload #8
    //   469: bipush #32
    //   471: iand
    //   472: ifeq -> 482
    //   475: iload #9
    //   477: ldc -458753
    //   479: iand
    //   480: istore #9
    //   482: aload #6
    //   484: invokeinterface endDefaults : ()V
    //   489: invokestatic isTraceInProgress : ()Z
    //   492: ifeq -> 505
    //   495: ldc 846189985
    //   497: iload #9
    //   499: iconst_m1
    //   500: ldc 'org.jetbrains.jewel.ui.component.InformationBanner (Banner.kt:32)'
    //   502: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   505: aload_0
    //   506: aload #4
    //   508: aload #5
    //   510: aload_2
    //   511: aload_3
    //   512: aload_1
    //   513: aload #6
    //   515: bipush #14
    //   517: iload #9
    //   519: iand
    //   520: bipush #112
    //   522: iload #9
    //   524: bipush #9
    //   526: ishr
    //   527: iand
    //   528: ior
    //   529: sipush #896
    //   532: iload #9
    //   534: bipush #9
    //   536: ishr
    //   537: iand
    //   538: ior
    //   539: sipush #7168
    //   542: iload #9
    //   544: iconst_3
    //   545: ishl
    //   546: iand
    //   547: ior
    //   548: ldc 57344
    //   550: iload #9
    //   552: iconst_3
    //   553: ishl
    //   554: iand
    //   555: ior
    //   556: ldc 458752
    //   558: iload #9
    //   560: bipush #12
    //   562: ishl
    //   563: iand
    //   564: ior
    //   565: iconst_0
    //   566: invokestatic BannerImpl : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    //   569: invokestatic isTraceInProgress : ()Z
    //   572: ifeq -> 588
    //   575: invokestatic traceEventEnd : ()V
    //   578: goto -> 588
    //   581: aload #6
    //   583: invokeinterface skipToGroupEnd : ()V
    //   588: aload #6
    //   590: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   595: dup
    //   596: ifnull -> 624
    //   599: aload_0
    //   600: aload_1
    //   601: aload_2
    //   602: aload_3
    //   603: aload #4
    //   605: aload #5
    //   607: iload #7
    //   609: iload #8
    //   611: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;II)Lkotlin/jvm/functions/Function2;
    //   616: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   621: goto -> 625
    //   624: pop
    //   625: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #33	-> 6
    //   #28	-> 354
    //   #30	-> 383
    //   #31	-> 393
    //   #32	-> 423
    //   #33	-> 502
    //   #34	-> 505
    //   #35	-> 581
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   21	605	9	$dirty	I
    //   0	626	0	text	Ljava/lang/String;
    //   0	626	1	modifier	Landroidx/compose/ui/Modifier;
    //   0	626	2	icon	Lkotlin/jvm/functions/Function2;
    //   0	626	3	actions	Lkotlin/jvm/functions/Function3;
    //   0	626	4	style	Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
    //   0	626	5	textStyle	Landroidx/compose/ui/text/TextStyle;
    //   0	626	6	$composer	Landroidx/compose/runtime/Composer;
    //   0	626	7	$changed	I
  }
  
  @Composable
  @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
  public static final void SuccessBanner(@NotNull String text, @Nullable Modifier modifier, @Nullable Function2<Composer, Integer, Unit> icon, @Nullable Function3 actions, @Nullable DefaultBannerStyle style, @Nullable TextStyle textStyle, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'text'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #6
    //   8: ldc -1033635848
    //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   15: astore #6
    //   17: iload #7
    //   19: istore #9
    //   21: iload #8
    //   23: iconst_1
    //   24: iand
    //   25: ifeq -> 38
    //   28: iload #9
    //   30: bipush #6
    //   32: ior
    //   33: istore #9
    //   35: goto -> 67
    //   38: iload #7
    //   40: bipush #6
    //   42: iand
    //   43: ifne -> 67
    //   46: iload #9
    //   48: aload #6
    //   50: aload_0
    //   51: invokeinterface changed : (Ljava/lang/Object;)Z
    //   56: ifeq -> 63
    //   59: iconst_4
    //   60: goto -> 64
    //   63: iconst_2
    //   64: ior
    //   65: istore #9
    //   67: iload #8
    //   69: iconst_2
    //   70: iand
    //   71: ifeq -> 84
    //   74: iload #9
    //   76: bipush #48
    //   78: ior
    //   79: istore #9
    //   81: goto -> 115
    //   84: iload #7
    //   86: bipush #48
    //   88: iand
    //   89: ifne -> 115
    //   92: iload #9
    //   94: aload #6
    //   96: aload_1
    //   97: invokeinterface changed : (Ljava/lang/Object;)Z
    //   102: ifeq -> 110
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #16
    //   112: ior
    //   113: istore #9
    //   115: iload #8
    //   117: iconst_4
    //   118: iand
    //   119: ifeq -> 133
    //   122: iload #9
    //   124: sipush #384
    //   127: ior
    //   128: istore #9
    //   130: goto -> 167
    //   133: iload #7
    //   135: sipush #384
    //   138: iand
    //   139: ifne -> 167
    //   142: iload #9
    //   144: aload #6
    //   146: aload_2
    //   147: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   152: ifeq -> 161
    //   155: sipush #256
    //   158: goto -> 164
    //   161: sipush #128
    //   164: ior
    //   165: istore #9
    //   167: iload #8
    //   169: bipush #8
    //   171: iand
    //   172: ifeq -> 186
    //   175: iload #9
    //   177: sipush #3072
    //   180: ior
    //   181: istore #9
    //   183: goto -> 220
    //   186: iload #7
    //   188: sipush #3072
    //   191: iand
    //   192: ifne -> 220
    //   195: iload #9
    //   197: aload #6
    //   199: aload_3
    //   200: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   205: ifeq -> 214
    //   208: sipush #2048
    //   211: goto -> 217
    //   214: sipush #1024
    //   217: ior
    //   218: istore #9
    //   220: iload #7
    //   222: sipush #24576
    //   225: iand
    //   226: ifne -> 263
    //   229: iload #9
    //   231: iload #8
    //   233: bipush #16
    //   235: iand
    //   236: ifne -> 257
    //   239: aload #6
    //   241: aload #4
    //   243: invokeinterface changed : (Ljava/lang/Object;)Z
    //   248: ifeq -> 257
    //   251: sipush #16384
    //   254: goto -> 260
    //   257: sipush #8192
    //   260: ior
    //   261: istore #9
    //   263: iload #7
    //   265: ldc 196608
    //   267: iand
    //   268: ifne -> 303
    //   271: iload #9
    //   273: iload #8
    //   275: bipush #32
    //   277: iand
    //   278: ifne -> 298
    //   281: aload #6
    //   283: aload #5
    //   285: invokeinterface changed : (Ljava/lang/Object;)Z
    //   290: ifeq -> 298
    //   293: ldc 131072
    //   295: goto -> 300
    //   298: ldc 65536
    //   300: ior
    //   301: istore #9
    //   303: iload #9
    //   305: ldc 74899
    //   307: iand
    //   308: ldc 74898
    //   310: if_icmpne -> 323
    //   313: aload #6
    //   315: invokeinterface getSkipping : ()Z
    //   320: ifne -> 581
    //   323: aload #6
    //   325: invokeinterface startDefaults : ()V
    //   330: iload #7
    //   332: iconst_1
    //   333: iand
    //   334: ifeq -> 347
    //   337: aload #6
    //   339: invokeinterface getDefaultsInvalid : ()Z
    //   344: ifeq -> 445
    //   347: iload #8
    //   349: iconst_2
    //   350: iand
    //   351: ifeq -> 361
    //   354: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   357: checkcast androidx/compose/ui/Modifier
    //   360: astore_1
    //   361: iload #8
    //   363: iconst_4
    //   364: iand
    //   365: ifeq -> 375
    //   368: getstatic org/jetbrains/jewel/ui/component/ComposableSingletons$BannerKt.INSTANCE : Lorg/jetbrains/jewel/ui/component/ComposableSingletons$BannerKt;
    //   371: invokevirtual getLambda-2$ui : ()Lkotlin/jvm/functions/Function2;
    //   374: astore_2
    //   375: iload #8
    //   377: bipush #8
    //   379: iand
    //   380: ifeq -> 385
    //   383: aconst_null
    //   384: astore_3
    //   385: iload #8
    //   387: bipush #16
    //   389: iand
    //   390: ifeq -> 415
    //   393: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   396: aload #6
    //   398: bipush #6
    //   400: invokestatic getDefaultBannerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;
    //   403: invokevirtual getSuccess : ()Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
    //   406: astore #4
    //   408: iload #9
    //   410: ldc -57345
    //   412: iand
    //   413: istore #9
    //   415: iload #8
    //   417: bipush #32
    //   419: iand
    //   420: ifeq -> 482
    //   423: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   426: aload #6
    //   428: bipush #6
    //   430: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
    //   433: astore #5
    //   435: iload #9
    //   437: ldc -458753
    //   439: iand
    //   440: istore #9
    //   442: goto -> 482
    //   445: aload #6
    //   447: invokeinterface skipToGroupEnd : ()V
    //   452: iload #8
    //   454: bipush #16
    //   456: iand
    //   457: ifeq -> 467
    //   460: iload #9
    //   462: ldc -57345
    //   464: iand
    //   465: istore #9
    //   467: iload #8
    //   469: bipush #32
    //   471: iand
    //   472: ifeq -> 482
    //   475: iload #9
    //   477: ldc -458753
    //   479: iand
    //   480: istore #9
    //   482: aload #6
    //   484: invokeinterface endDefaults : ()V
    //   489: invokestatic isTraceInProgress : ()Z
    //   492: ifeq -> 505
    //   495: ldc -1033635848
    //   497: iload #9
    //   499: iconst_m1
    //   500: ldc 'org.jetbrains.jewel.ui.component.SuccessBanner (Banner.kt:44)'
    //   502: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   505: aload_0
    //   506: aload #4
    //   508: aload #5
    //   510: aload_2
    //   511: aload_3
    //   512: aload_1
    //   513: aload #6
    //   515: bipush #14
    //   517: iload #9
    //   519: iand
    //   520: bipush #112
    //   522: iload #9
    //   524: bipush #9
    //   526: ishr
    //   527: iand
    //   528: ior
    //   529: sipush #896
    //   532: iload #9
    //   534: bipush #9
    //   536: ishr
    //   537: iand
    //   538: ior
    //   539: sipush #7168
    //   542: iload #9
    //   544: iconst_3
    //   545: ishl
    //   546: iand
    //   547: ior
    //   548: ldc 57344
    //   550: iload #9
    //   552: iconst_3
    //   553: ishl
    //   554: iand
    //   555: ior
    //   556: ldc 458752
    //   558: iload #9
    //   560: bipush #12
    //   562: ishl
    //   563: iand
    //   564: ior
    //   565: iconst_0
    //   566: invokestatic BannerImpl : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    //   569: invokestatic isTraceInProgress : ()Z
    //   572: ifeq -> 588
    //   575: invokestatic traceEventEnd : ()V
    //   578: goto -> 588
    //   581: aload #6
    //   583: invokeinterface skipToGroupEnd : ()V
    //   588: aload #6
    //   590: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   595: dup
    //   596: ifnull -> 624
    //   599: aload_0
    //   600: aload_1
    //   601: aload_2
    //   602: aload_3
    //   603: aload #4
    //   605: aload #5
    //   607: iload #7
    //   609: iload #8
    //   611: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;II)Lkotlin/jvm/functions/Function2;
    //   616: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   621: goto -> 625
    //   624: pop
    //   625: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #45	-> 6
    //   #40	-> 354
    //   #42	-> 383
    //   #43	-> 393
    //   #44	-> 423
    //   #45	-> 502
    //   #46	-> 505
    //   #47	-> 581
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   21	605	9	$dirty	I
    //   0	626	0	text	Ljava/lang/String;
    //   0	626	1	modifier	Landroidx/compose/ui/Modifier;
    //   0	626	2	icon	Lkotlin/jvm/functions/Function2;
    //   0	626	3	actions	Lkotlin/jvm/functions/Function3;
    //   0	626	4	style	Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
    //   0	626	5	textStyle	Landroidx/compose/ui/text/TextStyle;
    //   0	626	6	$composer	Landroidx/compose/runtime/Composer;
    //   0	626	7	$changed	I
  }
  
  @Composable
  @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
  public static final void WarningBanner(@NotNull String text, @Nullable Modifier modifier, @Nullable Function2<Composer, Integer, Unit> icon, @Nullable Function3 actions, @Nullable DefaultBannerStyle style, @Nullable TextStyle textStyle, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'text'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #6
    //   8: ldc -2136534767
    //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   15: astore #6
    //   17: iload #7
    //   19: istore #9
    //   21: iload #8
    //   23: iconst_1
    //   24: iand
    //   25: ifeq -> 38
    //   28: iload #9
    //   30: bipush #6
    //   32: ior
    //   33: istore #9
    //   35: goto -> 67
    //   38: iload #7
    //   40: bipush #6
    //   42: iand
    //   43: ifne -> 67
    //   46: iload #9
    //   48: aload #6
    //   50: aload_0
    //   51: invokeinterface changed : (Ljava/lang/Object;)Z
    //   56: ifeq -> 63
    //   59: iconst_4
    //   60: goto -> 64
    //   63: iconst_2
    //   64: ior
    //   65: istore #9
    //   67: iload #8
    //   69: iconst_2
    //   70: iand
    //   71: ifeq -> 84
    //   74: iload #9
    //   76: bipush #48
    //   78: ior
    //   79: istore #9
    //   81: goto -> 115
    //   84: iload #7
    //   86: bipush #48
    //   88: iand
    //   89: ifne -> 115
    //   92: iload #9
    //   94: aload #6
    //   96: aload_1
    //   97: invokeinterface changed : (Ljava/lang/Object;)Z
    //   102: ifeq -> 110
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #16
    //   112: ior
    //   113: istore #9
    //   115: iload #8
    //   117: iconst_4
    //   118: iand
    //   119: ifeq -> 133
    //   122: iload #9
    //   124: sipush #384
    //   127: ior
    //   128: istore #9
    //   130: goto -> 167
    //   133: iload #7
    //   135: sipush #384
    //   138: iand
    //   139: ifne -> 167
    //   142: iload #9
    //   144: aload #6
    //   146: aload_2
    //   147: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   152: ifeq -> 161
    //   155: sipush #256
    //   158: goto -> 164
    //   161: sipush #128
    //   164: ior
    //   165: istore #9
    //   167: iload #8
    //   169: bipush #8
    //   171: iand
    //   172: ifeq -> 186
    //   175: iload #9
    //   177: sipush #3072
    //   180: ior
    //   181: istore #9
    //   183: goto -> 220
    //   186: iload #7
    //   188: sipush #3072
    //   191: iand
    //   192: ifne -> 220
    //   195: iload #9
    //   197: aload #6
    //   199: aload_3
    //   200: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   205: ifeq -> 214
    //   208: sipush #2048
    //   211: goto -> 217
    //   214: sipush #1024
    //   217: ior
    //   218: istore #9
    //   220: iload #7
    //   222: sipush #24576
    //   225: iand
    //   226: ifne -> 263
    //   229: iload #9
    //   231: iload #8
    //   233: bipush #16
    //   235: iand
    //   236: ifne -> 257
    //   239: aload #6
    //   241: aload #4
    //   243: invokeinterface changed : (Ljava/lang/Object;)Z
    //   248: ifeq -> 257
    //   251: sipush #16384
    //   254: goto -> 260
    //   257: sipush #8192
    //   260: ior
    //   261: istore #9
    //   263: iload #7
    //   265: ldc 196608
    //   267: iand
    //   268: ifne -> 303
    //   271: iload #9
    //   273: iload #8
    //   275: bipush #32
    //   277: iand
    //   278: ifne -> 298
    //   281: aload #6
    //   283: aload #5
    //   285: invokeinterface changed : (Ljava/lang/Object;)Z
    //   290: ifeq -> 298
    //   293: ldc 131072
    //   295: goto -> 300
    //   298: ldc 65536
    //   300: ior
    //   301: istore #9
    //   303: iload #9
    //   305: ldc 74899
    //   307: iand
    //   308: ldc 74898
    //   310: if_icmpne -> 323
    //   313: aload #6
    //   315: invokeinterface getSkipping : ()Z
    //   320: ifne -> 581
    //   323: aload #6
    //   325: invokeinterface startDefaults : ()V
    //   330: iload #7
    //   332: iconst_1
    //   333: iand
    //   334: ifeq -> 347
    //   337: aload #6
    //   339: invokeinterface getDefaultsInvalid : ()Z
    //   344: ifeq -> 445
    //   347: iload #8
    //   349: iconst_2
    //   350: iand
    //   351: ifeq -> 361
    //   354: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   357: checkcast androidx/compose/ui/Modifier
    //   360: astore_1
    //   361: iload #8
    //   363: iconst_4
    //   364: iand
    //   365: ifeq -> 375
    //   368: getstatic org/jetbrains/jewel/ui/component/ComposableSingletons$BannerKt.INSTANCE : Lorg/jetbrains/jewel/ui/component/ComposableSingletons$BannerKt;
    //   371: invokevirtual getLambda-3$ui : ()Lkotlin/jvm/functions/Function2;
    //   374: astore_2
    //   375: iload #8
    //   377: bipush #8
    //   379: iand
    //   380: ifeq -> 385
    //   383: aconst_null
    //   384: astore_3
    //   385: iload #8
    //   387: bipush #16
    //   389: iand
    //   390: ifeq -> 415
    //   393: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   396: aload #6
    //   398: bipush #6
    //   400: invokestatic getDefaultBannerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;
    //   403: invokevirtual getWarning : ()Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
    //   406: astore #4
    //   408: iload #9
    //   410: ldc -57345
    //   412: iand
    //   413: istore #9
    //   415: iload #8
    //   417: bipush #32
    //   419: iand
    //   420: ifeq -> 482
    //   423: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   426: aload #6
    //   428: bipush #6
    //   430: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
    //   433: astore #5
    //   435: iload #9
    //   437: ldc -458753
    //   439: iand
    //   440: istore #9
    //   442: goto -> 482
    //   445: aload #6
    //   447: invokeinterface skipToGroupEnd : ()V
    //   452: iload #8
    //   454: bipush #16
    //   456: iand
    //   457: ifeq -> 467
    //   460: iload #9
    //   462: ldc -57345
    //   464: iand
    //   465: istore #9
    //   467: iload #8
    //   469: bipush #32
    //   471: iand
    //   472: ifeq -> 482
    //   475: iload #9
    //   477: ldc -458753
    //   479: iand
    //   480: istore #9
    //   482: aload #6
    //   484: invokeinterface endDefaults : ()V
    //   489: invokestatic isTraceInProgress : ()Z
    //   492: ifeq -> 505
    //   495: ldc -2136534767
    //   497: iload #9
    //   499: iconst_m1
    //   500: ldc 'org.jetbrains.jewel.ui.component.WarningBanner (Banner.kt:56)'
    //   502: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   505: aload_0
    //   506: aload #4
    //   508: aload #5
    //   510: aload_2
    //   511: aload_3
    //   512: aload_1
    //   513: aload #6
    //   515: bipush #14
    //   517: iload #9
    //   519: iand
    //   520: bipush #112
    //   522: iload #9
    //   524: bipush #9
    //   526: ishr
    //   527: iand
    //   528: ior
    //   529: sipush #896
    //   532: iload #9
    //   534: bipush #9
    //   536: ishr
    //   537: iand
    //   538: ior
    //   539: sipush #7168
    //   542: iload #9
    //   544: iconst_3
    //   545: ishl
    //   546: iand
    //   547: ior
    //   548: ldc 57344
    //   550: iload #9
    //   552: iconst_3
    //   553: ishl
    //   554: iand
    //   555: ior
    //   556: ldc 458752
    //   558: iload #9
    //   560: bipush #12
    //   562: ishl
    //   563: iand
    //   564: ior
    //   565: iconst_0
    //   566: invokestatic BannerImpl : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    //   569: invokestatic isTraceInProgress : ()Z
    //   572: ifeq -> 588
    //   575: invokestatic traceEventEnd : ()V
    //   578: goto -> 588
    //   581: aload #6
    //   583: invokeinterface skipToGroupEnd : ()V
    //   588: aload #6
    //   590: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   595: dup
    //   596: ifnull -> 624
    //   599: aload_0
    //   600: aload_1
    //   601: aload_2
    //   602: aload_3
    //   603: aload #4
    //   605: aload #5
    //   607: iload #7
    //   609: iload #8
    //   611: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;II)Lkotlin/jvm/functions/Function2;
    //   616: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   621: goto -> 625
    //   624: pop
    //   625: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #57	-> 6
    //   #52	-> 354
    //   #54	-> 383
    //   #55	-> 393
    //   #56	-> 423
    //   #57	-> 502
    //   #58	-> 505
    //   #59	-> 581
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   21	605	9	$dirty	I
    //   0	626	0	text	Ljava/lang/String;
    //   0	626	1	modifier	Landroidx/compose/ui/Modifier;
    //   0	626	2	icon	Lkotlin/jvm/functions/Function2;
    //   0	626	3	actions	Lkotlin/jvm/functions/Function3;
    //   0	626	4	style	Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
    //   0	626	5	textStyle	Landroidx/compose/ui/text/TextStyle;
    //   0	626	6	$composer	Landroidx/compose/runtime/Composer;
    //   0	626	7	$changed	I
  }
  
  @Composable
  @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
  public static final void ErrorBanner(@NotNull String text, @Nullable Modifier modifier, @Nullable Function2<Composer, Integer, Unit> icon, @Nullable Function3 actions, @Nullable DefaultBannerStyle style, @Nullable TextStyle textStyle, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'text'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #6
    //   8: ldc 2094006781
    //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   15: astore #6
    //   17: iload #7
    //   19: istore #9
    //   21: iload #8
    //   23: iconst_1
    //   24: iand
    //   25: ifeq -> 38
    //   28: iload #9
    //   30: bipush #6
    //   32: ior
    //   33: istore #9
    //   35: goto -> 67
    //   38: iload #7
    //   40: bipush #6
    //   42: iand
    //   43: ifne -> 67
    //   46: iload #9
    //   48: aload #6
    //   50: aload_0
    //   51: invokeinterface changed : (Ljava/lang/Object;)Z
    //   56: ifeq -> 63
    //   59: iconst_4
    //   60: goto -> 64
    //   63: iconst_2
    //   64: ior
    //   65: istore #9
    //   67: iload #8
    //   69: iconst_2
    //   70: iand
    //   71: ifeq -> 84
    //   74: iload #9
    //   76: bipush #48
    //   78: ior
    //   79: istore #9
    //   81: goto -> 115
    //   84: iload #7
    //   86: bipush #48
    //   88: iand
    //   89: ifne -> 115
    //   92: iload #9
    //   94: aload #6
    //   96: aload_1
    //   97: invokeinterface changed : (Ljava/lang/Object;)Z
    //   102: ifeq -> 110
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #16
    //   112: ior
    //   113: istore #9
    //   115: iload #8
    //   117: iconst_4
    //   118: iand
    //   119: ifeq -> 133
    //   122: iload #9
    //   124: sipush #384
    //   127: ior
    //   128: istore #9
    //   130: goto -> 167
    //   133: iload #7
    //   135: sipush #384
    //   138: iand
    //   139: ifne -> 167
    //   142: iload #9
    //   144: aload #6
    //   146: aload_2
    //   147: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   152: ifeq -> 161
    //   155: sipush #256
    //   158: goto -> 164
    //   161: sipush #128
    //   164: ior
    //   165: istore #9
    //   167: iload #8
    //   169: bipush #8
    //   171: iand
    //   172: ifeq -> 186
    //   175: iload #9
    //   177: sipush #3072
    //   180: ior
    //   181: istore #9
    //   183: goto -> 220
    //   186: iload #7
    //   188: sipush #3072
    //   191: iand
    //   192: ifne -> 220
    //   195: iload #9
    //   197: aload #6
    //   199: aload_3
    //   200: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   205: ifeq -> 214
    //   208: sipush #2048
    //   211: goto -> 217
    //   214: sipush #1024
    //   217: ior
    //   218: istore #9
    //   220: iload #7
    //   222: sipush #24576
    //   225: iand
    //   226: ifne -> 263
    //   229: iload #9
    //   231: iload #8
    //   233: bipush #16
    //   235: iand
    //   236: ifne -> 257
    //   239: aload #6
    //   241: aload #4
    //   243: invokeinterface changed : (Ljava/lang/Object;)Z
    //   248: ifeq -> 257
    //   251: sipush #16384
    //   254: goto -> 260
    //   257: sipush #8192
    //   260: ior
    //   261: istore #9
    //   263: iload #7
    //   265: ldc 196608
    //   267: iand
    //   268: ifne -> 303
    //   271: iload #9
    //   273: iload #8
    //   275: bipush #32
    //   277: iand
    //   278: ifne -> 298
    //   281: aload #6
    //   283: aload #5
    //   285: invokeinterface changed : (Ljava/lang/Object;)Z
    //   290: ifeq -> 298
    //   293: ldc 131072
    //   295: goto -> 300
    //   298: ldc 65536
    //   300: ior
    //   301: istore #9
    //   303: iload #9
    //   305: ldc 74899
    //   307: iand
    //   308: ldc 74898
    //   310: if_icmpne -> 323
    //   313: aload #6
    //   315: invokeinterface getSkipping : ()Z
    //   320: ifne -> 581
    //   323: aload #6
    //   325: invokeinterface startDefaults : ()V
    //   330: iload #7
    //   332: iconst_1
    //   333: iand
    //   334: ifeq -> 347
    //   337: aload #6
    //   339: invokeinterface getDefaultsInvalid : ()Z
    //   344: ifeq -> 445
    //   347: iload #8
    //   349: iconst_2
    //   350: iand
    //   351: ifeq -> 361
    //   354: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   357: checkcast androidx/compose/ui/Modifier
    //   360: astore_1
    //   361: iload #8
    //   363: iconst_4
    //   364: iand
    //   365: ifeq -> 375
    //   368: getstatic org/jetbrains/jewel/ui/component/ComposableSingletons$BannerKt.INSTANCE : Lorg/jetbrains/jewel/ui/component/ComposableSingletons$BannerKt;
    //   371: invokevirtual getLambda-4$ui : ()Lkotlin/jvm/functions/Function2;
    //   374: astore_2
    //   375: iload #8
    //   377: bipush #8
    //   379: iand
    //   380: ifeq -> 385
    //   383: aconst_null
    //   384: astore_3
    //   385: iload #8
    //   387: bipush #16
    //   389: iand
    //   390: ifeq -> 415
    //   393: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   396: aload #6
    //   398: bipush #6
    //   400: invokestatic getDefaultBannerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;
    //   403: invokevirtual getError : ()Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
    //   406: astore #4
    //   408: iload #9
    //   410: ldc -57345
    //   412: iand
    //   413: istore #9
    //   415: iload #8
    //   417: bipush #32
    //   419: iand
    //   420: ifeq -> 482
    //   423: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   426: aload #6
    //   428: bipush #6
    //   430: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
    //   433: astore #5
    //   435: iload #9
    //   437: ldc -458753
    //   439: iand
    //   440: istore #9
    //   442: goto -> 482
    //   445: aload #6
    //   447: invokeinterface skipToGroupEnd : ()V
    //   452: iload #8
    //   454: bipush #16
    //   456: iand
    //   457: ifeq -> 467
    //   460: iload #9
    //   462: ldc -57345
    //   464: iand
    //   465: istore #9
    //   467: iload #8
    //   469: bipush #32
    //   471: iand
    //   472: ifeq -> 482
    //   475: iload #9
    //   477: ldc -458753
    //   479: iand
    //   480: istore #9
    //   482: aload #6
    //   484: invokeinterface endDefaults : ()V
    //   489: invokestatic isTraceInProgress : ()Z
    //   492: ifeq -> 505
    //   495: ldc 2094006781
    //   497: iload #9
    //   499: iconst_m1
    //   500: ldc 'org.jetbrains.jewel.ui.component.ErrorBanner (Banner.kt:68)'
    //   502: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   505: aload_0
    //   506: aload #4
    //   508: aload #5
    //   510: aload_2
    //   511: aload_3
    //   512: aload_1
    //   513: aload #6
    //   515: bipush #14
    //   517: iload #9
    //   519: iand
    //   520: bipush #112
    //   522: iload #9
    //   524: bipush #9
    //   526: ishr
    //   527: iand
    //   528: ior
    //   529: sipush #896
    //   532: iload #9
    //   534: bipush #9
    //   536: ishr
    //   537: iand
    //   538: ior
    //   539: sipush #7168
    //   542: iload #9
    //   544: iconst_3
    //   545: ishl
    //   546: iand
    //   547: ior
    //   548: ldc 57344
    //   550: iload #9
    //   552: iconst_3
    //   553: ishl
    //   554: iand
    //   555: ior
    //   556: ldc 458752
    //   558: iload #9
    //   560: bipush #12
    //   562: ishl
    //   563: iand
    //   564: ior
    //   565: iconst_0
    //   566: invokestatic BannerImpl : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    //   569: invokestatic isTraceInProgress : ()Z
    //   572: ifeq -> 588
    //   575: invokestatic traceEventEnd : ()V
    //   578: goto -> 588
    //   581: aload #6
    //   583: invokeinterface skipToGroupEnd : ()V
    //   588: aload #6
    //   590: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   595: dup
    //   596: ifnull -> 624
    //   599: aload_0
    //   600: aload_1
    //   601: aload_2
    //   602: aload_3
    //   603: aload #4
    //   605: aload #5
    //   607: iload #7
    //   609: iload #8
    //   611: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;II)Lkotlin/jvm/functions/Function2;
    //   616: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   621: goto -> 625
    //   624: pop
    //   625: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #69	-> 6
    //   #64	-> 354
    //   #66	-> 383
    //   #67	-> 393
    //   #68	-> 423
    //   #69	-> 502
    //   #70	-> 505
    //   #71	-> 581
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   21	605	9	$dirty	I
    //   0	626	0	text	Ljava/lang/String;
    //   0	626	1	modifier	Landroidx/compose/ui/Modifier;
    //   0	626	2	icon	Lkotlin/jvm/functions/Function2;
    //   0	626	3	actions	Lkotlin/jvm/functions/Function3;
    //   0	626	4	style	Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
    //   0	626	5	textStyle	Landroidx/compose/ui/text/TextStyle;
    //   0	626	6	$composer	Landroidx/compose/runtime/Composer;
    //   0	626	7	$changed	I
  }
  
  @Composable
  @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
  private static final void BannerImpl(String text, DefaultBannerStyle style, TextStyle textStyle, Function2 icon, Function3 actions, Modifier modifier, Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload #6
    //   2: ldc 613793883
    //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   9: astore #6
    //   11: iload #7
    //   13: istore #9
    //   15: iload #8
    //   17: iconst_1
    //   18: iand
    //   19: ifeq -> 32
    //   22: iload #9
    //   24: bipush #6
    //   26: ior
    //   27: istore #9
    //   29: goto -> 61
    //   32: iload #7
    //   34: bipush #6
    //   36: iand
    //   37: ifne -> 61
    //   40: iload #9
    //   42: aload #6
    //   44: aload_0
    //   45: invokeinterface changed : (Ljava/lang/Object;)Z
    //   50: ifeq -> 57
    //   53: iconst_4
    //   54: goto -> 58
    //   57: iconst_2
    //   58: ior
    //   59: istore #9
    //   61: iload #8
    //   63: iconst_2
    //   64: iand
    //   65: ifeq -> 78
    //   68: iload #9
    //   70: bipush #48
    //   72: ior
    //   73: istore #9
    //   75: goto -> 109
    //   78: iload #7
    //   80: bipush #48
    //   82: iand
    //   83: ifne -> 109
    //   86: iload #9
    //   88: aload #6
    //   90: aload_1
    //   91: invokeinterface changed : (Ljava/lang/Object;)Z
    //   96: ifeq -> 104
    //   99: bipush #32
    //   101: goto -> 106
    //   104: bipush #16
    //   106: ior
    //   107: istore #9
    //   109: iload #8
    //   111: iconst_4
    //   112: iand
    //   113: ifeq -> 127
    //   116: iload #9
    //   118: sipush #384
    //   121: ior
    //   122: istore #9
    //   124: goto -> 161
    //   127: iload #7
    //   129: sipush #384
    //   132: iand
    //   133: ifne -> 161
    //   136: iload #9
    //   138: aload #6
    //   140: aload_2
    //   141: invokeinterface changed : (Ljava/lang/Object;)Z
    //   146: ifeq -> 155
    //   149: sipush #256
    //   152: goto -> 158
    //   155: sipush #128
    //   158: ior
    //   159: istore #9
    //   161: iload #8
    //   163: bipush #8
    //   165: iand
    //   166: ifeq -> 180
    //   169: iload #9
    //   171: sipush #3072
    //   174: ior
    //   175: istore #9
    //   177: goto -> 214
    //   180: iload #7
    //   182: sipush #3072
    //   185: iand
    //   186: ifne -> 214
    //   189: iload #9
    //   191: aload #6
    //   193: aload_3
    //   194: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   199: ifeq -> 208
    //   202: sipush #2048
    //   205: goto -> 211
    //   208: sipush #1024
    //   211: ior
    //   212: istore #9
    //   214: iload #8
    //   216: bipush #16
    //   218: iand
    //   219: ifeq -> 233
    //   222: iload #9
    //   224: sipush #24576
    //   227: ior
    //   228: istore #9
    //   230: goto -> 268
    //   233: iload #7
    //   235: sipush #24576
    //   238: iand
    //   239: ifne -> 268
    //   242: iload #9
    //   244: aload #6
    //   246: aload #4
    //   248: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   253: ifeq -> 262
    //   256: sipush #16384
    //   259: goto -> 265
    //   262: sipush #8192
    //   265: ior
    //   266: istore #9
    //   268: iload #8
    //   270: bipush #32
    //   272: iand
    //   273: ifeq -> 286
    //   276: iload #9
    //   278: ldc 196608
    //   280: ior
    //   281: istore #9
    //   283: goto -> 318
    //   286: iload #7
    //   288: ldc 196608
    //   290: iand
    //   291: ifne -> 318
    //   294: iload #9
    //   296: aload #6
    //   298: aload #5
    //   300: invokeinterface changed : (Ljava/lang/Object;)Z
    //   305: ifeq -> 313
    //   308: ldc 131072
    //   310: goto -> 315
    //   313: ldc 65536
    //   315: ior
    //   316: istore #9
    //   318: iload #9
    //   320: ldc 74899
    //   322: iand
    //   323: ldc 74898
    //   325: if_icmpne -> 338
    //   328: aload #6
    //   330: invokeinterface getSkipping : ()Z
    //   335: ifne -> 2366
    //   338: iload #8
    //   340: bipush #32
    //   342: iand
    //   343: ifeq -> 354
    //   346: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   349: checkcast androidx/compose/ui/Modifier
    //   352: astore #5
    //   354: invokestatic isTraceInProgress : ()Z
    //   357: ifeq -> 370
    //   360: ldc 613793883
    //   362: iload #9
    //   364: iconst_m1
    //   365: ldc 'org.jetbrains.jewel.ui.component.BannerImpl (Banner.kt:80)'
    //   367: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   370: bipush #14
    //   372: iload #9
    //   374: bipush #15
    //   376: ishr
    //   377: iand
    //   378: istore #12
    //   380: nop
    //   381: iconst_0
    //   382: istore #13
    //   384: aload #6
    //   386: ldc -483455358
    //   388: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   390: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   393: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   396: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   399: astore #10
    //   401: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   404: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   407: astore #11
    //   409: aload #10
    //   411: aload #11
    //   413: aload #6
    //   415: bipush #14
    //   417: iload #12
    //   419: iconst_3
    //   420: ishr
    //   421: iand
    //   422: bipush #112
    //   424: iload #12
    //   426: iconst_3
    //   427: ishr
    //   428: iand
    //   429: ior
    //   430: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   433: astore #14
    //   435: bipush #112
    //   437: iload #12
    //   439: iconst_3
    //   440: ishl
    //   441: iand
    //   442: istore #15
    //   444: nop
    //   445: iconst_0
    //   446: istore #16
    //   448: aload #6
    //   450: ldc_w -1323940314
    //   453: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   456: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   459: aload #6
    //   461: iconst_0
    //   462: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   465: istore #17
    //   467: aload #6
    //   469: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   474: astore #18
    //   476: aload #6
    //   478: aload #5
    //   480: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   483: astore #19
    //   485: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   488: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   491: astore #20
    //   493: bipush #6
    //   495: sipush #896
    //   498: iload #15
    //   500: bipush #6
    //   502: ishl
    //   503: iand
    //   504: ior
    //   505: istore #21
    //   507: nop
    //   508: iconst_0
    //   509: istore #22
    //   511: aload #6
    //   513: ldc_w -692256719
    //   516: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   519: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   522: aload #6
    //   524: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   529: instanceof androidx/compose/runtime/Applier
    //   532: ifne -> 538
    //   535: invokestatic invalidApplier : ()V
    //   538: aload #6
    //   540: invokeinterface startReusableNode : ()V
    //   545: aload #6
    //   547: invokeinterface getInserting : ()Z
    //   552: ifeq -> 567
    //   555: aload #6
    //   557: aload #20
    //   559: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   564: goto -> 574
    //   567: aload #6
    //   569: invokeinterface useNode : ()V
    //   574: aload #6
    //   576: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   579: astore #23
    //   581: iconst_0
    //   582: istore #24
    //   584: aload #23
    //   586: aload #14
    //   588: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   591: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   594: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   597: aload #23
    //   599: aload #18
    //   601: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   604: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   607: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   610: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   613: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   616: astore #25
    //   618: iconst_0
    //   619: istore #26
    //   621: aload #23
    //   623: astore #27
    //   625: iconst_0
    //   626: istore #28
    //   628: aload #27
    //   630: invokeinterface getInserting : ()Z
    //   635: ifne -> 656
    //   638: aload #27
    //   640: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   645: iload #17
    //   647: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   650: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   653: ifne -> 682
    //   656: aload #27
    //   658: iload #17
    //   660: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   663: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   668: aload #23
    //   670: iload #17
    //   672: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   675: aload #25
    //   677: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   682: nop
    //   683: nop
    //   684: nop
    //   685: aload #23
    //   687: aload #19
    //   689: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   692: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   695: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   698: nop
    //   699: nop
    //   700: aload #6
    //   702: bipush #14
    //   704: iload #21
    //   706: bipush #6
    //   708: ishr
    //   709: iand
    //   710: istore #29
    //   712: astore #30
    //   714: iconst_0
    //   715: istore #31
    //   717: aload #30
    //   719: ldc_w -384784025
    //   722: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
    //   725: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   728: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   731: aload #30
    //   733: bipush #6
    //   735: bipush #112
    //   737: iload #12
    //   739: bipush #6
    //   741: ishr
    //   742: iand
    //   743: ior
    //   744: istore #32
    //   746: astore #33
    //   748: checkcast androidx/compose/foundation/layout/ColumnScope
    //   751: astore #34
    //   753: iconst_0
    //   754: istore #35
    //   756: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
    //   759: astore #36
    //   761: aload_1
    //   762: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/BannerColors;
    //   765: invokevirtual getBorder-0d7_KjU : ()J
    //   768: lstore #37
    //   770: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   773: checkcast androidx/compose/ui/Modifier
    //   776: fconst_0
    //   777: iconst_1
    //   778: aconst_null
    //   779: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   782: aload #36
    //   784: swap
    //   785: lload #37
    //   787: fconst_0
    //   788: fconst_0
    //   789: aconst_null
    //   790: aload #33
    //   792: bipush #54
    //   794: bipush #56
    //   796: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
    //   799: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   802: checkcast androidx/compose/ui/Modifier
    //   805: aload_1
    //   806: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/BannerColors;
    //   809: invokevirtual getBackground-0d7_KjU : ()J
    //   812: aconst_null
    //   813: iconst_2
    //   814: aconst_null
    //   815: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   818: bipush #10
    //   820: istore #36
    //   822: iconst_0
    //   823: istore #39
    //   825: iload #36
    //   827: i2f
    //   828: invokestatic constructor-impl : (F)F
    //   831: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   834: astore #36
    //   836: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   839: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
    //   842: astore #40
    //   844: sipush #384
    //   847: istore #41
    //   849: nop
    //   850: iconst_0
    //   851: istore #42
    //   853: aload #33
    //   855: ldc_w 693286680
    //   858: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   861: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   864: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   867: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   870: astore #39
    //   872: aload #39
    //   874: aload #40
    //   876: aload #33
    //   878: bipush #14
    //   880: iload #41
    //   882: iconst_3
    //   883: ishr
    //   884: iand
    //   885: bipush #112
    //   887: iload #41
    //   889: iconst_3
    //   890: ishr
    //   891: iand
    //   892: ior
    //   893: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   896: astore #43
    //   898: bipush #112
    //   900: iload #41
    //   902: iconst_3
    //   903: ishl
    //   904: iand
    //   905: istore #44
    //   907: nop
    //   908: iconst_0
    //   909: istore #45
    //   911: aload #33
    //   913: ldc_w -1323940314
    //   916: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   919: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   922: aload #33
    //   924: iconst_0
    //   925: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   928: istore #46
    //   930: aload #33
    //   932: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   937: astore #47
    //   939: aload #33
    //   941: aload #36
    //   943: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   946: astore #48
    //   948: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   951: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   954: astore #49
    //   956: bipush #6
    //   958: sipush #896
    //   961: iload #44
    //   963: bipush #6
    //   965: ishl
    //   966: iand
    //   967: ior
    //   968: istore #50
    //   970: nop
    //   971: iconst_0
    //   972: istore #51
    //   974: aload #33
    //   976: ldc_w -692256719
    //   979: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   982: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   985: aload #33
    //   987: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   992: instanceof androidx/compose/runtime/Applier
    //   995: ifne -> 1001
    //   998: invokestatic invalidApplier : ()V
    //   1001: aload #33
    //   1003: invokeinterface startReusableNode : ()V
    //   1008: aload #33
    //   1010: invokeinterface getInserting : ()Z
    //   1015: ifeq -> 1030
    //   1018: aload #33
    //   1020: aload #49
    //   1022: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1027: goto -> 1037
    //   1030: aload #33
    //   1032: invokeinterface useNode : ()V
    //   1037: aload #33
    //   1039: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1042: astore #52
    //   1044: iconst_0
    //   1045: istore #53
    //   1047: aload #52
    //   1049: aload #43
    //   1051: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1054: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1057: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1060: aload #52
    //   1062: aload #47
    //   1064: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1067: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1070: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1073: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1076: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1079: astore #54
    //   1081: iconst_0
    //   1082: istore #55
    //   1084: aload #52
    //   1086: astore #56
    //   1088: iconst_0
    //   1089: istore #57
    //   1091: aload #56
    //   1093: invokeinterface getInserting : ()Z
    //   1098: ifne -> 1119
    //   1101: aload #56
    //   1103: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1108: iload #46
    //   1110: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1113: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1116: ifne -> 1145
    //   1119: aload #56
    //   1121: iload #46
    //   1123: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1126: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1131: aload #52
    //   1133: iload #46
    //   1135: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1138: aload #54
    //   1140: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1145: nop
    //   1146: nop
    //   1147: nop
    //   1148: aload #52
    //   1150: aload #48
    //   1152: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1155: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1158: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1161: nop
    //   1162: nop
    //   1163: aload #33
    //   1165: bipush #14
    //   1167: iload #50
    //   1169: bipush #6
    //   1171: ishr
    //   1172: iand
    //   1173: istore #58
    //   1175: astore #59
    //   1177: iconst_0
    //   1178: istore #60
    //   1180: aload #59
    //   1182: ldc_w -407840262
    //   1185: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
    //   1188: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1191: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   1194: aload #59
    //   1196: bipush #6
    //   1198: bipush #112
    //   1200: iload #41
    //   1202: bipush #6
    //   1204: ishr
    //   1205: iand
    //   1206: ior
    //   1207: istore #61
    //   1209: astore #62
    //   1211: checkcast androidx/compose/foundation/layout/RowScope
    //   1214: astore #63
    //   1216: iconst_0
    //   1217: istore #64
    //   1219: aload #62
    //   1221: ldc_w 905668859
    //   1224: invokeinterface startReplaceGroup : (I)V
    //   1229: aload_3
    //   1230: ifnull -> 1695
    //   1233: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1236: checkcast androidx/compose/ui/Modifier
    //   1239: bipush #16
    //   1241: istore #65
    //   1243: iconst_0
    //   1244: istore #66
    //   1246: iload #65
    //   1248: i2f
    //   1249: invokestatic constructor-impl : (F)F
    //   1252: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   1255: astore #65
    //   1257: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   1260: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
    //   1263: astore #66
    //   1265: bipush #54
    //   1267: istore #67
    //   1269: iconst_0
    //   1270: istore #68
    //   1272: aload #62
    //   1274: ldc_w 733328855
    //   1277: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
    //   1280: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1283: iconst_0
    //   1284: istore #69
    //   1286: aload #66
    //   1288: iload #69
    //   1290: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
    //   1293: astore #70
    //   1295: bipush #112
    //   1297: iload #67
    //   1299: iconst_3
    //   1300: ishl
    //   1301: iand
    //   1302: istore #71
    //   1304: nop
    //   1305: iconst_0
    //   1306: istore #72
    //   1308: aload #62
    //   1310: ldc_w -1323940314
    //   1313: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   1316: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1319: aload #62
    //   1321: iconst_0
    //   1322: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   1325: istore #73
    //   1327: aload #62
    //   1329: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   1334: astore #74
    //   1336: aload #62
    //   1338: aload #65
    //   1340: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   1343: astore #75
    //   1345: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1348: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   1351: astore #76
    //   1353: bipush #6
    //   1355: sipush #896
    //   1358: iload #71
    //   1360: bipush #6
    //   1362: ishl
    //   1363: iand
    //   1364: ior
    //   1365: istore #77
    //   1367: nop
    //   1368: iconst_0
    //   1369: istore #78
    //   1371: aload #62
    //   1373: ldc_w -692256719
    //   1376: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   1379: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1382: aload #62
    //   1384: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1389: instanceof androidx/compose/runtime/Applier
    //   1392: ifne -> 1398
    //   1395: invokestatic invalidApplier : ()V
    //   1398: aload #62
    //   1400: invokeinterface startReusableNode : ()V
    //   1405: aload #62
    //   1407: invokeinterface getInserting : ()Z
    //   1412: ifeq -> 1427
    //   1415: aload #62
    //   1417: aload #76
    //   1419: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1424: goto -> 1434
    //   1427: aload #62
    //   1429: invokeinterface useNode : ()V
    //   1434: aload #62
    //   1436: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1439: astore #79
    //   1441: iconst_0
    //   1442: istore #80
    //   1444: aload #79
    //   1446: aload #70
    //   1448: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1451: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1454: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1457: aload #79
    //   1459: aload #74
    //   1461: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1464: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1467: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1470: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1473: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1476: astore #81
    //   1478: iconst_0
    //   1479: istore #82
    //   1481: aload #79
    //   1483: astore #83
    //   1485: iconst_0
    //   1486: istore #84
    //   1488: aload #83
    //   1490: invokeinterface getInserting : ()Z
    //   1495: ifne -> 1516
    //   1498: aload #83
    //   1500: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1505: iload #73
    //   1507: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1510: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1513: ifne -> 1542
    //   1516: aload #83
    //   1518: iload #73
    //   1520: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1523: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1528: aload #79
    //   1530: iload #73
    //   1532: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1535: aload #81
    //   1537: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1542: nop
    //   1543: nop
    //   1544: nop
    //   1545: aload #79
    //   1547: aload #75
    //   1549: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1552: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1555: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1558: nop
    //   1559: nop
    //   1560: aload #62
    //   1562: bipush #14
    //   1564: iload #77
    //   1566: bipush #6
    //   1568: ishr
    //   1569: iand
    //   1570: istore #85
    //   1572: astore #86
    //   1574: iconst_0
    //   1575: istore #87
    //   1577: aload #86
    //   1579: ldc_w -2146769399
    //   1582: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
    //   1585: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1588: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
    //   1591: aload #86
    //   1593: bipush #6
    //   1595: bipush #112
    //   1597: iload #67
    //   1599: bipush #6
    //   1601: ishr
    //   1602: iand
    //   1603: ior
    //   1604: istore #88
    //   1606: astore #89
    //   1608: checkcast androidx/compose/foundation/layout/BoxScope
    //   1611: astore #90
    //   1613: iconst_0
    //   1614: istore #91
    //   1616: aload_3
    //   1617: aload #89
    //   1619: bipush #14
    //   1621: iload #9
    //   1623: bipush #9
    //   1625: ishr
    //   1626: iand
    //   1627: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1630: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1635: pop
    //   1636: aload #86
    //   1638: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1641: aload #62
    //   1643: invokeinterface endNode : ()V
    //   1648: aload #62
    //   1650: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1653: nop
    //   1654: aload #62
    //   1656: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1659: nop
    //   1660: aload #62
    //   1662: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1665: nop
    //   1666: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1669: checkcast androidx/compose/ui/Modifier
    //   1672: bipush #8
    //   1674: istore #65
    //   1676: iconst_0
    //   1677: istore #66
    //   1679: iload #65
    //   1681: i2f
    //   1682: invokestatic constructor-impl : (F)F
    //   1685: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   1688: aload #62
    //   1690: bipush #6
    //   1692: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    //   1695: aload #62
    //   1697: invokeinterface endReplaceGroup : ()V
    //   1702: aload_0
    //   1703: aconst_null
    //   1704: lconst_0
    //   1705: lconst_0
    //   1706: aconst_null
    //   1707: aconst_null
    //   1708: aconst_null
    //   1709: lconst_0
    //   1710: aconst_null
    //   1711: iconst_0
    //   1712: lconst_0
    //   1713: iconst_0
    //   1714: iconst_0
    //   1715: iconst_0
    //   1716: aconst_null
    //   1717: aload_2
    //   1718: aload #62
    //   1720: bipush #14
    //   1722: iload #9
    //   1724: iand
    //   1725: ldc 458752
    //   1727: iload #9
    //   1729: bipush #9
    //   1731: ishl
    //   1732: iand
    //   1733: sipush #32766
    //   1736: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
    //   1739: aload #63
    //   1741: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1744: checkcast androidx/compose/ui/Modifier
    //   1747: fconst_1
    //   1748: iconst_0
    //   1749: iconst_2
    //   1750: aconst_null
    //   1751: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   1754: aload #62
    //   1756: iconst_0
    //   1757: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    //   1760: aload #62
    //   1762: ldc_w 905678289
    //   1765: invokeinterface startReplaceGroup : (I)V
    //   1770: aload #4
    //   1772: ifnull -> 2242
    //   1775: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   1778: bipush #8
    //   1780: istore #66
    //   1782: iconst_0
    //   1783: istore #69
    //   1785: iload #66
    //   1787: i2f
    //   1788: invokestatic constructor-impl : (F)F
    //   1791: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   1794: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
    //   1797: astore #66
    //   1799: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   1802: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
    //   1805: astore #69
    //   1807: sipush #432
    //   1810: istore #67
    //   1812: nop
    //   1813: iconst_0
    //   1814: istore #68
    //   1816: aload #62
    //   1818: ldc_w 693286680
    //   1821: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   1824: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1827: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1830: checkcast androidx/compose/ui/Modifier
    //   1833: astore #65
    //   1835: aload #66
    //   1837: aload #69
    //   1839: aload #62
    //   1841: bipush #14
    //   1843: iload #67
    //   1845: iconst_3
    //   1846: ishr
    //   1847: iand
    //   1848: bipush #112
    //   1850: iload #67
    //   1852: iconst_3
    //   1853: ishr
    //   1854: iand
    //   1855: ior
    //   1856: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   1859: astore #70
    //   1861: bipush #112
    //   1863: iload #67
    //   1865: iconst_3
    //   1866: ishl
    //   1867: iand
    //   1868: istore #71
    //   1870: nop
    //   1871: iconst_0
    //   1872: istore #72
    //   1874: aload #62
    //   1876: ldc_w -1323940314
    //   1879: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   1882: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1885: aload #62
    //   1887: iconst_0
    //   1888: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   1891: istore #73
    //   1893: aload #62
    //   1895: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   1900: astore #74
    //   1902: aload #62
    //   1904: aload #65
    //   1906: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   1909: astore #75
    //   1911: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1914: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   1917: astore #76
    //   1919: bipush #6
    //   1921: sipush #896
    //   1924: iload #71
    //   1926: bipush #6
    //   1928: ishl
    //   1929: iand
    //   1930: ior
    //   1931: istore #77
    //   1933: nop
    //   1934: iconst_0
    //   1935: istore #78
    //   1937: aload #62
    //   1939: ldc_w -692256719
    //   1942: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   1945: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1948: aload #62
    //   1950: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1955: instanceof androidx/compose/runtime/Applier
    //   1958: ifne -> 1964
    //   1961: invokestatic invalidApplier : ()V
    //   1964: aload #62
    //   1966: invokeinterface startReusableNode : ()V
    //   1971: aload #62
    //   1973: invokeinterface getInserting : ()Z
    //   1978: ifeq -> 1993
    //   1981: aload #62
    //   1983: aload #76
    //   1985: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1990: goto -> 2000
    //   1993: aload #62
    //   1995: invokeinterface useNode : ()V
    //   2000: aload #62
    //   2002: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   2005: astore #79
    //   2007: iconst_0
    //   2008: istore #80
    //   2010: aload #79
    //   2012: aload #70
    //   2014: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2017: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   2020: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2023: aload #79
    //   2025: aload #74
    //   2027: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2030: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   2033: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2036: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2039: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   2042: astore #81
    //   2044: iconst_0
    //   2045: istore #82
    //   2047: aload #79
    //   2049: astore #83
    //   2051: iconst_0
    //   2052: istore #84
    //   2054: aload #83
    //   2056: invokeinterface getInserting : ()Z
    //   2061: ifne -> 2082
    //   2064: aload #83
    //   2066: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   2071: iload #73
    //   2073: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2076: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2079: ifne -> 2108
    //   2082: aload #83
    //   2084: iload #73
    //   2086: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2089: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   2094: aload #79
    //   2096: iload #73
    //   2098: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2101: aload #81
    //   2103: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2108: nop
    //   2109: nop
    //   2110: nop
    //   2111: aload #79
    //   2113: aload #75
    //   2115: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2118: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   2121: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2124: nop
    //   2125: nop
    //   2126: aload #62
    //   2128: bipush #14
    //   2130: iload #77
    //   2132: bipush #6
    //   2134: ishr
    //   2135: iand
    //   2136: istore #85
    //   2138: astore #86
    //   2140: iconst_0
    //   2141: istore #87
    //   2143: aload #86
    //   2145: ldc_w -407840262
    //   2148: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
    //   2151: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2154: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   2157: aload #86
    //   2159: bipush #6
    //   2161: bipush #112
    //   2163: iload #67
    //   2165: bipush #6
    //   2167: ishr
    //   2168: iand
    //   2169: ior
    //   2170: istore #88
    //   2172: astore #89
    //   2174: checkcast androidx/compose/foundation/layout/RowScope
    //   2177: astore #90
    //   2179: iconst_0
    //   2180: istore #91
    //   2182: aload #4
    //   2184: aload #90
    //   2186: aload #89
    //   2188: bipush #14
    //   2190: iload #88
    //   2192: iand
    //   2193: bipush #112
    //   2195: iload #9
    //   2197: bipush #9
    //   2199: ishr
    //   2200: iand
    //   2201: ior
    //   2202: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2205: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2210: pop
    //   2211: nop
    //   2212: aload #86
    //   2214: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2217: aload #62
    //   2219: invokeinterface endNode : ()V
    //   2224: aload #62
    //   2226: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2229: nop
    //   2230: aload #62
    //   2232: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2235: nop
    //   2236: aload #62
    //   2238: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2241: nop
    //   2242: aload #62
    //   2244: invokeinterface endReplaceGroup : ()V
    //   2249: nop
    //   2250: aload #59
    //   2252: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2255: aload #33
    //   2257: invokeinterface endNode : ()V
    //   2262: aload #33
    //   2264: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2267: nop
    //   2268: aload #33
    //   2270: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2273: nop
    //   2274: aload #33
    //   2276: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2279: nop
    //   2280: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
    //   2283: astore #36
    //   2285: aload_1
    //   2286: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/BannerColors;
    //   2289: invokevirtual getBorder-0d7_KjU : ()J
    //   2292: lstore #37
    //   2294: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   2297: checkcast androidx/compose/ui/Modifier
    //   2300: fconst_0
    //   2301: iconst_1
    //   2302: aconst_null
    //   2303: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   2306: aload #36
    //   2308: swap
    //   2309: lload #37
    //   2311: fconst_0
    //   2312: fconst_0
    //   2313: aconst_null
    //   2314: aload #33
    //   2316: bipush #54
    //   2318: bipush #56
    //   2320: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
    //   2323: nop
    //   2324: aload #30
    //   2326: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2329: aload #6
    //   2331: invokeinterface endNode : ()V
    //   2336: aload #6
    //   2338: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2341: nop
    //   2342: aload #6
    //   2344: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2347: nop
    //   2348: aload #6
    //   2350: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2353: nop
    //   2354: invokestatic isTraceInProgress : ()Z
    //   2357: ifeq -> 2373
    //   2360: invokestatic traceEventEnd : ()V
    //   2363: goto -> 2373
    //   2366: aload #6
    //   2368: invokeinterface skipToGroupEnd : ()V
    //   2373: aload #6
    //   2375: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   2380: dup
    //   2381: ifnull -> 2409
    //   2384: aload_0
    //   2385: aload_1
    //   2386: aload_2
    //   2387: aload_3
    //   2388: aload #4
    //   2390: aload #5
    //   2392: iload #7
    //   2394: iload #8
    //   2396: <illegal opcode> invoke : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;II)Lkotlin/jvm/functions/Function2;
    //   2401: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   2406: goto -> 2410
    //   2409: pop
    //   2410: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #81	-> 0
    //   #80	-> 346
    //   #81	-> 367
    //   #82	-> 380
    //   #107	-> 390
    //   #108	-> 393
    //   #109	-> 401
    //   #112	-> 409
    //   #113	-> 444
    //   #114	-> 456
    //   #115	-> 462
    //   #116	-> 469
    //   #117	-> 478
    //   #119	-> 485
    //   #118	-> 507
    //   #120	-> 519
    //   #121	-> 522
    //   #122	-> 540
    //   #123	-> 545
    //   #124	-> 557
    //   #126	-> 569
    //   #128	-> 574
    //   #129	-> 584
    //   #130	-> 597
    //   #132	-> 610
    //   #133	-> 621
    //   #134	-> 628
    //   #135	-> 656
    //   #136	-> 668
    //   #138	-> 682
    //   #133	-> 683
    //   #138	-> 684
    //   #139	-> 685
    //   #140	-> 698
    //   #128	-> 699
    //   #141	-> 700
    //   #142	-> 725
    //   #83	-> 756
    //   #85	-> 799
    //   #143	-> 825
    //   #85	-> 831
    //   #86	-> 836
    //   #84	-> 849
    //   #144	-> 861
    //   #145	-> 864
    //   #149	-> 872
    //   #150	-> 907
    //   #151	-> 919
    //   #152	-> 925
    //   #153	-> 932
    //   #154	-> 941
    //   #156	-> 948
    //   #155	-> 970
    //   #157	-> 982
    //   #158	-> 985
    //   #159	-> 1003
    //   #160	-> 1008
    //   #161	-> 1020
    //   #163	-> 1032
    //   #165	-> 1037
    //   #166	-> 1047
    //   #167	-> 1060
    //   #169	-> 1073
    //   #170	-> 1084
    //   #171	-> 1091
    //   #172	-> 1119
    //   #173	-> 1131
    //   #175	-> 1145
    //   #170	-> 1146
    //   #175	-> 1147
    //   #176	-> 1148
    //   #177	-> 1161
    //   #165	-> 1162
    //   #178	-> 1163
    //   #179	-> 1188
    //   #88	-> 1229
    //   #89	-> 1233
    //   #180	-> 1246
    //   #89	-> 1252
    //   #181	-> 1280
    //   #182	-> 1283
    //   #185	-> 1286
    //   #186	-> 1304
    //   #187	-> 1316
    //   #188	-> 1322
    //   #189	-> 1329
    //   #190	-> 1338
    //   #192	-> 1345
    //   #191	-> 1367
    //   #193	-> 1379
    //   #194	-> 1382
    //   #195	-> 1400
    //   #196	-> 1405
    //   #197	-> 1417
    //   #199	-> 1429
    //   #201	-> 1434
    //   #202	-> 1444
    //   #203	-> 1457
    //   #205	-> 1470
    //   #206	-> 1481
    //   #207	-> 1488
    //   #208	-> 1516
    //   #209	-> 1528
    //   #211	-> 1542
    //   #206	-> 1543
    //   #211	-> 1544
    //   #212	-> 1545
    //   #213	-> 1558
    //   #201	-> 1559
    //   #214	-> 1560
    //   #215	-> 1585
    //   #89	-> 1616
    //   #215	-> 1636
    //   #214	-> 1641
    //   #216	-> 1643
    //   #193	-> 1650
    //   #217	-> 1653
    //   #187	-> 1656
    //   #218	-> 1659
    //   #181	-> 1662
    //   #219	-> 1665
    //   #90	-> 1666
    //   #220	-> 1679
    //   #90	-> 1685
    //   #92	-> 1702
    //   #93	-> 1739
    //   #94	-> 1770
    //   #96	-> 1775
    //   #221	-> 1785
    //   #96	-> 1791
    //   #97	-> 1799
    //   #95	-> 1812
    //   #222	-> 1824
    //   #223	-> 1827
    //   #228	-> 1835
    //   #229	-> 1870
    //   #230	-> 1882
    //   #231	-> 1888
    //   #232	-> 1895
    //   #233	-> 1904
    //   #235	-> 1911
    //   #234	-> 1933
    //   #236	-> 1945
    //   #237	-> 1948
    //   #238	-> 1966
    //   #239	-> 1971
    //   #240	-> 1983
    //   #242	-> 1995
    //   #244	-> 2000
    //   #245	-> 2010
    //   #246	-> 2023
    //   #248	-> 2036
    //   #249	-> 2047
    //   #250	-> 2054
    //   #251	-> 2082
    //   #252	-> 2094
    //   #254	-> 2108
    //   #249	-> 2109
    //   #254	-> 2110
    //   #255	-> 2111
    //   #256	-> 2124
    //   #244	-> 2125
    //   #257	-> 2126
    //   #258	-> 2151
    //   #99	-> 2182
    //   #100	-> 2211
    //   #258	-> 2212
    //   #257	-> 2217
    //   #259	-> 2219
    //   #236	-> 2226
    //   #260	-> 2229
    //   #230	-> 2232
    //   #261	-> 2235
    //   #222	-> 2238
    //   #262	-> 2241
    //   #102	-> 2249
    //   #179	-> 2250
    //   #178	-> 2255
    //   #263	-> 2257
    //   #157	-> 2264
    //   #264	-> 2267
    //   #151	-> 2270
    //   #265	-> 2273
    //   #144	-> 2276
    //   #266	-> 2279
    //   #103	-> 2280
    //   #104	-> 2323
    //   #142	-> 2324
    //   #141	-> 2329
    //   #267	-> 2331
    //   #120	-> 2338
    //   #268	-> 2341
    //   #114	-> 2344
    //   #269	-> 2347
    //   #107	-> 2350
    //   #270	-> 2353
    //   #105	-> 2366
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   825	6	39	$i$f$getDp	I
    //   822	9	36	$this$dp$iv	I
    //   1246	6	66	$i$f$getDp	I
    //   1243	9	65	$this$dp$iv	I
    //   1616	20	91	$i$a$-Box-BannerKt$BannerImpl$1$1$1	I
    //   1613	23	90	$this$BannerImpl_u24lambda_u247_u24lambda_u246_u24lambda_u244	Landroidx/compose/foundation/layout/BoxScope;
    //   1613	23	89	$composer	Landroidx/compose/runtime/Composer;
    //   1613	23	88	$changed	I
    //   1577	64	87	$i$a$-Layout-BoxKt$Box$1$iv	I
    //   1574	67	86	$composer$iv	Landroidx/compose/runtime/Composer;
    //   1574	67	85	$changed$iv	I
    //   1488	55	84	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1485	58	83	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1481	64	82	$i$f$set-impl	I
    //   1478	67	81	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1444	115	80	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1441	118	79	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   1371	283	78	$i$f$ReusableComposeNode	I
    //   1368	286	76	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   1368	286	77	$changed$iv$iv$iv	I
    //   1308	352	72	$i$f$Layout	I
    //   1327	333	73	compositeKeyHash$iv$iv	I
    //   1336	324	74	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   1345	315	75	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   1305	355	71	$changed$iv$iv	I
    //   1272	394	68	$i$f$Box	I
    //   1295	371	70	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1269	397	65	modifier$iv	Landroidx/compose/ui/Modifier;
    //   1269	397	66	contentAlignment$iv	Landroidx/compose/ui/Alignment;
    //   1286	380	69	propagateMinConstraints$iv	Z
    //   1269	397	67	$changed$iv	I
    //   1679	6	66	$i$f$getDp	I
    //   1676	9	65	$this$dp$iv	I
    //   1785	6	69	$i$f$getDp	I
    //   1782	9	66	$this$dp$iv	I
    //   2182	30	91	$i$a$-Row-BannerKt$BannerImpl$1$1$2	I
    //   2179	33	90	$this$BannerImpl_u24lambda_u247_u24lambda_u246_u24lambda_u245	Landroidx/compose/foundation/layout/RowScope;
    //   2179	33	89	$composer	Landroidx/compose/runtime/Composer;
    //   2179	33	88	$changed	I
    //   2143	74	87	$i$a$-Layout-RowKt$Row$1$iv	I
    //   2140	77	86	$composer$iv	Landroidx/compose/runtime/Composer;
    //   2140	77	85	$changed$iv	I
    //   2054	55	84	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   2051	58	83	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   2047	64	82	$i$f$set-impl	I
    //   2044	67	81	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   2010	115	80	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   2007	118	79	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   1937	293	78	$i$f$ReusableComposeNode	I
    //   1934	296	76	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   1934	296	77	$changed$iv$iv$iv	I
    //   1874	362	72	$i$f$Layout	I
    //   1893	343	73	compositeKeyHash$iv$iv	I
    //   1902	334	74	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   1911	325	75	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   1871	365	71	$changed$iv$iv	I
    //   1816	426	68	$i$f$Row	I
    //   1861	381	70	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1835	407	65	modifier$iv	Landroidx/compose/ui/Modifier;
    //   1813	429	66	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   1813	429	69	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   1813	429	67	$changed$iv	I
    //   1219	1031	64	$i$a$-Row-BannerKt$BannerImpl$1$1	I
    //   1216	1034	63	$this$BannerImpl_u24lambda_u247_u24lambda_u246	Landroidx/compose/foundation/layout/RowScope;
    //   1216	1034	62	$composer	Landroidx/compose/runtime/Composer;
    //   1216	1034	61	$changed	I
    //   1180	1075	60	$i$a$-Layout-RowKt$Row$1$iv	I
    //   1177	1078	59	$composer$iv	Landroidx/compose/runtime/Composer;
    //   1177	1078	58	$changed$iv	I
    //   1091	55	57	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1088	58	56	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1084	64	55	$i$f$set-impl	I
    //   1081	67	54	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1047	115	53	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1044	118	52	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   974	1294	51	$i$f$ReusableComposeNode	I
    //   971	1297	49	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   971	1297	50	$changed$iv$iv$iv	I
    //   911	1363	45	$i$f$Layout	I
    //   930	1344	46	compositeKeyHash$iv$iv	I
    //   939	1335	47	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   948	1326	48	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   908	1366	44	$changed$iv$iv	I
    //   853	1427	42	$i$f$Row	I
    //   898	1382	43	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   850	1430	36	modifier$iv	Landroidx/compose/ui/Modifier;
    //   872	1408	39	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   850	1430	40	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   850	1430	41	$changed$iv	I
    //   756	1568	35	$i$a$-Column-BannerKt$BannerImpl$1	I
    //   753	1571	34	$this$BannerImpl_u24lambda_u247	Landroidx/compose/foundation/layout/ColumnScope;
    //   753	1571	33	$composer	Landroidx/compose/runtime/Composer;
    //   753	1571	32	$changed	I
    //   717	1612	31	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   714	1615	30	$composer$iv	Landroidx/compose/runtime/Composer;
    //   714	1615	29	$changed$iv	I
    //   628	55	28	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   625	58	27	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   621	64	26	$i$f$set-impl	I
    //   618	67	25	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   584	115	24	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   581	118	23	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   511	1831	22	$i$f$ReusableComposeNode	I
    //   508	1834	20	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   508	1834	21	$changed$iv$iv$iv	I
    //   448	1900	16	$i$f$Layout	I
    //   467	1881	17	compositeKeyHash$iv$iv	I
    //   476	1872	18	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   485	1863	19	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   445	1903	15	$changed$iv$iv	I
    //   384	1970	13	$i$f$Column	I
    //   435	1919	14	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   401	1953	10	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   409	1945	11	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   381	1973	12	$changed$iv	I
    //   15	2396	9	$dirty	I
    //   0	2411	0	text	Ljava/lang/String;
    //   0	2411	1	style	Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;
    //   0	2411	2	textStyle	Landroidx/compose/ui/text/TextStyle;
    //   0	2411	3	icon	Lkotlin/jvm/functions/Function2;
    //   0	2411	4	actions	Lkotlin/jvm/functions/Function3;
    //   0	2411	5	modifier	Landroidx/compose/ui/Modifier;
    //   0	2411	6	$composer	Landroidx/compose/runtime/Composer;
    //   0	2411	7	$changed	I
  }
  
  private static final Unit InformationBanner$lambda$0(String $text, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $icon, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $actions, DefaultBannerStyle $style, TextStyle $textStyle, int $$changed, int $$default, Composer $composer, int $force) {
    InformationBanner($text, $modifier, $icon, $actions, $style, $textStyle, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
  
  private static final Unit SuccessBanner$lambda$1(String $text, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $icon, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $actions, DefaultBannerStyle $style, TextStyle $textStyle, int $$changed, int $$default, Composer $composer, int $force) {
    SuccessBanner($text, $modifier, $icon, $actions, $style, $textStyle, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
  
  private static final Unit WarningBanner$lambda$2(String $text, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $icon, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $actions, DefaultBannerStyle $style, TextStyle $textStyle, int $$changed, int $$default, Composer $composer, int $force) {
    WarningBanner($text, $modifier, $icon, $actions, $style, $textStyle, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
  
  private static final Unit ErrorBanner$lambda$3(String $text, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $icon, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $actions, DefaultBannerStyle $style, TextStyle $textStyle, int $$changed, int $$default, Composer $composer, int $force) {
    ErrorBanner($text, $modifier, $icon, $actions, $style, $textStyle, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
  
  private static final Unit BannerImpl$lambda$8(String $text, DefaultBannerStyle $style, TextStyle $textStyle, Function2<? super Composer, ? super Integer, Unit> $icon, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $actions, Modifier $modifier, int $$changed, int $$default, Composer $composer, int $force) {
    BannerImpl($text, $style, $textStyle, $icon, $actions, $modifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\BannerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */