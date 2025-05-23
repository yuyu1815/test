/*      */ package androidx.collection;
/*      */ 
/*      */ import androidx.annotation.IntRange;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.CollectionToArray;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.jvm.internal.markers.KMutableList;
/*      */ import kotlin.jvm.internal.markers.KMutableListIterator;
/*      */ import kotlin.ranges.IntRange;
/*      */ import kotlin.ranges.RangesKt;
/*      */ import kotlin.sequences.Sequence;
/*      */ import kotlin.sequences.SequencesKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\004\n\002\030\002\n\002\020\021\n\002\b\002\n\002\020\036\n\002\020\034\n\002\020 \n\002\030\002\n\002\b\002\n\002\020!\n\002\b\f\n\002\030\002\n\002\030\002\n\002\b\r\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\003678B\017\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\023\020\013\032\0020\f2\006\020\r\032\0028\000¢\006\002\020\016J\035\020\013\032\0020\0172\b\b\001\020\020\032\0020\0042\006\020\r\032\0028\000¢\006\002\020\021J\024\020\022\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\002J\024\020\022\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\024J\031\020\022\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\025¢\006\002\020\026J\036\020\022\032\0020\f2\b\b\001\020\020\032\0020\0042\f\020\023\032\b\022\004\022\0028\0000\002J#\020\022\032\0020\f2\b\b\001\020\020\032\0020\0042\f\020\023\032\b\022\004\022\0028\0000\025¢\006\002\020\027J\036\020\022\032\0020\f2\b\b\001\020\020\032\0020\0042\f\020\023\032\b\022\004\022\0028\0000\030J\024\020\022\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\031J\024\020\022\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\032J\024\020\022\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\033J\016\020\034\032\b\022\004\022\0028\0000\032H\026J\f\020\035\032\b\022\004\022\0028\0000\036J\006\020\037\032\0020\017J\016\020 \032\0020\0172\006\020\006\032\0020\004J\026\020!\032\0020\0172\006\020\r\032\0028\000H\n¢\006\002\020\"J\027\020!\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\002H\002J\027\020!\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\024H\002J\034\020!\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\025H\002¢\006\002\020#J\027\020!\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\031H\002J\027\020!\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\032H\002J\027\020!\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\033H\002J\026\020$\032\0020\0172\006\020\r\032\0028\000H\n¢\006\002\020\"J\027\020$\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\002H\002J\027\020$\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\024H\002J\034\020$\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\025H\002¢\006\002\020#J\027\020$\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\031H\002J\027\020$\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\032H\002J\027\020$\032\0020\0172\f\020\023\032\b\022\004\022\0028\0000\033H\002J\023\020%\032\0020\f2\006\020\r\032\0028\000¢\006\002\020\016J\024\020&\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\002J\024\020&\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\024J\031\020&\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\025¢\006\002\020\026J\024\020&\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\031J\024\020&\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\032J\024\020&\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\033J\025\020'\032\0028\0002\b\b\001\020\020\032\0020\004¢\006\002\020(J/\020)\032\0020\0172!\020*\032\035\022\023\022\0218\000¢\006\f\b,\022\b\b-\022\004\b\b(\r\022\004\022\0020\f0+H\bø\001\000J\032\020.\032\0020\0172\b\b\001\020/\032\0020\0042\b\b\001\0200\032\0020\004J\024\0201\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\002J\031\0201\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\025¢\006\002\020\026J\024\0201\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\030J\024\0201\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\031J\024\0201\032\0020\f2\f\020\023\032\b\022\004\022\0028\0000\033J \0202\032\0028\0002\b\b\001\020\020\032\0020\0042\006\020\r\032\0028\000H\002¢\006\002\0203J\020\0204\032\0020\0172\b\b\002\0205\032\0020\004R\022\020\006\032\0020\0048Æ\002¢\006\006\032\004\b\007\020\bR\026\020\t\032\n\022\004\022\0028\000\030\0010\nX\016¢\006\002\n\000\002\007\n\005\b20\001¨\0069"}, d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "list", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)Z", "(I[Ljava/lang/Object;)Z", "", "", "", "Lkotlin/sequences/Sequence;", "asList", "asMutableList", "", "clear", "ensureCapacity", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)Ljava/lang/Object;", "removeIf", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "removeRange", "start", "end", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "trim", "minCapacity", "MutableObjectListIterator", "ObjectListMutableList", "SubList", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1810#4:1633\n1672#4:1637\n1810#4:1683\n1672#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
/*      */ public final class MutableObjectList<E>
/*      */   extends ObjectList<E>
/*      */ {
/*      */   @Nullable
/*      */   private ObjectListMutableList<E> list;
/*      */   
/*      */   public MutableObjectList(int initialCapacity) {
/*  642 */     super(initialCapacity, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getCapacity() {
/*  652 */     int $i$f$getCapacity = 0; return this.content.length;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean add(Object element) {
/*  658 */     ensureCapacity(this._size + 1);
/*  659 */     this.content[this._size] = element;
/*  660 */     int i = this._size; this._size = i + 1;
/*  661 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void add(@IntRange(from = 0L) int index, Object element) {
/*  670 */     if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0)) {
/*  671 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
/*      */     }
/*  673 */     ensureCapacity(this._size + 1);
/*  674 */     Object[] content = this.content;
/*  675 */     if (index != this._size) {
/*  676 */       ArraysKt.copyInto(content, 
/*  677 */           content, 
/*  678 */           index + 1, 
/*  679 */           index, 
/*  680 */           this._size);
/*      */     }
/*      */     
/*  683 */     content[index] = element;
/*  684 */     int i = this._size; this._size = i + 1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean addAll(@IntRange(from = 0L) int index, @NotNull Object[] elements) {
/*  697 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0)) {
/*  698 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
/*      */     }
/*  700 */     if ((elements.length == 0)) return false; 
/*  701 */     ensureCapacity(this._size + elements.length);
/*  702 */     Object[] content = this.content;
/*  703 */     if (index != this._size) {
/*  704 */       ArraysKt.copyInto(content, 
/*  705 */           content, 
/*  706 */           index + elements.length, 
/*  707 */           index, 
/*  708 */           this._size);
/*      */     }
/*      */     
/*  711 */     ArraysKt.copyInto$default(elements, content, index, 0, 0, 12, null);
/*  712 */     this._size += elements.length;
/*  713 */     return true;
/*      */   } public final boolean addAll(@IntRange(from = 0L) int index, @NotNull ObjectList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0))
/*      */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);  if (elements.isEmpty())
/*      */       return false;  ensureCapacity(this._size + elements._size); Object[] content = this.content; if (index != this._size)
/*      */       ArraysKt.copyInto(content, content, index + elements._size, index, this._size);  ArraysKt.copyInto(elements.content, content, index, 0, elements._size); this._size += elements._size; return true; } public final boolean addAll(@NotNull ObjectList<E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; plusAssign(elements); return (oldSize != this._size); }
/*      */   public final boolean addAll(@NotNull ScatterSet<E> elements) { Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     int oldSize = this._size;
/*      */     plusAssign(elements);
/*      */     return (oldSize != this._size); }
/*      */   public final boolean addAll(@NotNull Object[] elements) { Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     int oldSize = this._size;
/*      */     plusAssign((E[])elements);
/*      */     return (oldSize != this._size); }
/*  726 */   public final boolean addAll(@IntRange(from = 0L) int index, @NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0)) {
/*  727 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
/*      */     }
/*  729 */     if (elements.isEmpty()) return false; 
/*  730 */     ensureCapacity(this._size + elements.size());
/*  731 */     Object[] content = this.content;
/*  732 */     if (index != this._size) {
/*  733 */       ArraysKt.copyInto(content, 
/*  734 */           content, 
/*  735 */           index + elements.size(), 
/*  736 */           index, 
/*  737 */           this._size);
/*      */     }
/*      */     
/*  740 */     Iterable $this$forEachIndexed$iv = elements; int $i$f$forEachIndexed = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1619 */     int index$iv = 0;
/* 1620 */     Iterator iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int j = index$iv++; if (j < 0) CollectionsKt.throwIndexOverflow();  Object object1 = item$iv; int i = j, $i$a$-forEachIndexed-MutableObjectList$addAll$1 = 0; content[index + i] = object1; }  this._size += elements.size(); return true; } public final boolean addAll(@NotNull List<? extends E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; plusAssign(elements); return (oldSize != this._size); } public final boolean addAll(@NotNull Iterable<? extends E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; plusAssign(elements); return (oldSize != this._size); }
/*      */   public final boolean addAll(@NotNull Sequence<? extends E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; plusAssign(elements); return (oldSize != this._size); }
/*      */   public final void plusAssign(@NotNull ObjectList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); if (elements.isEmpty()) return;  ensureCapacity(this._size + elements._size); Object[] content = this.content; ArraysKt.copyInto(elements.content, content, this._size, 0, elements._size); this._size += elements._size; }
/* 1623 */   public final void plusAssign(@NotNull ScatterSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); if (elements.isEmpty()) return;  ensureCapacity(this._size + elements.getSize()); ScatterSet this_$iv = elements; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*      */     
/* 1625 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1627 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1628 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1630 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 1631 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1632 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1633 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 1634 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1635 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1646 */           if (bitCount$iv$iv == 8) continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 237 }  } else {  }  } public final void plusAssign(@NotNull Object[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); if ((elements.length == 0))
/*      */       return;  ensureCapacity(this._size + elements.length); Object[] content = this.content; ArraysKt.copyInto$default(elements, content, this._size, 0, 0, 12, null); this._size += elements.length; }
/*      */   public final void plusAssign(@NotNull List elements) { Intrinsics.checkNotNullParameter(elements, "elements"); if (elements.isEmpty())
/*      */       return;  int size = this._size; ensureCapacity(size + elements.size()); Object[] content = this.content; for (int i = 0, j = elements.size(); i < j; i++)
/*      */       content[i + size] = elements.get(i);  this._size += elements.size(); }
/* 1651 */   public final void plusAssign(@NotNull Iterable elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Iterable $this$forEach$iv = elements; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-MutableObjectList$plusAssign$2 = 0; MutableObjectList<Object> this_$iv = this; int $i$f$plusAssign = 0;
/* 1652 */       this_$iv.add(element); }
/*      */      } public final void plusAssign(@NotNull Sequence elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Sequence $this$forEach$iv = elements;
/*      */     int $i$f$forEach = 0;
/* 1655 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-MutableObjectList$plusAssign$3 = 0; MutableObjectList<Object> this_$iv = this; int $i$f$plusAssign = 0;
/* 1656 */       this_$iv.add(element); }
/*      */      } public final void clear() { ArraysKt.fill(this.content, null, 0, this._size); this._size = 0; }
/*      */   public final void trim(int minCapacity) { int minSize = Math.max(minCapacity, this._size); MutableObjectList this_$iv = this; int $i$f$getCapacity = 0;
/* 1659 */     if (this_$iv.content.length > minSize) { Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.content, minSize), "copyOf(this, newSize)"); this.content = Arrays.copyOf(this.content, minSize); }  } public final void ensureCapacity(int capacity) { Object[] oldContent = this.content; if (oldContent.length < capacity) { int newSize = Math.max(capacity, oldContent.length * 3 / 2); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(oldContent, newSize), "copyOf(this, newSize)"); this.content = Arrays.copyOf(oldContent, newSize); }  } public final void plusAssign(Object element) { int $i$f$plusAssign = 0; add((E)element); } public final void minusAssign(Object element) { int $i$f$minusAssign = 0; remove((E)element); } public final boolean remove(Object element) { int index = indexOf((E)element); if (index >= 0) { removeAt(index); return true; }  return false; }
/* 1660 */   public final void removeIf(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$removeIf = 0, gap = 0; int size = this._size; Object[] content = this.content; ObjectList this_$iv = this; int $i$f$getIndices = 0; IntRange intRange = RangesKt.until(0, this_$iv._size); int i = intRange.getFirst(); $i$f$getIndices = intRange.getLast(); if (i <= $i$f$getIndices) while (true) { content[i - gap] = content[i]; if (((Boolean)predicate.invoke(content[i])).booleanValue()) gap++;  if (i != $i$f$getIndices) { i++; continue; }  break; }   ArraysKt.fill(content, null, size - gap, size); this._size -= gap; }
/* 1661 */   public final boolean removeAll(@NotNull Object[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; for (int i = 0, j = elements.length; i < j; i++) remove((E)elements[i]);  return (initialSize != this._size); } public final boolean removeAll(@NotNull ObjectList<E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; minusAssign(elements); return (initialSize != this._size); } public final boolean removeAll(@NotNull ScatterSet<E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; minusAssign(elements); return (initialSize != this._size); } public final void minusAssign(@NotNull Object[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Object[] $this$forEach$iv = elements; int $i$f$forEach = 0; byte b = 0; int i = $this$forEach$iv.length; if (b < i) { Object element$iv = $this$forEach$iv[b], element = element$iv; int $i$a$-forEach-MutableObjectList$minusAssign$1 = 0; MutableObjectList<Object> this_$iv = this; int $i$f$minusAssign = 0;
/* 1662 */       this_$iv.remove(element); }
/*      */      }
/*      */   public final boolean removeAll(@NotNull List<? extends E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; minusAssign(elements); return (initialSize != this._size); }
/*      */   public final boolean removeAll(@NotNull Iterable<? extends E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; minusAssign(elements); return (initialSize != this._size); }
/* 1666 */   public final boolean removeAll(@NotNull Sequence<? extends E> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; minusAssign(elements); return (initialSize != this._size); } public final void minusAssign(@NotNull ObjectList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); ObjectList this_$iv = elements; int $i$f$forEach = 0; Object[] content$iv = this_$iv.content;
/* 1667 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 1668 */       Object element = content$iv[i$iv]; int $i$a$-forEach-MutableObjectList$minusAssign$2 = 0; MutableObjectList<Object> mutableObjectList = this; int $i$f$minusAssign = 0;
/* 1669 */       mutableObjectList.remove(element);
/*      */     }  } public final void minusAssign(@NotNull ScatterSet elements) { Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     ScatterSet this_$iv = elements;
/*      */     int $i$f$forEach = 0;
/* 1673 */     Object[] k$iv = this_$iv.elements;
/*      */     
/* 1675 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/* 1677 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1678 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1680 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1681 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1682 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1683 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1684 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1685 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1696 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break;
/*      */         }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 216
/*      */       }  }
/*      */     else {  }
/*      */      } public final void minusAssign(@NotNull List elements) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc 'elements'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: iconst_0
/*      */     //   7: istore_2
/*      */     //   8: aload_1
/*      */     //   9: invokeinterface size : ()I
/*      */     //   14: istore_3
/*      */     //   15: iload_2
/*      */     //   16: iload_3
/*      */     //   17: if_icmpge -> 50
/*      */     //   20: aload_0
/*      */     //   21: astore #4
/*      */     //   23: aload_1
/*      */     //   24: iload_2
/*      */     //   25: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   30: astore #5
/*      */     //   32: iconst_0
/*      */     //   33: istore #6
/*      */     //   35: aload #4
/*      */     //   37: aload #5
/*      */     //   39: invokevirtual remove : (Ljava/lang/Object;)Z
/*      */     //   42: pop
/*      */     //   43: nop
/*      */     //   44: iinc #2, 1
/*      */     //   47: goto -> 15
/*      */     //   50: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1076	-> 6
/*      */     //   #1077	-> 20
/*      */     //   #1701	-> 35
/*      */     //   #1702	-> 43
/*      */     //   #1076	-> 44
/*      */     //   #1079	-> 50
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   35	9	6	$i$f$minusAssign	I
/*      */     //   32	12	4	this_$iv	Landroidx/collection/MutableObjectList;
/*      */     //   32	12	5	element$iv	Ljava/lang/Object;
/*      */     //   8	42	2	i	I
/*      */     //   0	51	0	this	Landroidx/collection/MutableObjectList;
/*      */     //   0	51	1	elements	Ljava/util/List; }
/* 1703 */   public final void minusAssign(@NotNull Iterable elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Iterable $this$forEach$iv = elements; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-MutableObjectList$minusAssign$4 = 0; MutableObjectList<Object> this_$iv = this; int $i$f$minusAssign = 0;
/* 1704 */       this_$iv.remove(element); }
/*      */      } public final void minusAssign(@NotNull Sequence elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Sequence $this$forEach$iv = elements;
/*      */     int $i$f$forEach = 0;
/* 1707 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-MutableObjectList$minusAssign$5 = 0; MutableObjectList<Object> this_$iv = this; int $i$f$minusAssign = 0;
/* 1708 */       this_$iv.remove(element); }
/*      */      } public final E removeAt(@IntRange(from = 0L) int index) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) {
/*      */       ObjectList objectList = this; int j = 0;
/* 1711 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (objectList._size - 1));
/* 1712 */     }  Object[] content = this.content; Object element = content[index]; ObjectList this_$iv = this; int $i$f$getLastIndex = 0; if (index != this_$iv._size - 1) ArraysKt.copyInto(content, content, index, index + 1, this._size);  int i = this._size; this._size = i + -1; content[this._size] = null; return (E)element; } public final void removeRange(@IntRange(from = 0L) int start, @IntRange(from = 0L) int end) { if ((0 <= start) ? ((start <= this._size)) : false) if ((0 <= end) ? ((end <= this._size)) : false) { if (end < start) throw new IllegalArgumentException("Start (" + start + ") is more than end (" + end + ')');  if (end != start) { if (end < this._size) ArraysKt.copyInto(this.content, this.content, start, end, this._size);  int newSize = this._size - end - start; ArraysKt.fill(this.content, null, newSize, this._size); this._size = newSize; }  return; }   throw new IndexOutOfBoundsException("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size); }
/* 1713 */   public final boolean retainAll(@NotNull Object[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; Object[] content = this.content; int i; ObjectList this_$iv; int $i$f$getLastIndex; for (this_$iv = this, $i$f$getLastIndex = 0, i = this_$iv._size - 1; -1 < i; i--) { Object element = content[i]; if (ArraysKt.indexOf(elements, element) < 0)
/* 1714 */         removeAt(i);  }  return (initialSize != this._size); } public final boolean retainAll(@NotNull ObjectList<Object> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; Object[] content = this.content; int i; ObjectList this_$iv; int $i$f$getLastIndex; for (this_$iv = this, $i$f$getLastIndex = 0, i = this_$iv._size - 1; -1 < i; i--) { Object element = content[i]; if (!elements.contains(element))
/* 1715 */         removeAt(i);  }  return (initialSize != this._size); } public final boolean retainAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; Object[] content = this.content; int i; ObjectList this_$iv; int $i$f$getLastIndex; for (this_$iv = this, $i$f$getLastIndex = 0, i = this_$iv._size - 1; -1 < i; i--) { Object element = content[i]; if (!elements.contains(element))
/* 1716 */         removeAt(i);  }  return (initialSize != this._size); } public final boolean retainAll(@NotNull Iterable elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; Object[] content = this.content; int i; ObjectList this_$iv; int $i$f$getLastIndex; for (this_$iv = this, $i$f$getLastIndex = 0, i = this_$iv._size - 1; -1 < i; i--) { Object element = content[i]; if (!CollectionsKt.contains(elements, element))
/* 1717 */         removeAt(i);  }  return (initialSize != this._size); } public final boolean retainAll(@NotNull Sequence elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; Object[] content = this.content; int i; ObjectList this_$iv; int $i$f$getLastIndex; for (this_$iv = this, $i$f$getLastIndex = 0, i = this_$iv._size - 1; -1 < i; i--) { Object element = content[i]; if (!SequencesKt.contains(elements, element))
/* 1718 */         removeAt(i);  }  return (initialSize != this._size); } public final E set(@IntRange(from = 0L) int index, Object element) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) { ObjectList this_$iv = this; int $i$f$getLastIndex = 0; throw new IndexOutOfBoundsException("set index " + index + " must be between 0 .. " + (this_$iv._size - 1)); }
/*      */     
/*      */     Object[] content = this.content;
/*      */     Object old = content[index];
/*      */     content[index] = element;
/*      */     return (E)old; }
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public List<E> asList() {
/*      */     return asMutableList();
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final List<E> asMutableList() {
/*      */     ObjectListMutableList<E> objectListMutableList1 = new ObjectListMutableList(this), it = objectListMutableList1;
/*      */     int $i$a$-also-MutableObjectList$asMutableList$1 = 0;
/*      */     this.list = it;
/*      */     return (this.list != null) ? this.list : objectListMutableList1;
/*      */   }
/*      */   
/*      */   public MutableObjectList() {
/*      */     this(0, 1, (DefaultConstructorMarker)null);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020+\n\000\n\002\020!\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\t\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B\033\022\f\020\003\032\b\022\004\022\0028\0010\004\022\006\020\005\032\0020\006¢\006\002\020\007J\025\020\t\032\0020\n2\006\020\013\032\0028\001H\026¢\006\002\020\fJ\t\020\r\032\0020\016H\002J\b\020\017\032\0020\016H\026J\016\020\020\032\0028\001H\002¢\006\002\020\021J\b\020\022\032\0020\006H\026J\r\020\023\032\0028\001H\026¢\006\002\020\021J\b\020\024\032\0020\006H\026J\b\020\025\032\0020\nH\026J\025\020\026\032\0020\n2\006\020\013\032\0028\001H\026¢\006\002\020\fR\024\020\003\032\b\022\004\022\0028\0010\004X\004¢\006\002\n\000R\016\020\b\032\0020\006X\016¢\006\002\n\000¨\006\027"}, d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", "T", "", "list", "", "index", "", "(Ljava/util/List;I)V", "prevIndex", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "collection"})
/*      */   private static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {
/*      */     @NotNull
/*      */     private final List<T> list;
/*      */     private int prevIndex;
/*      */     
/*      */     public MutableObjectListIterator(@NotNull List<T> list, int index) {
/*      */       this.list = list;
/*      */       this.prevIndex = index - 1;
/*      */     }
/*      */     
/*      */     public boolean hasNext() {
/*      */       return (this.prevIndex < this.list.size() - 1);
/*      */     }
/*      */     
/*      */     public T next() {
/*      */       this.prevIndex++;
/*      */       return this.list.get(this.prevIndex);
/*      */     }
/*      */     
/*      */     public void remove() {
/*      */       this.list.remove(this.prevIndex);
/*      */       int i = this.prevIndex;
/*      */       this.prevIndex = i + -1;
/*      */     }
/*      */     
/*      */     public boolean hasPrevious() {
/*      */       return (this.prevIndex >= 0);
/*      */     }
/*      */     
/*      */     public int nextIndex() {
/*      */       return this.prevIndex + 1;
/*      */     }
/*      */     
/*      */     public T previous() {
/*      */       int i = this.prevIndex;
/*      */       this.prevIndex = i + -1;
/*      */       return this.list.get(i);
/*      */     }
/*      */     
/*      */     public int previousIndex() {
/*      */       return this.prevIndex;
/*      */     }
/*      */     
/*      */     public void add(Object element) {
/*      */       this.prevIndex++;
/*      */       this.list.add(this.prevIndex, (T)element);
/*      */     }
/*      */     
/*      */     public void set(Object element) {
/*      */       this.list.set(this.prevIndex, (T)element);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\000\n\002\020!\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\036\n\002\b\t\n\002\020)\n\002\b\002\n\002\020+\n\002\b\n\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0010\004¢\006\002\020\005J\025\020\n\032\0020\0132\006\020\f\032\0028\001H\026¢\006\002\020\rJ\035\020\n\032\0020\0162\006\020\017\032\0020\0072\006\020\f\032\0028\001H\026¢\006\002\020\020J\036\020\021\032\0020\0132\006\020\017\032\0020\0072\f\020\022\032\b\022\004\022\0028\0010\023H\026J\026\020\021\032\0020\0132\f\020\022\032\b\022\004\022\0028\0010\023H\026J\b\020\024\032\0020\016H\026J\026\020\025\032\0020\0132\006\020\f\032\0028\001H\002¢\006\002\020\rJ\026\020\026\032\0020\0132\f\020\022\032\b\022\004\022\0028\0010\023H\026J\026\020\027\032\0028\0012\006\020\017\032\0020\007H\002¢\006\002\020\030J\025\020\031\032\0020\0072\006\020\f\032\0028\001H\026¢\006\002\020\032J\b\020\033\032\0020\013H\026J\017\020\034\032\b\022\004\022\0028\0010\035H\002J\025\020\036\032\0020\0072\006\020\f\032\0028\001H\026¢\006\002\020\032J\016\020\037\032\b\022\004\022\0028\0010 H\026J\026\020\037\032\b\022\004\022\0028\0010 2\006\020\017\032\0020\007H\026J\025\020!\032\0020\0132\006\020\f\032\0028\001H\026¢\006\002\020\rJ\026\020\"\032\0020\0132\f\020\022\032\b\022\004\022\0028\0010\023H\026J\025\020#\032\0028\0012\006\020\017\032\0020\007H\026¢\006\002\020\030J\026\020$\032\0020\0132\f\020\022\032\b\022\004\022\0028\0010\023H\026J\036\020%\032\0028\0012\006\020\017\032\0020\0072\006\020\f\032\0028\001H\002¢\006\002\020&J\036\020'\032\b\022\004\022\0028\0010\0022\006\020(\032\0020\0072\006\020)\032\0020\007H\026R\024\020\003\032\b\022\004\022\0028\0010\004X\004¢\006\002\n\000R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\t¨\006*"}, d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", "T", "", "objectList", "Landroidx/collection/MutableObjectList;", "(Landroidx/collection/MutableObjectList;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"})
/*      */   private static final class ObjectListMutableList<T> implements List<T>, KMutableList {
/*      */     @NotNull
/*      */     private final MutableObjectList<T> objectList;
/*      */     
/*      */     public ObjectListMutableList(@NotNull MutableObjectList<T> objectList) {
/*      */       this.objectList = objectList;
/*      */     }
/*      */     
/*      */     public int getSize() {
/*      */       return this.objectList.getSize();
/*      */     }
/*      */     
/*      */     public boolean contains(Object element) {
/*      */       return this.objectList.contains((T)element);
/*      */     }
/*      */     
/*      */     public boolean containsAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.objectList.containsAll(elements);
/*      */     }
/*      */     
/*      */     public T get(int index) {
/*      */       ObjectListKt.access$checkIndex(this, index);
/*      */       return this.objectList.get(index);
/*      */     }
/*      */     
/*      */     public int indexOf(Object element) {
/*      */       return this.objectList.indexOf((T)element);
/*      */     }
/*      */     
/*      */     public boolean isEmpty() {
/*      */       return this.objectList.isEmpty();
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Iterator<T> iterator() {
/*      */       return new MutableObjectList.MutableObjectListIterator<>(this, 0);
/*      */     }
/*      */     
/*      */     public int lastIndexOf(Object element) {
/*      */       return this.objectList.lastIndexOf((T)element);
/*      */     }
/*      */     
/*      */     public boolean add(Object element) {
/*      */       return this.objectList.add((T)element);
/*      */     }
/*      */     
/*      */     public void add(int index, Object element) {
/*      */       this.objectList.add(index, (T)element);
/*      */     }
/*      */     
/*      */     public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.objectList.addAll(index, elements);
/*      */     }
/*      */     
/*      */     public boolean addAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.objectList.addAll(elements);
/*      */     }
/*      */     
/*      */     public void clear() {
/*      */       this.objectList.clear();
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public ListIterator<T> listIterator() {
/*      */       return new MutableObjectList.MutableObjectListIterator<>(this, 0);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public ListIterator<T> listIterator(int index) {
/*      */       return new MutableObjectList.MutableObjectListIterator<>(this, index);
/*      */     }
/*      */     
/*      */     public boolean remove(Object element) {
/*      */       return this.objectList.remove((T)element);
/*      */     }
/*      */     
/*      */     public boolean removeAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.objectList.removeAll(elements);
/*      */     }
/*      */     
/*      */     public T removeAt(int index) {
/*      */       ObjectListKt.access$checkIndex(this, index);
/*      */       return this.objectList.removeAt(index);
/*      */     }
/*      */     
/*      */     public boolean retainAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.objectList.retainAll(elements);
/*      */     }
/*      */     
/*      */     public T set(int index, Object element) {
/*      */       ObjectListKt.access$checkIndex(this, index);
/*      */       return this.objectList.set(index, (T)element);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public List<T> subList(int fromIndex, int toIndex) {
/*      */       ObjectListKt.access$checkSubIndex(this, fromIndex, toIndex);
/*      */       return new MutableObjectList.SubList<>(this, fromIndex, toIndex);
/*      */     }
/*      */     
/*      */     public <T> T[] toArray(Object[] array) {
/*      */       Intrinsics.checkNotNullParameter(array, "array");
/*      */       return (T[])CollectionToArray.toArray(this, array);
/*      */     }
/*      */     
/*      */     public Object[] toArray() {
/*      */       return CollectionToArray.toArray(this);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\000\n\002\020!\n\002\b\002\n\002\020\b\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\036\n\002\b\t\n\002\020)\n\002\b\002\n\002\020+\n\002\b\n\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B#\022\f\020\003\032\b\022\004\022\0028\0010\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007J\025\020\013\032\0020\f2\006\020\r\032\0028\001H\026¢\006\002\020\016J\035\020\013\032\0020\0172\006\020\020\032\0020\0052\006\020\r\032\0028\001H\026¢\006\002\020\021J\036\020\022\032\0020\f2\006\020\020\032\0020\0052\f\020\023\032\b\022\004\022\0028\0010\024H\026J\026\020\022\032\0020\f2\f\020\023\032\b\022\004\022\0028\0010\024H\026J\b\020\025\032\0020\017H\026J\026\020\026\032\0020\f2\006\020\r\032\0028\001H\002¢\006\002\020\016J\026\020\027\032\0020\f2\f\020\023\032\b\022\004\022\0028\0010\024H\026J\026\020\030\032\0028\0012\006\020\020\032\0020\005H\002¢\006\002\020\031J\025\020\032\032\0020\0052\006\020\r\032\0028\001H\026¢\006\002\020\033J\b\020\034\032\0020\fH\026J\017\020\035\032\b\022\004\022\0028\0010\036H\002J\025\020\037\032\0020\0052\006\020\r\032\0028\001H\026¢\006\002\020\033J\016\020 \032\b\022\004\022\0028\0010!H\026J\026\020 \032\b\022\004\022\0028\0010!2\006\020\020\032\0020\005H\026J\025\020\"\032\0020\f2\006\020\r\032\0028\001H\026¢\006\002\020\016J\026\020#\032\0020\f2\f\020\023\032\b\022\004\022\0028\0010\024H\026J\025\020$\032\0028\0012\006\020\020\032\0020\005H\026¢\006\002\020\031J\026\020%\032\0020\f2\f\020\023\032\b\022\004\022\0028\0010\024H\026J\036\020&\032\0028\0012\006\020\020\032\0020\0052\006\020\r\032\0028\001H\002¢\006\002\020'J\036\020(\032\b\022\004\022\0028\0010\0022\006\020)\032\0020\0052\006\020*\032\0020\005H\026R\016\020\006\032\0020\005X\016¢\006\002\n\000R\024\020\003\032\b\022\004\022\0028\0010\002X\004¢\006\002\n\000R\024\020\b\032\0020\0058VX\004¢\006\006\032\004\b\t\020\nR\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006+"}, d2 = {"Landroidx/collection/MutableObjectList$SubList;", "T", "", "list", "start", "", "end", "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"})
/*      */   @SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n1855#2,2:1619\n1855#2,2:1621\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1395#1:1619,2\n1477#1:1621,2\n*E\n"})
/*      */   private static final class SubList<T> implements List<T>, KMutableList {
/*      */     @NotNull
/*      */     private final List<T> list;
/*      */     private final int start;
/*      */     private int end;
/*      */     
/*      */     public SubList(@NotNull List<T> list, int start, int end) {
/*      */       this.list = list;
/*      */       this.start = start;
/*      */       this.end = end;
/*      */     }
/*      */     
/*      */     public int getSize() {
/*      */       return this.end - this.start;
/*      */     }
/*      */     
/*      */     public boolean contains(Object element) {
/*      */       for (int i = this.start, j = this.end; i < j; i++) {
/*      */         if (Intrinsics.areEqual(this.list.get(i), element))
/*      */           return true; 
/*      */       } 
/*      */       return false;
/*      */     }
/*      */     
/*      */     public boolean containsAll(@NotNull Collection elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       Iterable $this$forEach$iv = elements;
/*      */       int $i$f$forEach = 0;
/*      */       Iterator iterator = $this$forEach$iv.iterator();
/*      */       if (iterator.hasNext()) {
/*      */         Object element$iv = iterator.next(), it = element$iv;
/*      */         int $i$a$-forEach-MutableObjectList$SubList$containsAll$1 = 0;
/*      */         if (!contains(it))
/*      */           return false; 
/*      */       } 
/*      */       return true;
/*      */     }
/*      */     
/*      */     public T get(int index) {
/*      */       ObjectListKt.access$checkIndex(this, index);
/*      */       return this.list.get(index + this.start);
/*      */     }
/*      */     
/*      */     public int indexOf(Object element) {
/*      */       for (int i = this.start, j = this.end; i < j; i++) {
/*      */         if (Intrinsics.areEqual(this.list.get(i), element))
/*      */           return i - this.start; 
/*      */       } 
/*      */       return -1;
/*      */     }
/*      */     
/*      */     public boolean isEmpty() {
/*      */       return (this.end == this.start);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Iterator<T> iterator() {
/*      */       return new MutableObjectList.MutableObjectListIterator<>(this, 0);
/*      */     }
/*      */     
/*      */     public int lastIndexOf(Object element) {
/*      */       int i = this.end - 1, j = this.start;
/*      */       if (j <= i)
/*      */         while (true) {
/*      */           if (Intrinsics.areEqual(this.list.get(i), element))
/*      */             return i - this.start; 
/*      */           if (i != j) {
/*      */             i--;
/*      */             continue;
/*      */           } 
/*      */           break;
/*      */         }  
/*      */       return -1;
/*      */     }
/*      */     
/*      */     public boolean add(Object element) {
/*      */       int i = this.end;
/*      */       this.end = i + 1;
/*      */       this.list.add(i, (T)element);
/*      */       return true;
/*      */     }
/*      */     
/*      */     public void add(int index, Object element) {
/*      */       this.list.add(index + this.start, (T)element);
/*      */       int i = this.end;
/*      */       this.end = i + 1;
/*      */     }
/*      */     
/*      */     public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       this.list.addAll(index + this.start, elements);
/*      */       this.end += elements.size();
/*      */       return (elements.size() > 0);
/*      */     }
/*      */     
/*      */     public boolean addAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       this.list.addAll(this.end, elements);
/*      */       this.end += elements.size();
/*      */       return (elements.size() > 0);
/*      */     }
/*      */     
/*      */     public void clear() {
/*      */       int i = this.end - 1, j = this.start;
/*      */       if (j <= i)
/*      */         while (true) {
/*      */           this.list.remove(i);
/*      */           if (i != j) {
/*      */             i--;
/*      */             continue;
/*      */           } 
/*      */           break;
/*      */         }  
/*      */       this.end = this.start;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public ListIterator<T> listIterator() {
/*      */       return new MutableObjectList.MutableObjectListIterator<>(this, 0);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public ListIterator<T> listIterator(int index) {
/*      */       return new MutableObjectList.MutableObjectListIterator<>(this, index);
/*      */     }
/*      */     
/*      */     public boolean remove(Object element) {
/*      */       for (int i = this.start, j = this.end; i < j; i++) {
/*      */         if (Intrinsics.areEqual(this.list.get(i), element)) {
/*      */           this.list.remove(i);
/*      */           int k = this.end;
/*      */           this.end = k + -1;
/*      */           return true;
/*      */         } 
/*      */       } 
/*      */       return false;
/*      */     }
/*      */     
/*      */     public boolean removeAll(@NotNull Collection elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       int originalEnd = this.end;
/*      */       Iterable $this$forEach$iv = elements;
/*      */       int $i$f$forEach = 0;
/*      */       Iterator iterator = $this$forEach$iv.iterator();
/*      */       if (iterator.hasNext()) {
/*      */         Object element$iv = iterator.next(), it = element$iv;
/*      */         int $i$a$-forEach-MutableObjectList$SubList$removeAll$1 = 0;
/*      */         remove(it);
/*      */       } 
/*      */       return (originalEnd != this.end);
/*      */     }
/*      */     
/*      */     public T removeAt(int index) {
/*      */       ObjectListKt.access$checkIndex(this, index);
/*      */       Object element = this.list.remove(index + this.start);
/*      */       int i = this.end;
/*      */       this.end = i + -1;
/*      */       return (T)element;
/*      */     }
/*      */     
/*      */     public boolean retainAll(@NotNull Collection elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       int originalEnd = this.end;
/*      */       int i = this.end - 1, j = this.start;
/*      */       if (j <= i)
/*      */         while (true) {
/*      */           Object element = this.list.get(i);
/*      */           if (!elements.contains(element)) {
/*      */             this.list.remove(i);
/*      */             int k = this.end;
/*      */             this.end = k + -1;
/*      */           } 
/*      */           if (i != j) {
/*      */             i--;
/*      */             continue;
/*      */           } 
/*      */           break;
/*      */         }  
/*      */       return (originalEnd != this.end);
/*      */     }
/*      */     
/*      */     public T set(int index, Object element) {
/*      */       ObjectListKt.access$checkIndex(this, index);
/*      */       return this.list.set(index + this.start, (T)element);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public List<T> subList(int fromIndex, int toIndex) {
/*      */       ObjectListKt.access$checkSubIndex(this, fromIndex, toIndex);
/*      */       return new SubList(this, fromIndex, toIndex);
/*      */     }
/*      */     
/*      */     public <T> T[] toArray(Object[] array) {
/*      */       Intrinsics.checkNotNullParameter(array, "array");
/*      */       return (T[])CollectionToArray.toArray(this, array);
/*      */     }
/*      */     
/*      */     public Object[] toArray() {
/*      */       return CollectionToArray.toArray(this);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableObjectList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */