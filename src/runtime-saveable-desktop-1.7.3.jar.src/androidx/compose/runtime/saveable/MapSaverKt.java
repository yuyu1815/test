/*    */ package androidx.compose.runtime.saveable;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020$\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\032x\020\000\032\016\022\004\022\002H\002\022\004\022\0020\0030\001\"\004\b\000\020\0022:\020\004\0326\022\004\022\0020\006\022\023\022\021H\002¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\022\022\020\022\004\022\0020\013\022\006\022\004\030\0010\0030\n0\005¢\006\002\b\f2\"\020\r\032\036\022\022\022\020\022\004\022\0020\013\022\006\022\004\030\0010\0030\n\022\006\022\004\030\001H\0020\016¨\006\017"}, d2 = {"mapSaver", "Landroidx/compose/runtime/saveable/Saver;", "T", "", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "", "", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "runtime-saveable"})
/*    */ public final class MapSaverKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> Saver<T, Object> mapSaver(@NotNull Function2<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> save, @NotNull Function1<? super Map<String, ? extends Object>, ? extends T> restore) {
/* 33 */     Intrinsics.checkNotNullParameter(save, "save"); Intrinsics.checkNotNullParameter(restore, "restore"); return ListSaverKt.listSaver(new MapSaverKt$mapSaver$1(save), new MapSaverKt$mapSaver$2(restore)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020 \n\002\020\000\n\000\n\002\030\002\n\002\b\003\020\000\032\n\022\006\022\004\030\0010\0020\001\"\004\b\000\020\003*\0020\0042\006\020\005\032\002H\003H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "", "T", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/util/List;"}) @SourceDebugExtension({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n215#2,2:56\n*S KotlinDebug\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n*L\n36#1:56,2\n*E\n"})
/*    */   static final class MapSaverKt$mapSaver$1 extends Lambda implements Function2<SaverScope, T, List<? extends Object>> { @NotNull
/* 35 */     public final List<Object> invoke(@NotNull SaverScope $this$listSaver, Object it) { Intrinsics.checkNotNullParameter($this$listSaver, "$this$listSaver"); ArrayList<Object> arrayList = new ArrayList(); Function2<SaverScope, T, Map<String, Object>> function2 = this.$save; List<Object> $this$invoke_u24lambda_u241 = arrayList; int $i$a$-apply-MapSaverKt$mapSaver$1$1 = 0;
/* 36 */       Map $this$forEach$iv = (Map)function2.invoke($this$listSaver, it); int $i$f$forEach = 0;
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
/*    */ 
/*    */       
/* 56 */       Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry = element$iv; int $i$a$-forEach-MapSaverKt$mapSaver$1$1$1 = 0;
/*    */         $this$invoke_u24lambda_u241.add(entry.getKey());
/*    */         $this$invoke_u24lambda_u241.add(entry.getValue()); }
/*    */       
/*    */       return arrayList; }
/*    */ 
/*    */     
/*    */     MapSaverKt$mapSaver$1(Function2<SaverScope, T, Map<String, Object>> $save) {
/*    */       super(2);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\002\b\003\n\002\020 \n\002\020\000\n\002\b\002\020\000\032\004\030\001H\001\"\004\b\000\020\0012\016\020\002\032\n\022\006\022\004\030\0010\0040\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "T", "list", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Object;"})
/*    */   @SourceDebugExtension({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
/*    */   static final class MapSaverKt$mapSaver$2 extends Lambda implements Function1<List<? extends Object>, T> {
/*    */     @Nullable
/*    */     public final T invoke(@NotNull List list) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'list'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: new java/util/LinkedHashMap
/*    */       //   9: dup
/*    */       //   10: invokespecial <init> : ()V
/*    */       //   13: checkcast java/util/Map
/*    */       //   16: astore_2
/*    */       //   17: aload_1
/*    */       //   18: invokeinterface size : ()I
/*    */       //   23: iconst_2
/*    */       //   24: irem
/*    */       //   25: ifne -> 32
/*    */       //   28: iconst_1
/*    */       //   29: goto -> 33
/*    */       //   32: iconst_0
/*    */       //   33: ifne -> 56
/*    */       //   36: iconst_0
/*    */       //   37: istore #4
/*    */       //   39: ldc 'non-zero remainder'
/*    */       //   41: astore #4
/*    */       //   43: new java/lang/IllegalStateException
/*    */       //   46: dup
/*    */       //   47: aload #4
/*    */       //   49: invokevirtual toString : ()Ljava/lang/String;
/*    */       //   52: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   55: athrow
/*    */       //   56: iconst_0
/*    */       //   57: istore_3
/*    */       //   58: iload_3
/*    */       //   59: aload_1
/*    */       //   60: invokeinterface size : ()I
/*    */       //   65: if_icmpge -> 115
/*    */       //   68: aload_1
/*    */       //   69: iload_3
/*    */       //   70: invokeinterface get : (I)Ljava/lang/Object;
/*    */       //   75: dup
/*    */       //   76: ldc 'null cannot be cast to non-null type kotlin.String'
/*    */       //   78: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   81: checkcast java/lang/String
/*    */       //   84: astore #4
/*    */       //   86: aload_1
/*    */       //   87: iload_3
/*    */       //   88: iconst_1
/*    */       //   89: iadd
/*    */       //   90: invokeinterface get : (I)Ljava/lang/Object;
/*    */       //   95: astore #5
/*    */       //   97: aload_2
/*    */       //   98: aload #4
/*    */       //   100: aload #5
/*    */       //   102: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   107: pop
/*    */       //   108: iinc #3, 2
/*    */       //   111: nop
/*    */       //   112: goto -> 58
/*    */       //   115: aload_0
/*    */       //   116: getfield $restore : Lkotlin/jvm/functions/Function1;
/*    */       //   119: aload_2
/*    */       //   120: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   125: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #43	-> 6
/*    */       //   #43	-> 16
/*    */       //   #44	-> 17
/*    */       //   #56	-> 36
/*    */       //   #44	-> 39
/*    */       //   #44	-> 41
/*    */       //   #45	-> 56
/*    */       //   #46	-> 58
/*    */       //   #47	-> 68
/*    */       //   #48	-> 86
/*    */       //   #49	-> 97
/*    */       //   #50	-> 111
/*    */       //   #52	-> 115
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   39	2	4	$i$a$-check-MapSaverKt$mapSaver$2$1	I
/*    */       //   86	26	4	key	Ljava/lang/String;
/*    */       //   97	15	5	value	Ljava/lang/Object;
/*    */       //   17	109	2	map	Ljava/util/Map;
/*    */       //   58	68	3	index	I
/*    */       //   0	126	0	this	Landroidx/compose/runtime/saveable/MapSaverKt$mapSaver$2;
/*    */       //   0	126	1	list	Ljava/util/List;
/*    */     }
/*    */     
/*    */     MapSaverKt$mapSaver$2(Function1<Map<String, ? extends Object>, T> $restore) {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\MapSaverKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */