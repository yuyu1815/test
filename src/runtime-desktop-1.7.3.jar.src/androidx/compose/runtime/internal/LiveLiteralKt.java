/*     */ package androidx.compose.runtime.internal;
/*     */ 
/*     */ import androidx.compose.runtime.ComposeCompilerApi;
/*     */ import androidx.compose.runtime.InternalComposeApi;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\013\n\002\b\005\n\002\030\002\n\002\020\016\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\006\032\b\020\f\032\0020\rH\007\032)\020\016\032\b\022\004\022\002H\0200\017\"\004\b\000\020\0202\006\020\021\032\0020\b2\006\020\022\032\002H\020H\007¢\006\002\020\023\032\032\020\024\032\0020\r2\006\020\021\032\0020\b2\b\020\022\032\004\030\0010\nH\007\"&\020\002\032\0020\0012\006\020\000\032\0020\0018\006@BX\016¢\006\016\n\000\022\004\b\003\020\004\032\004\b\002\020\005\":\020\006\032.\022\004\022\0020\b\022\f\022\n\022\006\022\004\030\0010\n0\t0\007j\026\022\004\022\0020\b\022\f\022\n\022\006\022\004\030\0010\n0\t`\013X\004¢\006\002\n\000¨\006\025"}, d2 = {"<set-?>", "", "isLiveLiteralsEnabled", "isLiveLiteralsEnabled$annotations", "()V", "()Z", "liveLiteralCache", "Ljava/util/HashMap;", "", "Landroidx/compose/runtime/MutableState;", "", "Lkotlin/collections/HashMap;", "enableLiveLiterals", "", "liveLiteral", "Landroidx/compose/runtime/State;", "T", "key", "value", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/runtime/State;", "updateLiveLiteralValue", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,100:1\n372#2,7:101\n372#2,7:108\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n81#1:101,7\n92#1:108,7\n*E\n"})
/*     */ public final class LiveLiteralKt
/*     */ {
/*     */   @NotNull
/*  53 */   private static final HashMap<String, MutableState<Object>> liveLiteralCache = new HashMap<>();
/*     */   private static boolean isLiveLiteralsEnabled;
/*     */   
/*     */   public static final boolean isLiveLiteralsEnabled() {
/*  57 */     return isLiveLiteralsEnabled;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @InternalComposeApi
/*     */   public static final void enableLiveLiterals() {
/*  67 */     isLiveLiteralsEnabled = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ComposeCompilerApi
/*     */   @InternalComposeApi
/*     */   @NotNull
/*     */   public static final <T> State<T> liveLiteral(@NotNull String key, Object value) {
/*  81 */     Intrinsics.checkNotNullParameter(key, "key"); Map<String, MutableState<Object>> $this$getOrPut$iv = liveLiteralCache; int $i$f$getOrPut = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     Object<Object> value$iv = (Object<Object>)$this$getOrPut$iv.get(key);
/* 102 */     if (value$iv == null) {
/* 103 */       int $i$a$-getOrPut-LiveLiteralKt$liveLiteral$1 = 0; Object answer$iv = SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
/* 104 */       $this$getOrPut$iv.put(key, answer$iv);
/*     */     } 
/*     */     
/* 107 */     Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>"); return (State)value$iv; } @InternalComposeApi public static final void updateLiveLiteralValue(@NotNull String key, @Nullable Object value) { Intrinsics.checkNotNullParameter(key, "key"); boolean needToUpdate = false; needToUpdate = true; Map<String, MutableState<Object>> $this$getOrPut$iv = liveLiteralCache; int $i$f$getOrPut = 0;
/* 108 */     Object<Object> value$iv = (Object<Object>)$this$getOrPut$iv.get(key);
/* 109 */     if (value$iv == null) {
/* 110 */       int $i$a$-getOrPut-LiveLiteralKt$updateLiveLiteralValue$stateObj$1 = 0; needToUpdate = false; Object answer$iv = SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
/* 111 */       $this$getOrPut$iv.put(key, answer$iv);
/*     */     } 
/*     */     
/* 114 */     MutableState stateObj = (MutableState)value$iv;
/*     */     if (needToUpdate)
/*     */       stateObj.setValue(value);  }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\LiveLiteralKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */