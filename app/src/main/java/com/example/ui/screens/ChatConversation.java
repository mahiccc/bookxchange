package com.example.ui.screens;

import com.example.data.Book;
import com.example.data.Message;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatsScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J]\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001c¨\u0006*"}, d2 = {"Lcom/example/ui/screens/ChatConversation;", "", "bookId", "", "book", "Lcom/example/data/Book;", "otherUserEmail", "otherUserName", "otherUserPhoto", "lastMessage", "Lcom/example/data/Message;", "unreadCount", "", "isOwner", "", "<init>", "(Ljava/lang/String;Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Message;IZ)V", "getBookId", "()Ljava/lang/String;", "getBook", "()Lcom/example/data/Book;", "getOtherUserEmail", "getOtherUserName", "getOtherUserPhoto", "getLastMessage", "()Lcom/example/data/Message;", "getUnreadCount", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatConversation {
    public static final int $stable = 8;
    private final Book book;
    private final String bookId;
    private final boolean isOwner;
    private final Message lastMessage;
    private final String otherUserEmail;
    private final String otherUserName;
    private final String otherUserPhoto;
    private final int unreadCount;

    public static /* synthetic */ ChatConversation copy$default(ChatConversation chatConversation, String str, Book book, String str2, String str3, String str4, Message message, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatConversation.bookId;
        }
        if ((i2 & 2) != 0) {
            book = chatConversation.book;
        }
        if ((i2 & 4) != 0) {
            str2 = chatConversation.otherUserEmail;
        }
        if ((i2 & 8) != 0) {
            str3 = chatConversation.otherUserName;
        }
        if ((i2 & 16) != 0) {
            str4 = chatConversation.otherUserPhoto;
        }
        if ((i2 & 32) != 0) {
            message = chatConversation.lastMessage;
        }
        if ((i2 & 64) != 0) {
            i = chatConversation.unreadCount;
        }
        if ((i2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z = chatConversation.isOwner;
        }
        int i3 = i;
        boolean z2 = z;
        String str5 = str4;
        Message message2 = message;
        return chatConversation.copy(str, book, str2, str3, str5, message2, i3, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBookId() {
        return this.bookId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Book getBook() {
        return this.book;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOtherUserEmail() {
        return this.otherUserEmail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOtherUserName() {
        return this.otherUserName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOtherUserPhoto() {
        return this.otherUserPhoto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Message getLastMessage() {
        return this.lastMessage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsOwner() {
        return this.isOwner;
    }

    public final ChatConversation copy(String bookId, Book book, String otherUserEmail, String otherUserName, String otherUserPhoto, Message lastMessage, int unreadCount, boolean isOwner) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(otherUserEmail, "otherUserEmail");
        Intrinsics.checkNotNullParameter(otherUserName, "otherUserName");
        Intrinsics.checkNotNullParameter(lastMessage, "lastMessage");
        return new ChatConversation(bookId, book, otherUserEmail, otherUserName, otherUserPhoto, lastMessage, unreadCount, isOwner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatConversation)) {
            return false;
        }
        ChatConversation chatConversation = (ChatConversation) other;
        return Intrinsics.areEqual(this.bookId, chatConversation.bookId) && Intrinsics.areEqual(this.book, chatConversation.book) && Intrinsics.areEqual(this.otherUserEmail, chatConversation.otherUserEmail) && Intrinsics.areEqual(this.otherUserName, chatConversation.otherUserName) && Intrinsics.areEqual(this.otherUserPhoto, chatConversation.otherUserPhoto) && Intrinsics.areEqual(this.lastMessage, chatConversation.lastMessage) && this.unreadCount == chatConversation.unreadCount && this.isOwner == chatConversation.isOwner;
    }

    public int hashCode() {
        int iHashCode = this.bookId.hashCode() * 31;
        Book book = this.book;
        int iHashCode2 = (((((iHashCode + (book == null ? 0 : book.hashCode())) * 31) + this.otherUserEmail.hashCode()) * 31) + this.otherUserName.hashCode()) * 31;
        String str = this.otherUserPhoto;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.lastMessage.hashCode()) * 31) + Integer.hashCode(this.unreadCount)) * 31) + Boolean.hashCode(this.isOwner);
    }

    public String toString() {
        return "ChatConversation(bookId=" + this.bookId + ", book=" + this.book + ", otherUserEmail=" + this.otherUserEmail + ", otherUserName=" + this.otherUserName + ", otherUserPhoto=" + this.otherUserPhoto + ", lastMessage=" + this.lastMessage + ", unreadCount=" + this.unreadCount + ", isOwner=" + this.isOwner + ")";
    }

    public ChatConversation(String str, Book book, String str2, String str3, String str4, Message message, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "bookId");
        Intrinsics.checkNotNullParameter(str2, "otherUserEmail");
        Intrinsics.checkNotNullParameter(str3, "otherUserName");
        Intrinsics.checkNotNullParameter(message, "lastMessage");
        this.bookId = str;
        this.book = book;
        this.otherUserEmail = str2;
        this.otherUserName = str3;
        this.otherUserPhoto = str4;
        this.lastMessage = message;
        this.unreadCount = i;
        this.isOwner = z;
    }

    public final String getBookId() {
        return this.bookId;
    }

    public final Book getBook() {
        return this.book;
    }

    public final String getOtherUserEmail() {
        return this.otherUserEmail;
    }

    public final String getOtherUserName() {
        return this.otherUserName;
    }

    public final String getOtherUserPhoto() {
        return this.otherUserPhoto;
    }

    public final Message getLastMessage() {
        return this.lastMessage;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final boolean isOwner() {
        return this.isOwner;
    }
}
