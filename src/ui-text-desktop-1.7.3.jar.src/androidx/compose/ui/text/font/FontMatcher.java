/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\004\b\000\030\0002\0020\001B\005¢\006\002\020\002J.\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013ø\001\000¢\006\004\b\f\020\rJ.\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\0162\006\020\b\032\0020\t2\006\020\n\032\0020\013ø\001\000¢\006\004\b\f\020\017J4\020\003\032\b\022\004\022\0020\0050\0042\f\020\020\032\b\022\004\022\0020\0050\0042\006\020\b\032\0020\t2\006\020\n\032\0020\013ø\001\000¢\006\004\b\f\020\021JF\020\022\032\b\022\004\022\0020\0050\004*\b\022\004\022\0020\0050\0042\006\020\b\032\0020\t2\006\020\023\032\0020\0242\n\b\002\020\025\032\004\030\0010\t2\n\b\002\020\026\032\004\030\0010\tH\b¢\006\002\b\027\002\007\n\005\b¡\0360\001¨\006\030"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "()V", "matchFont", "", "Landroidx/compose/ui/text/font/Font;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "matchFont-RetOiIg", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "fontList", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "filterByClosestWeight", "preferBelow", "", "minSearchRange", "maxSearchRange", "filterByClosestWeight$ui_text", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n102#1,34:190\n102#1,34:235\n108#1,28:280\n108#1,28:319\n235#2,3:167\n33#2,4:170\n238#2,2:174\n38#2:176\n240#2:177\n235#2,3:178\n33#2,4:181\n238#2,2:185\n38#2:187\n240#2:188\n235#2,3:224\n33#2,4:227\n238#2,2:231\n38#2:233\n240#2:234\n235#2,3:269\n33#2,4:272\n238#2,2:276\n38#2:278\n240#2:279\n235#2,3:308\n33#2,4:311\n238#2,2:315\n38#2:317\n240#2:318\n235#2,3:347\n33#2,4:350\n238#2,2:354\n38#2:356\n240#2:357\n235#2,3:358\n33#2,4:361\n238#2,2:365\n38#2:367\n240#2:368\n235#2,3:369\n33#2,4:372\n238#2,2:376\n38#2:378\n240#2:379\n1#3:189\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:190,34\n71#1:235,34\n80#1:280,28\n87#1:319,28\n49#1:167,3\n49#1:170,4\n49#1:174,2\n49#1:176\n49#1:177\n57#1:178,3\n57#1:181,4\n57#1:185,2\n57#1:187\n57#1:188\n65#1:224,3\n65#1:227,4\n65#1:231,2\n65#1:233\n65#1:234\n71#1:269,3\n71#1:272,4\n71#1:276,2\n71#1:278\n71#1:279\n80#1:308,3\n80#1:311,4\n80#1:315,2\n80#1:317\n80#1:318\n87#1:347,3\n87#1:350,4\n87#1:354,2\n87#1:356\n87#1:357\n135#1:358,3\n135#1:361,4\n135#1:365,2\n135#1:367\n135#1:368\n135#1:369,3\n135#1:372,4\n135#1:376,2\n135#1:378\n135#1:379\n*E\n"})
/*     */ public final class FontMatcher
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public final List<Font> matchFont-RetOiIg(@NotNull List fontList, @NotNull FontWeight fontWeight, int fontStyle) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'fontList'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'fontWeight'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_1
/*     */     //   13: astore #4
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: nop
/*     */     //   19: new java/util/ArrayList
/*     */     //   22: dup
/*     */     //   23: aload #4
/*     */     //   25: invokeinterface size : ()I
/*     */     //   30: invokespecial <init> : (I)V
/*     */     //   33: astore #6
/*     */     //   35: aload #4
/*     */     //   37: astore #7
/*     */     //   39: iconst_0
/*     */     //   40: istore #8
/*     */     //   42: nop
/*     */     //   43: iconst_0
/*     */     //   44: istore #9
/*     */     //   46: aload #7
/*     */     //   48: invokeinterface size : ()I
/*     */     //   53: istore #10
/*     */     //   55: iload #9
/*     */     //   57: iload #10
/*     */     //   59: if_icmpge -> 147
/*     */     //   62: aload #7
/*     */     //   64: iload #9
/*     */     //   66: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   71: astore #11
/*     */     //   73: aload #11
/*     */     //   75: astore #12
/*     */     //   77: iconst_0
/*     */     //   78: istore #13
/*     */     //   80: aload #12
/*     */     //   82: checkcast androidx/compose/ui/text/font/Font
/*     */     //   85: astore #14
/*     */     //   87: iconst_0
/*     */     //   88: istore #15
/*     */     //   90: aload #14
/*     */     //   92: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   97: aload_2
/*     */     //   98: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   101: ifeq -> 122
/*     */     //   104: aload #14
/*     */     //   106: invokeinterface getStyle-_-LCdwA : ()I
/*     */     //   111: iload_3
/*     */     //   112: invokestatic equals-impl0 : (II)Z
/*     */     //   115: ifeq -> 122
/*     */     //   118: iconst_1
/*     */     //   119: goto -> 123
/*     */     //   122: iconst_0
/*     */     //   123: ifeq -> 139
/*     */     //   126: aload #6
/*     */     //   128: checkcast java/util/Collection
/*     */     //   131: aload #12
/*     */     //   133: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   138: pop
/*     */     //   139: nop
/*     */     //   140: nop
/*     */     //   141: iinc #9, 1
/*     */     //   144: goto -> 55
/*     */     //   147: nop
/*     */     //   148: aload #6
/*     */     //   150: checkcast java/util/List
/*     */     //   153: astore #5
/*     */     //   155: iconst_0
/*     */     //   156: istore #6
/*     */     //   158: aload #5
/*     */     //   160: checkcast java/util/Collection
/*     */     //   163: invokeinterface isEmpty : ()Z
/*     */     //   168: ifne -> 175
/*     */     //   171: iconst_1
/*     */     //   172: goto -> 176
/*     */     //   175: iconst_0
/*     */     //   176: ifeq -> 182
/*     */     //   179: aload #5
/*     */     //   181: areturn
/*     */     //   182: nop
/*     */     //   183: nop
/*     */     //   184: aload_1
/*     */     //   185: astore #5
/*     */     //   187: iconst_0
/*     */     //   188: istore #6
/*     */     //   190: nop
/*     */     //   191: new java/util/ArrayList
/*     */     //   194: dup
/*     */     //   195: aload #5
/*     */     //   197: invokeinterface size : ()I
/*     */     //   202: invokespecial <init> : (I)V
/*     */     //   205: astore #7
/*     */     //   207: aload #5
/*     */     //   209: astore #8
/*     */     //   211: iconst_0
/*     */     //   212: istore #9
/*     */     //   214: nop
/*     */     //   215: iconst_0
/*     */     //   216: istore #10
/*     */     //   218: aload #8
/*     */     //   220: invokeinterface size : ()I
/*     */     //   225: istore #11
/*     */     //   227: iload #10
/*     */     //   229: iload #11
/*     */     //   231: if_icmpge -> 297
/*     */     //   234: aload #8
/*     */     //   236: iload #10
/*     */     //   238: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   243: astore #12
/*     */     //   245: aload #12
/*     */     //   247: astore #13
/*     */     //   249: iconst_0
/*     */     //   250: istore #14
/*     */     //   252: aload #13
/*     */     //   254: checkcast androidx/compose/ui/text/font/Font
/*     */     //   257: astore #15
/*     */     //   259: iconst_0
/*     */     //   260: istore #16
/*     */     //   262: aload #15
/*     */     //   264: invokeinterface getStyle-_-LCdwA : ()I
/*     */     //   269: iload_3
/*     */     //   270: invokestatic equals-impl0 : (II)Z
/*     */     //   273: ifeq -> 289
/*     */     //   276: aload #7
/*     */     //   278: checkcast java/util/Collection
/*     */     //   281: aload #13
/*     */     //   283: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   288: pop
/*     */     //   289: nop
/*     */     //   290: nop
/*     */     //   291: iinc #10, 1
/*     */     //   294: goto -> 227
/*     */     //   297: nop
/*     */     //   298: aload #7
/*     */     //   300: checkcast java/util/List
/*     */     //   303: checkcast java/util/Collection
/*     */     //   306: astore #5
/*     */     //   308: aload #5
/*     */     //   310: invokeinterface isEmpty : ()Z
/*     */     //   315: ifeq -> 325
/*     */     //   318: iconst_0
/*     */     //   319: istore #6
/*     */     //   321: aload_1
/*     */     //   322: goto -> 327
/*     */     //   325: aload #5
/*     */     //   327: checkcast java/util/List
/*     */     //   330: astore #4
/*     */     //   332: nop
/*     */     //   333: aload_2
/*     */     //   334: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   337: invokevirtual getW400 : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   340: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   343: ifge -> 652
/*     */     //   346: iconst_1
/*     */     //   347: istore #6
/*     */     //   349: aconst_null
/*     */     //   350: astore #7
/*     */     //   352: aconst_null
/*     */     //   353: astore #8
/*     */     //   355: iconst_0
/*     */     //   356: istore #9
/*     */     //   358: aconst_null
/*     */     //   359: astore #10
/*     */     //   361: aconst_null
/*     */     //   362: astore #11
/*     */     //   364: iconst_0
/*     */     //   365: istore #12
/*     */     //   367: aload #4
/*     */     //   369: invokeinterface size : ()I
/*     */     //   374: istore #13
/*     */     //   376: iload #12
/*     */     //   378: iload #13
/*     */     //   380: if_icmpge -> 515
/*     */     //   383: aload #4
/*     */     //   385: iload #12
/*     */     //   387: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   392: checkcast androidx/compose/ui/text/font/Font
/*     */     //   395: astore #14
/*     */     //   397: aload #14
/*     */     //   399: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   404: astore #15
/*     */     //   406: aload #7
/*     */     //   408: ifnull -> 421
/*     */     //   411: aload #15
/*     */     //   413: aload #7
/*     */     //   415: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   418: iflt -> 509
/*     */     //   421: aload #8
/*     */     //   423: ifnull -> 436
/*     */     //   426: aload #15
/*     */     //   428: aload #8
/*     */     //   430: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   433: ifgt -> 509
/*     */     //   436: aload #15
/*     */     //   438: aload_2
/*     */     //   439: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   442: ifge -> 467
/*     */     //   445: aload #11
/*     */     //   447: ifnull -> 460
/*     */     //   450: aload #15
/*     */     //   452: aload #11
/*     */     //   454: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   457: ifle -> 509
/*     */     //   460: aload #15
/*     */     //   462: astore #11
/*     */     //   464: goto -> 509
/*     */     //   467: aload #15
/*     */     //   469: aload_2
/*     */     //   470: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   473: ifle -> 498
/*     */     //   476: aload #10
/*     */     //   478: ifnull -> 491
/*     */     //   481: aload #15
/*     */     //   483: aload #10
/*     */     //   485: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   488: ifge -> 509
/*     */     //   491: aload #15
/*     */     //   493: astore #10
/*     */     //   495: goto -> 509
/*     */     //   498: aload #15
/*     */     //   500: astore #10
/*     */     //   502: aload #15
/*     */     //   504: astore #11
/*     */     //   506: goto -> 515
/*     */     //   509: iinc #12, 1
/*     */     //   512: goto -> 376
/*     */     //   515: nop
/*     */     //   516: aload #11
/*     */     //   518: dup
/*     */     //   519: ifnonnull -> 525
/*     */     //   522: pop
/*     */     //   523: aload #10
/*     */     //   525: astore #12
/*     */     //   527: aload #4
/*     */     //   529: astore #13
/*     */     //   531: iconst_0
/*     */     //   532: istore #14
/*     */     //   534: nop
/*     */     //   535: new java/util/ArrayList
/*     */     //   538: dup
/*     */     //   539: aload #13
/*     */     //   541: invokeinterface size : ()I
/*     */     //   546: invokespecial <init> : (I)V
/*     */     //   549: astore #15
/*     */     //   551: aload #13
/*     */     //   553: astore #16
/*     */     //   555: iconst_0
/*     */     //   556: istore #17
/*     */     //   558: nop
/*     */     //   559: iconst_0
/*     */     //   560: istore #18
/*     */     //   562: aload #16
/*     */     //   564: invokeinterface size : ()I
/*     */     //   569: istore #19
/*     */     //   571: iload #18
/*     */     //   573: iload #19
/*     */     //   575: if_icmpge -> 642
/*     */     //   578: aload #16
/*     */     //   580: iload #18
/*     */     //   582: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   587: astore #20
/*     */     //   589: aload #20
/*     */     //   591: astore #21
/*     */     //   593: iconst_0
/*     */     //   594: istore #22
/*     */     //   596: aload #21
/*     */     //   598: checkcast androidx/compose/ui/text/font/Font
/*     */     //   601: astore #23
/*     */     //   603: iconst_0
/*     */     //   604: istore #24
/*     */     //   606: aload #23
/*     */     //   608: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   613: aload #12
/*     */     //   615: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   618: ifeq -> 634
/*     */     //   621: aload #15
/*     */     //   623: checkcast java/util/Collection
/*     */     //   626: aload #21
/*     */     //   628: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   633: pop
/*     */     //   634: nop
/*     */     //   635: nop
/*     */     //   636: iinc #18, 1
/*     */     //   639: goto -> 571
/*     */     //   642: nop
/*     */     //   643: aload #15
/*     */     //   645: checkcast java/util/List
/*     */     //   648: nop
/*     */     //   649: goto -> 1630
/*     */     //   652: aload_2
/*     */     //   653: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   656: invokevirtual getW500 : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   659: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   662: ifle -> 971
/*     */     //   665: iconst_0
/*     */     //   666: istore #6
/*     */     //   668: aconst_null
/*     */     //   669: astore #7
/*     */     //   671: aconst_null
/*     */     //   672: astore #8
/*     */     //   674: iconst_0
/*     */     //   675: istore #9
/*     */     //   677: aconst_null
/*     */     //   678: astore #10
/*     */     //   680: aconst_null
/*     */     //   681: astore #11
/*     */     //   683: iconst_0
/*     */     //   684: istore #12
/*     */     //   686: aload #4
/*     */     //   688: invokeinterface size : ()I
/*     */     //   693: istore #13
/*     */     //   695: iload #12
/*     */     //   697: iload #13
/*     */     //   699: if_icmpge -> 834
/*     */     //   702: aload #4
/*     */     //   704: iload #12
/*     */     //   706: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   711: checkcast androidx/compose/ui/text/font/Font
/*     */     //   714: astore #14
/*     */     //   716: aload #14
/*     */     //   718: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   723: astore #15
/*     */     //   725: aload #7
/*     */     //   727: ifnull -> 740
/*     */     //   730: aload #15
/*     */     //   732: aload #7
/*     */     //   734: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   737: iflt -> 828
/*     */     //   740: aload #8
/*     */     //   742: ifnull -> 755
/*     */     //   745: aload #15
/*     */     //   747: aload #8
/*     */     //   749: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   752: ifgt -> 828
/*     */     //   755: aload #15
/*     */     //   757: aload_2
/*     */     //   758: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   761: ifge -> 786
/*     */     //   764: aload #11
/*     */     //   766: ifnull -> 779
/*     */     //   769: aload #15
/*     */     //   771: aload #11
/*     */     //   773: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   776: ifle -> 828
/*     */     //   779: aload #15
/*     */     //   781: astore #11
/*     */     //   783: goto -> 828
/*     */     //   786: aload #15
/*     */     //   788: aload_2
/*     */     //   789: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   792: ifle -> 817
/*     */     //   795: aload #10
/*     */     //   797: ifnull -> 810
/*     */     //   800: aload #15
/*     */     //   802: aload #10
/*     */     //   804: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   807: ifge -> 828
/*     */     //   810: aload #15
/*     */     //   812: astore #10
/*     */     //   814: goto -> 828
/*     */     //   817: aload #15
/*     */     //   819: astore #10
/*     */     //   821: aload #15
/*     */     //   823: astore #11
/*     */     //   825: goto -> 834
/*     */     //   828: iinc #12, 1
/*     */     //   831: goto -> 695
/*     */     //   834: nop
/*     */     //   835: aload #10
/*     */     //   837: dup
/*     */     //   838: ifnonnull -> 844
/*     */     //   841: pop
/*     */     //   842: aload #11
/*     */     //   844: astore #12
/*     */     //   846: aload #4
/*     */     //   848: astore #13
/*     */     //   850: iconst_0
/*     */     //   851: istore #14
/*     */     //   853: nop
/*     */     //   854: new java/util/ArrayList
/*     */     //   857: dup
/*     */     //   858: aload #13
/*     */     //   860: invokeinterface size : ()I
/*     */     //   865: invokespecial <init> : (I)V
/*     */     //   868: astore #15
/*     */     //   870: aload #13
/*     */     //   872: astore #16
/*     */     //   874: iconst_0
/*     */     //   875: istore #17
/*     */     //   877: nop
/*     */     //   878: iconst_0
/*     */     //   879: istore #18
/*     */     //   881: aload #16
/*     */     //   883: invokeinterface size : ()I
/*     */     //   888: istore #19
/*     */     //   890: iload #18
/*     */     //   892: iload #19
/*     */     //   894: if_icmpge -> 961
/*     */     //   897: aload #16
/*     */     //   899: iload #18
/*     */     //   901: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   906: astore #20
/*     */     //   908: aload #20
/*     */     //   910: astore #21
/*     */     //   912: iconst_0
/*     */     //   913: istore #22
/*     */     //   915: aload #21
/*     */     //   917: checkcast androidx/compose/ui/text/font/Font
/*     */     //   920: astore #23
/*     */     //   922: iconst_0
/*     */     //   923: istore #24
/*     */     //   925: aload #23
/*     */     //   927: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   932: aload #12
/*     */     //   934: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   937: ifeq -> 953
/*     */     //   940: aload #15
/*     */     //   942: checkcast java/util/Collection
/*     */     //   945: aload #21
/*     */     //   947: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   952: pop
/*     */     //   953: nop
/*     */     //   954: nop
/*     */     //   955: iinc #18, 1
/*     */     //   958: goto -> 890
/*     */     //   961: nop
/*     */     //   962: aload #15
/*     */     //   964: checkcast java/util/List
/*     */     //   967: nop
/*     */     //   968: goto -> 1630
/*     */     //   971: aload_0
/*     */     //   972: astore #6
/*     */     //   974: aload #4
/*     */     //   976: astore #7
/*     */     //   978: iconst_0
/*     */     //   979: istore #8
/*     */     //   981: aconst_null
/*     */     //   982: astore #9
/*     */     //   984: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   987: invokevirtual getW500 : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   990: astore #10
/*     */     //   992: nop
/*     */     //   993: iconst_0
/*     */     //   994: istore #11
/*     */     //   996: aconst_null
/*     */     //   997: astore #12
/*     */     //   999: aconst_null
/*     */     //   1000: astore #13
/*     */     //   1002: iconst_0
/*     */     //   1003: istore #14
/*     */     //   1005: aload #7
/*     */     //   1007: invokeinterface size : ()I
/*     */     //   1012: istore #15
/*     */     //   1014: iload #14
/*     */     //   1016: iload #15
/*     */     //   1018: if_icmpge -> 1153
/*     */     //   1021: aload #7
/*     */     //   1023: iload #14
/*     */     //   1025: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1030: checkcast androidx/compose/ui/text/font/Font
/*     */     //   1033: astore #16
/*     */     //   1035: aload #16
/*     */     //   1037: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1042: astore #17
/*     */     //   1044: aload #9
/*     */     //   1046: ifnull -> 1059
/*     */     //   1049: aload #17
/*     */     //   1051: aload #9
/*     */     //   1053: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1056: iflt -> 1147
/*     */     //   1059: aload #10
/*     */     //   1061: ifnull -> 1074
/*     */     //   1064: aload #17
/*     */     //   1066: aload #10
/*     */     //   1068: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1071: ifgt -> 1147
/*     */     //   1074: aload #17
/*     */     //   1076: aload_2
/*     */     //   1077: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1080: ifge -> 1105
/*     */     //   1083: aload #13
/*     */     //   1085: ifnull -> 1098
/*     */     //   1088: aload #17
/*     */     //   1090: aload #13
/*     */     //   1092: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1095: ifle -> 1147
/*     */     //   1098: aload #17
/*     */     //   1100: astore #13
/*     */     //   1102: goto -> 1147
/*     */     //   1105: aload #17
/*     */     //   1107: aload_2
/*     */     //   1108: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1111: ifle -> 1136
/*     */     //   1114: aload #12
/*     */     //   1116: ifnull -> 1129
/*     */     //   1119: aload #17
/*     */     //   1121: aload #12
/*     */     //   1123: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1126: ifge -> 1147
/*     */     //   1129: aload #17
/*     */     //   1131: astore #12
/*     */     //   1133: goto -> 1147
/*     */     //   1136: aload #17
/*     */     //   1138: astore #12
/*     */     //   1140: aload #17
/*     */     //   1142: astore #13
/*     */     //   1144: goto -> 1153
/*     */     //   1147: iinc #14, 1
/*     */     //   1150: goto -> 1014
/*     */     //   1153: nop
/*     */     //   1154: aload #12
/*     */     //   1156: dup
/*     */     //   1157: ifnonnull -> 1163
/*     */     //   1160: pop
/*     */     //   1161: aload #13
/*     */     //   1163: astore #14
/*     */     //   1165: aload #7
/*     */     //   1167: astore #15
/*     */     //   1169: iconst_0
/*     */     //   1170: istore #16
/*     */     //   1172: nop
/*     */     //   1173: new java/util/ArrayList
/*     */     //   1176: dup
/*     */     //   1177: aload #15
/*     */     //   1179: invokeinterface size : ()I
/*     */     //   1184: invokespecial <init> : (I)V
/*     */     //   1187: astore #17
/*     */     //   1189: aload #15
/*     */     //   1191: astore #18
/*     */     //   1193: iconst_0
/*     */     //   1194: istore #19
/*     */     //   1196: nop
/*     */     //   1197: iconst_0
/*     */     //   1198: istore #20
/*     */     //   1200: aload #18
/*     */     //   1202: invokeinterface size : ()I
/*     */     //   1207: istore #21
/*     */     //   1209: iload #20
/*     */     //   1211: iload #21
/*     */     //   1213: if_icmpge -> 1280
/*     */     //   1216: aload #18
/*     */     //   1218: iload #20
/*     */     //   1220: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1225: astore #22
/*     */     //   1227: aload #22
/*     */     //   1229: astore #23
/*     */     //   1231: iconst_0
/*     */     //   1232: istore #24
/*     */     //   1234: aload #23
/*     */     //   1236: checkcast androidx/compose/ui/text/font/Font
/*     */     //   1239: astore #25
/*     */     //   1241: iconst_0
/*     */     //   1242: istore #26
/*     */     //   1244: aload #25
/*     */     //   1246: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1251: aload #14
/*     */     //   1253: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1256: ifeq -> 1272
/*     */     //   1259: aload #17
/*     */     //   1261: checkcast java/util/Collection
/*     */     //   1264: aload #23
/*     */     //   1266: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1271: pop
/*     */     //   1272: nop
/*     */     //   1273: nop
/*     */     //   1274: iinc #20, 1
/*     */     //   1277: goto -> 1209
/*     */     //   1280: nop
/*     */     //   1281: aload #17
/*     */     //   1283: checkcast java/util/List
/*     */     //   1286: nop
/*     */     //   1287: checkcast java/util/Collection
/*     */     //   1290: astore #6
/*     */     //   1292: aload #6
/*     */     //   1294: invokeinterface isEmpty : ()Z
/*     */     //   1299: ifeq -> 1625
/*     */     //   1302: iconst_0
/*     */     //   1303: istore #7
/*     */     //   1305: aload_0
/*     */     //   1306: astore #8
/*     */     //   1308: aload #4
/*     */     //   1310: astore #9
/*     */     //   1312: iconst_0
/*     */     //   1313: istore #10
/*     */     //   1315: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   1318: invokevirtual getW500 : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1321: astore #11
/*     */     //   1323: aconst_null
/*     */     //   1324: astore #12
/*     */     //   1326: nop
/*     */     //   1327: iconst_0
/*     */     //   1328: istore #13
/*     */     //   1330: aconst_null
/*     */     //   1331: astore #14
/*     */     //   1333: aconst_null
/*     */     //   1334: astore #15
/*     */     //   1336: iconst_0
/*     */     //   1337: istore #16
/*     */     //   1339: aload #9
/*     */     //   1341: invokeinterface size : ()I
/*     */     //   1346: istore #17
/*     */     //   1348: iload #16
/*     */     //   1350: iload #17
/*     */     //   1352: if_icmpge -> 1487
/*     */     //   1355: aload #9
/*     */     //   1357: iload #16
/*     */     //   1359: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1364: checkcast androidx/compose/ui/text/font/Font
/*     */     //   1367: astore #18
/*     */     //   1369: aload #18
/*     */     //   1371: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1376: astore #19
/*     */     //   1378: aload #11
/*     */     //   1380: ifnull -> 1393
/*     */     //   1383: aload #19
/*     */     //   1385: aload #11
/*     */     //   1387: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1390: iflt -> 1481
/*     */     //   1393: aload #12
/*     */     //   1395: ifnull -> 1408
/*     */     //   1398: aload #19
/*     */     //   1400: aload #12
/*     */     //   1402: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1405: ifgt -> 1481
/*     */     //   1408: aload #19
/*     */     //   1410: aload_2
/*     */     //   1411: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1414: ifge -> 1439
/*     */     //   1417: aload #15
/*     */     //   1419: ifnull -> 1432
/*     */     //   1422: aload #19
/*     */     //   1424: aload #15
/*     */     //   1426: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1429: ifle -> 1481
/*     */     //   1432: aload #19
/*     */     //   1434: astore #15
/*     */     //   1436: goto -> 1481
/*     */     //   1439: aload #19
/*     */     //   1441: aload_2
/*     */     //   1442: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1445: ifle -> 1470
/*     */     //   1448: aload #14
/*     */     //   1450: ifnull -> 1463
/*     */     //   1453: aload #19
/*     */     //   1455: aload #14
/*     */     //   1457: invokevirtual compareTo : (Landroidx/compose/ui/text/font/FontWeight;)I
/*     */     //   1460: ifge -> 1481
/*     */     //   1463: aload #19
/*     */     //   1465: astore #14
/*     */     //   1467: goto -> 1481
/*     */     //   1470: aload #19
/*     */     //   1472: astore #14
/*     */     //   1474: aload #19
/*     */     //   1476: astore #15
/*     */     //   1478: goto -> 1487
/*     */     //   1481: iinc #16, 1
/*     */     //   1484: goto -> 1348
/*     */     //   1487: nop
/*     */     //   1488: aload #14
/*     */     //   1490: dup
/*     */     //   1491: ifnonnull -> 1497
/*     */     //   1494: pop
/*     */     //   1495: aload #15
/*     */     //   1497: astore #16
/*     */     //   1499: aload #9
/*     */     //   1501: astore #17
/*     */     //   1503: iconst_0
/*     */     //   1504: istore #18
/*     */     //   1506: nop
/*     */     //   1507: new java/util/ArrayList
/*     */     //   1510: dup
/*     */     //   1511: aload #17
/*     */     //   1513: invokeinterface size : ()I
/*     */     //   1518: invokespecial <init> : (I)V
/*     */     //   1521: astore #19
/*     */     //   1523: aload #17
/*     */     //   1525: astore #20
/*     */     //   1527: iconst_0
/*     */     //   1528: istore #21
/*     */     //   1530: nop
/*     */     //   1531: iconst_0
/*     */     //   1532: istore #22
/*     */     //   1534: aload #20
/*     */     //   1536: invokeinterface size : ()I
/*     */     //   1541: istore #23
/*     */     //   1543: iload #22
/*     */     //   1545: iload #23
/*     */     //   1547: if_icmpge -> 1614
/*     */     //   1550: aload #20
/*     */     //   1552: iload #22
/*     */     //   1554: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1559: astore #24
/*     */     //   1561: aload #24
/*     */     //   1563: astore #25
/*     */     //   1565: iconst_0
/*     */     //   1566: istore #26
/*     */     //   1568: aload #25
/*     */     //   1570: checkcast androidx/compose/ui/text/font/Font
/*     */     //   1573: astore #27
/*     */     //   1575: iconst_0
/*     */     //   1576: istore #28
/*     */     //   1578: aload #27
/*     */     //   1580: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1585: aload #16
/*     */     //   1587: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1590: ifeq -> 1606
/*     */     //   1593: aload #19
/*     */     //   1595: checkcast java/util/Collection
/*     */     //   1598: aload #25
/*     */     //   1600: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1605: pop
/*     */     //   1606: nop
/*     */     //   1607: nop
/*     */     //   1608: iinc #22, 1
/*     */     //   1611: goto -> 1543
/*     */     //   1614: nop
/*     */     //   1615: aload #19
/*     */     //   1617: checkcast java/util/List
/*     */     //   1620: nop
/*     */     //   1621: nop
/*     */     //   1622: goto -> 1627
/*     */     //   1625: aload #6
/*     */     //   1627: checkcast java/util/List
/*     */     //   1630: astore #5
/*     */     //   1632: aload #5
/*     */     //   1634: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 12
/*     */     //   #167	-> 18
/*     */     //   #168	-> 19
/*     */     //   #169	-> 35
/*     */     //   #170	-> 42
/*     */     //   #171	-> 43
/*     */     //   #172	-> 62
/*     */     //   #173	-> 73
/*     */     //   #174	-> 80
/*     */     //   #49	-> 90
/*     */     //   #174	-> 123
/*     */     //   #175	-> 139
/*     */     //   #173	-> 140
/*     */     //   #171	-> 141
/*     */     //   #176	-> 147
/*     */     //   #177	-> 148
/*     */     //   #49	-> 153
/*     */     //   #51	-> 158
/*     */     //   #51	-> 176
/*     */     //   #52	-> 179
/*     */     //   #54	-> 182
/*     */     //   #49	-> 183
/*     */     //   #57	-> 184
/*     */     //   #178	-> 190
/*     */     //   #179	-> 191
/*     */     //   #180	-> 207
/*     */     //   #181	-> 214
/*     */     //   #182	-> 215
/*     */     //   #183	-> 234
/*     */     //   #184	-> 245
/*     */     //   #185	-> 252
/*     */     //   #57	-> 262
/*     */     //   #185	-> 273
/*     */     //   #186	-> 289
/*     */     //   #184	-> 290
/*     */     //   #182	-> 291
/*     */     //   #187	-> 297
/*     */     //   #188	-> 298
/*     */     //   #57	-> 308
/*     */     //   #189	-> 318
/*     */     //   #57	-> 321
/*     */     //   #57	-> 322
/*     */     //   #57	-> 327
/*     */     //   #59	-> 332
/*     */     //   #60	-> 333
/*     */     //   #65	-> 346
/*     */     //   #190	-> 349
/*     */     //   #193	-> 349
/*     */     //   #190	-> 352
/*     */     //   #194	-> 352
/*     */     //   #190	-> 355
/*     */     //   #196	-> 358
/*     */     //   #197	-> 361
/*     */     //   #198	-> 364
/*     */     //   #199	-> 383
/*     */     //   #200	-> 397
/*     */     //   #201	-> 406
/*     */     //   #202	-> 421
/*     */     //   #203	-> 436
/*     */     //   #204	-> 445
/*     */     //   #205	-> 460
/*     */     //   #207	-> 467
/*     */     //   #208	-> 476
/*     */     //   #209	-> 491
/*     */     //   #213	-> 498
/*     */     //   #214	-> 502
/*     */     //   #215	-> 506
/*     */     //   #198	-> 509
/*     */     //   #218	-> 515
/*     */     //   #219	-> 516
/*     */     //   #218	-> 525
/*     */     //   #223	-> 527
/*     */     //   #224	-> 534
/*     */     //   #225	-> 535
/*     */     //   #226	-> 551
/*     */     //   #227	-> 558
/*     */     //   #228	-> 559
/*     */     //   #229	-> 578
/*     */     //   #230	-> 589
/*     */     //   #231	-> 596
/*     */     //   #223	-> 606
/*     */     //   #231	-> 618
/*     */     //   #232	-> 634
/*     */     //   #230	-> 635
/*     */     //   #228	-> 636
/*     */     //   #233	-> 642
/*     */     //   #234	-> 643
/*     */     //   #223	-> 648
/*     */     //   #67	-> 652
/*     */     //   #71	-> 665
/*     */     //   #235	-> 668
/*     */     //   #238	-> 668
/*     */     //   #235	-> 671
/*     */     //   #239	-> 671
/*     */     //   #235	-> 674
/*     */     //   #241	-> 677
/*     */     //   #242	-> 680
/*     */     //   #243	-> 683
/*     */     //   #244	-> 702
/*     */     //   #245	-> 716
/*     */     //   #246	-> 725
/*     */     //   #247	-> 740
/*     */     //   #248	-> 755
/*     */     //   #249	-> 764
/*     */     //   #250	-> 779
/*     */     //   #252	-> 786
/*     */     //   #253	-> 795
/*     */     //   #254	-> 810
/*     */     //   #258	-> 817
/*     */     //   #259	-> 821
/*     */     //   #260	-> 825
/*     */     //   #243	-> 828
/*     */     //   #263	-> 834
/*     */     //   #266	-> 835
/*     */     //   #263	-> 844
/*     */     //   #268	-> 846
/*     */     //   #269	-> 853
/*     */     //   #270	-> 854
/*     */     //   #271	-> 870
/*     */     //   #272	-> 877
/*     */     //   #273	-> 878
/*     */     //   #274	-> 897
/*     */     //   #275	-> 908
/*     */     //   #276	-> 915
/*     */     //   #268	-> 925
/*     */     //   #276	-> 937
/*     */     //   #277	-> 953
/*     */     //   #275	-> 954
/*     */     //   #273	-> 955
/*     */     //   #278	-> 961
/*     */     //   #279	-> 962
/*     */     //   #268	-> 967
/*     */     //   #80	-> 971
/*     */     //   #79	-> 974
/*     */     //   #82	-> 978
/*     */     //   #83	-> 981
/*     */     //   #84	-> 984
/*     */     //   #80	-> 992
/*     */     //   #280	-> 996
/*     */     //   #281	-> 999
/*     */     //   #282	-> 1002
/*     */     //   #283	-> 1021
/*     */     //   #284	-> 1035
/*     */     //   #285	-> 1044
/*     */     //   #286	-> 1059
/*     */     //   #287	-> 1074
/*     */     //   #288	-> 1083
/*     */     //   #289	-> 1098
/*     */     //   #291	-> 1105
/*     */     //   #292	-> 1114
/*     */     //   #293	-> 1129
/*     */     //   #297	-> 1136
/*     */     //   #298	-> 1140
/*     */     //   #299	-> 1144
/*     */     //   #282	-> 1147
/*     */     //   #302	-> 1153
/*     */     //   #305	-> 1154
/*     */     //   #302	-> 1163
/*     */     //   #307	-> 1165
/*     */     //   #308	-> 1172
/*     */     //   #309	-> 1173
/*     */     //   #310	-> 1189
/*     */     //   #311	-> 1196
/*     */     //   #312	-> 1197
/*     */     //   #313	-> 1216
/*     */     //   #314	-> 1227
/*     */     //   #315	-> 1234
/*     */     //   #307	-> 1244
/*     */     //   #315	-> 1256
/*     */     //   #316	-> 1272
/*     */     //   #314	-> 1273
/*     */     //   #312	-> 1274
/*     */     //   #317	-> 1280
/*     */     //   #318	-> 1281
/*     */     //   #307	-> 1286
/*     */     //   #86	-> 1292
/*     */     //   #87	-> 1305
/*     */     //   #89	-> 1312
/*     */     //   #90	-> 1315
/*     */     //   #91	-> 1323
/*     */     //   #87	-> 1326
/*     */     //   #319	-> 1330
/*     */     //   #320	-> 1333
/*     */     //   #321	-> 1336
/*     */     //   #322	-> 1355
/*     */     //   #323	-> 1369
/*     */     //   #324	-> 1378
/*     */     //   #325	-> 1393
/*     */     //   #326	-> 1408
/*     */     //   #327	-> 1417
/*     */     //   #328	-> 1432
/*     */     //   #330	-> 1439
/*     */     //   #331	-> 1448
/*     */     //   #332	-> 1463
/*     */     //   #336	-> 1470
/*     */     //   #337	-> 1474
/*     */     //   #338	-> 1478
/*     */     //   #321	-> 1481
/*     */     //   #341	-> 1487
/*     */     //   #344	-> 1488
/*     */     //   #341	-> 1497
/*     */     //   #346	-> 1499
/*     */     //   #347	-> 1506
/*     */     //   #348	-> 1507
/*     */     //   #349	-> 1523
/*     */     //   #350	-> 1530
/*     */     //   #351	-> 1531
/*     */     //   #352	-> 1550
/*     */     //   #353	-> 1561
/*     */     //   #354	-> 1568
/*     */     //   #346	-> 1578
/*     */     //   #354	-> 1590
/*     */     //   #355	-> 1606
/*     */     //   #353	-> 1607
/*     */     //   #351	-> 1608
/*     */     //   #356	-> 1614
/*     */     //   #357	-> 1615
/*     */     //   #346	-> 1620
/*     */     //   #87	-> 1621
/*     */     //   #86	-> 1622
/*     */     //   #59	-> 1630
/*     */     //   #97	-> 1632
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   90	33	15	$i$a$-fastFilter-FontMatcher$matchFont$1	I
/*     */     //   87	36	14	it	Landroidx/compose/ui/text/font/Font;
/*     */     //   80	60	13	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv	I
/*     */     //   77	63	12	it$iv	Ljava/lang/Object;
/*     */     //   73	68	11	item$iv$iv	Ljava/lang/Object;
/*     */     //   46	101	9	index$iv$iv	I
/*     */     //   42	106	8	$i$f$fastForEach	I
/*     */     //   39	109	7	$this$fastForEach$iv$iv	Ljava/util/List;
/*     */     //   18	135	5	$i$f$fastFilter	I
/*     */     //   35	118	6	target$iv	Ljava/util/ArrayList;
/*     */     //   15	138	4	$this$fastFilter$iv	Ljava/util/List;
/*     */     //   158	25	6	$i$a$-let-FontMatcher$matchFont$2	I
/*     */     //   155	28	5	it	Ljava/util/List;
/*     */     //   262	11	16	$i$a$-fastFilter-FontMatcher$matchFont$fontsToSearch$1	I
/*     */     //   259	14	15	it	Landroidx/compose/ui/text/font/Font;
/*     */     //   252	38	14	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv	I
/*     */     //   249	41	13	it$iv	Ljava/lang/Object;
/*     */     //   245	46	12	item$iv$iv	Ljava/lang/Object;
/*     */     //   218	79	10	index$iv$iv	I
/*     */     //   214	84	9	$i$f$fastForEach	I
/*     */     //   211	87	8	$this$fastForEach$iv$iv	Ljava/util/List;
/*     */     //   190	113	6	$i$f$fastFilter	I
/*     */     //   207	96	7	target$iv	Ljava/util/ArrayList;
/*     */     //   187	116	5	$this$fastFilter$iv	Ljava/util/List;
/*     */     //   321	1	6	$i$a$-ifEmpty-FontMatcher$matchFont$fontsToSearch$2	I
/*     */     //   397	112	14	font$iv	Landroidx/compose/ui/text/font/Font;
/*     */     //   406	103	15	possibleWeight$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   367	148	12	index$iv	I
/*     */     //   606	12	24	$i$a$-fastFilter-FontMatcher$filterByClosestWeight$1$iv	I
/*     */     //   603	15	23	it$iv	Landroidx/compose/ui/text/font/Font;
/*     */     //   596	39	22	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv$iv	I
/*     */     //   593	42	21	it$iv$iv	Ljava/lang/Object;
/*     */     //   589	47	20	item$iv$iv$iv	Ljava/lang/Object;
/*     */     //   562	80	18	index$iv$iv$iv	I
/*     */     //   558	85	17	$i$f$fastForEach	I
/*     */     //   555	88	16	$this$fastForEach$iv$iv$iv	Ljava/util/List;
/*     */     //   534	114	14	$i$f$fastFilter	I
/*     */     //   551	97	15	target$iv$iv	Ljava/util/ArrayList;
/*     */     //   531	117	13	$this$fastFilter$iv$iv	Ljava/util/List;
/*     */     //   358	291	9	$i$f$filterByClosestWeight$ui_text	I
/*     */     //   361	288	10	bestWeightAbove$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   364	285	11	bestWeightBelow$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   527	122	12	bestWeight$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   349	300	6	preferBelow$iv	Z
/*     */     //   352	297	7	minSearchRange$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   355	294	8	maxSearchRange$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   716	112	14	font$iv	Landroidx/compose/ui/text/font/Font;
/*     */     //   725	103	15	possibleWeight$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   686	148	12	index$iv	I
/*     */     //   925	12	24	$i$a$-fastFilter-FontMatcher$filterByClosestWeight$1$iv	I
/*     */     //   922	15	23	it$iv	Landroidx/compose/ui/text/font/Font;
/*     */     //   915	39	22	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv$iv	I
/*     */     //   912	42	21	it$iv$iv	Ljava/lang/Object;
/*     */     //   908	47	20	item$iv$iv$iv	Ljava/lang/Object;
/*     */     //   881	80	18	index$iv$iv$iv	I
/*     */     //   877	85	17	$i$f$fastForEach	I
/*     */     //   874	88	16	$this$fastForEach$iv$iv$iv	Ljava/util/List;
/*     */     //   853	114	14	$i$f$fastFilter	I
/*     */     //   870	97	15	target$iv$iv	Ljava/util/ArrayList;
/*     */     //   850	117	13	$this$fastFilter$iv$iv	Ljava/util/List;
/*     */     //   677	291	9	$i$f$filterByClosestWeight$ui_text	I
/*     */     //   680	288	10	bestWeightAbove$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   683	285	11	bestWeightBelow$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   846	122	12	bestWeight$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   668	300	6	preferBelow$iv	Z
/*     */     //   671	297	7	minSearchRange$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   674	294	8	maxSearchRange$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1035	112	16	font$iv	Landroidx/compose/ui/text/font/Font;
/*     */     //   1044	103	17	possibleWeight$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1005	148	14	index$iv	I
/*     */     //   1244	12	26	$i$a$-fastFilter-FontMatcher$filterByClosestWeight$1$iv	I
/*     */     //   1241	15	25	it$iv	Landroidx/compose/ui/text/font/Font;
/*     */     //   1234	39	24	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv$iv	I
/*     */     //   1231	42	23	it$iv$iv	Ljava/lang/Object;
/*     */     //   1227	47	22	item$iv$iv$iv	Ljava/lang/Object;
/*     */     //   1200	80	20	index$iv$iv$iv	I
/*     */     //   1196	85	19	$i$f$fastForEach	I
/*     */     //   1193	88	18	$this$fastForEach$iv$iv$iv	Ljava/util/List;
/*     */     //   1172	114	16	$i$f$fastFilter	I
/*     */     //   1189	97	17	target$iv$iv	Ljava/util/ArrayList;
/*     */     //   1169	117	15	$this$fastFilter$iv$iv	Ljava/util/List;
/*     */     //   996	291	11	$i$f$filterByClosestWeight$ui_text	I
/*     */     //   999	288	12	bestWeightAbove$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1002	285	13	bestWeightBelow$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1165	122	14	bestWeight$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   993	294	6	this_$iv	Landroidx/compose/ui/text/font/FontMatcher;
/*     */     //   993	294	7	$this$filterByClosestWeight$iv	Ljava/util/List;
/*     */     //   993	294	8	preferBelow$iv	Z
/*     */     //   993	294	9	minSearchRange$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   993	294	10	maxSearchRange$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1369	112	18	font$iv	Landroidx/compose/ui/text/font/Font;
/*     */     //   1378	103	19	possibleWeight$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1339	148	16	index$iv	I
/*     */     //   1578	12	28	$i$a$-fastFilter-FontMatcher$filterByClosestWeight$1$iv	I
/*     */     //   1575	15	27	it$iv	Landroidx/compose/ui/text/font/Font;
/*     */     //   1568	39	26	$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv$iv	I
/*     */     //   1565	42	25	it$iv$iv	Ljava/lang/Object;
/*     */     //   1561	47	24	item$iv$iv$iv	Ljava/lang/Object;
/*     */     //   1534	80	22	index$iv$iv$iv	I
/*     */     //   1530	85	21	$i$f$fastForEach	I
/*     */     //   1527	88	20	$this$fastForEach$iv$iv$iv	Ljava/util/List;
/*     */     //   1506	114	18	$i$f$fastFilter	I
/*     */     //   1523	97	19	target$iv$iv	Ljava/util/ArrayList;
/*     */     //   1503	117	17	$this$fastFilter$iv$iv	Ljava/util/List;
/*     */     //   1330	291	13	$i$f$filterByClosestWeight$ui_text	I
/*     */     //   1333	288	14	bestWeightAbove$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1336	285	15	bestWeightBelow$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1499	122	16	bestWeight$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1327	294	8	this_$iv	Landroidx/compose/ui/text/font/FontMatcher;
/*     */     //   1327	294	9	$this$filterByClosestWeight$iv	Ljava/util/List;
/*     */     //   1327	294	10	preferBelow$iv	Z
/*     */     //   1327	294	11	minSearchRange$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1327	294	12	maxSearchRange$iv	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1305	317	7	$i$a$-ifEmpty-FontMatcher$matchFont$result$1	I
/*     */     //   332	1303	4	fontsToSearch	Ljava/util/List;
/*     */     //   1632	3	5	result	Ljava/util/List;
/*     */     //   0	1635	0	this	Landroidx/compose/ui/text/font/FontMatcher;
/*     */     //   0	1635	1	fontList	Ljava/util/List;
/*     */     //   0	1635	2	fontWeight	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   0	1635	3	fontStyle	I
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Font> filterByClosestWeight$ui_text(@NotNull List<Font> $this$filterByClosestWeight, @NotNull FontWeight fontWeight, boolean preferBelow, @Nullable FontWeight minSearchRange, @Nullable FontWeight maxSearchRange) {
/* 108 */     Intrinsics.checkNotNullParameter($this$filterByClosestWeight, "<this>"); Intrinsics.checkNotNullParameter(fontWeight, "fontWeight"); int $i$f$filterByClosestWeight$ui_text = 0; FontWeight bestWeightAbove = null;
/* 109 */     FontWeight bestWeightBelow = null;
/* 110 */     for (int index = 0, i = $this$filterByClosestWeight.size(); index < i; index++) {
/* 111 */       Font font = $this$filterByClosestWeight.get(index);
/* 112 */       FontWeight possibleWeight = font.getWeight();
/* 113 */       if ((minSearchRange == null || possibleWeight.compareTo(minSearchRange) >= 0) && (
/* 114 */         maxSearchRange == null || possibleWeight.compareTo(maxSearchRange) <= 0))
/* 115 */         if (possibleWeight.compareTo(fontWeight) < 0) {
/* 116 */           if (bestWeightBelow == null || possibleWeight.compareTo(bestWeightBelow) > 0) {
/* 117 */             bestWeightBelow = possibleWeight;
/*     */           }
/* 119 */         } else if (possibleWeight.compareTo(fontWeight) > 0) {
/* 120 */           if (bestWeightAbove == null || possibleWeight.compareTo(bestWeightAbove) < 0) {
/* 121 */             bestWeightAbove = possibleWeight;
/*     */           }
/*     */         } else {
/*     */           
/* 125 */           bestWeightAbove = possibleWeight;
/* 126 */           bestWeightBelow = possibleWeight;
/*     */           break;
/*     */         }  
/*     */     } 
/* 130 */     if (preferBelow)
/* 131 */     { if (bestWeightBelow == null); }
/*     */     
/* 133 */     else if (bestWeightAbove == null) {  }  FontWeight bestWeight = bestWeightBelow;
/*     */     
/* 135 */     List<Font> $this$fastFilter$iv = $this$filterByClosestWeight; int $i$f$fastFilter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 359 */     ArrayList<Object> target$iv = new ArrayList($this$fastFilter$iv.size());
/* 360 */     List<Font> $this$fastForEach$iv$iv = $this$fastFilter$iv; int $i$f$fastForEach = 0;
/*     */     
/* 362 */     int index$iv$iv = 0, j = $this$fastForEach$iv$iv.size(); if (index$iv$iv < j) {
/* 363 */       Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 364 */       Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv = 0;
/* 365 */       Font it = (Font)it$iv; int $i$a$-fastFilter-FontMatcher$filterByClosestWeight$1 = 0; if (Intrinsics.areEqual(it.getWeight(), bestWeight)) target$iv.add(it$iv);
/*     */     
/*     */     } 
/* 368 */     return target$iv;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Font> matchFont-RetOiIg(@NotNull FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle) {
/*     */     Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
/*     */     Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
/*     */     if (!(fontFamily instanceof FontListFontFamily))
/*     */       throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used"); 
/*     */     return matchFont-RetOiIg((FontListFontFamily)fontFamily, fontWeight, fontStyle);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Font> matchFont-RetOiIg(@NotNull FontListFontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle) {
/*     */     Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
/*     */     Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
/*     */     return matchFont-RetOiIg(fontFamily.getFonts(), fontWeight, fontStyle);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */