/*     */ package androidx.compose.ui.text;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*     */ import kotlin.jvm.internal.CharCompanionObject;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.IntRange;
/*     */ import kotlin.sequences.SequenceScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.BreakIterator;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000D\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\r\n\002\b\t\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\f\n\002\b\003\032\020\020\016\032\0020\001*\0060\001j\002`\bH\000\032\030\020\017\032\0060\001j\002`\b*\0020\t2\006\020\020\032\0020\001H\000\032\030\020\021\032\0060\001j\002`\b*\0020\t2\006\020\020\032\0020\001H\000\032\024\020\022\032\0020\001*\0020\0232\006\020\020\032\0020\001H\000\032\024\020\024\032\0020\001*\0020\0232\006\020\020\032\0020\001H\000\032\021\020\025\032\0020\026*\0020\tH\000¢\006\002\020\027\032\020\020\030\032\0020\031*\0060\001j\002`\bH\000\032 \020\032\032\0060\001j\002`\b*\0020\0332\006\020\034\032\0020\0352\006\020\036\032\0020\035H\002\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\005X\004¢\006\002\n\000\"\"\020\006\032\f\022\b\022\0060\001j\002`\b0\007*\0020\t8@X\004¢\006\006\032\004\b\n\020\013\"\"\020\f\032\f\022\b\022\0060\001j\002`\b0\007*\0020\t8BX\004¢\006\006\032\004\b\r\020\013*\f\b\000\020\037\"\0020\0012\0020\001¨\006 "}, d2 = {"MAX_CODE_POINT", "", "MIN_SUPPLEMENTARY_CODE_POINT", "POP_DIRECTIONAL_ISOLATE_CODE_POINT", "PUSH_DIRECTIONAL_ISOLATE_RANGE", "Lkotlin/ranges/IntRange;", "codePoints", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/text/CodePoint;", "", "getCodePoints", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "codePointsOutsideDirectionalIsolate", "getCodePointsOutsideDirectionalIsolate", "charCount", "codePointAt", "index", "codePointBefore", "findFollowingBreak", "", "findPrecedingBreak", "firstStrongDirectionType", "Landroidx/compose/ui/text/StrongDirectionType;", "(Ljava/lang/CharSequence;)I", "isSupplementaryCodePoint", "", "toCodePoint", "Lkotlin/Char$Companion;", "high", "", "low", "CodePoint", "ui-text"})
/*     */ public final class CharHelpers_skikoKt {
/*     */   private static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
/*     */   private static final int MAX_CODE_POINT = 1114111;
/*     */   
/*     */   public static final int findPrecedingBreak(@NotNull String $this$findPrecedingBreak, int index) {
/*  23 */     Intrinsics.checkNotNullParameter($this$findPrecedingBreak, "<this>"); BreakIterator it = BreakIterator.Companion.makeCharacterInstance$default(BreakIterator.Companion, null, 1, null);
/*  24 */     it.setText($this$findPrecedingBreak);
/*  25 */     return it.preceding(index);
/*     */   }
/*     */   
/*     */   public static final int findFollowingBreak(@NotNull String $this$findFollowingBreak, int index) {
/*  29 */     Intrinsics.checkNotNullParameter($this$findFollowingBreak, "<this>"); BreakIterator it = BreakIterator.Companion.makeCharacterInstance$default(BreakIterator.Companion, null, 1, null);
/*  30 */     it.setText($this$findFollowingBreak);
/*  31 */     return it.following(index);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int toCodePoint(CharCompanionObject $this$toCodePoint, char high, char low) {
/*  53 */     return (high - 55296 << 10 | low - 56320) + 65536;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int charCount(int $this$charCount) {
/*  65 */     return ($this$charCount >= 65536) ? 2 : 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean isSupplementaryCodePoint(int $this$isSupplementaryCodePoint) {
/*  71 */     return (65536 <= $this$isSupplementaryCodePoint) ? (($this$isSupplementaryCodePoint < 1114112)) : false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int firstStrongDirectionType(@NotNull CharSequence $this$firstStrongDirectionType) {
/*  81 */     Intrinsics.checkNotNullParameter($this$firstStrongDirectionType, "<this>"); for (Iterator<Number> iterator = getCodePointsOutsideDirectionalIsolate($this$firstStrongDirectionType).iterator(); iterator.hasNext(); ) { int codePoint = ((Number)iterator.next()).intValue();
/*  82 */       int strongDirectionType = CharHelpers_jvmKt.strongDirectionType(codePoint);
/*  83 */       if (!StrongDirectionType.equals-impl0(strongDirectionType, StrongDirectionType.Companion.getNone-JKYp3V4())) {
/*  84 */         return strongDirectionType;
/*     */       } }
/*     */     
/*  87 */     return StrongDirectionType.Companion.getNone-JKYp3V4();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  95 */   private static final IntRange PUSH_DIRECTIONAL_ISOLATE_RANGE = new IntRange(8294, 8296);
/*     */   
/*     */   private static final int POP_DIRECTIONAL_ISOLATE_CODE_POINT = 8297;
/*     */ 
/*     */   
/*     */   private static final Sequence<Integer> getCodePointsOutsideDirectionalIsolate(CharSequence $this$codePointsOutsideDirectionalIsolate)
/*     */   {
/* 102 */     return SequencesKt.sequence(new CharHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1($this$codePointsOutsideDirectionalIsolate, null)); } @DebugMetadata(f = "CharHelpers.skiko.kt", l = {112}, i = {0, 0}, s = {"L$0", "I$0"}, n = {"$this$sequence", "openIsolateCount"}, m = "invokeSuspend", c = "androidx.compose.ui.text.CharHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\030\002\n\002\020\b\n\002\030\002\020\000\032\0020\001*\f\022\b\022\0060\003j\002`\0040\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/ui/text/CodePoint;"}) static final class CharHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> { Object L$1; int I$0; int label; CharHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1(CharSequence $receiver, Continuation $completion) { super(2, $completion); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super CharHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1> $completion) { CharHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1 charHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1 = new CharHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1(this.$this_codePointsOutsideDirectionalIsolate, $completion); charHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1.L$0 = value; return (Continuation<Unit>)charHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1; } @Nullable public final Object invokeSuspend(@NotNull Object $result) { SequenceScope $this$sequence; int openIsolateCount; Iterator<Number> iterator; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$sequence = (SequenceScope)this.L$0;
/* 103 */           openIsolateCount = 0;
/* 104 */           iterator = CharHelpers_skikoKt.getCodePoints(this.$this_codePointsOutsideDirectionalIsolate).iterator(); while (true) { if (iterator.hasNext()) { int codePoint = ((Number)iterator.next()).intValue();
/* 105 */               IntRange intRange = CharHelpers_skikoKt.PUSH_DIRECTIONAL_ISOLATE_RANGE; int i = intRange.getFirst(); if ((codePoint <= intRange.getLast()) ? ((i <= codePoint)) : false) {
/* 106 */                 openIsolateCount++; continue;
/* 107 */               }  if (codePoint == 8297) {
/* 108 */                 if (openIsolateCount > 0)
/* 109 */                   openIsolateCount--;  continue;
/*     */               } 
/* 111 */               if (openIsolateCount == 0)
/* 112 */               { this.L$0 = $this$sequence; this.L$1 = iterator; this.I$0 = openIsolateCount; this.label = 1; if ($this$sequence.yield(Boxing.boxInt(codePoint), (Continuation)this) == object) return object;  } else { continue; }  } else { break; }  $this$sequence.yield(Boxing.boxInt(codePoint), (Continuation)this); }
/*     */ 
/*     */           
/* 115 */           return Unit.INSTANCE;
/*     */         case 1: openIsolateCount = this.I$0; iterator = (Iterator<Number>)this.L$1; $this$sequence = (SequenceScope)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); continue; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @Nullable public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) { return ((CharHelpers_skikoKt$codePointsOutsideDirectionalIsolate$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 117 */    @NotNull public static final Sequence<Integer> getCodePoints(@NotNull CharSequence $this$codePoints) { Intrinsics.checkNotNullParameter($this$codePoints, "<this>"); return SequencesKt.sequence(new CharHelpers_skikoKt$codePoints$1($this$codePoints, null)); } @DebugMetadata(f = "CharHelpers.skiko.kt", l = {121}, i = {0, 0, 0}, s = {"L$0", "I$0", "I$1"}, n = {"$this$sequence", "index", "codePoint"}, m = "invokeSuspend", c = "androidx.compose.ui.text.CharHelpers_skikoKt$codePoints$1")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\030\002\n\002\020\b\n\002\030\002\020\000\032\0020\001*\f\022\b\022\0060\003j\002`\0040\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/ui/text/CodePoint;"})
/*     */   static final class CharHelpers_skikoKt$codePoints$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
/*     */     int I$0; int I$1; int label; CharHelpers_skikoKt$codePoints$1(CharSequence $receiver, Continuation $completion) { super(2, $completion); }
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 152, 0 -> 32, 1 -> 112
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast kotlin/sequences/SequenceScope
/*     */       //   43: astore_2
/*     */       //   44: iconst_0
/*     */       //   45: istore_3
/*     */       //   46: iload_3
/*     */       //   47: aload_0
/*     */       //   48: getfield $this_codePoints : Ljava/lang/CharSequence;
/*     */       //   51: invokeinterface length : ()I
/*     */       //   56: if_icmpge -> 148
/*     */       //   59: aload_0
/*     */       //   60: getfield $this_codePoints : Ljava/lang/CharSequence;
/*     */       //   63: iload_3
/*     */       //   64: invokestatic codePointAt : (Ljava/lang/CharSequence;I)I
/*     */       //   67: istore #4
/*     */       //   69: aload_2
/*     */       //   70: iload #4
/*     */       //   72: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */       //   75: aload_0
/*     */       //   76: checkcast kotlin/coroutines/Continuation
/*     */       //   79: aload_0
/*     */       //   80: aload_2
/*     */       //   81: putfield L$0 : Ljava/lang/Object;
/*     */       //   84: aload_0
/*     */       //   85: iload_3
/*     */       //   86: putfield I$0 : I
/*     */       //   89: aload_0
/*     */       //   90: iload #4
/*     */       //   92: putfield I$1 : I
/*     */       //   95: aload_0
/*     */       //   96: iconst_1
/*     */       //   97: putfield label : I
/*     */       //   100: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   103: dup
/*     */       //   104: aload #5
/*     */       //   106: if_acmpne -> 136
/*     */       //   109: aload #5
/*     */       //   111: areturn
/*     */       //   112: aload_0
/*     */       //   113: getfield I$1 : I
/*     */       //   116: istore #4
/*     */       //   118: aload_0
/*     */       //   119: getfield I$0 : I
/*     */       //   122: istore_3
/*     */       //   123: aload_0
/*     */       //   124: getfield L$0 : Ljava/lang/Object;
/*     */       //   127: checkcast kotlin/sequences/SequenceScope
/*     */       //   130: astore_2
/*     */       //   131: aload_1
/*     */       //   132: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   135: aload_1
/*     */       //   136: pop
/*     */       //   137: iload_3
/*     */       //   138: iload #4
/*     */       //   140: invokestatic charCount : (I)I
/*     */       //   143: iadd
/*     */       //   144: istore_3
/*     */       //   145: goto -> 46
/*     */       //   148: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   151: areturn
/*     */       //   152: new java/lang/IllegalStateException
/*     */       //   155: dup
/*     */       //   156: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   158: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   161: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #117	-> 3
/*     */       //   #118	-> 44
/*     */       //   #119	-> 46
/*     */       //   #120	-> 59
/*     */       //   #121	-> 69
/*     */       //   #117	-> 109
/*     */       //   #122	-> 136
/*     */       //   #124	-> 148
/*     */       //   #117	-> 152
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	68	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   131	21	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   46	66	3	index	I
/*     */       //   123	29	3	index	I
/*     */       //   69	43	4	codePoint	I
/*     */       //   118	27	4	codePoint	I
/*     */       //   36	116	0	this	Landroidx/compose/ui/text/CharHelpers_skikoKt$codePoints$1;
/*     */       //   36	116	1	$result	Ljava/lang/Object; }
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super CharHelpers_skikoKt$codePoints$1> $completion) { CharHelpers_skikoKt$codePoints$1 charHelpers_skikoKt$codePoints$1 = new CharHelpers_skikoKt$codePoints$1(this.$this_codePoints, $completion);
/*     */       charHelpers_skikoKt$codePoints$1.L$0 = value;
/*     */       return (Continuation<Unit>)charHelpers_skikoKt$codePoints$1; }
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) { return ((CharHelpers_skikoKt$codePoints$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */   public static final int codePointAt(@NotNull CharSequence $this$codePointAt, int index) {
/* 130 */     Intrinsics.checkNotNullParameter($this$codePointAt, "<this>"); char high = $this$codePointAt.charAt(index);
/* 131 */     if (Character.isHighSurrogate(high) && index + 1 < $this$codePointAt.length()) {
/* 132 */       char low = $this$codePointAt.charAt(index + 1);
/* 133 */       if (Character.isLowSurrogate(low)) {
/* 134 */         return toCodePoint(CharCompanionObject.INSTANCE, high, low);
/*     */       }
/*     */     } 
/* 137 */     return high;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int codePointBefore(@NotNull CharSequence $this$codePointBefore, int index) {
/* 144 */     Intrinsics.checkNotNullParameter($this$codePointBefore, "<this>"); char low = $this$codePointBefore.charAt(index);
/* 145 */     if (Character.isLowSurrogate(low) && index - 1 >= 0) {
/* 146 */       char high = $this$codePointBefore.charAt(index - 1);
/* 147 */       if (Character.isHighSurrogate(high)) {
/* 148 */         return toCodePoint(CharCompanionObject.INSTANCE, high, low);
/*     */       }
/*     */     } 
/* 151 */     return low;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\CharHelpers_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */