/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.function.UnaryOperator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.CollectionToArray;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable(with = JsonArraySerializer.class)
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\020 \n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\020\036\n\002\b\005\n\002\020(\n\002\b\002\n\002\020*\n\002\b\b\b\007\030\000 \"2\0020\0012\b\022\004\022\0020\0010\002:\001\"B\025\022\f\020\003\032\b\022\004\022\0020\0010\002¢\006\004\b\004\020\005J\023\020\006\032\0020\0072\b\020\b\032\004\030\0010\tH\002J\b\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\026J\021\020\016\032\0020\0072\006\020\017\032\0020\001H\003J\027\020\020\032\0020\0072\f\020\021\032\b\022\004\022\0020\0010\022H\001J\021\020\023\032\0020\0012\006\020\024\032\0020\013H\003J\021\020\025\032\0020\0132\006\020\017\032\0020\001H\001J\t\020\026\032\0020\007H\001J\017\020\027\032\b\022\004\022\0020\0010\030H\003J\021\020\031\032\0020\0132\006\020\017\032\0020\001H\001J\017\020\032\032\b\022\004\022\0020\0010\033H\001J\027\020\032\032\b\022\004\022\0020\0010\0332\006\020\024\032\0020\013H\001J\037\020\034\032\b\022\004\022\0020\0010\0022\006\020\035\032\0020\0132\006\020\036\032\0020\013H\001R\024\020\003\032\b\022\004\022\0020\0010\002X\004¢\006\002\n\000R\022\020\037\032\0020\013X\005¢\006\006\032\004\b \020!¨\006#"}, d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", "content", "<init>", "(Ljava/util/List;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "contains", "element", "containsAll", "elements", "", "get", "index", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "size", "getSize", "()I", "Companion", "kotlinx-serialization-json"})
/*     */ public final class JsonArray
/*     */   extends JsonElement
/*     */   implements List<JsonElement>, KMappedMarker
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final List<JsonElement> content;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lkotlinx/serialization/json/JsonArray$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "kotlinx-serialization-json"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<JsonArray> serializer() {
/* 218 */       return JsonArraySerializer.INSTANCE;
/* 219 */     } } public JsonArray(@NotNull List<JsonElement> content) { super(null); this.content = content; }
/* 220 */   public boolean equals(@Nullable Object other) { return Intrinsics.areEqual(this.content, other); }
/* 221 */   public int hashCode() { return this.content.hashCode(); } @NotNull
/* 222 */   public String toString() { return CollectionsKt.joinToString$default(this.content, ",", "[", "]", 0, null, null, 56, null); }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/*     */     return this.content.isEmpty();
/*     */   }
/*     */   
/*     */   public boolean contains(@NotNull JsonElement element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     return this.content.contains(element);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Iterator<JsonElement> iterator() {
/*     */     return this.content.iterator();
/*     */   }
/*     */   
/*     */   public boolean containsAll(@NotNull Collection<?> elements) {
/*     */     Intrinsics.checkNotNullParameter(elements, "elements");
/*     */     return this.content.containsAll(elements);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public JsonElement get(int index) {
/*     */     return this.content.get(index);
/*     */   }
/*     */   
/*     */   public int indexOf(@NotNull JsonElement element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     return this.content.indexOf(element);
/*     */   }
/*     */   
/*     */   public int lastIndexOf(@NotNull JsonElement element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     return this.content.lastIndexOf(element);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ListIterator<JsonElement> listIterator() {
/*     */     return this.content.listIterator();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ListIterator<JsonElement> listIterator(int index) {
/*     */     return this.content.listIterator(index);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<JsonElement> subList(int fromIndex, int toIndex) {
/*     */     return this.content.subList(fromIndex, toIndex);
/*     */   }
/*     */   
/*     */   public int getSize() {
/*     */     return this.content.size();
/*     */   }
/*     */   
/*     */   public boolean add(JsonElement element) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void add(int index, JsonElement element) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean remove(Object element) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean addAll(Collection elements) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean addAll(int index, Collection elements) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean removeAll(Collection elements) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean retainAll(Collection elements) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void clear() {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public JsonElement set(int index, JsonElement element) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public JsonElement remove(int index) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void replaceAll(UnaryOperator p0) {
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */