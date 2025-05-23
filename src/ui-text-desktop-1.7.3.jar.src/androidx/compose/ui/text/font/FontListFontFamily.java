/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import java.util.Collection;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.function.UnaryOperator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.CollectionToArray;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\036\n\002\b\002\n\002\020\000\n\002\b\006\n\002\020(\n\002\b\002\n\002\020*\n\002\b\004\n\002\020\016\n\000\b\007\030\0002\0020\0012\b\022\004\022\0020\0030\002B\025\b\000\022\f\020\004\032\b\022\004\022\0020\0030\002¢\006\002\020\005J\021\020\f\032\0020\r2\006\020\016\032\0020\003H\003J\027\020\017\032\0020\r2\f\020\020\032\b\022\004\022\0020\0030\021H\001J\023\020\022\032\0020\r2\b\020\023\032\004\030\0010\024H\002J\021\020\025\032\0020\0032\006\020\026\032\0020\tH\003J\b\020\027\032\0020\tH\026J\021\020\030\032\0020\t2\006\020\016\032\0020\003H\001J\t\020\031\032\0020\rH\001J\017\020\032\032\b\022\004\022\0020\0030\033H\003J\021\020\034\032\0020\t2\006\020\016\032\0020\003H\001J\017\020\035\032\b\022\004\022\0020\0030\036H\001J\027\020\035\032\b\022\004\022\0020\0030\0362\006\020\026\032\0020\tH\001J\037\020\037\032\b\022\004\022\0020\0030\0022\006\020 \032\0020\t2\006\020!\032\0020\tH\001J\b\020\"\032\0020#H\026R\027\020\004\032\b\022\004\022\0020\0030\002¢\006\b\n\000\032\004\b\006\020\007R\022\020\b\032\0020\tX\005¢\006\006\032\004\b\n\020\013¨\006$"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamily;", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "", "Landroidx/compose/ui/text/font/Font;", "fonts", "(Ljava/util/List;)V", "getFonts", "()Ljava/util/List;", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "ui-text"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n1#2:269\n*E\n"})
/*     */ public final class FontListFontFamily
/*     */   extends FileBasedFontFamily
/*     */   implements List<Font>, KMappedMarker
/*     */ {
/*     */   @NotNull
/*     */   private final List<Font> fonts;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public final List<Font> getFonts() {
/* 174 */     return this.fonts; } public FontListFontFamily(@NotNull List<Font> fonts) {
/* 175 */     super(null);
/*     */     this.fonts = fonts;
/* 177 */     if (!(!this.fonts.isEmpty() ? 1 : 0)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 269 */       int $i$a$-check-FontListFontFamily$1 = 0;
/*     */       String str = "At least one font should be passed to FontFamily";
/*     */       throw new IllegalStateException(str.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FontListFontFamily))
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(this.fonts, ((FontListFontFamily)other).fonts))
/*     */       return false; 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.fonts.hashCode();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "FontListFontFamily(fonts=" + this.fonts + ')';
/*     */   }
/*     */   
/*     */   public int getSize() {
/*     */     return this.fonts.size();
/*     */   }
/*     */   
/*     */   public boolean contains(@NotNull Font element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     return this.fonts.contains(element);
/*     */   }
/*     */   
/*     */   public boolean containsAll(@NotNull Collection<?> elements) {
/*     */     Intrinsics.checkNotNullParameter(elements, "elements");
/*     */     return this.fonts.containsAll(elements);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Font get(int index) {
/*     */     return this.fonts.get(index);
/*     */   }
/*     */   
/*     */   public int indexOf(@NotNull Font element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     return this.fonts.indexOf(element);
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     return this.fonts.isEmpty();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Iterator<Font> iterator() {
/*     */     return this.fonts.iterator();
/*     */   }
/*     */   
/*     */   public int lastIndexOf(@NotNull Font element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     return this.fonts.lastIndexOf(element);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ListIterator<Font> listIterator() {
/*     */     return this.fonts.listIterator();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ListIterator<Font> listIterator(int index) {
/*     */     return this.fonts.listIterator(index);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<Font> subList(int fromIndex, int toIndex) {
/*     */     return this.fonts.subList(fromIndex, toIndex);
/*     */   }
/*     */   
/*     */   public boolean add(Font element) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void add(int index, Font element) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean addAll(int index, Collection elements) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean addAll(Collection elements) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void clear() {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean remove(Object element) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean removeAll(Collection elements) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public Font remove(int index) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void replaceAll(UnaryOperator p0) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean retainAll(Collection elements) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public Font set(int index, Font element) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void sort(Comparator p0) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public <T> T[] toArray(Object[] array) {
/*     */     Intrinsics.checkNotNullParameter(array, "array");
/*     */     return (T[])CollectionToArray.toArray(this, array);
/*     */   }
/*     */   
/*     */   public Object[] toArray() {
/*     */     return CollectionToArray.toArray(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontListFontFamily.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */