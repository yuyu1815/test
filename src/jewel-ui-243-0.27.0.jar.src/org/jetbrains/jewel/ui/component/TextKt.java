/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.foundation.text.InlineTextContent;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.text.AnnotatedString;
/*    */ import androidx.compose.ui.text.TextLayoutResult;
/*    */ import androidx.compose.ui.text.TextStyle;
/*    */ import androidx.compose.ui.text.font.FontFamily;
/*    */ import androidx.compose.ui.text.font.FontStyle;
/*    */ import androidx.compose.ui.text.font.FontWeight;
/*    */ import androidx.compose.ui.text.style.TextDecoration;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000x\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\b\003\032Á\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\b\b\002\020\020\032\0020\t2\n\b\002\020\021\032\004\030\0010\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\t2\b\b\002\020\026\032\0020\0272\b\b\002\020\030\032\0020\0312\b\b\002\020\032\032\0020\0332\024\b\002\020\034\032\016\022\004\022\0020\036\022\004\022\0020\0010\0352\b\b\002\020\037\032\0020 H\007¢\006\004\b!\020\"\032×\001\020\000\032\0020\0012\006\020\002\032\0020#2\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\b\b\002\020\020\032\0020\t2\n\b\002\020\021\032\004\030\0010\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\t2\b\b\002\020\026\032\0020\0272\b\b\002\020\030\032\0020\0312\b\b\002\020\032\032\0020\0332\024\b\002\020$\032\016\022\004\022\0020\003\022\004\022\0020&0%2\024\b\002\020\034\032\016\022\004\022\0020\036\022\004\022\0020\0010\0352\b\b\002\020\037\032\0020 H\007¢\006\004\b'\020(¨\006)"}, d2 = {"Text", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Landroidx/compose/ui/text/TextStyle;", "Text-bAzTDeA", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "", "Landroidx/compose/foundation/text/InlineTextContent;", "Text-F-Jr8PA", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\norg/jetbrains/jewel/ui/component/TextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,101:1\n1225#2,6:102\n1225#2,6:108\n708#3:114\n696#3:115\n77#4:116\n*S KotlinDebug\n*F\n+ 1 Text.kt\norg/jetbrains/jewel/ui/component/TextKt\n*L\n38#1:102,6\n79#1:108,6\n82#1:114\n82#1:115\n82#1:116\n*E\n"})
/*    */ public final class TextKt
/*    */ {
/*    */   private static final Unit Text_bAzTDeA$lambda$1$lambda$0(TextLayoutResult it) {
/* 38 */     Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE;
/*    */   }
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
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void Text-bAzTDeA(@NotNull String text, @Nullable Modifier modifier, long color, long fontSize, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long letterSpacing, @Nullable TextDecoration textDecoration, int textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, @Nullable Function1 onTextLayout, @Nullable TextStyle style, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'text'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload #20
/*    */     //   8: ldc 2088910712
/*    */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   15: astore #20
/*    */     //   17: iload #21
/*    */     //   19: istore #24
/*    */     //   21: iload #22
/*    */     //   23: istore #25
/*    */     //   25: iload #23
/*    */     //   27: iconst_1
/*    */     //   28: iand
/*    */     //   29: ifeq -> 42
/*    */     //   32: iload #24
/*    */     //   34: bipush #6
/*    */     //   36: ior
/*    */     //   37: istore #24
/*    */     //   39: goto -> 71
/*    */     //   42: iload #21
/*    */     //   44: bipush #6
/*    */     //   46: iand
/*    */     //   47: ifne -> 71
/*    */     //   50: iload #24
/*    */     //   52: aload #20
/*    */     //   54: aload_0
/*    */     //   55: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   60: ifeq -> 67
/*    */     //   63: iconst_4
/*    */     //   64: goto -> 68
/*    */     //   67: iconst_2
/*    */     //   68: ior
/*    */     //   69: istore #24
/*    */     //   71: iload #23
/*    */     //   73: iconst_2
/*    */     //   74: iand
/*    */     //   75: ifeq -> 88
/*    */     //   78: iload #24
/*    */     //   80: bipush #48
/*    */     //   82: ior
/*    */     //   83: istore #24
/*    */     //   85: goto -> 119
/*    */     //   88: iload #21
/*    */     //   90: bipush #48
/*    */     //   92: iand
/*    */     //   93: ifne -> 119
/*    */     //   96: iload #24
/*    */     //   98: aload #20
/*    */     //   100: aload_1
/*    */     //   101: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   106: ifeq -> 114
/*    */     //   109: bipush #32
/*    */     //   111: goto -> 116
/*    */     //   114: bipush #16
/*    */     //   116: ior
/*    */     //   117: istore #24
/*    */     //   119: iload #23
/*    */     //   121: iconst_4
/*    */     //   122: iand
/*    */     //   123: ifeq -> 137
/*    */     //   126: iload #24
/*    */     //   128: sipush #384
/*    */     //   131: ior
/*    */     //   132: istore #24
/*    */     //   134: goto -> 171
/*    */     //   137: iload #21
/*    */     //   139: sipush #384
/*    */     //   142: iand
/*    */     //   143: ifne -> 171
/*    */     //   146: iload #24
/*    */     //   148: aload #20
/*    */     //   150: lload_2
/*    */     //   151: invokeinterface changed : (J)Z
/*    */     //   156: ifeq -> 165
/*    */     //   159: sipush #256
/*    */     //   162: goto -> 168
/*    */     //   165: sipush #128
/*    */     //   168: ior
/*    */     //   169: istore #24
/*    */     //   171: iload #23
/*    */     //   173: bipush #8
/*    */     //   175: iand
/*    */     //   176: ifeq -> 190
/*    */     //   179: iload #24
/*    */     //   181: sipush #3072
/*    */     //   184: ior
/*    */     //   185: istore #24
/*    */     //   187: goto -> 225
/*    */     //   190: iload #21
/*    */     //   192: sipush #3072
/*    */     //   195: iand
/*    */     //   196: ifne -> 225
/*    */     //   199: iload #24
/*    */     //   201: aload #20
/*    */     //   203: lload #4
/*    */     //   205: invokeinterface changed : (J)Z
/*    */     //   210: ifeq -> 219
/*    */     //   213: sipush #2048
/*    */     //   216: goto -> 222
/*    */     //   219: sipush #1024
/*    */     //   222: ior
/*    */     //   223: istore #24
/*    */     //   225: iload #23
/*    */     //   227: bipush #16
/*    */     //   229: iand
/*    */     //   230: ifeq -> 244
/*    */     //   233: iload #24
/*    */     //   235: sipush #24576
/*    */     //   238: ior
/*    */     //   239: istore #24
/*    */     //   241: goto -> 279
/*    */     //   244: iload #21
/*    */     //   246: sipush #24576
/*    */     //   249: iand
/*    */     //   250: ifne -> 279
/*    */     //   253: iload #24
/*    */     //   255: aload #20
/*    */     //   257: aload #6
/*    */     //   259: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   264: ifeq -> 273
/*    */     //   267: sipush #16384
/*    */     //   270: goto -> 276
/*    */     //   273: sipush #8192
/*    */     //   276: ior
/*    */     //   277: istore #24
/*    */     //   279: iload #23
/*    */     //   281: bipush #32
/*    */     //   283: iand
/*    */     //   284: ifeq -> 297
/*    */     //   287: iload #24
/*    */     //   289: ldc 196608
/*    */     //   291: ior
/*    */     //   292: istore #24
/*    */     //   294: goto -> 329
/*    */     //   297: iload #21
/*    */     //   299: ldc 196608
/*    */     //   301: iand
/*    */     //   302: ifne -> 329
/*    */     //   305: iload #24
/*    */     //   307: aload #20
/*    */     //   309: aload #7
/*    */     //   311: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   316: ifeq -> 324
/*    */     //   319: ldc 131072
/*    */     //   321: goto -> 326
/*    */     //   324: ldc 65536
/*    */     //   326: ior
/*    */     //   327: istore #24
/*    */     //   329: iload #23
/*    */     //   331: bipush #64
/*    */     //   333: iand
/*    */     //   334: ifeq -> 347
/*    */     //   337: iload #24
/*    */     //   339: ldc 1572864
/*    */     //   341: ior
/*    */     //   342: istore #24
/*    */     //   344: goto -> 379
/*    */     //   347: iload #21
/*    */     //   349: ldc 1572864
/*    */     //   351: iand
/*    */     //   352: ifne -> 379
/*    */     //   355: iload #24
/*    */     //   357: aload #20
/*    */     //   359: aload #8
/*    */     //   361: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   366: ifeq -> 374
/*    */     //   369: ldc 1048576
/*    */     //   371: goto -> 376
/*    */     //   374: ldc 524288
/*    */     //   376: ior
/*    */     //   377: istore #24
/*    */     //   379: iload #23
/*    */     //   381: sipush #128
/*    */     //   384: iand
/*    */     //   385: ifeq -> 398
/*    */     //   388: iload #24
/*    */     //   390: ldc 12582912
/*    */     //   392: ior
/*    */     //   393: istore #24
/*    */     //   395: goto -> 430
/*    */     //   398: iload #21
/*    */     //   400: ldc 12582912
/*    */     //   402: iand
/*    */     //   403: ifne -> 430
/*    */     //   406: iload #24
/*    */     //   408: aload #20
/*    */     //   410: lload #9
/*    */     //   412: invokeinterface changed : (J)Z
/*    */     //   417: ifeq -> 425
/*    */     //   420: ldc 8388608
/*    */     //   422: goto -> 427
/*    */     //   425: ldc 4194304
/*    */     //   427: ior
/*    */     //   428: istore #24
/*    */     //   430: iload #23
/*    */     //   432: sipush #256
/*    */     //   435: iand
/*    */     //   436: ifeq -> 449
/*    */     //   439: iload #24
/*    */     //   441: ldc 100663296
/*    */     //   443: ior
/*    */     //   444: istore #24
/*    */     //   446: goto -> 481
/*    */     //   449: iload #21
/*    */     //   451: ldc 100663296
/*    */     //   453: iand
/*    */     //   454: ifne -> 481
/*    */     //   457: iload #24
/*    */     //   459: aload #20
/*    */     //   461: aload #11
/*    */     //   463: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   468: ifeq -> 476
/*    */     //   471: ldc 67108864
/*    */     //   473: goto -> 478
/*    */     //   476: ldc 33554432
/*    */     //   478: ior
/*    */     //   479: istore #24
/*    */     //   481: iload #21
/*    */     //   483: ldc 805306368
/*    */     //   485: iand
/*    */     //   486: ifne -> 522
/*    */     //   489: iload #24
/*    */     //   491: iload #23
/*    */     //   493: sipush #512
/*    */     //   496: iand
/*    */     //   497: ifne -> 517
/*    */     //   500: aload #20
/*    */     //   502: iload #12
/*    */     //   504: invokeinterface changed : (I)Z
/*    */     //   509: ifeq -> 517
/*    */     //   512: ldc 536870912
/*    */     //   514: goto -> 519
/*    */     //   517: ldc 268435456
/*    */     //   519: ior
/*    */     //   520: istore #24
/*    */     //   522: iload #23
/*    */     //   524: sipush #1024
/*    */     //   527: iand
/*    */     //   528: ifeq -> 541
/*    */     //   531: iload #25
/*    */     //   533: bipush #6
/*    */     //   535: ior
/*    */     //   536: istore #25
/*    */     //   538: goto -> 571
/*    */     //   541: iload #22
/*    */     //   543: bipush #6
/*    */     //   545: iand
/*    */     //   546: ifne -> 571
/*    */     //   549: iload #25
/*    */     //   551: aload #20
/*    */     //   553: lload #13
/*    */     //   555: invokeinterface changed : (J)Z
/*    */     //   560: ifeq -> 567
/*    */     //   563: iconst_4
/*    */     //   564: goto -> 568
/*    */     //   567: iconst_2
/*    */     //   568: ior
/*    */     //   569: istore #25
/*    */     //   571: iload #23
/*    */     //   573: sipush #2048
/*    */     //   576: iand
/*    */     //   577: ifeq -> 590
/*    */     //   580: iload #25
/*    */     //   582: bipush #48
/*    */     //   584: ior
/*    */     //   585: istore #25
/*    */     //   587: goto -> 622
/*    */     //   590: iload #22
/*    */     //   592: bipush #48
/*    */     //   594: iand
/*    */     //   595: ifne -> 622
/*    */     //   598: iload #25
/*    */     //   600: aload #20
/*    */     //   602: iload #15
/*    */     //   604: invokeinterface changed : (I)Z
/*    */     //   609: ifeq -> 617
/*    */     //   612: bipush #32
/*    */     //   614: goto -> 619
/*    */     //   617: bipush #16
/*    */     //   619: ior
/*    */     //   620: istore #25
/*    */     //   622: iload #23
/*    */     //   624: sipush #4096
/*    */     //   627: iand
/*    */     //   628: ifeq -> 642
/*    */     //   631: iload #25
/*    */     //   633: sipush #384
/*    */     //   636: ior
/*    */     //   637: istore #25
/*    */     //   639: goto -> 677
/*    */     //   642: iload #22
/*    */     //   644: sipush #384
/*    */     //   647: iand
/*    */     //   648: ifne -> 677
/*    */     //   651: iload #25
/*    */     //   653: aload #20
/*    */     //   655: iload #16
/*    */     //   657: invokeinterface changed : (Z)Z
/*    */     //   662: ifeq -> 671
/*    */     //   665: sipush #256
/*    */     //   668: goto -> 674
/*    */     //   671: sipush #128
/*    */     //   674: ior
/*    */     //   675: istore #25
/*    */     //   677: iload #23
/*    */     //   679: sipush #8192
/*    */     //   682: iand
/*    */     //   683: ifeq -> 697
/*    */     //   686: iload #25
/*    */     //   688: sipush #3072
/*    */     //   691: ior
/*    */     //   692: istore #25
/*    */     //   694: goto -> 732
/*    */     //   697: iload #22
/*    */     //   699: sipush #3072
/*    */     //   702: iand
/*    */     //   703: ifne -> 732
/*    */     //   706: iload #25
/*    */     //   708: aload #20
/*    */     //   710: iload #17
/*    */     //   712: invokeinterface changed : (I)Z
/*    */     //   717: ifeq -> 726
/*    */     //   720: sipush #2048
/*    */     //   723: goto -> 729
/*    */     //   726: sipush #1024
/*    */     //   729: ior
/*    */     //   730: istore #25
/*    */     //   732: iload #23
/*    */     //   734: sipush #16384
/*    */     //   737: iand
/*    */     //   738: ifeq -> 752
/*    */     //   741: iload #25
/*    */     //   743: sipush #24576
/*    */     //   746: ior
/*    */     //   747: istore #25
/*    */     //   749: goto -> 787
/*    */     //   752: iload #22
/*    */     //   754: sipush #24576
/*    */     //   757: iand
/*    */     //   758: ifne -> 787
/*    */     //   761: iload #25
/*    */     //   763: aload #20
/*    */     //   765: aload #18
/*    */     //   767: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   772: ifeq -> 781
/*    */     //   775: sipush #16384
/*    */     //   778: goto -> 784
/*    */     //   781: sipush #8192
/*    */     //   784: ior
/*    */     //   785: istore #25
/*    */     //   787: iload #22
/*    */     //   789: ldc 196608
/*    */     //   791: iand
/*    */     //   792: ifne -> 827
/*    */     //   795: iload #25
/*    */     //   797: iload #23
/*    */     //   799: ldc 32768
/*    */     //   801: iand
/*    */     //   802: ifne -> 822
/*    */     //   805: aload #20
/*    */     //   807: aload #19
/*    */     //   809: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   814: ifeq -> 822
/*    */     //   817: ldc 131072
/*    */     //   819: goto -> 824
/*    */     //   822: ldc 65536
/*    */     //   824: ior
/*    */     //   825: istore #25
/*    */     //   827: iload #24
/*    */     //   829: ldc 306783379
/*    */     //   831: iand
/*    */     //   832: ldc 306783378
/*    */     //   834: if_icmpne -> 857
/*    */     //   837: iload #25
/*    */     //   839: ldc 74899
/*    */     //   841: iand
/*    */     //   842: ldc 74898
/*    */     //   844: if_icmpne -> 857
/*    */     //   847: aload #20
/*    */     //   849: invokeinterface getSkipping : ()Z
/*    */     //   854: ifne -> 1420
/*    */     //   857: aload #20
/*    */     //   859: invokeinterface startDefaults : ()V
/*    */     //   864: iload #21
/*    */     //   866: iconst_1
/*    */     //   867: iand
/*    */     //   868: ifeq -> 881
/*    */     //   871: aload #20
/*    */     //   873: invokeinterface getDefaultsInvalid : ()Z
/*    */     //   878: ifeq -> 1196
/*    */     //   881: iload #23
/*    */     //   883: iconst_2
/*    */     //   884: iand
/*    */     //   885: ifeq -> 895
/*    */     //   888: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   891: checkcast androidx/compose/ui/Modifier
/*    */     //   894: astore_1
/*    */     //   895: iload #23
/*    */     //   897: iconst_4
/*    */     //   898: iand
/*    */     //   899: ifeq -> 909
/*    */     //   902: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*    */     //   905: invokevirtual getUnspecified-0d7_KjU : ()J
/*    */     //   908: lstore_2
/*    */     //   909: iload #23
/*    */     //   911: bipush #8
/*    */     //   913: iand
/*    */     //   914: ifeq -> 925
/*    */     //   917: getstatic androidx/compose/ui/unit/TextUnit.Companion : Landroidx/compose/ui/unit/TextUnit$Companion;
/*    */     //   920: invokevirtual getUnspecified-XSAIIZE : ()J
/*    */     //   923: lstore #4
/*    */     //   925: iload #23
/*    */     //   927: bipush #16
/*    */     //   929: iand
/*    */     //   930: ifeq -> 936
/*    */     //   933: aconst_null
/*    */     //   934: astore #6
/*    */     //   936: iload #23
/*    */     //   938: bipush #32
/*    */     //   940: iand
/*    */     //   941: ifeq -> 947
/*    */     //   944: aconst_null
/*    */     //   945: astore #7
/*    */     //   947: iload #23
/*    */     //   949: bipush #64
/*    */     //   951: iand
/*    */     //   952: ifeq -> 958
/*    */     //   955: aconst_null
/*    */     //   956: astore #8
/*    */     //   958: iload #23
/*    */     //   960: sipush #128
/*    */     //   963: iand
/*    */     //   964: ifeq -> 975
/*    */     //   967: getstatic androidx/compose/ui/unit/TextUnit.Companion : Landroidx/compose/ui/unit/TextUnit$Companion;
/*    */     //   970: invokevirtual getUnspecified-XSAIIZE : ()J
/*    */     //   973: lstore #9
/*    */     //   975: iload #23
/*    */     //   977: sipush #256
/*    */     //   980: iand
/*    */     //   981: ifeq -> 987
/*    */     //   984: aconst_null
/*    */     //   985: astore #11
/*    */     //   987: iload #23
/*    */     //   989: sipush #512
/*    */     //   992: iand
/*    */     //   993: ifeq -> 1011
/*    */     //   996: getstatic androidx/compose/ui/text/style/TextAlign.Companion : Landroidx/compose/ui/text/style/TextAlign$Companion;
/*    */     //   999: invokevirtual getUnspecified-e0LSkKk : ()I
/*    */     //   1002: istore #12
/*    */     //   1004: iload #24
/*    */     //   1006: ldc -1879048193
/*    */     //   1008: iand
/*    */     //   1009: istore #24
/*    */     //   1011: iload #23
/*    */     //   1013: sipush #1024
/*    */     //   1016: iand
/*    */     //   1017: ifeq -> 1028
/*    */     //   1020: getstatic androidx/compose/ui/unit/TextUnit.Companion : Landroidx/compose/ui/unit/TextUnit$Companion;
/*    */     //   1023: invokevirtual getUnspecified-XSAIIZE : ()J
/*    */     //   1026: lstore #13
/*    */     //   1028: iload #23
/*    */     //   1030: sipush #2048
/*    */     //   1033: iand
/*    */     //   1034: ifeq -> 1045
/*    */     //   1037: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*    */     //   1040: invokevirtual getClip-gIe3tQ8 : ()I
/*    */     //   1043: istore #15
/*    */     //   1045: iload #23
/*    */     //   1047: sipush #4096
/*    */     //   1050: iand
/*    */     //   1051: ifeq -> 1057
/*    */     //   1054: iconst_1
/*    */     //   1055: istore #16
/*    */     //   1057: iload #23
/*    */     //   1059: sipush #8192
/*    */     //   1062: iand
/*    */     //   1063: ifeq -> 1070
/*    */     //   1066: ldc 2147483647
/*    */     //   1068: istore #17
/*    */     //   1070: iload #23
/*    */     //   1072: sipush #16384
/*    */     //   1075: iand
/*    */     //   1076: ifeq -> 1166
/*    */     //   1079: aload #20
/*    */     //   1081: ldc 1098999949
/*    */     //   1083: invokeinterface startReplaceGroup : (I)V
/*    */     //   1088: aload #20
/*    */     //   1090: astore #27
/*    */     //   1092: iconst_0
/*    */     //   1093: istore #28
/*    */     //   1095: iconst_0
/*    */     //   1096: istore #29
/*    */     //   1098: aload #27
/*    */     //   1100: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1105: astore #30
/*    */     //   1107: iconst_0
/*    */     //   1108: istore #31
/*    */     //   1110: aload #30
/*    */     //   1112: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   1115: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   1118: if_acmpne -> 1145
/*    */     //   1121: iconst_0
/*    */     //   1122: istore #32
/*    */     //   1124: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   1129: astore #32
/*    */     //   1131: aload #27
/*    */     //   1133: aload #32
/*    */     //   1135: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1140: aload #32
/*    */     //   1142: goto -> 1147
/*    */     //   1145: aload #30
/*    */     //   1147: nop
/*    */     //   1148: nop
/*    */     //   1149: nop
/*    */     //   1150: checkcast kotlin/jvm/functions/Function1
/*    */     //   1153: astore #26
/*    */     //   1155: aload #20
/*    */     //   1157: invokeinterface endReplaceGroup : ()V
/*    */     //   1162: aload #26
/*    */     //   1164: astore #18
/*    */     //   1166: iload #23
/*    */     //   1168: ldc 32768
/*    */     //   1170: iand
/*    */     //   1171: ifeq -> 1234
/*    */     //   1174: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   1177: aload #20
/*    */     //   1179: bipush #6
/*    */     //   1181: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*    */     //   1184: astore #19
/*    */     //   1186: iload #25
/*    */     //   1188: ldc -458753
/*    */     //   1190: iand
/*    */     //   1191: istore #25
/*    */     //   1193: goto -> 1234
/*    */     //   1196: aload #20
/*    */     //   1198: invokeinterface skipToGroupEnd : ()V
/*    */     //   1203: iload #23
/*    */     //   1205: sipush #512
/*    */     //   1208: iand
/*    */     //   1209: ifeq -> 1219
/*    */     //   1212: iload #24
/*    */     //   1214: ldc -1879048193
/*    */     //   1216: iand
/*    */     //   1217: istore #24
/*    */     //   1219: iload #23
/*    */     //   1221: ldc 32768
/*    */     //   1223: iand
/*    */     //   1224: ifeq -> 1234
/*    */     //   1227: iload #25
/*    */     //   1229: ldc -458753
/*    */     //   1231: iand
/*    */     //   1232: istore #25
/*    */     //   1234: aload #20
/*    */     //   1236: invokeinterface endDefaults : ()V
/*    */     //   1241: invokestatic isTraceInProgress : ()Z
/*    */     //   1244: ifeq -> 1258
/*    */     //   1247: ldc 2088910712
/*    */     //   1249: iload #24
/*    */     //   1251: iload #25
/*    */     //   1253: ldc 'org.jetbrains.jewel.ui.component.Text (Text.kt:39)'
/*    */     //   1255: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   1258: new androidx/compose/ui/text/AnnotatedString
/*    */     //   1261: dup
/*    */     //   1262: aload_0
/*    */     //   1263: aconst_null
/*    */     //   1264: aconst_null
/*    */     //   1265: bipush #6
/*    */     //   1267: aconst_null
/*    */     //   1268: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   1271: aload_1
/*    */     //   1272: lload_2
/*    */     //   1273: lload #4
/*    */     //   1275: aload #6
/*    */     //   1277: aload #7
/*    */     //   1279: aload #8
/*    */     //   1281: lload #9
/*    */     //   1283: aload #11
/*    */     //   1285: iload #12
/*    */     //   1287: lload #13
/*    */     //   1289: iload #15
/*    */     //   1291: iload #16
/*    */     //   1293: iload #17
/*    */     //   1295: invokestatic emptyMap : ()Ljava/util/Map;
/*    */     //   1298: aload #18
/*    */     //   1300: aload #19
/*    */     //   1302: aload #20
/*    */     //   1304: bipush #112
/*    */     //   1306: iload #24
/*    */     //   1308: iand
/*    */     //   1309: sipush #896
/*    */     //   1312: iload #24
/*    */     //   1314: iand
/*    */     //   1315: ior
/*    */     //   1316: sipush #7168
/*    */     //   1319: iload #24
/*    */     //   1321: iand
/*    */     //   1322: ior
/*    */     //   1323: ldc 57344
/*    */     //   1325: iload #24
/*    */     //   1327: iand
/*    */     //   1328: ior
/*    */     //   1329: ldc 458752
/*    */     //   1331: iload #24
/*    */     //   1333: iand
/*    */     //   1334: ior
/*    */     //   1335: ldc 3670016
/*    */     //   1337: iload #24
/*    */     //   1339: iand
/*    */     //   1340: ior
/*    */     //   1341: ldc 29360128
/*    */     //   1343: iload #24
/*    */     //   1345: iand
/*    */     //   1346: ior
/*    */     //   1347: ldc 234881024
/*    */     //   1349: iload #24
/*    */     //   1351: iand
/*    */     //   1352: ior
/*    */     //   1353: ldc 1879048192
/*    */     //   1355: iload #24
/*    */     //   1357: iand
/*    */     //   1358: ior
/*    */     //   1359: sipush #24576
/*    */     //   1362: bipush #14
/*    */     //   1364: iload #25
/*    */     //   1366: iand
/*    */     //   1367: ior
/*    */     //   1368: bipush #112
/*    */     //   1370: iload #25
/*    */     //   1372: iand
/*    */     //   1373: ior
/*    */     //   1374: sipush #896
/*    */     //   1377: iload #25
/*    */     //   1379: iand
/*    */     //   1380: ior
/*    */     //   1381: sipush #7168
/*    */     //   1384: iload #25
/*    */     //   1386: iand
/*    */     //   1387: ior
/*    */     //   1388: ldc 458752
/*    */     //   1390: iload #25
/*    */     //   1392: iconst_3
/*    */     //   1393: ishl
/*    */     //   1394: iand
/*    */     //   1395: ior
/*    */     //   1396: ldc 3670016
/*    */     //   1398: iload #25
/*    */     //   1400: iconst_3
/*    */     //   1401: ishl
/*    */     //   1402: iand
/*    */     //   1403: ior
/*    */     //   1404: iconst_0
/*    */     //   1405: invokestatic Text-F-Jr8PA : (Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   1408: invokestatic isTraceInProgress : ()Z
/*    */     //   1411: ifeq -> 1427
/*    */     //   1414: invokestatic traceEventEnd : ()V
/*    */     //   1417: goto -> 1427
/*    */     //   1420: aload #20
/*    */     //   1422: invokeinterface skipToGroupEnd : ()V
/*    */     //   1427: aload #20
/*    */     //   1429: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   1434: dup
/*    */     //   1435: ifnull -> 1486
/*    */     //   1438: aload_0
/*    */     //   1439: aload_1
/*    */     //   1440: lload_2
/*    */     //   1441: lload #4
/*    */     //   1443: aload #6
/*    */     //   1445: aload #7
/*    */     //   1447: aload #8
/*    */     //   1449: lload #9
/*    */     //   1451: aload #11
/*    */     //   1453: iload #12
/*    */     //   1455: lload #13
/*    */     //   1457: iload #15
/*    */     //   1459: iload #16
/*    */     //   1461: iload #17
/*    */     //   1463: aload #18
/*    */     //   1465: aload #19
/*    */     //   1467: iload #21
/*    */     //   1469: iload #22
/*    */     //   1471: iload #23
/*    */     //   1473: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;III)Lkotlin/jvm/functions/Function2;
/*    */     //   1478: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   1483: goto -> 1487
/*    */     //   1486: pop
/*    */     //   1487: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 6
/*    */     //   #25	-> 888
/*    */     //   #26	-> 902
/*    */     //   #27	-> 917
/*    */     //   #28	-> 933
/*    */     //   #29	-> 944
/*    */     //   #30	-> 955
/*    */     //   #31	-> 967
/*    */     //   #32	-> 984
/*    */     //   #33	-> 996
/*    */     //   #34	-> 1020
/*    */     //   #35	-> 1037
/*    */     //   #36	-> 1054
/*    */     //   #37	-> 1066
/*    */     //   #38	-> 1079
/*    */     //   #102	-> 1098
/*    */     //   #103	-> 1110
/*    */     //   #104	-> 1121
/*    */     //   #104	-> 1129
/*    */     //   #105	-> 1131
/*    */     //   #106	-> 1140
/*    */     //   #107	-> 1145
/*    */     //   #103	-> 1147
/*    */     //   #102	-> 1148
/*    */     //   #102	-> 1149
/*    */     //   #38	-> 1150
/*    */     //   #39	-> 1174
/*    */     //   #40	-> 1255
/*    */     //   #42	-> 1258
/*    */     //   #43	-> 1271
/*    */     //   #44	-> 1272
/*    */     //   #45	-> 1273
/*    */     //   #46	-> 1275
/*    */     //   #47	-> 1277
/*    */     //   #48	-> 1279
/*    */     //   #49	-> 1281
/*    */     //   #50	-> 1283
/*    */     //   #51	-> 1285
/*    */     //   #52	-> 1287
/*    */     //   #53	-> 1289
/*    */     //   #54	-> 1291
/*    */     //   #55	-> 1293
/*    */     //   #56	-> 1295
/*    */     //   #57	-> 1298
/*    */     //   #58	-> 1300
/*    */     //   #41	-> 1405
/*    */     //   #60	-> 1420
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   1124	5	32	$i$a$-cache-TextKt$Text$1	I
/*    */     //   1131	11	32	value$iv	Ljava/lang/Object;
/*    */     //   1110	38	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   1107	41	30	it$iv	Ljava/lang/Object;
/*    */     //   1098	52	29	$i$f$cache	I
/*    */     //   1095	55	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1095	55	28	invalid$iv	Z
/*    */     //   21	1467	24	$dirty	I
/*    */     //   25	1463	25	$dirty1	I
/*    */     //   0	1488	0	text	Ljava/lang/String;
/*    */     //   0	1488	1	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	1488	2	color	J
/*    */     //   0	1488	4	fontSize	J
/*    */     //   0	1488	6	fontStyle	Landroidx/compose/ui/text/font/FontStyle;
/*    */     //   0	1488	7	fontWeight	Landroidx/compose/ui/text/font/FontWeight;
/*    */     //   0	1488	8	fontFamily	Landroidx/compose/ui/text/font/FontFamily;
/*    */     //   0	1488	9	letterSpacing	J
/*    */     //   0	1488	11	textDecoration	Landroidx/compose/ui/text/style/TextDecoration;
/*    */     //   0	1488	12	textAlign	I
/*    */     //   0	1488	13	lineHeight	J
/*    */     //   0	1488	15	overflow	I
/*    */     //   0	1488	16	softWrap	Z
/*    */     //   0	1488	17	maxLines	I
/*    */     //   0	1488	18	onTextLayout	Lkotlin/jvm/functions/Function1;
/*    */     //   0	1488	19	style	Landroidx/compose/ui/text/TextStyle;
/*    */     //   0	1488	20	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1488	21	$changed	I
/*    */     //   0	1488	22	$changed1	I
/*    */   }
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
/*    */   private static final Unit Text_F_Jr8PA$lambda$4$lambda$3(TextLayoutResult it) {
/* 79 */     Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void Text-F-Jr8PA(@NotNull AnnotatedString text, @Nullable Modifier modifier, long color, long fontSize, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long letterSpacing, @Nullable TextDecoration textDecoration, int textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, @Nullable Map inlineContent, @Nullable Function1 onTextLayout, @Nullable TextStyle style, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'text'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload #21
/*    */     //   8: ldc_w -398603798
/*    */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   16: astore #21
/*    */     //   18: iload #22
/*    */     //   20: istore #25
/*    */     //   22: iload #23
/*    */     //   24: istore #26
/*    */     //   26: iload #24
/*    */     //   28: iconst_1
/*    */     //   29: iand
/*    */     //   30: ifeq -> 43
/*    */     //   33: iload #25
/*    */     //   35: bipush #6
/*    */     //   37: ior
/*    */     //   38: istore #25
/*    */     //   40: goto -> 72
/*    */     //   43: iload #22
/*    */     //   45: bipush #6
/*    */     //   47: iand
/*    */     //   48: ifne -> 72
/*    */     //   51: iload #25
/*    */     //   53: aload #21
/*    */     //   55: aload_0
/*    */     //   56: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   61: ifeq -> 68
/*    */     //   64: iconst_4
/*    */     //   65: goto -> 69
/*    */     //   68: iconst_2
/*    */     //   69: ior
/*    */     //   70: istore #25
/*    */     //   72: iload #24
/*    */     //   74: iconst_2
/*    */     //   75: iand
/*    */     //   76: ifeq -> 89
/*    */     //   79: iload #25
/*    */     //   81: bipush #48
/*    */     //   83: ior
/*    */     //   84: istore #25
/*    */     //   86: goto -> 120
/*    */     //   89: iload #22
/*    */     //   91: bipush #48
/*    */     //   93: iand
/*    */     //   94: ifne -> 120
/*    */     //   97: iload #25
/*    */     //   99: aload #21
/*    */     //   101: aload_1
/*    */     //   102: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   107: ifeq -> 115
/*    */     //   110: bipush #32
/*    */     //   112: goto -> 117
/*    */     //   115: bipush #16
/*    */     //   117: ior
/*    */     //   118: istore #25
/*    */     //   120: iload #24
/*    */     //   122: iconst_4
/*    */     //   123: iand
/*    */     //   124: ifeq -> 138
/*    */     //   127: iload #25
/*    */     //   129: sipush #384
/*    */     //   132: ior
/*    */     //   133: istore #25
/*    */     //   135: goto -> 172
/*    */     //   138: iload #22
/*    */     //   140: sipush #384
/*    */     //   143: iand
/*    */     //   144: ifne -> 172
/*    */     //   147: iload #25
/*    */     //   149: aload #21
/*    */     //   151: lload_2
/*    */     //   152: invokeinterface changed : (J)Z
/*    */     //   157: ifeq -> 166
/*    */     //   160: sipush #256
/*    */     //   163: goto -> 169
/*    */     //   166: sipush #128
/*    */     //   169: ior
/*    */     //   170: istore #25
/*    */     //   172: iload #24
/*    */     //   174: bipush #8
/*    */     //   176: iand
/*    */     //   177: ifeq -> 191
/*    */     //   180: iload #25
/*    */     //   182: sipush #3072
/*    */     //   185: ior
/*    */     //   186: istore #25
/*    */     //   188: goto -> 226
/*    */     //   191: iload #22
/*    */     //   193: sipush #3072
/*    */     //   196: iand
/*    */     //   197: ifne -> 226
/*    */     //   200: iload #25
/*    */     //   202: aload #21
/*    */     //   204: lload #4
/*    */     //   206: invokeinterface changed : (J)Z
/*    */     //   211: ifeq -> 220
/*    */     //   214: sipush #2048
/*    */     //   217: goto -> 223
/*    */     //   220: sipush #1024
/*    */     //   223: ior
/*    */     //   224: istore #25
/*    */     //   226: iload #24
/*    */     //   228: bipush #16
/*    */     //   230: iand
/*    */     //   231: ifeq -> 245
/*    */     //   234: iload #25
/*    */     //   236: sipush #24576
/*    */     //   239: ior
/*    */     //   240: istore #25
/*    */     //   242: goto -> 280
/*    */     //   245: iload #22
/*    */     //   247: sipush #24576
/*    */     //   250: iand
/*    */     //   251: ifne -> 280
/*    */     //   254: iload #25
/*    */     //   256: aload #21
/*    */     //   258: aload #6
/*    */     //   260: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   265: ifeq -> 274
/*    */     //   268: sipush #16384
/*    */     //   271: goto -> 277
/*    */     //   274: sipush #8192
/*    */     //   277: ior
/*    */     //   278: istore #25
/*    */     //   280: iload #24
/*    */     //   282: bipush #32
/*    */     //   284: iand
/*    */     //   285: ifeq -> 298
/*    */     //   288: iload #25
/*    */     //   290: ldc 196608
/*    */     //   292: ior
/*    */     //   293: istore #25
/*    */     //   295: goto -> 330
/*    */     //   298: iload #22
/*    */     //   300: ldc 196608
/*    */     //   302: iand
/*    */     //   303: ifne -> 330
/*    */     //   306: iload #25
/*    */     //   308: aload #21
/*    */     //   310: aload #7
/*    */     //   312: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   317: ifeq -> 325
/*    */     //   320: ldc 131072
/*    */     //   322: goto -> 327
/*    */     //   325: ldc 65536
/*    */     //   327: ior
/*    */     //   328: istore #25
/*    */     //   330: iload #24
/*    */     //   332: bipush #64
/*    */     //   334: iand
/*    */     //   335: ifeq -> 348
/*    */     //   338: iload #25
/*    */     //   340: ldc 1572864
/*    */     //   342: ior
/*    */     //   343: istore #25
/*    */     //   345: goto -> 380
/*    */     //   348: iload #22
/*    */     //   350: ldc 1572864
/*    */     //   352: iand
/*    */     //   353: ifne -> 380
/*    */     //   356: iload #25
/*    */     //   358: aload #21
/*    */     //   360: aload #8
/*    */     //   362: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   367: ifeq -> 375
/*    */     //   370: ldc 1048576
/*    */     //   372: goto -> 377
/*    */     //   375: ldc 524288
/*    */     //   377: ior
/*    */     //   378: istore #25
/*    */     //   380: iload #24
/*    */     //   382: sipush #128
/*    */     //   385: iand
/*    */     //   386: ifeq -> 399
/*    */     //   389: iload #25
/*    */     //   391: ldc 12582912
/*    */     //   393: ior
/*    */     //   394: istore #25
/*    */     //   396: goto -> 431
/*    */     //   399: iload #22
/*    */     //   401: ldc 12582912
/*    */     //   403: iand
/*    */     //   404: ifne -> 431
/*    */     //   407: iload #25
/*    */     //   409: aload #21
/*    */     //   411: lload #9
/*    */     //   413: invokeinterface changed : (J)Z
/*    */     //   418: ifeq -> 426
/*    */     //   421: ldc 8388608
/*    */     //   423: goto -> 428
/*    */     //   426: ldc 4194304
/*    */     //   428: ior
/*    */     //   429: istore #25
/*    */     //   431: iload #24
/*    */     //   433: sipush #256
/*    */     //   436: iand
/*    */     //   437: ifeq -> 450
/*    */     //   440: iload #25
/*    */     //   442: ldc 100663296
/*    */     //   444: ior
/*    */     //   445: istore #25
/*    */     //   447: goto -> 482
/*    */     //   450: iload #22
/*    */     //   452: ldc 100663296
/*    */     //   454: iand
/*    */     //   455: ifne -> 482
/*    */     //   458: iload #25
/*    */     //   460: aload #21
/*    */     //   462: aload #11
/*    */     //   464: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   469: ifeq -> 477
/*    */     //   472: ldc 67108864
/*    */     //   474: goto -> 479
/*    */     //   477: ldc 33554432
/*    */     //   479: ior
/*    */     //   480: istore #25
/*    */     //   482: iload #22
/*    */     //   484: ldc 805306368
/*    */     //   486: iand
/*    */     //   487: ifne -> 523
/*    */     //   490: iload #25
/*    */     //   492: iload #24
/*    */     //   494: sipush #512
/*    */     //   497: iand
/*    */     //   498: ifne -> 518
/*    */     //   501: aload #21
/*    */     //   503: iload #12
/*    */     //   505: invokeinterface changed : (I)Z
/*    */     //   510: ifeq -> 518
/*    */     //   513: ldc 536870912
/*    */     //   515: goto -> 520
/*    */     //   518: ldc 268435456
/*    */     //   520: ior
/*    */     //   521: istore #25
/*    */     //   523: iload #24
/*    */     //   525: sipush #1024
/*    */     //   528: iand
/*    */     //   529: ifeq -> 542
/*    */     //   532: iload #26
/*    */     //   534: bipush #6
/*    */     //   536: ior
/*    */     //   537: istore #26
/*    */     //   539: goto -> 572
/*    */     //   542: iload #23
/*    */     //   544: bipush #6
/*    */     //   546: iand
/*    */     //   547: ifne -> 572
/*    */     //   550: iload #26
/*    */     //   552: aload #21
/*    */     //   554: lload #13
/*    */     //   556: invokeinterface changed : (J)Z
/*    */     //   561: ifeq -> 568
/*    */     //   564: iconst_4
/*    */     //   565: goto -> 569
/*    */     //   568: iconst_2
/*    */     //   569: ior
/*    */     //   570: istore #26
/*    */     //   572: iload #24
/*    */     //   574: sipush #2048
/*    */     //   577: iand
/*    */     //   578: ifeq -> 591
/*    */     //   581: iload #26
/*    */     //   583: bipush #48
/*    */     //   585: ior
/*    */     //   586: istore #26
/*    */     //   588: goto -> 623
/*    */     //   591: iload #23
/*    */     //   593: bipush #48
/*    */     //   595: iand
/*    */     //   596: ifne -> 623
/*    */     //   599: iload #26
/*    */     //   601: aload #21
/*    */     //   603: iload #15
/*    */     //   605: invokeinterface changed : (I)Z
/*    */     //   610: ifeq -> 618
/*    */     //   613: bipush #32
/*    */     //   615: goto -> 620
/*    */     //   618: bipush #16
/*    */     //   620: ior
/*    */     //   621: istore #26
/*    */     //   623: iload #24
/*    */     //   625: sipush #4096
/*    */     //   628: iand
/*    */     //   629: ifeq -> 643
/*    */     //   632: iload #26
/*    */     //   634: sipush #384
/*    */     //   637: ior
/*    */     //   638: istore #26
/*    */     //   640: goto -> 678
/*    */     //   643: iload #23
/*    */     //   645: sipush #384
/*    */     //   648: iand
/*    */     //   649: ifne -> 678
/*    */     //   652: iload #26
/*    */     //   654: aload #21
/*    */     //   656: iload #16
/*    */     //   658: invokeinterface changed : (Z)Z
/*    */     //   663: ifeq -> 672
/*    */     //   666: sipush #256
/*    */     //   669: goto -> 675
/*    */     //   672: sipush #128
/*    */     //   675: ior
/*    */     //   676: istore #26
/*    */     //   678: iload #24
/*    */     //   680: sipush #8192
/*    */     //   683: iand
/*    */     //   684: ifeq -> 698
/*    */     //   687: iload #26
/*    */     //   689: sipush #3072
/*    */     //   692: ior
/*    */     //   693: istore #26
/*    */     //   695: goto -> 733
/*    */     //   698: iload #23
/*    */     //   700: sipush #3072
/*    */     //   703: iand
/*    */     //   704: ifne -> 733
/*    */     //   707: iload #26
/*    */     //   709: aload #21
/*    */     //   711: iload #17
/*    */     //   713: invokeinterface changed : (I)Z
/*    */     //   718: ifeq -> 727
/*    */     //   721: sipush #2048
/*    */     //   724: goto -> 730
/*    */     //   727: sipush #1024
/*    */     //   730: ior
/*    */     //   731: istore #26
/*    */     //   733: iload #24
/*    */     //   735: sipush #16384
/*    */     //   738: iand
/*    */     //   739: ifeq -> 753
/*    */     //   742: iload #26
/*    */     //   744: sipush #24576
/*    */     //   747: ior
/*    */     //   748: istore #26
/*    */     //   750: goto -> 788
/*    */     //   753: iload #23
/*    */     //   755: sipush #24576
/*    */     //   758: iand
/*    */     //   759: ifne -> 788
/*    */     //   762: iload #26
/*    */     //   764: aload #21
/*    */     //   766: aload #18
/*    */     //   768: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   773: ifeq -> 782
/*    */     //   776: sipush #16384
/*    */     //   779: goto -> 785
/*    */     //   782: sipush #8192
/*    */     //   785: ior
/*    */     //   786: istore #26
/*    */     //   788: iload #24
/*    */     //   790: ldc 32768
/*    */     //   792: iand
/*    */     //   793: ifeq -> 806
/*    */     //   796: iload #26
/*    */     //   798: ldc 196608
/*    */     //   800: ior
/*    */     //   801: istore #26
/*    */     //   803: goto -> 838
/*    */     //   806: iload #23
/*    */     //   808: ldc 196608
/*    */     //   810: iand
/*    */     //   811: ifne -> 838
/*    */     //   814: iload #26
/*    */     //   816: aload #21
/*    */     //   818: aload #19
/*    */     //   820: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   825: ifeq -> 833
/*    */     //   828: ldc 131072
/*    */     //   830: goto -> 835
/*    */     //   833: ldc 65536
/*    */     //   835: ior
/*    */     //   836: istore #26
/*    */     //   838: iload #23
/*    */     //   840: ldc 1572864
/*    */     //   842: iand
/*    */     //   843: ifne -> 878
/*    */     //   846: iload #26
/*    */     //   848: iload #24
/*    */     //   850: ldc 65536
/*    */     //   852: iand
/*    */     //   853: ifne -> 873
/*    */     //   856: aload #21
/*    */     //   858: aload #20
/*    */     //   860: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   865: ifeq -> 873
/*    */     //   868: ldc 1048576
/*    */     //   870: goto -> 875
/*    */     //   873: ldc 524288
/*    */     //   875: ior
/*    */     //   876: istore #26
/*    */     //   878: iload #25
/*    */     //   880: ldc 306783379
/*    */     //   882: iand
/*    */     //   883: ldc 306783378
/*    */     //   885: if_icmpne -> 910
/*    */     //   888: iload #26
/*    */     //   890: ldc_w 599187
/*    */     //   893: iand
/*    */     //   894: ldc_w 599186
/*    */     //   897: if_icmpne -> 910
/*    */     //   900: aload #21
/*    */     //   902: invokeinterface getSkipping : ()Z
/*    */     //   907: ifne -> 1651
/*    */     //   910: aload #21
/*    */     //   912: invokeinterface startDefaults : ()V
/*    */     //   917: iload #22
/*    */     //   919: iconst_1
/*    */     //   920: iand
/*    */     //   921: ifeq -> 934
/*    */     //   924: aload #21
/*    */     //   926: invokeinterface getDefaultsInvalid : ()Z
/*    */     //   931: ifeq -> 1264
/*    */     //   934: iload #24
/*    */     //   936: iconst_2
/*    */     //   937: iand
/*    */     //   938: ifeq -> 948
/*    */     //   941: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   944: checkcast androidx/compose/ui/Modifier
/*    */     //   947: astore_1
/*    */     //   948: iload #24
/*    */     //   950: iconst_4
/*    */     //   951: iand
/*    */     //   952: ifeq -> 962
/*    */     //   955: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*    */     //   958: invokevirtual getUnspecified-0d7_KjU : ()J
/*    */     //   961: lstore_2
/*    */     //   962: iload #24
/*    */     //   964: bipush #8
/*    */     //   966: iand
/*    */     //   967: ifeq -> 978
/*    */     //   970: getstatic androidx/compose/ui/unit/TextUnit.Companion : Landroidx/compose/ui/unit/TextUnit$Companion;
/*    */     //   973: invokevirtual getUnspecified-XSAIIZE : ()J
/*    */     //   976: lstore #4
/*    */     //   978: iload #24
/*    */     //   980: bipush #16
/*    */     //   982: iand
/*    */     //   983: ifeq -> 989
/*    */     //   986: aconst_null
/*    */     //   987: astore #6
/*    */     //   989: iload #24
/*    */     //   991: bipush #32
/*    */     //   993: iand
/*    */     //   994: ifeq -> 1000
/*    */     //   997: aconst_null
/*    */     //   998: astore #7
/*    */     //   1000: iload #24
/*    */     //   1002: bipush #64
/*    */     //   1004: iand
/*    */     //   1005: ifeq -> 1011
/*    */     //   1008: aconst_null
/*    */     //   1009: astore #8
/*    */     //   1011: iload #24
/*    */     //   1013: sipush #128
/*    */     //   1016: iand
/*    */     //   1017: ifeq -> 1028
/*    */     //   1020: getstatic androidx/compose/ui/unit/TextUnit.Companion : Landroidx/compose/ui/unit/TextUnit$Companion;
/*    */     //   1023: invokevirtual getUnspecified-XSAIIZE : ()J
/*    */     //   1026: lstore #9
/*    */     //   1028: iload #24
/*    */     //   1030: sipush #256
/*    */     //   1033: iand
/*    */     //   1034: ifeq -> 1040
/*    */     //   1037: aconst_null
/*    */     //   1038: astore #11
/*    */     //   1040: iload #24
/*    */     //   1042: sipush #512
/*    */     //   1045: iand
/*    */     //   1046: ifeq -> 1064
/*    */     //   1049: getstatic androidx/compose/ui/text/style/TextAlign.Companion : Landroidx/compose/ui/text/style/TextAlign$Companion;
/*    */     //   1052: invokevirtual getUnspecified-e0LSkKk : ()I
/*    */     //   1055: istore #12
/*    */     //   1057: iload #25
/*    */     //   1059: ldc -1879048193
/*    */     //   1061: iand
/*    */     //   1062: istore #25
/*    */     //   1064: iload #24
/*    */     //   1066: sipush #1024
/*    */     //   1069: iand
/*    */     //   1070: ifeq -> 1081
/*    */     //   1073: getstatic androidx/compose/ui/unit/TextUnit.Companion : Landroidx/compose/ui/unit/TextUnit$Companion;
/*    */     //   1076: invokevirtual getUnspecified-XSAIIZE : ()J
/*    */     //   1079: lstore #13
/*    */     //   1081: iload #24
/*    */     //   1083: sipush #2048
/*    */     //   1086: iand
/*    */     //   1087: ifeq -> 1098
/*    */     //   1090: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*    */     //   1093: invokevirtual getClip-gIe3tQ8 : ()I
/*    */     //   1096: istore #15
/*    */     //   1098: iload #24
/*    */     //   1100: sipush #4096
/*    */     //   1103: iand
/*    */     //   1104: ifeq -> 1110
/*    */     //   1107: iconst_1
/*    */     //   1108: istore #16
/*    */     //   1110: iload #24
/*    */     //   1112: sipush #8192
/*    */     //   1115: iand
/*    */     //   1116: ifeq -> 1123
/*    */     //   1119: ldc 2147483647
/*    */     //   1121: istore #17
/*    */     //   1123: iload #24
/*    */     //   1125: sipush #16384
/*    */     //   1128: iand
/*    */     //   1129: ifeq -> 1137
/*    */     //   1132: invokestatic emptyMap : ()Ljava/util/Map;
/*    */     //   1135: astore #18
/*    */     //   1137: iload #24
/*    */     //   1139: ldc 32768
/*    */     //   1141: iand
/*    */     //   1142: ifeq -> 1233
/*    */     //   1145: aload #21
/*    */     //   1147: ldc_w 1099035725
/*    */     //   1150: invokeinterface startReplaceGroup : (I)V
/*    */     //   1155: aload #21
/*    */     //   1157: astore #28
/*    */     //   1159: iconst_0
/*    */     //   1160: istore #29
/*    */     //   1162: iconst_0
/*    */     //   1163: istore #30
/*    */     //   1165: aload #28
/*    */     //   1167: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1172: astore #31
/*    */     //   1174: iconst_0
/*    */     //   1175: istore #32
/*    */     //   1177: aload #31
/*    */     //   1179: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   1182: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   1185: if_acmpne -> 1212
/*    */     //   1188: iconst_0
/*    */     //   1189: istore #33
/*    */     //   1191: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   1196: astore #33
/*    */     //   1198: aload #28
/*    */     //   1200: aload #33
/*    */     //   1202: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1207: aload #33
/*    */     //   1209: goto -> 1214
/*    */     //   1212: aload #31
/*    */     //   1214: nop
/*    */     //   1215: nop
/*    */     //   1216: nop
/*    */     //   1217: checkcast kotlin/jvm/functions/Function1
/*    */     //   1220: astore #27
/*    */     //   1222: aload #21
/*    */     //   1224: invokeinterface endReplaceGroup : ()V
/*    */     //   1229: aload #27
/*    */     //   1231: astore #19
/*    */     //   1233: iload #24
/*    */     //   1235: ldc 65536
/*    */     //   1237: iand
/*    */     //   1238: ifeq -> 1303
/*    */     //   1241: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   1244: aload #21
/*    */     //   1246: bipush #6
/*    */     //   1248: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*    */     //   1251: astore #20
/*    */     //   1253: iload #26
/*    */     //   1255: ldc_w -3670017
/*    */     //   1258: iand
/*    */     //   1259: istore #26
/*    */     //   1261: goto -> 1303
/*    */     //   1264: aload #21
/*    */     //   1266: invokeinterface skipToGroupEnd : ()V
/*    */     //   1271: iload #24
/*    */     //   1273: sipush #512
/*    */     //   1276: iand
/*    */     //   1277: ifeq -> 1287
/*    */     //   1280: iload #25
/*    */     //   1282: ldc -1879048193
/*    */     //   1284: iand
/*    */     //   1285: istore #25
/*    */     //   1287: iload #24
/*    */     //   1289: ldc 65536
/*    */     //   1291: iand
/*    */     //   1292: ifeq -> 1303
/*    */     //   1295: iload #26
/*    */     //   1297: ldc_w -3670017
/*    */     //   1300: iand
/*    */     //   1301: istore #26
/*    */     //   1303: aload #21
/*    */     //   1305: invokeinterface endDefaults : ()V
/*    */     //   1310: invokestatic isTraceInProgress : ()Z
/*    */     //   1313: ifeq -> 1329
/*    */     //   1316: ldc_w -398603798
/*    */     //   1319: iload #25
/*    */     //   1321: iload #26
/*    */     //   1323: ldc_w 'org.jetbrains.jewel.ui.component.Text (Text.kt:80)'
/*    */     //   1326: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   1329: aload #21
/*    */     //   1331: ldc_w 1099038542
/*    */     //   1334: invokeinterface startReplaceGroup : (I)V
/*    */     //   1339: lload_2
/*    */     //   1340: lstore #31
/*    */     //   1342: iconst_0
/*    */     //   1343: istore #33
/*    */     //   1345: lload #31
/*    */     //   1347: lstore #34
/*    */     //   1349: iconst_0
/*    */     //   1350: istore #36
/*    */     //   1352: lload #34
/*    */     //   1354: ldc2_w 16
/*    */     //   1357: lcmp
/*    */     //   1358: ifeq -> 1365
/*    */     //   1361: iconst_1
/*    */     //   1362: goto -> 1366
/*    */     //   1365: iconst_0
/*    */     //   1366: ifeq -> 1374
/*    */     //   1369: lload #31
/*    */     //   1371: goto -> 1491
/*    */     //   1374: iconst_0
/*    */     //   1375: istore #37
/*    */     //   1377: aload #21
/*    */     //   1379: ldc_w 1099039315
/*    */     //   1382: invokeinterface startReplaceGroup : (I)V
/*    */     //   1387: aload #20
/*    */     //   1389: invokevirtual getColor-0d7_KjU : ()J
/*    */     //   1392: lstore #38
/*    */     //   1394: iconst_0
/*    */     //   1395: istore #40
/*    */     //   1397: lload #38
/*    */     //   1399: lstore #41
/*    */     //   1401: iconst_0
/*    */     //   1402: istore #43
/*    */     //   1404: lload #41
/*    */     //   1406: ldc2_w 16
/*    */     //   1409: lcmp
/*    */     //   1410: ifeq -> 1417
/*    */     //   1413: iconst_1
/*    */     //   1414: goto -> 1418
/*    */     //   1417: iconst_0
/*    */     //   1418: ifeq -> 1426
/*    */     //   1421: lload #38
/*    */     //   1423: goto -> 1479
/*    */     //   1426: iconst_0
/*    */     //   1427: istore #44
/*    */     //   1429: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*    */     //   1432: checkcast androidx/compose/runtime/CompositionLocal
/*    */     //   1435: astore #45
/*    */     //   1437: iconst_0
/*    */     //   1438: istore #46
/*    */     //   1440: iconst_0
/*    */     //   1441: istore #47
/*    */     //   1443: aload #21
/*    */     //   1445: ldc_w 2023513938
/*    */     //   1448: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*    */     //   1451: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1454: aload #21
/*    */     //   1456: aload #45
/*    */     //   1458: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*    */     //   1463: astore #48
/*    */     //   1465: aload #21
/*    */     //   1467: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1470: aload #48
/*    */     //   1472: checkcast androidx/compose/ui/graphics/Color
/*    */     //   1475: invokevirtual unbox-impl : ()J
/*    */     //   1478: nop
/*    */     //   1479: lstore #49
/*    */     //   1481: aload #21
/*    */     //   1483: invokeinterface endReplaceGroup : ()V
/*    */     //   1488: lload #49
/*    */     //   1490: nop
/*    */     //   1491: lstore #29
/*    */     //   1493: aload #21
/*    */     //   1495: invokeinterface endReplaceGroup : ()V
/*    */     //   1500: lload #29
/*    */     //   1502: lstore #27
/*    */     //   1504: aload #20
/*    */     //   1506: new androidx/compose/ui/text/TextStyle
/*    */     //   1509: dup
/*    */     //   1510: lload #27
/*    */     //   1512: lload #4
/*    */     //   1514: aload #7
/*    */     //   1516: aload #6
/*    */     //   1518: aconst_null
/*    */     //   1519: aload #8
/*    */     //   1521: aconst_null
/*    */     //   1522: lload #9
/*    */     //   1524: aconst_null
/*    */     //   1525: aconst_null
/*    */     //   1526: aconst_null
/*    */     //   1527: lconst_0
/*    */     //   1528: aload #11
/*    */     //   1530: aconst_null
/*    */     //   1531: aconst_null
/*    */     //   1532: iload #12
/*    */     //   1534: iconst_0
/*    */     //   1535: lload #13
/*    */     //   1537: aconst_null
/*    */     //   1538: aconst_null
/*    */     //   1539: aconst_null
/*    */     //   1540: iconst_0
/*    */     //   1541: iconst_0
/*    */     //   1542: aconst_null
/*    */     //   1543: ldc_w 16609104
/*    */     //   1546: aconst_null
/*    */     //   1547: invokespecial <init> : (JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   1550: invokevirtual merge : (Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;
/*    */     //   1553: astore #29
/*    */     //   1555: aload_0
/*    */     //   1556: aload_1
/*    */     //   1557: aload #29
/*    */     //   1559: aload #19
/*    */     //   1561: iload #15
/*    */     //   1563: iload #16
/*    */     //   1565: iload #17
/*    */     //   1567: iconst_1
/*    */     //   1568: aload #18
/*    */     //   1570: aconst_null
/*    */     //   1571: aload #21
/*    */     //   1573: ldc 12582912
/*    */     //   1575: bipush #14
/*    */     //   1577: iload #25
/*    */     //   1579: iand
/*    */     //   1580: ior
/*    */     //   1581: bipush #112
/*    */     //   1583: iload #25
/*    */     //   1585: iand
/*    */     //   1586: ior
/*    */     //   1587: sipush #7168
/*    */     //   1590: iload #26
/*    */     //   1592: bipush #6
/*    */     //   1594: ishr
/*    */     //   1595: iand
/*    */     //   1596: ior
/*    */     //   1597: ldc 57344
/*    */     //   1599: iload #26
/*    */     //   1601: bipush #9
/*    */     //   1603: ishl
/*    */     //   1604: iand
/*    */     //   1605: ior
/*    */     //   1606: ldc 458752
/*    */     //   1608: iload #26
/*    */     //   1610: bipush #9
/*    */     //   1612: ishl
/*    */     //   1613: iand
/*    */     //   1614: ior
/*    */     //   1615: ldc 3670016
/*    */     //   1617: iload #26
/*    */     //   1619: bipush #9
/*    */     //   1621: ishl
/*    */     //   1622: iand
/*    */     //   1623: ior
/*    */     //   1624: ldc 234881024
/*    */     //   1626: iload #26
/*    */     //   1628: bipush #12
/*    */     //   1630: ishl
/*    */     //   1631: iand
/*    */     //   1632: ior
/*    */     //   1633: sipush #512
/*    */     //   1636: invokestatic BasicText-RWo7tUw : (Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1639: invokestatic isTraceInProgress : ()Z
/*    */     //   1642: ifeq -> 1658
/*    */     //   1645: invokestatic traceEventEnd : ()V
/*    */     //   1648: goto -> 1658
/*    */     //   1651: aload #21
/*    */     //   1653: invokeinterface skipToGroupEnd : ()V
/*    */     //   1658: aload #21
/*    */     //   1660: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   1665: dup
/*    */     //   1666: ifnull -> 1719
/*    */     //   1669: aload_0
/*    */     //   1670: aload_1
/*    */     //   1671: lload_2
/*    */     //   1672: lload #4
/*    */     //   1674: aload #6
/*    */     //   1676: aload #7
/*    */     //   1678: aload #8
/*    */     //   1680: lload #9
/*    */     //   1682: aload #11
/*    */     //   1684: iload #12
/*    */     //   1686: lload #13
/*    */     //   1688: iload #15
/*    */     //   1690: iload #16
/*    */     //   1692: iload #17
/*    */     //   1694: aload #18
/*    */     //   1696: aload #19
/*    */     //   1698: aload #20
/*    */     //   1700: iload #22
/*    */     //   1702: iload #23
/*    */     //   1704: iload #24
/*    */     //   1706: <illegal opcode> invoke : (Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;III)Lkotlin/jvm/functions/Function2;
/*    */     //   1711: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   1716: goto -> 1720
/*    */     //   1719: pop
/*    */     //   1720: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #81	-> 6
/*    */     //   #65	-> 941
/*    */     //   #66	-> 955
/*    */     //   #67	-> 970
/*    */     //   #68	-> 986
/*    */     //   #69	-> 997
/*    */     //   #70	-> 1008
/*    */     //   #71	-> 1020
/*    */     //   #72	-> 1037
/*    */     //   #73	-> 1049
/*    */     //   #74	-> 1073
/*    */     //   #75	-> 1090
/*    */     //   #76	-> 1107
/*    */     //   #77	-> 1119
/*    */     //   #78	-> 1132
/*    */     //   #79	-> 1145
/*    */     //   #108	-> 1165
/*    */     //   #109	-> 1177
/*    */     //   #110	-> 1188
/*    */     //   #110	-> 1196
/*    */     //   #111	-> 1198
/*    */     //   #112	-> 1207
/*    */     //   #113	-> 1212
/*    */     //   #109	-> 1214
/*    */     //   #108	-> 1215
/*    */     //   #108	-> 1216
/*    */     //   #79	-> 1217
/*    */     //   #80	-> 1241
/*    */     //   #81	-> 1326
/*    */     //   #82	-> 1339
/*    */     //   #114	-> 1345
/*    */     //   #115	-> 1352
/*    */     //   #114	-> 1366
/*    */     //   #82	-> 1387
/*    */     //   #114	-> 1397
/*    */     //   #115	-> 1404
/*    */     //   #114	-> 1418
/*    */     //   #82	-> 1429
/*    */     //   #116	-> 1451
/*    */     //   #82	-> 1472
/*    */     //   #114	-> 1478
/*    */     //   #82	-> 1479
/*    */     //   #114	-> 1490
/*    */     //   #82	-> 1491
/*    */     //   #85	-> 1504
/*    */     //   #86	-> 1506
/*    */     //   #87	-> 1510
/*    */     //   #88	-> 1512
/*    */     //   #89	-> 1514
/*    */     //   #94	-> 1516
/*    */     //   #86	-> 1518
/*    */     //   #92	-> 1519
/*    */     //   #86	-> 1521
/*    */     //   #95	-> 1522
/*    */     //   #86	-> 1524
/*    */     //   #93	-> 1528
/*    */     //   #86	-> 1530
/*    */     //   #90	-> 1532
/*    */     //   #86	-> 1534
/*    */     //   #91	-> 1535
/*    */     //   #86	-> 1537
/*    */     //   #85	-> 1550
/*    */     //   #84	-> 1553
/*    */     //   #99	-> 1555
/*    */     //   #100	-> 1651
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   1191	5	33	$i$a$-cache-TextKt$Text$3	I
/*    */     //   1198	11	33	value$iv	Ljava/lang/Object;
/*    */     //   1177	38	32	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   1174	41	31	it$iv	Ljava/lang/Object;
/*    */     //   1165	52	30	$i$f$cache	I
/*    */     //   1162	55	28	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1162	55	29	invalid$iv	Z
/*    */     //   1443	29	47	$i$f$getCurrent	I
/*    */     //   1440	32	45	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*    */     //   1440	32	46	$changed$iv	I
/*    */     //   1429	49	44	$i$a$-takeOrElse-DxMtmZc-TextKt$Text$textColor$1$1	I
/*    */     //   1404	14	43	$i$f$isSpecified-8_81llA	I
/*    */     //   1401	17	41	$this$isSpecified$iv$iv	J
/*    */     //   1397	82	40	$i$f$takeOrElse-DxMtmZc	I
/*    */     //   1394	85	38	$this$takeOrElse_u2dDxMtmZc$iv	J
/*    */     //   1377	113	37	$i$a$-takeOrElse-DxMtmZc-TextKt$Text$textColor$1	I
/*    */     //   1352	14	36	$i$f$isSpecified-8_81llA	I
/*    */     //   1349	17	34	$this$isSpecified$iv$iv	J
/*    */     //   1345	146	33	$i$f$takeOrElse-DxMtmZc	I
/*    */     //   1342	149	31	$this$takeOrElse_u2dDxMtmZc$iv	J
/*    */     //   1504	144	27	textColor	J
/*    */     //   1555	93	29	mergedStyle	Landroidx/compose/ui/text/TextStyle;
/*    */     //   22	1699	25	$dirty	I
/*    */     //   26	1695	26	$dirty1	I
/*    */     //   0	1721	0	text	Landroidx/compose/ui/text/AnnotatedString;
/*    */     //   0	1721	1	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	1721	2	color	J
/*    */     //   0	1721	4	fontSize	J
/*    */     //   0	1721	6	fontStyle	Landroidx/compose/ui/text/font/FontStyle;
/*    */     //   0	1721	7	fontWeight	Landroidx/compose/ui/text/font/FontWeight;
/*    */     //   0	1721	8	fontFamily	Landroidx/compose/ui/text/font/FontFamily;
/*    */     //   0	1721	9	letterSpacing	J
/*    */     //   0	1721	11	textDecoration	Landroidx/compose/ui/text/style/TextDecoration;
/*    */     //   0	1721	12	textAlign	I
/*    */     //   0	1721	13	lineHeight	J
/*    */     //   0	1721	15	overflow	I
/*    */     //   0	1721	16	softWrap	Z
/*    */     //   0	1721	17	maxLines	I
/*    */     //   0	1721	18	inlineContent	Ljava/util/Map;
/*    */     //   0	1721	19	onTextLayout	Lkotlin/jvm/functions/Function1;
/*    */     //   0	1721	20	style	Landroidx/compose/ui/text/TextStyle;
/*    */     //   0	1721	21	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1721	22	$changed	I
/*    */     //   0	1721	23	$changed1	I
/*    */   }
/*    */   
/*    */   private static final Unit Text_bAzTDeA$lambda$2(String $text, Modifier $modifier, long $color, long $fontSize, FontStyle $fontStyle, FontWeight $fontWeight, FontFamily $fontFamily, long $letterSpacing, TextDecoration $textDecoration, int $textAlign, long $lineHeight, int $overflow, boolean $softWrap, int $maxLines, Function1<? super TextLayoutResult, Unit> $onTextLayout, TextStyle $style, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*    */     Text-bAzTDeA($text, $modifier, $color, $fontSize, $fontStyle, $fontWeight, $fontFamily, $letterSpacing, $textDecoration, $textAlign, $lineHeight, $overflow, $softWrap, $maxLines, $onTextLayout, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit Text_F_Jr8PA$lambda$7(AnnotatedString $text, Modifier $modifier, long $color, long $fontSize, FontStyle $fontStyle, FontWeight $fontWeight, FontFamily $fontFamily, long $letterSpacing, TextDecoration $textDecoration, int $textAlign, long $lineHeight, int $overflow, boolean $softWrap, int $maxLines, Map<String, InlineTextContent> $inlineContent, Function1<? super TextLayoutResult, Unit> $onTextLayout, TextStyle $style, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*    */     Text-F-Jr8PA($text, $modifier, $color, $fontSize, $fontStyle, $fontWeight, $fontFamily, $letterSpacing, $textDecoration, $textAlign, $lineHeight, $overflow, $softWrap, $maxLines, $inlineContent, $onTextLayout, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TextKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */