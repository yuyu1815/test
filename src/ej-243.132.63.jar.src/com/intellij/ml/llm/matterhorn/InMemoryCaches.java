/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.util.io.Compressor;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NotImplementedError;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\016\n\000\n\002\020\022\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\034\n\002\b\t\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\013\032\0020\f2\006\020\r\032\0020\0062\006\020\016\032\0020\0072\006\020\017\032\0020\007H\026J\030\020\020\032\0020\0212\006\020\r\032\0020\0062\006\020\016\032\0020\007H\026J\032\020\022\032\004\030\0010\0072\006\020\r\032\0020\0062\006\020\016\032\0020\007H\026J\026\020\023\032\b\022\004\022\0020\0070\0242\006\020\r\032\0020\006H\026J\020\020\025\032\0020\0212\006\020\r\032\0020\006H\026J\030\020\026\032\0020\f2\006\020\r\032\0020\0062\006\020\016\032\0020\007H\026J \020\027\032\0020\f2\006\020\r\032\0020\0062\006\020\016\032\0020\0072\006\020\017\032\0020\tH\026J\032\020\030\032\004\030\0010\t2\006\020\r\032\0020\0062\006\020\016\032\0020\007H\026J\030\020\031\032\0020\f2\006\020\r\032\0020\0062\006\020\017\032\0020\007H\026J\022\020\032\032\004\030\0010\0072\006\020\r\032\0020\006H\026J\b\020\033\032\0020\fH\026J\020\020\034\032\0020\f2\006\020\035\032\0020\036H\026R&\020\004\032\032\022\004\022\0020\006\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\0050\005X\004¢\006\002\n\000R&\020\b\032\032\022\004\022\0020\006\022\020\022\016\022\004\022\0020\007\022\004\022\0020\t0\0050\005X\004¢\006\002\n\000R\032\020\n\032\016\022\004\022\0020\006\022\004\022\0020\0070\005X\004¢\006\002\n\000¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/InMemoryCaches;", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "<init>", "()V", "multiPathStorage", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/intellij/ml/llm/matterhorn/CacheType;", "", "binaryStorage", "", "singleStorage", "save", "", "type", "path", "content", "contains", "", "load", "loadAllPaths", "", "hasAnyOfType", "remove", "saveBinary", "loadBinary", "saveSingle", "loadSingle", "clear", "dumpToZip", "zip", "Lcom/intellij/util/io/Compressor$Zip;", "core"})
/*     */ public final class InMemoryCaches
/*     */   implements MatterhornCaches
/*     */ {
/*     */   @NotNull
/* 233 */   private final ConcurrentHashMap<CacheType, ConcurrentHashMap<String, String>> multiPathStorage = new ConcurrentHashMap<>(); @NotNull
/* 234 */   private final ConcurrentHashMap<CacheType, ConcurrentHashMap<String, byte[]>> binaryStorage = new ConcurrentHashMap<>(); @NotNull
/* 235 */   private final ConcurrentHashMap<CacheType, String> singleStorage = new ConcurrentHashMap<>();
/*     */   
/*     */   public void save(@NotNull CacheType type, @NotNull String path, @NotNull String content) {
/* 238 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullExpressionValue(this.multiPathStorage.computeIfAbsent(type, InMemoryCaches::save$lambda$0::save$lambda$1), "computeIfAbsent(...)"); this.multiPathStorage.computeIfAbsent(type, InMemoryCaches::save$lambda$0::save$lambda$1).put(path, content); } private static final ConcurrentHashMap save$lambda$0(CacheType it) { Intrinsics.checkNotNullParameter(it, "it"); return new ConcurrentHashMap<>(); } private static final ConcurrentHashMap save$lambda$1(Function1 $tmp0, Object p0) { return (ConcurrentHashMap)$tmp0.invoke(p0); }
/*     */ 
/*     */   
/*     */   public boolean contains(@NotNull CacheType type, @NotNull String path) {
/* 242 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(path, "path"); (ConcurrentHashMap)this.multiPathStorage.get(type); return ((ConcurrentHashMap)this.multiPathStorage.get(type) != null) ? ((ConcurrentHashMap)this.multiPathStorage.get(type)).containsKey(path) : false;
/*     */   }
/*     */   @Nullable
/*     */   public String load(@NotNull CacheType type, @NotNull String path) {
/* 246 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(path, "path"); (ConcurrentHashMap)this.multiPathStorage.get(type); return ((ConcurrentHashMap)this.multiPathStorage.get(type) != null) ? (String)((ConcurrentHashMap)this.multiPathStorage.get(type)).get(path) : null;
/*     */   }
/*     */   @NotNull
/*     */   public Iterable<String> loadAllPaths(@NotNull CacheType type) {
/* 250 */     Intrinsics.checkNotNullParameter(type, "type"); (ConcurrentHashMap.KeySetView)((ConcurrentHashMap)this.multiPathStorage.get(type)).keySet(); return ((ConcurrentHashMap)this.multiPathStorage.get(type) != null && (ConcurrentHashMap.KeySetView)((ConcurrentHashMap)this.multiPathStorage.get(type)).keySet() != null) ? ((ConcurrentHashMap)this.multiPathStorage.get(type)).keySet() : SetsKt.emptySet();
/*     */   }
/*     */   
/*     */   public boolean hasAnyOfType(@NotNull CacheType type) {
/* 254 */     Intrinsics.checkNotNullParameter(type, "type"); (ConcurrentHashMap)this.multiPathStorage.get(type); return ((((ConcurrentHashMap)this.multiPathStorage.get(type) != null) ? (((!((ConcurrentHashMap)this.multiPathStorage.get(type)).isEmpty() ? true : false) == true)) : false) || this.singleStorage.containsKey(type));
/*     */   }
/*     */   
/*     */   public void remove(@NotNull CacheType type, @NotNull String path) {
/* 258 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(path, "path"); if ((ConcurrentHashMap)this.multiPathStorage.get(type) != null) { (String)((ConcurrentHashMap)this.multiPathStorage.get(type)).remove(path); } else { (ConcurrentHashMap)this.multiPathStorage.get(type); }
/*     */   
/*     */   }
/*     */   
/* 262 */   public void saveBinary(@NotNull CacheType type, @NotNull String path, @NotNull byte[] content) { Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullExpressionValue(this.binaryStorage.computeIfAbsent(type, InMemoryCaches::saveBinary$lambda$2::saveBinary$lambda$3), "computeIfAbsent(...)"); this.binaryStorage.computeIfAbsent(type, InMemoryCaches::saveBinary$lambda$2::saveBinary$lambda$3).put(path, content); } private static final ConcurrentHashMap saveBinary$lambda$2(CacheType it) { Intrinsics.checkNotNullParameter(it, "it"); return new ConcurrentHashMap<>(); } private static final ConcurrentHashMap saveBinary$lambda$3(Function1 $tmp0, Object p0) { return (ConcurrentHashMap)$tmp0.invoke(p0); }
/*     */   
/*     */   @Nullable
/*     */   public byte[] loadBinary(@NotNull CacheType type, @NotNull String path) {
/* 266 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(path, "path"); (ConcurrentHashMap)this.binaryStorage.get(type); return ((ConcurrentHashMap)this.binaryStorage.get(type) != null) ? (byte[])((ConcurrentHashMap)this.binaryStorage.get(type)).get(path) : null;
/*     */   }
/*     */   
/*     */   public void saveSingle(@NotNull CacheType type, @NotNull String content) {
/* 270 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(content, "content"); this.singleStorage.put(type, content);
/*     */   }
/*     */   @Nullable
/*     */   public String loadSingle(@NotNull CacheType type) {
/* 274 */     Intrinsics.checkNotNullParameter(type, "type"); return this.singleStorage.get(type);
/*     */   }
/*     */   
/*     */   public void clear() {
/* 278 */     this.multiPathStorage.clear();
/* 279 */     this.binaryStorage.clear();
/* 280 */     this.singleStorage.clear();
/*     */   }
/*     */   
/*     */   public void dumpToZip(@NotNull Compressor.Zip zip) {
/* 284 */     Intrinsics.checkNotNullParameter(zip, "zip"); String str = "Not yet implemented"; throw new NotImplementedError("An operation is not implemented: " + str);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\InMemoryCaches.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */