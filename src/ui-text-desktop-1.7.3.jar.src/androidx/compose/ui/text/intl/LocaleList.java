/*     */ package androidx.compose.ui.text.intl;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.CollectionToArray;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\036\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\021\n\002\b\002\n\002\020 \n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\005\n\002\020\000\n\002\b\005\n\002\020(\n\002\b\003\b\007\030\000 !2\b\022\004\022\0020\0020\001:\001!B\017\b\026\022\006\020\003\032\0020\004¢\006\002\020\005B\033\b\026\022\022\020\006\032\n\022\006\b\001\022\0020\0020\007\"\0020\002¢\006\002\020\bB\023\022\f\020\t\032\b\022\004\022\0020\0020\n¢\006\002\020\013J\021\020\022\032\0020\0232\006\020\024\032\0020\002H\002J\026\020\025\032\0020\0232\f\020\026\032\b\022\004\022\0020\0020\001H\026J\023\020\027\032\0020\0232\b\020\030\032\004\030\0010\031H\002J\021\020\032\032\0020\0022\006\020\033\032\0020\017H\002J\b\020\034\032\0020\017H\026J\b\020\035\032\0020\023H\026J\017\020\036\032\b\022\004\022\0020\0020\037H\002J\b\020 \032\0020\004H\026R\027\020\t\032\b\022\004\022\0020\0020\n¢\006\b\n\000\032\004\b\f\020\rR\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\020\020\021¨\006\""}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList;", "", "Landroidx/compose/ui/text/intl/Locale;", "languageTags", "", "(Ljava/lang/String;)V", "locales", "", "([Landroidx/compose/ui/text/intl/Locale;)V", "localeList", "", "(Ljava/util/List;)V", "getLocaleList", "()Ljava/util/List;", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "equals", "other", "", "get", "i", "hashCode", "isEmpty", "iterator", "", "toString", "Companion", "ui-text"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,90:1\n151#2,3:91\n33#2,4:94\n154#2,2:98\n38#2:100\n156#2:101\n33#2,4:102\n154#2,2:106\n38#2:108\n156#2:109\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n54#1:91,3\n54#1:94,4\n54#1:98,2\n54#1:100\n54#1:101\n54#1:102,4\n54#1:106,2\n54#1:108\n54#1:109\n*E\n"})
/*     */ public final class LocaleList
/*     */   implements Collection<Locale>, KMappedMarker
/*     */ {
/*     */   public LocaleList(@NotNull List<Locale> localeList) {
/*  31 */     this.localeList = localeList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     this.size = this.localeList.size();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<Locale> getLocaleList() {
/*     */     return this.localeList;
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\0048F¢\006\006\032\004\b\b\020\006¨\006\t"}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList$Companion;", "", "()V", "Empty", "Landroidx/compose/ui/text/intl/LocaleList;", "getEmpty", "()Landroidx/compose/ui/text/intl/LocaleList;", "current", "getCurrent", "ui-text"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final LocaleList getEmpty() {
/*     */       return LocaleList.Empty;
/*     */     }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final LocaleList getCurrent() {
/*     */       return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @NotNull
/*     */   private final List<Locale> localeList;
/*     */   
/*     */   private final int size;
/*     */   
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   private static final LocaleList Empty = new LocaleList(CollectionsKt.emptyList());
/*     */ 
/*     */   
/*     */   public LocaleList(@NotNull String languageTags) {
/* 109 */     this(target$iv);
/*     */   }
/*     */   
/*     */   public LocaleList(@NotNull Locale... locales) {
/*     */     this(ArraysKt.toList((Object[])locales));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Locale get(int i) {
/*     */     return this.localeList.get(i);
/*     */   }
/*     */   
/*     */   public int getSize() {
/*     */     return this.size;
/*     */   }
/*     */   
/*     */   public boolean contains(@NotNull Locale element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     return this.localeList.contains(element);
/*     */   }
/*     */   
/*     */   public boolean containsAll(@NotNull Collection<?> elements) {
/*     */     Intrinsics.checkNotNullParameter(elements, "elements");
/*     */     return this.localeList.containsAll(elements);
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     return this.localeList.isEmpty();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Iterator<Locale> iterator() {
/*     */     return this.localeList.iterator();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof LocaleList))
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(this.localeList, ((LocaleList)other).localeList))
/*     */       return false; 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.localeList.hashCode();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "LocaleList(localeList=" + this.localeList + ')';
/*     */   }
/*     */   
/*     */   public boolean add(Locale element) {
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
/*     */   public boolean removeIf(Predicate p0) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean retainAll(Collection elements) {
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\intl\LocaleList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */