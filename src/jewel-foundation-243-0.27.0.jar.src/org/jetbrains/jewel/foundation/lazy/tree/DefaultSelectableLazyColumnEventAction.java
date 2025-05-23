package org.jetbrains.jewel.foundation.lazy.tree;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jewel.foundation.lazy.SelectableColumnKeybindings;
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
import org.jetbrains.jewel.foundation.lazy.SelectionMode;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\000\n\002\b\004\b\027\030\0002\0020\001B\007¢\006\004\b\002\020\003J>\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\f\020\016\032\b\022\004\022\0020\0200\0172\006\020\021\032\0020\022H\026J.\020\023\032\0020\0052\006\020\021\032\0020\0222\f\020\016\032\b\022\004\022\0020\0200\0172\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026J.\020\024\032\0020\0052\006\020\021\032\0020\0222\f\020\016\032\b\022\004\022\0020\0200\0172\006\020\025\032\0020\0132\006\020\f\032\0020\rH\026¨\006\026"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnEventAction;", "Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;", "<init>", "()V", "handlePointerEventPress", "", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "selectableLazyListState", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "selectionMode", "Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;", "allKeys", "", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "key", "", "toggleKeySelection", "onExtendSelectionToKey", "state", "foundation"})
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nKeyActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyActions.kt\norg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnEventAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n350#2,7:322\n350#2,7:329\n350#2,7:336\n350#2,7:343\n*S KotlinDebug\n*F\n+ 1 KeyActions.kt\norg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnEventAction\n*L\n85#1:322,7\n108#1:329,7\n121#1:336,7\n140#1:343,7\n*E\n"})
public class DefaultSelectableLazyColumnEventAction implements PointerEventActions {
  public static final int $stable;
  
  public void handlePointerEventPress(@NotNull PointerEvent pointerEvent, @NotNull SelectableColumnKeybindings keybindings, @NotNull SelectableLazyListState selectableLazyListState, @NotNull SelectionMode selectionMode, @NotNull List allKeys, @NotNull Object key) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'pointerEvent'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 'keybindings'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_3
    //   13: ldc 'selectableLazyListState'
    //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload #4
    //   20: ldc 'selectionMode'
    //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   25: aload #5
    //   27: ldc 'allKeys'
    //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   32: aload #6
    //   34: ldc 'key'
    //   36: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   39: aload_2
    //   40: astore #7
    //   42: iconst_0
    //   43: istore #8
    //   45: nop
    //   46: aload #7
    //   48: aload_1
    //   49: invokevirtual getKeyboardModifiers-k7X9c1A : ()I
    //   52: invokeinterface isContiguousSelectionKeyPressed-5xRPYO0 : (I)Z
    //   57: ifeq -> 70
    //   60: aload_1
    //   61: invokevirtual getKeyboardModifiers-k7X9c1A : ()I
    //   64: invokestatic isCtrlPressed-5xRPYO0 : (I)Z
    //   67: ifne -> 223
    //   70: aload #7
    //   72: aload_1
    //   73: invokevirtual getKeyboardModifiers-k7X9c1A : ()I
    //   76: invokeinterface isContiguousSelectionKeyPressed-5xRPYO0 : (I)Z
    //   81: ifeq -> 98
    //   84: aload_0
    //   85: aload #6
    //   87: aload #5
    //   89: aload_3
    //   90: aload #4
    //   92: invokevirtual onExtendSelectionToKey : (Ljava/lang/Object;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;)V
    //   95: goto -> 223
    //   98: aload #7
    //   100: aload_1
    //   101: invokevirtual getKeyboardModifiers-k7X9c1A : ()I
    //   104: invokeinterface isMultiSelectionKeyPressed-5xRPYO0 : (I)Z
    //   109: ifeq -> 126
    //   112: aload_0
    //   113: aload #6
    //   115: aload #5
    //   117: aload_3
    //   118: aload #4
    //   120: invokevirtual toggleKeySelection : (Ljava/lang/Object;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;)V
    //   123: goto -> 223
    //   126: aload_3
    //   127: aload #6
    //   129: invokestatic setOf : (Ljava/lang/Object;)Ljava/util/Set;
    //   132: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
    //   135: aload_3
    //   136: aload #5
    //   138: astore #9
    //   140: astore #10
    //   142: iconst_0
    //   143: istore #11
    //   145: iconst_0
    //   146: istore #12
    //   148: aload #9
    //   150: invokeinterface iterator : ()Ljava/util/Iterator;
    //   155: astore #13
    //   157: aload #13
    //   159: invokeinterface hasNext : ()Z
    //   164: ifeq -> 210
    //   167: aload #13
    //   169: invokeinterface next : ()Ljava/lang/Object;
    //   174: astore #14
    //   176: aload #14
    //   178: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
    //   181: astore #15
    //   183: iconst_0
    //   184: istore #16
    //   186: aload #15
    //   188: invokevirtual getKey : ()Ljava/lang/Object;
    //   191: aload #6
    //   193: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   196: ifeq -> 204
    //   199: iload #12
    //   201: goto -> 211
    //   204: iinc #12, 1
    //   207: goto -> 157
    //   210: iconst_m1
    //   211: istore #17
    //   213: aload #10
    //   215: iload #17
    //   217: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   220: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
    //   223: nop
    //   224: nop
    //   225: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #68	-> 39
    //   #69	-> 45
    //   #70	-> 46
    //   #71	-> 60
    //   #75	-> 70
    //   #76	-> 84
    //   #79	-> 98
    //   #80	-> 112
    //   #84	-> 126
    //   #85	-> 135
    //   #322	-> 145
    //   #323	-> 148
    //   #324	-> 176
    //   #85	-> 186
    //   #324	-> 196
    //   #325	-> 199
    //   #326	-> 204
    //   #328	-> 210
    //   #85	-> 220
    //   #88	-> 223
    //   #68	-> 224
    //   #89	-> 225
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   186	10	16	$i$a$-indexOfFirst-DefaultSelectableLazyColumnEventAction$handlePointerEventPress$1$1	I
    //   183	13	15	it	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
    //   176	31	14	item$iv	Ljava/lang/Object;
    //   145	66	11	$i$f$indexOfFirst	I
    //   148	63	12	index$iv	I
    //   142	69	9	$this$indexOfFirst$iv	Ljava/util/List;
    //   45	179	8	$i$a$-with-DefaultSelectableLazyColumnEventAction$handlePointerEventPress$1	I
    //   42	182	7	$this$handlePointerEventPress_u24lambda_u241	Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;
    //   0	226	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnEventAction;
    //   0	226	1	pointerEvent	Landroidx/compose/ui/input/pointer/PointerEvent;
    //   0	226	2	keybindings	Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;
    //   0	226	3	selectableLazyListState	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
    //   0	226	4	selectionMode	Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
    //   0	226	5	allKeys	Ljava/util/List;
    //   0	226	6	key	Ljava/lang/Object;
  }
  
  public void toggleKeySelection(@NotNull Object key, @NotNull List allKeys, @NotNull SelectableLazyListState selectableLazyListState, @NotNull SelectionMode selectionMode) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'key'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 'allKeys'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_3
    //   13: ldc 'selectableLazyListState'
    //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload #4
    //   20: ldc 'selectionMode'
    //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   25: aload #4
    //   27: getstatic org/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnEventAction$WhenMappings.$EnumSwitchMapping$0 : [I
    //   30: swap
    //   31: invokevirtual ordinal : ()I
    //   34: iaload
    //   35: tableswitch default -> 115, 1 -> 60, 2 -> 61, 3 -> 72
    //   60: return
    //   61: aload_3
    //   62: aload_1
    //   63: invokestatic setOf : (Ljava/lang/Object;)Ljava/util/Set;
    //   66: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
    //   69: goto -> 123
    //   72: aload_3
    //   73: invokevirtual getSelectedKeys : ()Ljava/util/Set;
    //   76: aload_1
    //   77: invokeinterface contains : (Ljava/lang/Object;)Z
    //   82: ifeq -> 100
    //   85: aload_3
    //   86: aload_3
    //   87: invokevirtual getSelectedKeys : ()Ljava/util/Set;
    //   90: aload_1
    //   91: invokestatic minus : (Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;
    //   94: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
    //   97: goto -> 123
    //   100: aload_3
    //   101: aload_3
    //   102: invokevirtual getSelectedKeys : ()Ljava/util/Set;
    //   105: aload_1
    //   106: invokestatic plus : (Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;
    //   109: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
    //   112: goto -> 123
    //   115: new kotlin/NoWhenBranchMatchedException
    //   118: dup
    //   119: invokespecial <init> : ()V
    //   122: athrow
    //   123: aload_3
    //   124: aload_2
    //   125: astore #5
    //   127: astore #12
    //   129: iconst_0
    //   130: istore #6
    //   132: iconst_0
    //   133: istore #7
    //   135: aload #5
    //   137: invokeinterface iterator : ()Ljava/util/Iterator;
    //   142: astore #8
    //   144: aload #8
    //   146: invokeinterface hasNext : ()Z
    //   151: ifeq -> 193
    //   154: aload #8
    //   156: invokeinterface next : ()Ljava/lang/Object;
    //   161: astore #9
    //   163: aload #9
    //   165: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
    //   168: astore #10
    //   170: iconst_0
    //   171: istore #11
    //   173: aload #10
    //   175: aload_1
    //   176: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   179: ifeq -> 187
    //   182: iload #7
    //   184: goto -> 194
    //   187: iinc #7, 1
    //   190: goto -> 144
    //   193: iconst_m1
    //   194: istore #13
    //   196: aload #12
    //   198: iload #13
    //   200: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   203: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
    //   206: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #97	-> 25
    //   #98	-> 60
    //   #99	-> 61
    //   #101	-> 72
    //   #102	-> 85
    //   #104	-> 100
    //   #97	-> 115
    //   #108	-> 123
    //   #329	-> 132
    //   #330	-> 135
    //   #331	-> 163
    //   #108	-> 173
    //   #331	-> 179
    //   #332	-> 182
    //   #333	-> 187
    //   #335	-> 193
    //   #108	-> 203
    //   #109	-> 206
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   173	6	11	$i$a$-indexOfFirst-DefaultSelectableLazyColumnEventAction$toggleKeySelection$1	I
    //   170	9	10	it	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
    //   163	27	9	item$iv	Ljava/lang/Object;
    //   132	62	6	$i$f$indexOfFirst	I
    //   135	59	7	index$iv	I
    //   129	65	5	$this$indexOfFirst$iv	Ljava/util/List;
    //   0	207	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnEventAction;
    //   0	207	1	key	Ljava/lang/Object;
    //   0	207	2	allKeys	Ljava/util/List;
    //   0	207	3	selectableLazyListState	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
    //   0	207	4	selectionMode	Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
  }
  
  public void onExtendSelectionToKey(@NotNull Object key, @NotNull List allKeys, @NotNull SelectableLazyListState state, @NotNull SelectionMode selectionMode) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'key'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 'allKeys'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_3
    //   13: ldc 'state'
    //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload #4
    //   20: ldc 'selectionMode'
    //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   25: aload #4
    //   27: getstatic org/jetbrains/jewel/foundation/lazy/SelectionMode.None : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
    //   30: if_acmpne -> 34
    //   33: return
    //   34: aload #4
    //   36: getstatic org/jetbrains/jewel/foundation/lazy/SelectionMode.Single : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
    //   39: if_acmpne -> 53
    //   42: aload_3
    //   43: aload_1
    //   44: invokestatic setOf : (Ljava/lang/Object;)Ljava/util/Set;
    //   47: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
    //   50: goto -> 429
    //   53: aload_2
    //   54: astore #6
    //   56: iconst_0
    //   57: istore #7
    //   59: iconst_0
    //   60: istore #8
    //   62: aload #6
    //   64: invokeinterface iterator : ()Ljava/util/Iterator;
    //   69: astore #9
    //   71: aload #9
    //   73: invokeinterface hasNext : ()Z
    //   78: ifeq -> 123
    //   81: aload #9
    //   83: invokeinterface next : ()Ljava/lang/Object;
    //   88: astore #10
    //   90: aload #10
    //   92: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
    //   95: astore #11
    //   97: iconst_0
    //   98: istore #12
    //   100: aload #11
    //   102: invokevirtual getKey : ()Ljava/lang/Object;
    //   105: aload_1
    //   106: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   109: ifeq -> 117
    //   112: iload #8
    //   114: goto -> 124
    //   117: iinc #8, 1
    //   120: goto -> 71
    //   123: iconst_m1
    //   124: iconst_0
    //   125: invokestatic coerceAtLeast : (II)I
    //   128: istore #5
    //   130: aload_3
    //   131: invokevirtual getLastActiveItemIndex : ()Ljava/lang/Integer;
    //   134: dup
    //   135: ifnull -> 144
    //   138: invokevirtual intValue : ()I
    //   141: goto -> 147
    //   144: pop
    //   145: iload #5
    //   147: istore #6
    //   149: iload #5
    //   151: iload #6
    //   153: if_icmple -> 173
    //   156: new kotlin/ranges/IntRange
    //   159: dup
    //   160: iload #6
    //   162: iload #5
    //   164: invokespecial <init> : (II)V
    //   167: checkcast kotlin/ranges/IntProgression
    //   170: goto -> 180
    //   173: iload #6
    //   175: iload #5
    //   177: invokestatic downTo : (II)Lkotlin/ranges/IntProgression;
    //   180: astore #7
    //   182: invokestatic createListBuilder : ()Ljava/util/List;
    //   185: astore #9
    //   187: aload #9
    //   189: astore #10
    //   191: iconst_0
    //   192: istore #11
    //   194: aload #7
    //   196: invokevirtual getFirst : ()I
    //   199: istore #12
    //   201: aload #7
    //   203: invokevirtual getLast : ()I
    //   206: istore #13
    //   208: aload #7
    //   210: invokevirtual getStep : ()I
    //   213: istore #14
    //   215: iload #14
    //   217: ifle -> 227
    //   220: iload #12
    //   222: iload #13
    //   224: if_icmple -> 239
    //   227: iload #14
    //   229: ifge -> 319
    //   232: iload #13
    //   234: iload #12
    //   236: if_icmpgt -> 319
    //   239: aload_2
    //   240: iload #12
    //   242: invokeinterface get : (I)Ljava/lang/Object;
    //   247: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
    //   250: astore #15
    //   252: aload #15
    //   254: instanceof org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
    //   257: ifeq -> 302
    //   260: aload_3
    //   261: invokevirtual getSelectedKeys : ()Ljava/util/Set;
    //   264: aload_2
    //   265: iload #12
    //   267: invokeinterface get : (I)Ljava/lang/Object;
    //   272: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
    //   275: invokevirtual getKey : ()Ljava/lang/Object;
    //   278: invokeinterface contains : (Ljava/lang/Object;)Z
    //   283: ifne -> 302
    //   286: aload #10
    //   288: aload #15
    //   290: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
    //   293: invokevirtual getKey : ()Ljava/lang/Object;
    //   296: invokeinterface add : (Ljava/lang/Object;)Z
    //   301: pop
    //   302: iload #12
    //   304: iload #13
    //   306: if_icmpeq -> 319
    //   309: iload #12
    //   311: iload #14
    //   313: iadd
    //   314: istore #12
    //   316: goto -> 239
    //   319: nop
    //   320: aload #9
    //   322: invokestatic build : (Ljava/util/List;)Ljava/util/List;
    //   325: astore #8
    //   327: aload_3
    //   328: aload_3
    //   329: invokevirtual getSelectedKeys : ()Ljava/util/Set;
    //   332: aload #8
    //   334: checkcast java/lang/Iterable
    //   337: invokestatic plus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
    //   340: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
    //   343: aload_3
    //   344: aload_2
    //   345: astore #9
    //   347: astore #16
    //   349: iconst_0
    //   350: istore #10
    //   352: iconst_0
    //   353: istore #11
    //   355: aload #9
    //   357: invokeinterface iterator : ()Ljava/util/Iterator;
    //   362: astore #12
    //   364: aload #12
    //   366: invokeinterface hasNext : ()Z
    //   371: ifeq -> 416
    //   374: aload #12
    //   376: invokeinterface next : ()Ljava/lang/Object;
    //   381: astore #13
    //   383: aload #13
    //   385: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
    //   388: astore #14
    //   390: iconst_0
    //   391: istore #15
    //   393: aload #14
    //   395: invokevirtual getKey : ()Ljava/lang/Object;
    //   398: aload_1
    //   399: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   402: ifeq -> 410
    //   405: iload #11
    //   407: goto -> 417
    //   410: iinc #11, 1
    //   413: goto -> 364
    //   416: iconst_m1
    //   417: istore #17
    //   419: aload #16
    //   421: iload #17
    //   423: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   426: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
    //   429: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #117	-> 25
    //   #118	-> 34
    //   #119	-> 42
    //   #121	-> 53
    //   #336	-> 59
    //   #337	-> 62
    //   #338	-> 90
    //   #121	-> 100
    //   #338	-> 109
    //   #339	-> 112
    //   #340	-> 117
    //   #342	-> 123
    //   #121	-> 124
    //   #122	-> 130
    //   #124	-> 149
    //   #125	-> 156
    //   #127	-> 173
    //   #124	-> 180
    //   #123	-> 180
    //   #129	-> 182
    //   #130	-> 194
    //   #131	-> 239
    //   #132	-> 252
    //   #133	-> 252
    //   #135	-> 286
    //   #130	-> 302
    //   #138	-> 319
    //   #129	-> 320
    //   #129	-> 325
    //   #139	-> 327
    //   #140	-> 343
    //   #343	-> 352
    //   #344	-> 355
    //   #345	-> 383
    //   #140	-> 393
    //   #345	-> 402
    //   #346	-> 405
    //   #347	-> 410
    //   #349	-> 416
    //   #140	-> 426
    //   #142	-> 429
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   100	9	12	$i$a$-indexOfFirst-DefaultSelectableLazyColumnEventAction$onExtendSelectionToKey$currentIndex$1	I
    //   97	12	11	it	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
    //   90	30	10	item$iv	Ljava/lang/Object;
    //   59	65	7	$i$f$indexOfFirst	I
    //   62	62	8	index$iv	I
    //   56	68	6	$this$indexOfFirst$iv	Ljava/util/List;
    //   252	50	15	currentKey	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
    //   201	118	12	i	I
    //   194	126	11	$i$a$-buildList-DefaultSelectableLazyColumnEventAction$onExtendSelectionToKey$keys$1	I
    //   191	129	10	$this$onExtendSelectionToKey_u24lambda_u244	Ljava/util/List;
    //   393	9	15	$i$a$-indexOfFirst-DefaultSelectableLazyColumnEventAction$onExtendSelectionToKey$1	I
    //   390	12	14	it	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
    //   383	30	13	item$iv	Ljava/lang/Object;
    //   352	65	10	$i$f$indexOfFirst	I
    //   355	62	11	index$iv	I
    //   349	68	9	$this$indexOfFirst$iv	Ljava/util/List;
    //   130	299	5	currentIndex	I
    //   149	280	6	lastFocussed	I
    //   182	247	7	indexInterval	Lkotlin/ranges/IntProgression;
    //   327	102	8	keys	Ljava/util/List;
    //   0	430	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnEventAction;
    //   0	430	1	key	Ljava/lang/Object;
    //   0	430	2	allKeys	Ljava/util/List;
    //   0	430	3	state	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
    //   0	430	4	selectionMode	Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\DefaultSelectableLazyColumnEventAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */